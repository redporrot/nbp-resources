/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyrighted 2009 Sun Microsystems, Inc.
 */

package org.netbeans.modules.php.phpunit.ui.customizer;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.netbeans.modules.php.api.phpmodule.PhpModule;
import org.netbeans.modules.php.api.validation.ValidationResult;
import org.netbeans.modules.php.phpunit.commands.PhpUnit;
import org.netbeans.modules.php.phpunit.preferences.PhpUnitPreferences;
import org.netbeans.modules.php.phpunit.preferences.PhpUnitPreferencesValidator;
import org.netbeans.spi.project.ui.support.ProjectCustomizer;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.Mnemonics;
import org.openide.filesystems.FileChooserBuilder;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;

/**
 * @author Tomas Mysik
 */
public final class CustomizerPhpUnit extends JPanel implements HelpCtx.Provider {

    private static final long serialVersionUID = 2171421712032630826L;

    private final ProjectCustomizer.Category category;
    private final PhpModule phpModule;


    public CustomizerPhpUnit(ProjectCustomizer.Category category, PhpModule phpModule) {
        this.category = category;
        this.phpModule = phpModule;

        initComponents();
        init();
    }

    private void init() {
        initFile(PhpUnitPreferences.isBootstrapEnabled(phpModule),
                PhpUnitPreferences.getBootstrapPath(phpModule),
                bootstrapCheckBox, bootstrapTextField);
        bootstrapForCreateTestsCheckBox.setSelected(PhpUnitPreferences.isBootstrapForCreateTests(phpModule));
        initFile(PhpUnitPreferences.isConfigurationEnabled(phpModule),
                PhpUnitPreferences.getConfigurationPath(phpModule),
                configurationCheckBox, configurationTextField);
        initFile(PhpUnitPreferences.isCustomSuiteEnabled(phpModule),
                PhpUnitPreferences.getCustomSuitePath(phpModule),
                suiteCheckBox, suiteTextField);
        initFile(PhpUnitPreferences.isPhpUnitEnabled(phpModule),
                PhpUnitPreferences.getPhpUnitPath(phpModule),
                scriptCheckBox, scriptTextField);
        runTestUsingUnitCheckBox.setSelected(PhpUnitPreferences.getRunAllTestFiles(phpModule));
        askForTestGroupsCheckBox.setSelected(PhpUnitPreferences.getAskForTestGroups(phpModule));

        enableFile(bootstrapCheckBox.isSelected(), bootstrapLabel, bootstrapTextField, bootstrapGenerateButton, bootstrapBrowseButton, bootstrapForCreateTestsCheckBox);
        enableFile(configurationCheckBox.isSelected(), configurationLabel, configurationTextField, configurationGenerateButton, configurationBrowseButton);
        enableFile(suiteCheckBox.isSelected(), suiteLabel, suiteTextField, suiteBrowseButton, suiteInfoLabel);
        enableFile(scriptCheckBox.isSelected(), scriptLabel, scriptTextField, scriptBrowseButton);

        addListeners();
        validateData();
        category.setStoreListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                storeData();
            }
        });
    }

    @Override
    public HelpCtx getHelpCtx() {
        // do not change, backward compatibility
        return new HelpCtx("org.netbeans.modules.php.project.ui.customizer.CustomizerPhpUnit"); // NOI18N
    }

    void enableFile(boolean enabled, JComponent... components) {
        for (JComponent component : components) {
            component.setEnabled(enabled);
        }
    }

    void validateData() {
        ValidationResult result = new PhpUnitPreferencesValidator()
                .validateBootstrap(bootstrapCheckBox.isSelected(), bootstrapTextField.getText())
                .validateConfiguration(configurationCheckBox.isSelected(), configurationTextField.getText())
                .validateCustomSuite(suiteCheckBox.isSelected(), suiteTextField.getText())
                .validatePhpUnit(scriptCheckBox.isSelected(), scriptTextField.getText())
                .getResult();
        for (ValidationResult.Message message : result.getErrors()) {
            category.setErrorMessage(message.getMessage());
            category.setValid(false);
            return;
        }
        for (ValidationResult.Message message : result.getWarnings()) {
            category.setErrorMessage(message.getMessage());
            category.setValid(true);
            return;
        }
        category.setErrorMessage(null);
        category.setValid(true);
    }

    void storeData() {
        PhpUnitPreferences.setBootstrapEnabled(phpModule, bootstrapCheckBox.isSelected());
        PhpUnitPreferences.setBootstrapPath(phpModule, bootstrapTextField.getText());
        PhpUnitPreferences.setBootstrapForCreateTests(phpModule, bootstrapForCreateTestsCheckBox.isSelected());
        PhpUnitPreferences.setConfigurationEnabled(phpModule, configurationCheckBox.isSelected());
        PhpUnitPreferences.setConfigurationPath(phpModule, configurationTextField.getText());
        PhpUnitPreferences.setCustomSuiteEnabled(phpModule, suiteCheckBox.isSelected());
        PhpUnitPreferences.setCustomSuitePath(phpModule, suiteTextField.getText());
        PhpUnitPreferences.setPhpUnitEnabled(phpModule, scriptCheckBox.isSelected());
        PhpUnitPreferences.setPhpUnitPath(phpModule, scriptTextField.getText());
        PhpUnitPreferences.setRunAllTestFiles(phpModule, runTestUsingUnitCheckBox.isSelected());
        PhpUnitPreferences.setAskForTestGroups(phpModule, askForTestGroupsCheckBox.isSelected());
    }

    private void initFile(boolean enabled, String file, JCheckBox checkBox, JTextField textField) {
        checkBox.setSelected(enabled);
        textField.setText(file);
    }

    private void addListeners() {
        DocumentListener defaultDocumentListener = new DefaultDocumentListener();
        bootstrapCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                enableFile(e.getStateChange() == ItemEvent.SELECTED,
                        bootstrapLabel, bootstrapTextField, bootstrapGenerateButton, bootstrapBrowseButton, bootstrapForCreateTestsCheckBox);
                validateData();
            }
        });
        bootstrapTextField.getDocument().addDocumentListener(defaultDocumentListener);
        bootstrapForCreateTestsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validateData();
            }
        });

        configurationCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                enableFile(e.getStateChange() == ItemEvent.SELECTED, configurationLabel, configurationTextField, configurationGenerateButton, configurationBrowseButton);
                validateData();
            }
        });
        configurationTextField.getDocument().addDocumentListener(defaultDocumentListener);

        suiteCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                enableFile(e.getStateChange() == ItemEvent.SELECTED, suiteLabel, suiteTextField, suiteBrowseButton, suiteInfoLabel);
                validateData();
            }
        });
        suiteTextField.getDocument().addDocumentListener(defaultDocumentListener);

        scriptCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                enableFile(e.getStateChange() == ItemEvent.SELECTED, scriptLabel, scriptTextField, scriptBrowseButton);
                validateData();
            }
        });
        scriptTextField.getDocument().addDocumentListener(defaultDocumentListener);

        final ItemListener validateItemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                validateData();
            }
        };
        runTestUsingUnitCheckBox.addItemListener(validateItemListener);
        askForTestGroupsCheckBox.addItemListener(validateItemListener);
    }

    private File getDefaultDirectory() {
        File defaultDirectory;
        FileObject testDirectory = phpModule.getTestDirectory(null);
        if (testDirectory != null) {
            defaultDirectory = FileUtil.toFile(testDirectory);
        } else {
            FileObject sourcesDirectory = phpModule.getSourceDirectory();
            assert sourcesDirectory != null;
            defaultDirectory = FileUtil.toFile(sourcesDirectory);
        }
        assert defaultDirectory != null;
        return defaultDirectory;
    }

    @NbBundle.Messages("CustomizerPhpUnit.error.noTestDir=Test directory is not set yet. Set it in Sources category and save this dialog.")
    private boolean checkTestDirectory() {
        if (phpModule.getTestDirectory(null) == null) {
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message(Bundle.CustomizerPhpUnit_error_noTestDir(), NotifyDescriptor.INFORMATION_MESSAGE));
            return false;
        }
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bootstrapLabel = new JLabel();
        bootstrapTextField = new JTextField();
        bootstrapBrowseButton = new JButton();
        bootstrapGenerateButton = new JButton();
        bootstrapForCreateTestsCheckBox = new JCheckBox();
        configurationCheckBox = new JCheckBox();
        configurationLabel = new JLabel();
        configurationTextField = new JTextField();
        configurationBrowseButton = new JButton();
        bootstrapCheckBox = new JCheckBox();
        configurationGenerateButton = new JButton();
        suiteCheckBox = new JCheckBox();
        suiteLabel = new JLabel();
        suiteTextField = new JTextField();
        suiteBrowseButton = new JButton();
        suiteInfoLabel = new JLabel();
        scriptCheckBox = new JCheckBox();
        scriptLabel = new JLabel();
        scriptTextField = new JTextField();
        scriptBrowseButton = new JButton();
        runTestUsingUnitCheckBox = new JCheckBox();
        askForTestGroupsCheckBox = new JCheckBox();

        bootstrapLabel.setLabelFor(bootstrapTextField);
        Mnemonics.setLocalizedText(bootstrapLabel, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapLabel.text")); // NOI18N

        bootstrapTextField.setColumns(20);

        Mnemonics.setLocalizedText(bootstrapBrowseButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapBrowseButton.text")); // NOI18N
        bootstrapBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bootstrapBrowseButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(bootstrapGenerateButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapGenerateButton.text")); // NOI18N
        bootstrapGenerateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bootstrapGenerateButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(bootstrapForCreateTestsCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapForCreateTestsCheckBox.text")); // NOI18N

        Mnemonics.setLocalizedText(configurationCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationCheckBox.text")); // NOI18N

        configurationLabel.setLabelFor(configurationTextField);
        Mnemonics.setLocalizedText(configurationLabel, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationLabel.text")); // NOI18N

        configurationTextField.setColumns(20);

        Mnemonics.setLocalizedText(configurationBrowseButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationBrowseButton.text")); // NOI18N
        configurationBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                configurationBrowseButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(bootstrapCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapCheckBox.text")); // NOI18N

        Mnemonics.setLocalizedText(configurationGenerateButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationGenerateButton.text")); // NOI18N
        configurationGenerateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                configurationGenerateButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(suiteCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteCheckBox.text")); // NOI18N

        suiteLabel.setLabelFor(suiteTextField);
        Mnemonics.setLocalizedText(suiteLabel, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteLabel.text")); // NOI18N

        suiteTextField.setColumns(20);

        Mnemonics.setLocalizedText(suiteBrowseButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteBrowseButton.text")); // NOI18N
        suiteBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                suiteBrowseButtonActionPerformed(evt);
            }
        });

        suiteInfoLabel.setLabelFor(this);
        Mnemonics.setLocalizedText(suiteInfoLabel, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteInfoLabel.text")); // NOI18N

        Mnemonics.setLocalizedText(scriptCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.scriptCheckBox.text")); // NOI18N

        Mnemonics.setLocalizedText(scriptLabel, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.scriptLabel.text")); // NOI18N

        scriptTextField.setColumns(20);

        Mnemonics.setLocalizedText(scriptBrowseButton, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.scriptBrowseButton.text")); // NOI18N
        scriptBrowseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                scriptBrowseButtonActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(runTestUsingUnitCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.runTestUsingUnitCheckBox.text")); // NOI18N

        Mnemonics.setLocalizedText(askForTestGroupsCheckBox, NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.askForTestGroupsCheckBox.text")); // NOI18N

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addComponent(configurationCheckBox)
                    .addComponent(suiteCheckBox)
                    .addComponent(bootstrapCheckBox)
                    .addComponent(runTestUsingUnitCheckBox)
                    .addComponent(askForTestGroupsCheckBox)
                    .addComponent(scriptCheckBox))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(configurationLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(configurationTextField, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(configurationBrowseButton)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(configurationGenerateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(suiteLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suiteInfoLabel)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suiteTextField)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(suiteBrowseButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bootstrapForCreateTestsCheckBox)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bootstrapLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(bootstrapTextField, GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(bootstrapBrowseButton)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(bootstrapGenerateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scriptLabel)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(scriptTextField)
                        .addPreferredGap(ComponentPlacement.RELATED)
                        .addComponent(scriptBrowseButton))))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new Component[] {bootstrapBrowseButton, bootstrapGenerateButton, configurationBrowseButton, configurationGenerateButton, scriptBrowseButton, suiteBrowseButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(bootstrapCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(bootstrapLabel)
                    .addComponent(bootstrapTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(bootstrapGenerateButton)
                    .addComponent(bootstrapBrowseButton))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(bootstrapForCreateTestsCheckBox)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(configurationCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(configurationLabel)
                    .addComponent(configurationTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(configurationGenerateButton)
                    .addComponent(configurationBrowseButton))
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(suiteCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(suiteLabel)
                    .addComponent(suiteTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(suiteBrowseButton))
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(suiteInfoLabel)
                .addPreferredGap(ComponentPlacement.UNRELATED)
                .addComponent(scriptCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(scriptLabel)
                    .addComponent(scriptTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(scriptBrowseButton))
                .addGap(18, 18, 18)
                .addComponent(runTestUsingUnitCheckBox)
                .addPreferredGap(ComponentPlacement.RELATED)
                .addComponent(askForTestGroupsCheckBox))
        );

        bootstrapLabel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapLabel.AccessibleContext.accessibleName")); // NOI18N
        bootstrapLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapLabel.AccessibleContext.accessibleDescription")); // NOI18N
        bootstrapTextField.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapTextField.AccessibleContext.accessibleName")); // NOI18N
        bootstrapTextField.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapTextField.AccessibleContext.accessibleDescription")); // NOI18N
        bootstrapBrowseButton.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapBrowseButton.AccessibleContext.accessibleName")); // NOI18N
        bootstrapBrowseButton.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapBrowseButton.AccessibleContext.accessibleDescription")); // NOI18N
        bootstrapGenerateButton.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapGenerateButton.AccessibleContext.accessibleName")); // NOI18N
        bootstrapGenerateButton.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapGenerateButton.AccessibleContext.accessibleDescription")); // NOI18N
        bootstrapForCreateTestsCheckBox.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapForCreateTestsCheckBox.AccessibleContext.accessibleName")); // NOI18N
        bootstrapForCreateTestsCheckBox.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapForCreateTestsCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        configurationCheckBox.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationCheckBox.AccessibleContext.accessibleName")); // NOI18N
        configurationCheckBox.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        configurationLabel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationLabel.AccessibleContext.accessibleName")); // NOI18N
        configurationLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationLabel.AccessibleContext.accessibleDescription")); // NOI18N
        configurationTextField.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationTextField.AccessibleContext.accessibleName")); // NOI18N
        configurationTextField.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationTextField.AccessibleContext.accessibleDescription")); // NOI18N
        configurationBrowseButton.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationBrowseButton.AccessibleContext.accessibleName")); // NOI18N
        configurationBrowseButton.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationBrowseButton.AccessibleContext.accessibleDescription")); // NOI18N
        bootstrapCheckBox.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapCheckBox.AccessibleContext.accessibleName")); // NOI18N
        bootstrapCheckBox.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.bootstrapCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        configurationGenerateButton.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationGenerateButton.AccessibleContext.accessibleName")); // NOI18N
        configurationGenerateButton.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.configurationGenerateButton.AccessibleContext.accessibleDescription")); // NOI18N
        suiteCheckBox.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteCheckBox.AccessibleContext.accessibleName")); // NOI18N
        suiteCheckBox.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        suiteLabel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteLabel.AccessibleContext.accessibleName")); // NOI18N
        suiteLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteLabel.AccessibleContext.accessibleDescription")); // NOI18N
        suiteTextField.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteTextField.AccessibleContext.accessibleName")); // NOI18N
        suiteTextField.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteTextField.AccessibleContext.accessibleDescription")); // NOI18N
        suiteBrowseButton.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteBrowseButton.AccessibleContext.accessibleName")); // NOI18N
        suiteBrowseButton.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteBrowseButton.AccessibleContext.accessibleDescription")); // NOI18N
        suiteInfoLabel.getAccessibleContext().setAccessibleName(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteInfoLabel.AccessibleContext.accessibleName")); // NOI18N
        suiteInfoLabel.getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.suiteInfoLabel.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleDescription(NbBundle.getMessage(CustomizerPhpUnit.class, "CustomizerPhpUnit.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    @NbBundle.Messages("CustomizerPhpUnit.chooser.bootstrap=Select PHPUnit bootstrap file")
    private void bootstrapBrowseButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bootstrapBrowseButtonActionPerformed
        File file = new FileChooserBuilder(CustomizerPhpUnit.class)
                .setTitle(Bundle.CustomizerPhpUnit_chooser_bootstrap())
                .setFilesOnly(true)
                .setDefaultWorkingDirectory(getDefaultDirectory())
                .forceUseOfDefaultWorkingDirectory(true)
                .showOpenDialog();
        if (file != null) {
            bootstrapTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_bootstrapBrowseButtonActionPerformed

    private void bootstrapGenerateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_bootstrapGenerateButtonActionPerformed
        if (checkTestDirectory()) {
            File bootstrap = PhpUnit.createBootstrapFile(phpModule);
            if (bootstrap != null) {
                bootstrapTextField.setText(bootstrap.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_bootstrapGenerateButtonActionPerformed

    @NbBundle.Messages("CustomizerPhpUnit.chooser.configuration=Select PHPUnit XML configuration file")
    private void configurationBrowseButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_configurationBrowseButtonActionPerformed
        File file = new FileChooserBuilder(CustomizerPhpUnit.class)
                .setTitle(Bundle.CustomizerPhpUnit_chooser_configuration())
                .setFilesOnly(true)
                .setDefaultWorkingDirectory(getDefaultDirectory())
                .forceUseOfDefaultWorkingDirectory(true)
                .showOpenDialog();
        if (file != null) {
            configurationTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_configurationBrowseButtonActionPerformed

    private void configurationGenerateButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_configurationGenerateButtonActionPerformed
        if (checkTestDirectory()) {
            File configuration = PhpUnit.createConfigurationFile(phpModule);
            if (configuration != null) {
                configurationTextField.setText(configuration.getAbsolutePath());
            }
        }
    }//GEN-LAST:event_configurationGenerateButtonActionPerformed

    @NbBundle.Messages("CustomizerPhpUnit.chooser.suite=Select PHPUnit test suite file")
    private void suiteBrowseButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_suiteBrowseButtonActionPerformed
        File file = new FileChooserBuilder(CustomizerPhpUnit.class)
                .setTitle(Bundle.CustomizerPhpUnit_chooser_suite())
                .setFilesOnly(true)
                .setDefaultWorkingDirectory(getDefaultDirectory())
                .forceUseOfDefaultWorkingDirectory(true)
                .showOpenDialog();
        if (file != null) {
            suiteTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_suiteBrowseButtonActionPerformed

    @NbBundle.Messages("CustomizerPhpUnit.chooser.phpUnit=Select PHPUnit script")
    private void scriptBrowseButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_scriptBrowseButtonActionPerformed
        File file = new FileChooserBuilder(CustomizerPhpUnit.class)
                .setTitle(Bundle.CustomizerPhpUnit_chooser_phpUnit())
                .setFilesOnly(true)
                .setDefaultWorkingDirectory(getDefaultDirectory())
                .forceUseOfDefaultWorkingDirectory(true)
                .showOpenDialog();
        if (file != null) {
            scriptTextField.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_scriptBrowseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox askForTestGroupsCheckBox;
    private JButton bootstrapBrowseButton;
    private JCheckBox bootstrapCheckBox;
    private JCheckBox bootstrapForCreateTestsCheckBox;
    private JButton bootstrapGenerateButton;
    private JLabel bootstrapLabel;
    private JTextField bootstrapTextField;
    private JButton configurationBrowseButton;
    private JCheckBox configurationCheckBox;
    private JButton configurationGenerateButton;
    private JLabel configurationLabel;
    private JTextField configurationTextField;
    private JCheckBox runTestUsingUnitCheckBox;
    private JButton scriptBrowseButton;
    private JCheckBox scriptCheckBox;
    private JLabel scriptLabel;
    private JTextField scriptTextField;
    private JButton suiteBrowseButton;
    private JCheckBox suiteCheckBox;
    private JLabel suiteInfoLabel;
    private JLabel suiteLabel;
    private JTextField suiteTextField;
    // End of variables declaration//GEN-END:variables

    //~ Inner classes

    private final class DefaultDocumentListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            processUpdate();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            processUpdate();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            processUpdate();
        }
        private void processUpdate() {
            validateData();
        }
    }

}
