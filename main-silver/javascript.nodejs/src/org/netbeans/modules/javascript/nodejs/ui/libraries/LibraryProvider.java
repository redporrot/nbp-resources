/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2014 Sun Microsystems, Inc.
 */

package org.netbeans.modules.javascript.nodejs.ui.libraries;

import java.awt.EventQueue;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.netbeans.api.project.Project;
import org.netbeans.modules.javascript.nodejs.exec.NpmExecutable;
import org.openide.util.RequestProcessor;

/**
 * npm library provider.
 * 
 * The clients of this provider are expected to use {@link #findLibraries}
 * method to search libraries matching given search term. The search
 * for the libraries is performed asynchronously. Hence, this method
 * returns {@code null} when it is called for the first time for the given
 * search term. The clients should register property change listeners
 * on the provider to be notified when the result of the search is available.
 * The property change events fired by the provider will have the property
 * name set to the search term and the new value to the result of the search.
 * The new value may be set to {@code null} when the search failed for
 * some reason (the new value is set to an empty array when the result
 * of the search is empty).
 * 
 * @author Jan Stola
 */
public class LibraryProvider {
    /** Library providers for individual projects. */
    private static final Map<Project,LibraryProvider> providers =
            Collections.synchronizedMap(new WeakHashMap<Project,LibraryProvider>());
    /** Request processor used by this class. */
    private static final RequestProcessor RP = new RequestProcessor(LibraryProvider.class.getName(), 3);
    /** Project for which the libraries should be provided. */
    private final Project project;
    /** Cache of the search results. It maps the search term to the search result. */
    private final Map<String,WeakReference<Library[]>> searchCache =
            Collections.synchronizedMap(new HashMap<String,WeakReference<Library[]>>());
    /** Cache of library details. It maps name of the library/package to the library details. */
    private final Map<String,WeakReference<Library>> detailCache =
            Collections.synchronizedMap(new HashMap<String,WeakReference<Library>>());
    /** Property change support. */
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Creates a new {@code LibraryProvider} for the given project.
     * 
     * @param project project for which the libraries should be provided.
     */
    private LibraryProvider(Project project) {
        this.project = project;
    }

    /**
     * Returns library provider for the given project.
     * 
     * @param project project for which the library provider should be returned.
     * @return library provider for the given project.
     */
    public static synchronized LibraryProvider forProject(Project project) {
        LibraryProvider provider = providers.get(project);
        if (provider == null) {
            provider = new LibraryProvider(project);
            providers.put(project, provider);
        }
        return provider;
    }

    /**
     * Adds a property change listener to this provider. The listener
     * is notified whenever a new search result is available.
     * 
     * @param listener listener to register.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Removes a property change listener from this provider.
     * 
     * @param listener listener to unregister.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    /**
     * Finds the libraries matching the given search term. This method returns
     * {@code null} when the result of the search is not present in the cache
     * already. It starts the corresponding search in this case and reports
     * its result by firing a property change event with the property name
     * equal to the given search term. The result of the search can be obtained
     * through the new value property of the event or by another invocation
     * of this method. The first approach is recommended as it allows
     * to recognize that the search failed. The new value property of the
     * event is set to {@code null} in such case.
     * 
     * @param searchTerm search term.
     */
    public Library[] findLibraries(String searchTerm) {
        WeakReference<Library[]> reference = searchCache.get(searchTerm);
        Library[] result = null;
        if (reference != null) {
            result = reference.get();
        }
        if (result == null) {
            SearchTask task = new SearchTask(searchTerm);
            RP.post(task);
        }
        return result;
    }

    /**
     * Returns details of the library/package with the given name.
     * 
     * @param libraryName name of the library/package.
     * @param cachedOnly if {@code true} then the details will be returned when
     * they are cached only (i.e., {@code null} will be returned if they are not
     * cached and no attempt will be made to obtain the details from the server).
     * @return details of the library/package with the given name.
     */
    public Library libraryDetails(String libraryName, boolean cachedOnly) {
        WeakReference<Library> reference = detailCache.get(libraryName);
        Library result = null;
        if (reference != null) {
            result = reference.get();
        }
        if (result == null && !cachedOnly) {
            assert !EventQueue.isDispatchThread();
            NpmExecutable executable = NpmExecutable.getDefault(project, false);
            if (executable != null) {
                JSONObject details = executable.view(libraryName);
                if (details != null) {
                    result = parseLibraryDetails(details);
                    reference = new WeakReference<>(result);
                    detailCache.put(libraryName, reference);
                }
            }
        }
        return result;
    }

