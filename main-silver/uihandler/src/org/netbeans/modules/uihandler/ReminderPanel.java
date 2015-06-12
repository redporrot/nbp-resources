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
package org.netbeans.modules.uihandler;

import java.awt.Cursor;
import java.net.MalformedURLException;
import java.net.URL;
import org.openide.util.NbBundle;

/**
 * Created on December 11, 2007, 4:01 PM
 * @author  Marek Slama
 */
public class ReminderPanel extends javax.swing.JPanel {
    
    /** Creates new form ReminderPanel */
    public ReminderPanel() {
        initComponents();
        setText();
    }
    
    private void setText () {
        jBottomLabel1.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText1"));
        jBottomLabel2.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText2"));
        jBottomLabel3.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText3"));
        
        lblLearnMore.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_LearnMore"));
        lblLearnMore.getAccessibleContext().setAccessibleName
        (NbBundle.getMessage(ReminderPanel.class, "ACSN_LearnMore"));
        lblLearnMore.getAccessibleContext().setAccessibleDescription
        (NbBundle.getMessage(ReminderPanel.class, "ACSD_LearnMore"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBottomLabel1 = new javax.swing.JLabel();
        jBottomLabel2 = new javax.swing.JLabel();
        jBottomLabel3 = new javax.swing.JLabel();
        lblLearnMore = new javax.swing.JLabel();

        setFocusable(false);

        jBottomLabel1.setText("<html>Help us improve the NetBeans IDE by providing anonymous usage data.</html>"); // NOI18N
        jBottomLabel1.setFocusable(false);
        jBottomLabel1.setRequestFocusEnabled(false);

        jBottomLabel2.setText("<html>If you agree to participate, the IDE will send anonymous information about the high-level features that you use to a database at netbeans.org.</html>"); // NOI18N
        jBottomLabel2.setFocusable(false);
        jBottomLabel2.setRequestFocusEnabled(false);

        jBottomLabel3.setText("<html>The usage statistics help us better understand user requirements and prioritize improvements in future releases. We will never reverse-engineer the collected data to find specific details about your projects.</html>"); // NOI18N
        jBottomLabel3.setFocusable(false);
        jBottomLabel3.setRequestFocusEnabled(false);

        lblLearnMore.setText("<html><font color=\"#0000FF\" <u>Learn more</u></font></html>"); // NOI18N
        lblLearnMore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLearnMoreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLearnMoreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBottomLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jBottomLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(lblLearnMore, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jBottomLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBottomLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBottomLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBottomLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLearnMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBottomLabel1.getAccessibleContext().setAccessibleName(""); // NOI18N
        jBottomLabel2.getAccessibleContext().setAccessibleName(""); // NOI18N
        jBottomLabel3.getAccessibleContext().setAccessibleName(""); // NOI18N
        lblLearnMore.getAccessibleContext().setAccessibleName(""); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void lblLearnMoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnMoreMouseEntered
        evt.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}//GEN-LAST:event_lblLearnMoreMouseEntered

    private void lblLearnMoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnMoreMousePressed
        URL u = null;
        try {
            u = new URL(NbBundle.getMessage(ReminderPanel.class, "METRICS_INFO_URL"));
        } catch (MalformedURLException exc) {
        }
        if (u != null) {
            org.openide.awt.HtmlBrowser.URLDisplayer.getDefault().showURL(u);
        }
    }//GEN-LAST:event_lblLearnMoreMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBottomLabel1;
    private javax.swing.JLabel jBottomLabel2;
    private javax.swing.JLabel jBottomLabel3;
    private javax.swing.JLabel lblLearnMore;
    // End of variables declaration//GEN-END:variables
    
}