/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
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
 * Contributor(s):
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
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
 */
package org.netbeans.modules.j2ee.sun.bridge.apis;

import javax.swing.Action;
import org.openide.actions.PropertiesAction;
import org.openide.nodes.Children;
import org.openide.util.actions.SystemAction;

/**
 * The parent class for all appserver plugin management leaf nodes. All leaf 
 * nodes for the NetBeans runtime tab J2EE plugin must extend this class for 
 * effectively communicating via AMX API.
 */
public abstract class AppserverMgmtLeafNode extends AppserverMgmtActiveNode {
  
    /**
     * Abstract constructor for an AppserverLeafNode called by subclass.
     *
     * @param nodeType The type of leaf node to construct (e.g. JVM, etc.)
     */
    public AppserverMgmtLeafNode(String nodeType) {
        super(Children.LEAF, nodeType);
    }
    
    /**
     * Abstract constructor for an AppserverLeafNode called by subclass.
     *
     * @param nodeType The type of leaf node to construct (e.g. JVM, etc.)
     */
    public AppserverMgmtLeafNode(Controller controller, String nodeType) {
        super(Children.LEAF, controller, nodeType);
    }
    
    
    /**
     * Abstract constructor for an AppserverLeafNode called by subclass.
     *
     * @param nodeType The type of leaf node to construct (e.g. JVM, etc.)
     */
    public AppserverMgmtLeafNode(final AppserverMgmtController controller, 
            final String nodeType) {
        super(Children.LEAF, controller, nodeType);
    }
    
  
    /**
     * Return the actions associated with the menu drop down seen when
     * a user right-clicks on a node in the plugin.
     *
     * @param boolean true/false
     * @return An array of Action objects.
     */
    public Action[] getActions(boolean flag) {
        return new SystemAction[] {
            SystemAction.get(PropertiesAction.class)
        };
    }
    
    /**
     * Return the default action for the node
     * a user double-clicks on a node in the plugin.
     */
    public javax.swing.Action getPreferredAction(){
        return SystemAction.get(PropertiesAction.class);
    }
}