    /**
     * Returns the installed libraries/packages.
     * 
     * @return map that maps the library name to the installed version.
     * Returns {@code null} when the attempt to determine the installed
     * libraries failed. When no library is installed then an empty array
     * is returned.
     */
    public Map<String,String> installedLibraries() {
        Map<String,String> result = null;
        NpmExecutable executable = NpmExecutable.getDefault(project, false);
        if (executable != null) {
            JSONObject json = executable.list(0);
            if (json != null) {
                result = new HashMap<>();
                JSONObject dependencies = (JSONObject)json.get("dependencies"); // NOI18N
                if (dependencies != null) {
                    for (Object key : dependencies.keySet()) {
                        Object value = dependencies.get(key);
                        if (value instanceof JSONObject) {
                            JSONObject libraryInfo = (JSONObject)value;
                            String versionName = (String)libraryInfo.get("version"); // NOI18N
                            if (versionName != null) {
                                String libraryName = key.toString();
                                result.put(libraryName, versionName);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * Returns library that corresponds to the JSON object obtained
     * as a result of a call to {@code npm view --json} command.
     * 
     * @param viewInfo result of some {@code npm view --json} command.
     * @return library that corresponds to the given JSON object.
     */
    private Library parseLibraryDetails(JSONObject viewInfo) {
        String name = (String)viewInfo.get("name"); // NOI18N
        Library library = new Library(name);

        String latestVersionName = (String)viewInfo.get("version"); // NOI18N
        Library.Version latestVersion = null;

        Library.Version[] versions;
        Object versionsObject = viewInfo.get("versions"); // NOI18N
        if (versionsObject instanceof JSONArray) {
            JSONArray versionArray = (JSONArray)viewInfo.get("versions"); // NOI18N
            versions = new Library.Version[versionArray.size()];
            for (int i=0; i<versionArray.size(); i++) {
                String versionName = (String)versionArray.get(i);
                Library.Version version = new Library.Version(library, versionName);
                if (versionName.equals(latestVersionName)) {
                    latestVersion = version;
                }
                versions[i] = version;
            }
        } else {
            latestVersion = new Library.Version(library, versionsObject.toString());
            versions = new Library.Version[] { latestVersion };
        }
        library.setVersions(versions);
        library.setLatestVersion(latestVersion);

        return library;
    }

    /**
     * Updates the cache with the result of the search.
     * 
     * @param searchTerm search term.
     * @param libraries libraries matching the search term.
     */
    void updateCache(String searchTerm, Library[] libraries) {
        if (libraries != null) {
            WeakReference<Library[]> reference = new WeakReference<>(libraries);
            searchCache.put(searchTerm, reference);
        }
        propertyChangeSupport.firePropertyChange(searchTerm, null, libraries);
    }

    /**
     * Search task - a task that performs one search for libraries matching
     * the given search term.
     */
    private class SearchTask implements Runnable {
        /** Search term. */
        private final String searchTerm;

        /**
         * Creates a new {@code SearchTask} for the given search term.
         * 
         * @param searchTerm search term.
         */
        SearchTask(String searchTerm) {
            this.searchTerm = searchTerm;
        }

        @Override
        public void run() {
            NpmExecutable executable = NpmExecutable.getDefault(project, false);
            if (executable != null) {
                String result = executable.search(searchTerm);
                Library[] libraries = result == null ? null : parseSearchResult(result);
                updateCache(searchTerm, libraries);
            }
        }

        /**
         * Parses the output of npm search call.
         * 
         * @param searchResult output of the npm search call.
         * @return libraries/packages returned by the search.
         */
        private Library[] parseSearchResult(String searchResult) {
            String[] lines = searchResult.split("\n"); // NOI18N
            String header = lines[0];
            int descriptionIndex = header.indexOf("DESCRIPTION"); // NOI18N
            int authorIndex = header.indexOf("AUTHOR"); // NOI18N
            int dateIndex = header.indexOf("DATE"); // NOI18N
            int versionIndex = header.indexOf("VERSION"); // NOI18N
            int keywordsIndex = header.indexOf("KEYWORDS"); // NOI18N
            List<Library> libraryList = new LinkedList<>();
            String name = ""; // NOI18N
            String description = ""; // NOI18N
            String versionName = ""; // NOI18N
            for (int i=lines.length-1; i>=1; i--) {
                String line = lines[i];
                int length = line.length();

                // Name
                String namePart = line.substring(0,descriptionIndex).trim();
                name = namePart.trim() + name;

                // Description
                String descriptionPart = length < authorIndex
                        ? line.substring(descriptionIndex).trim()
                        : line.substring(descriptionIndex, authorIndex).trim();
                description = descriptionPart + "\n" + description; // NOI18N

                // Version
                String versionNamePart;
                if (length < versionIndex) {
                    versionNamePart = "";
                } else if (length < keywordsIndex) {
                    versionNamePart = line.substring(versionIndex);
                } else {
                    versionNamePart = line.substring(versionIndex, keywordsIndex);
                }
                versionNamePart = versionNamePart.trim();
                // multiline versions end with '...' character
                if (versionNamePart.endsWith("\u2026")) { // NOI18N
                    versionNamePart = versionNamePart.substring(0, versionNamePart.length()-1);
                }
                versionName = versionNamePart + versionName;

                // The first line (but the last one we are processing as we go
                // from the back) describing this library
                if (length >= dateIndex && !Character.isWhitespace(line.charAt(dateIndex))) {
                    // Some libraries (like jquery.tap.js or elasticsearch-jquery)
                    // are broken. They don't have any version in npm meta-data
                    // and cannot be installed => skip them.
                    if (!versionName.isEmpty()) {
                        String keywords = length < keywordsIndex
                                ? "" // NOI18N
                                : line.substring(keywordsIndex).trim();
                        Library library = new Library(name);
                        library.setDescription(description.trim());
                        if (!keywords.isEmpty()) {
                            library.setKeywords(keywords.split(" ")); // NOI18N
                        }
                        Library.Version version = new Library.Version(library, versionName);
                        library.setLatestVersion(version);
                        libraryList.add(0, library);
                    }
                    name = ""; // NOI18N
                    description = ""; // NOI18N
                    versionName = ""; // NOI18N
                }
            }
            return libraryList.toArray(new Library[libraryList.size()]);
        }

    }

}
