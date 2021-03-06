/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2012 Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyrighted 2012 Sun Microsystems, Inc.
 */
package org.netbeans.modules.javascript2.editor.doc;

import java.util.LinkedList;
import java.util.List;
import org.netbeans.modules.javascript2.editor.doc.spi.DocParameter;
import org.netbeans.modules.javascript2.editor.doc.spi.JsComment;
import org.netbeans.modules.javascript2.editor.model.Type;
import org.openide.util.NbBundle.Messages;

/**
 * Contains method for printing documentation entries.
 *
 * @author Martin Fousek <marfous@netbeans.org>
 */
public class JsDocumentationPrinter {

    private static final String WRAPPER_HEADER = "h3"; //NOI18N
    private static final String WRAPPER_SUBHEADER = "h4"; //NOI18N
    private static final String TABLE_BEGIN = "<table style=\"margin-left: 10px;\">\n"; //NOI18N
    private static final String PARAGRAPH_BEGIN = "<p style=\"margin: 0px 14px 0px 14px;\">"; //NOI18N

    private static final String OPTIONAL_PARAMETER = "[optional]"; //NOI18N
    private static final String OPTIONAL_PARAMETER_DEFAULT = "[optional, default=%s]"; //NOI18N

    @Messages({
        "# T13Y: All following words are section headers of the documentation window. Mostly ends with colon.",
        "JsDocumentationPrinter.title.type=Type",
        "JsDocumentationPrinter.title.description=Description",
        "JsDocumentationPrinter.title.deprecated=Deprecated",
        "JsDocumentationPrinter.title.parameters=Parameters",
        "JsDocumentationPrinter.title.returns=Returns",
        "JsDocumentationPrinter.title.throws=Throws",
        "JsDocumentationPrinter.title.extends=Extends",
        "JsDocumentationPrinter.title.since=Since",
        "JsDocumentationPrinter.title.examples=Examples",
        "JsDocumentationPrinter.title.see=See",
    })
    private JsDocumentationPrinter() {
    }

    /**
     * Prints documentation for CC doc window.
     *
     * @param jsComment docBlock
     * @return formatted documentation
     */
    public static String printDocumentation(JsComment jsComment) {
        StringBuilder sb = new StringBuilder();

        sb.append(printSyntax(jsComment));
        sb.append(printDeprecated(jsComment));
        sb.append(printSummary(jsComment));
        sb.append(printParameters(jsComment));
        sb.append(printReturns(jsComment));
        sb.append(printExtends(jsComment));
        sb.append(printThrows(jsComment));
        sb.append(printExamples(jsComment));
        sb.append(printSince(jsComment));
        sb.append(printSee(jsComment));
        
        // Doesn't seem to be important information by developing - for Code Completion documentation
//        sb.append(printVersion(jsComment));
//        sb.append(printAuthor(jsComment));

        return sb.toString();
    }

    /**
     * Prints parameter documentation for the CC doc window.
     *
     * @param docParameter parameter
     * @return formatted documentation
     */
    public static String printParameterDocumentation(DocParameter docParameter) {
        StringBuilder sb = new StringBuilder();
        sb.append(renderHeader(WRAPPER_HEADER, Bundle.JsDocumentationPrinter_title_type()));
        sb.append(renderSingleValueFromTypes(docParameter.getParamTypes()));
        sb.append(renderHeader(WRAPPER_HEADER, Bundle.JsDocumentationPrinter_title_description()));
        sb.append(renderSingleValue(docParameter.getParamDescription()));
        return sb.toString();
    }

    private static String printDeprecated(JsComment jsComment) {
        if (jsComment.getDeprecated() == null) {
            return ""; //NOI18N
        }

        StringBuilder sb = new StringBuilder("<p style=\"margin: 0px 5px 0px 5px;\"><b>"); //NOI18N
        sb.append(Bundle.JsDocumentationPrinter_title_deprecated()).append(".</b>\n"); //NOI18N
        if (!jsComment.getDeprecated().isEmpty()) {
            sb.append(" <i>").append(jsComment.getDeprecated()).append("</i>\n"); //NOI18N
        }
        sb.append("</p>\n"); //NOI18N
        return sb.toString();
    }

