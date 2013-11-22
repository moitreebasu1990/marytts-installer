/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package marytts.tools.newinstall;

import marytts.tools.newinstall.objects.Component;
import marytts.tools.newinstall.objects.VoiceComponent;

/**
 * 
 * @author Jonathan
 */
public class VoiceComponentPanel extends javax.swing.JPanel {

	/**
	 * Creates new form VoiceComponentPanel
	 */
	public VoiceComponentPanel(Component component) {

		initComponents();
		fillFields(component);
	}

	/* @formatter:off
	
	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of
	 * this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentNameLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        installButton = new javax.swing.JButton();
        collapseButton = new javax.swing.JToggleButton();
        collapsiblePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        versionLabel = new javax.swing.JLabel();
        licenseValueLabel = new javax.swing.JLabel();
        versionValueLabel = new javax.swing.JLabel();
        licenseLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        localeValueLabel = new javax.swing.JLabel();
        localeLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderValueLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeValueLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        sizeValueLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(520, 170));

        componentNameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        componentNameLabel.setText("jLabel1");

        statusLabel.setText("jLabel2");

        installButton.setText("Install");
        installButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installButtonActionPerformed(evt);
            }
        });

        collapseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collapseButtonActionPerformed(evt);
            }
        });

        collapsiblePanel.setPreferredSize(new java.awt.Dimension(520, 500));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Description"));
        jTextArea1.setPreferredSize(new java.awt.Dimension(132, 50));
        jScrollPane2.setViewportView(jTextArea1);

        versionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        versionLabel.setText("Version:");

        licenseValueLabel.setText("jLabel6");

        versionValueLabel.setText("jLabel4");

        licenseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        licenseLabel.setText("License:");

        javax.swing.GroupLayout collapsiblePanelLayout = new javax.swing.GroupLayout(collapsiblePanel);
        collapsiblePanel.setLayout(collapsiblePanelLayout);
        collapsiblePanelLayout.setHorizontalGroup(
            collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                .addGroup(collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(collapsiblePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                                .addComponent(licenseLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(licenseValueLabel))
                            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                                .addComponent(versionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(versionValueLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        collapsiblePanelLayout.setVerticalGroup(
            collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(collapsiblePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionLabel)
                    .addComponent(versionValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(collapsiblePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseLabel)
                    .addComponent(licenseValueLabel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        localeValueLabel.setText("jLabel");

        localeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        localeLabel.setText("Locale:");

        genderLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        genderLabel.setText("Gender:");

        genderValueLabel.setText("jLabel6");

        typeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        typeLabel.setText("Type:");

        typeValueLabel.setText("jLabel6");

        sizeLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        sizeLabel.setText("Size:");

        sizeValueLabel.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componentNameLabel)
                    .addComponent(collapseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localeValueLabel)
                        .addGap(27, 27, 27)
                        .addComponent(typeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusLabel)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(installButton)
                        .addContainerGap())))
            .addComponent(collapsiblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(componentNameLabel)
                            .addComponent(statusLabel)
                            .addComponent(localeLabel)
                            .addComponent(localeValueLabel)
                            .addComponent(typeLabel)
                            .addComponent(typeValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collapseButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(installButton)
                                .addComponent(genderLabel)
                                .addComponent(genderValueLabel)
                                .addComponent(sizeLabel)
                                .addComponent(sizeValueLabel))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(collapsiblePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

	/* @formatter:on */
	private void installButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

	}// GEN-LAST:event_jButton1ActionPerformed

	private void collapseButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jToggleButton1ActionPerformed

	private void fillFields(Component component) {
		this.componentNameLabel.setText(component.getName());
		this.jTextArea1.setText(component.getDescription().replaceAll("[\\t\\n]", " ").replaceAll("( )+", " "));
		this.versionValueLabel.setText(component.getVersion());
		this.licenseValueLabel.setText(component.getLicenseShortName());
		this.sizeValueLabel.setText(String.valueOf(component.getSize()));
		this.statusLabel.setText(component.getStatus().toString());
		this.localeValueLabel.setText(component.getLocale().toString());
		
		// TODO solve this in a better way
		if (component instanceof VoiceComponent) {
			this.typeValueLabel.setText(((VoiceComponent) component).getType());
			this.genderValueLabel.setText(((VoiceComponent) component).getGender());
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton collapseButton;
    private javax.swing.JPanel collapsiblePanel;
    private javax.swing.JLabel componentNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderValueLabel;
    private javax.swing.JButton installButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JLabel licenseValueLabel;
    private javax.swing.JLabel localeLabel;
    private javax.swing.JLabel localeValueLabel;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JLabel sizeValueLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeValueLabel;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel versionValueLabel;
    // End of variables declaration//GEN-END:variables
}