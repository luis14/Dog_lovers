package interfaz;

import javax.swing.ImageIcon;

public class JCasaCuna extends javax.swing.JFrame {

    public JCasaCuna() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Casa Cuna");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Texto2Label = new javax.swing.JLabel();
        Texto1Label = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        TipoComboBox = new javax.swing.JComboBox();
        RazaComboBox = new javax.swing.JComboBox();
        RazaLabel = new javax.swing.JLabel();
        ColorLabel = new javax.swing.JLabel();
        ColorComboBox = new javax.swing.JComboBox();
        DonacionLabel = new javax.swing.JLabel();
        DanacionSiRadioButton = new javax.swing.JRadioButton();
        DonacionNoRadioButton = new javax.swing.JRadioButton();
        CancelarButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Raza:");

        jLabel5.setText("Color:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Casa Cuna");

        Texto2Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Texto2Label.setText("Ingrese los datos para conocer el tipo de mascota que prefieres cuidar.");

        Texto1Label.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Texto1Label.setText("Esta opción te permitirá poder servir como casa cuna. ");

        TipoLabel.setText("Tipo :");

        TipoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RazaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RazaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaComboBoxActionPerformed(evt);
            }
        });

        RazaLabel.setText("Raza:");

        ColorLabel.setText("Color:");

        ColorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        DonacionLabel.setText("Requiere de una donación para la alimentación :");

        DanacionSiRadioButton.setText("Si");

        DonacionNoRadioButton.setText("No");

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        AceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButton.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CancelarButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DonacionLabel)
                                .addGap(18, 18, 18)
                                .addComponent(DanacionSiRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(DonacionNoRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(TipoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(ColorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ColorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(RazaLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RazaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Texto2Label)
                            .addComponent(Texto1Label)
                            .addComponent(jLabel1))
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Texto1Label)
                .addGap(4, 4, 4)
                .addComponent(Texto2Label)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoLabel)
                    .addComponent(TipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorLabel)
                    .addComponent(ColorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazaLabel)
                    .addComponent(RazaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DonacionLabel)
                    .addComponent(DonacionNoRadioButton)
                    .addComponent(DanacionSiRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(AceptarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void RazaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RazaComboBoxActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JComboBox ColorComboBox;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JRadioButton DanacionSiRadioButton;
    private javax.swing.JLabel DonacionLabel;
    private javax.swing.JRadioButton DonacionNoRadioButton;
    private javax.swing.JComboBox RazaComboBox;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JLabel Texto1Label;
    private javax.swing.JLabel Texto2Label;
    private javax.swing.JComboBox TipoComboBox;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
