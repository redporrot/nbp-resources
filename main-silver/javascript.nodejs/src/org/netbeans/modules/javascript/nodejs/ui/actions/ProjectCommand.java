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
package org.netbeans.modules.javascript.nodejs.ui.actions;

import org.netbeans.api.project.Project;
import org.netbeans.modules.javascript.nodejs.exec.NodeExecutable;
import org.netbeans.modules.javascript.nodejs.platform.NodeJsSupport;
import org.netbeans.modules.javascript.nodejs.util.NodeInfo;
import org.netbeans.modules.javascript.nodejs.util.RunInfo;
import org.openide.util.Lookup;

abstract class ProjectCommand extends Command {

    private final boolean debug;


    public ProjectCommand(Project project, boolean debug) {
        super(project);
        this.debug = debug;
    }

    protected abstract boolean isEnabledInternal(Lookup context);
    protected abstract NodeInfo runNodeInternal(NodeExecutable node, RunInfo runInfo);

    @Override
    public final boolean isEnabled(Lookup context) {
        if (!NodeJsSupport.forProject(project).getPreferences().isRunEnabled()) {
            return false;
        }
        return isEnabledInternal(context);
    }

    @Override
    final void runInternal(Lookup context) {
        NodeJsSupport nodeJsSupport = NodeJsSupport.forProject(project);
        NodeInfo currentNodeInfo = nodeJsSupport.getCurrentNodeInfo();
        if (!currentNodeInfo.isRunning()) {
            // run it
            nodeJsSupport.setCurrentNodeInfo(runNode());
            return;
        }
        // node is running
        assert currentNodeInfo.isRunning();
        // check type + restart option
        if (currentNodeInfo.isDebug() != debug
                || nodeJsSupport.getPreferences().isRunRestart()) {
            // force restart
            currentNodeInfo.stop();
            nodeJsSupport.setCurrentNodeInfo(runNode());
        }
    }

    private NodeInfo runNode() {
        NodeExecutable node = getNode();
        if (node == null) {
            return NodeInfo.none();
        }
        RunInfo runInfo = getRunInfo();
        if (runInfo == null) {
            return NodeInfo.none();
        }
        return runNodeInternal(node, runInfo);
    }

}