    private static String printSyntax(JsComment jsComment) {
        List<String> syntax = jsComment.getSyntax();
        if (!syntax.isEmpty()) {
            StringBuilder sb = new StringBuilder("<p style=\"background-color: #C7C7C7; width: 100%; padding: 3px; margin: 10 5 3 5;\">\n"); //NOI18N
            for (String descElement : syntax) {
                sb.append(descElement).append("<br>\n"); //NOI18N
            }
            sb.append("</p>\n"); //NOI18N
            return sb.toString();
        }
        return ""; //NOI18N
    }

    private static String printSummary(JsComment jsComment) {
        List<String> summary = jsComment.getSummary();
        if (!summary.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String descElement : summary) {
                sb.append("<p style=\"margin: 5px 5px 0px 5px;\">\n"); //NOI18N
                sb.append(descElement).append("\n"); //NOI18N;
                sb.append("</p>\n");
            }
            return sb.toString();
        }
        return ""; //NOI18N
    }

    private static String printParameters(JsComment jsComment) {
        List<DocParameter> parameters = jsComment.getParameters();
        if (!parameters.isEmpty()) {
            StringBuilder sb = new StringBuilder(renderHeader(WRAPPER_HEADER, Bundle.JsDocumentationPrinter_title_parameters()));
            sb.append(TABLE_BEGIN); //NOI18N
            for (DocParameter docParam : parameters) {
                String paramName = (docParam.getParamName() == null) ? "" : docParam.getParamName().getName(); //NOI18N
                sb.append("<tr>\n"); //NOI18N
                sb.append("<td valign=\"top\" style=\"margin-right:5px;\">").append(getStringFromTypes(docParam.getParamTypes())).append("</td>\n"); //NOI18N
                sb.append("<td valign=\"top\" style=\"margin-right:5px;\"><b>").append(paramName).append("</b></td>\n"); //NOI18N
                String description = docParam.getParamDescription();
                if (docParam.isOptional()) {
                    if (docParam.getDefaultValue() == null || docParam.getDefaultValue().isEmpty()) {
                        description = OPTIONAL_PARAMETER + "<br>" + description; //NOI18N
                    } else {
                        description = String.format(OPTIONAL_PARAMETER_DEFAULT, docParam.getDefaultValue()) + "<br>" + description; //NOI18N
                    }
                }
                sb.append("<td>").append(description).append("</td>\n"); //NOI18N
                sb.append("</tr>\n"); //NOI18N
            }
            sb.append("</table>\n"); //NOI18N
            return sb.toString();
        }
        return ""; //NOI18N
    }

    private static String printReturns(JsComment jsComment) {
        DocParameter returns = jsComment.getReturnType();
        if (returns != null) {
            StringBuilder sb = new StringBuilder(renderHeader(WRAPPER_HEADER, Bundle.JsDocumentationPrinter_title_returns()));
            sb.append(TABLE_BEGIN); //NOI18N
            if (!returns.getParamTypes().isEmpty()) {
                sb.append("<tr>\n"); //NOI18N
                sb.append("<td valign=\"top\" style=\"margin-right:5px;\"><b>"); //NOI18N
                sb.append(Bundle.JsDocumentationPrinter_title_type());
                sb.append(":</b></td>\n"); //NOI18N
                sb.append("<td valign=\"top\">").append(getStringFromTypes(returns.getParamTypes())).append("</td>\n"); //NOI18N
                sb.append("</tr>\n"); //NOI18N
            }
            if (!returns.getParamDescription().isEmpty()) {
                sb.append("<tr>\n"); //NOI18N
                sb.append("<td valign=\"top\" style=\"margin-right:5px;\"><b>"); //NOI18N
                sb.append(Bundle.JsDocumentationPrinter_title_description());
                sb.append(":</b></td>\n"); //NOI18N
                sb.append("<td valign=\"top\">").append(returns.getParamDescription()).append("</td>\n"); //NOI18N
                sb.append("</tr>\n"); //NOI18N
            }
            sb.append("</table>\n"); //NOI18N
            return sb.toString();
        }
        return ""; //NOI18N
    }

    private static String printThrows(JsComment jsComment) {
        List<DocParameter> throwsList = jsComment.getThrows();
        if (!throwsList.isEmpty()) {
            StringBuilder sb = new StringBuilder(renderHeader(WRAPPER_SUBHEADER, Bundle.JsDocumentationPrinter_title_throws()));
            sb.append(TABLE_BEGIN); //NOI18N
            for (DocParameter throwClause : throwsList) {
                sb.append("<tr>\n"); //NOI18N
                if (!throwClause.getParamTypes().isEmpty()) {
                    sb.append("<td valign=\"top\">").append(getStringFromTypes(throwClause.getParamTypes())).append("</td>\n"); //NOI18N
                } else {
                    sb.append("<td></td>\n"); //NOI18N
                }
                if (!throwClause.getParamDescription().isEmpty()) {
                    sb.append("<td valign=\"top\">").append(throwClause.getParamDescription()).append("</td>\n"); //NOI18N
                } else {
                    sb.append("<td></td>\n"); //NOI18N
                }
                sb.append("</tr>\n"); //NOI18N
            }
            sb.append("</table>\n");
            return sb.toString();
        }
        return ""; //NOI18N
    }

    private static String printExtends(JsComment jsComment) {
        List<Type> extendsList = jsComment.getExtends();
        if (!extendsList.isEmpty()) {
            return renderHeader(WRAPPER_SUBHEADER, Bundle.JsDocumentationPrinter_title_extends()) + renderSingleValueFromTypes(extendsList);
        }
        return ""; //NOI18N
    }

    private static String printSince(JsComment jsComment) {
        String since = jsComment.getSince();
        if (since != null && !since.isEmpty()) {
            return renderHeader(WRAPPER_SUBHEADER, Bundle.JsDocumentationPrinter_title_since()) + renderSingleValue(since);
        }
        return ""; //NOI18N
    }

//    private static String printVersion(JsComment jsComment) {
//        String version = jsComment.getVersion();
//        if (version != null && !version.isEmpty()) {
//            return renderHeader(WRAPPER_SUBHEADER, "Version") + renderSingleValue(version); //NOI18N
//        }
//        return ""; //NOI18N
//    }
//
//    private static String printAuthor(JsComment jsComment) {
//        List<String> authors = jsComment.getAuthor();
//        if (!authors.isEmpty()) {
//            return renderHeader(WRAPPER_SUBHEADER, "Authors") + renderSingleValueFromStrings(authors); //NOI18N
//        }
//        return ""; //NOI18N
//    }

    private static String printExamples(JsComment jsComment) {
        List<String> examples = jsComment.getExamples();
        if (!examples.isEmpty()) {
            return renderHeader(WRAPPER_SUBHEADER, Bundle.JsDocumentationPrinter_title_examples()) + renderLines(examples);
        }
        return ""; //NOI18N
    }

    private static String printSee(JsComment jsComment) {
        List<String> sees = jsComment.getSee();
        if (!sees.isEmpty()) {
            return renderHeader(WRAPPER_SUBHEADER, Bundle.JsDocumentationPrinter_title_see()) + renderLines(sees);
        }
        return ""; //NOI18N
    }

    private static String renderHeader(String headerType, String header) {
        StringBuilder sb = new StringBuilder("<").append(headerType).append(" style=\"margin: 10px 0px 5px 0px\">"); //NOI18N
        sb.append(header).append(":"); //NOI18N
        sb.append("</").append(headerType).append(">\n"); //NOI18N
        return sb.toString();
    }

    private static String renderLines(List<String> lines) {
        StringBuilder sb = new StringBuilder();
        sb.append(TABLE_BEGIN); //NOI18N
        for (String line : lines) {
            sb.append("<tr>\n"); //NOI18N
            sb.append("<td valign=\"top\">").append(line).append("</td>\n"); //NOI18N
            sb.append("</tr>\n"); //NOI18N
        }
        sb.append("</table>\n"); //NOI18N
        return sb.toString();
    }

    private static String renderSingleValue(String value) {
        StringBuilder sb = new StringBuilder();
        sb.append(PARAGRAPH_BEGIN).append(value).append("</p>\n"); //NOI18N
        return sb.toString();
    }

    private static String renderSingleValueFromStrings(List<String> values) {
        StringBuilder sb = new StringBuilder();
        String delimiter = ""; //NOI18N
        for (String author : values) {
            sb.append(delimiter).append(author);
            delimiter = ", "; //NOI18N
        }
        return renderSingleValue(sb.toString());
    }

    private static String renderSingleValueFromTypes(List<Type> types) {
        List<String> values = new LinkedList<String>();
        for (Type type : types) {
            values.add(type.getType());
        }
        return renderSingleValueFromStrings(values);
    }

    private static String getStringFromTypes(List<? extends Type> types) {
        StringBuilder sb = new StringBuilder();
        String delimiter = ""; //NOI18N
        for (Type type : types) {
            sb.append(delimiter).append(type.getType());
            delimiter = " | "; //NOI18N
        }
        return sb.toString();
    }
}
