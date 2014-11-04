package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JRegistroMascotas extends javax.swing.JFrame {

    public JRegistroMascotas() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Mascotas");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RazaLabel = new javax.swing.JLabel();
        RazaCombo = new javax.swing.JComboBox();
        TipoLabel = new javax.swing.JLabel();
        TipoCombo = new javax.swing.JComboBox();
        NombreLabel = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ChipLabel = new javax.swing.JLabel();
        ChipText = new javax.swing.JTextField();
        ColorLabel = new javax.swing.JLabel();
        ColorCombo = new javax.swing.JComboBox();
        CargarButton = new javax.swing.JButton();
        EmailLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PerdidoRadio = new javax.swing.JRadioButton();
        EncontradoRadio = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        LugarText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FechaText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        RecompensaText = new javax.swing.JTextField();
        ColonesRadio = new javax.swing.JRadioButton();
        DolaresRadio = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionText = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        TamanlText = new javax.swing.JTextField();
        ImagenLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        RazaLabel.setText("Raza:");

        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RazaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaComboActionPerformed(evt);
            }
        });

        TipoLabel.setText("Tipo:");

        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        NombreLabel.setText("Nombre:");

        ChipLabel.setText("Chip:");

        ColorLabel.setText("Color:");

        ColorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CargarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410329443_go-top-16.png"))); // NOI18N
        CargarButton.setText("Cargar imagen");

        EmailLabel.setText("Tamaño:");

        jLabel8.setText("Estado:");

        PerdidoRadio.setText("Perdido");
        PerdidoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerdidoRadioActionPerformed(evt);
            }
        });

        EncontradoRadio.setText("Encontrado");
        EncontradoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncontradoRadioActionPerformed(evt);
            }
        });

        jLabel9.setText("Lugar:");

        LugarText.setText("Lugar donde fue perdido o encontrado");

        jLabel10.setText("Fecha:");

        FechaText.setText("Fecha en la que fue perdido o encontrado");

        jLabel11.setText("Recompensa:");

        ColonesRadio.setText("Colones");
        ColonesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColonesRadioActionPerformed(evt);
            }
        });

        DolaresRadio.setText("Dolares");
        DolaresRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DolaresRadioActionPerformed(evt);
            }
        });

        jLabel12.setText("Descripción:");

        DescripcionText.setColumns(20);
        DescripcionText.setRows(5);
        jScrollPane1.setViewportView(DescripcionText);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312077_add.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Registro de Mascotas");

        ImagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pets-128.png"))); // NOI18N
        ImagenLabel.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Todos los espacios deben estar llenos.");
        jLabel1.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ChipLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(ChipText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TipoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RazaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ColorLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CargarButton)
                                            .addComponent(ImagenLabel))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EmailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TamanlText, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ColonesRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DolaresRadio))
                                    .addComponent(RecompensaText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaText)
                                    .addComponent(LugarText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PerdidoRadio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EncontradoRadio)))))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoLabel)
                            .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RazaLabel)
                            .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreLabel)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ChipLabel)
                            .addComponent(ChipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorLabel)
                            .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel)
                            .addComponent(TamanlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ImagenLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PerdidoRadio)
                            .addComponent(EncontradoRadio))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LugarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(RecompensaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColonesRadio)
                            .addComponent(DolaresRadio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RazaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RazaComboActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String estado;
        if(PerdidoRadio.isSelected()){
            estado = "Perdido";
        }else{
            estado = "Encontrado";
        }

        if(VerificaMascota()){
            Administrador.RegistrarMascota(NombreLabel.getText(), TipoCombo.getSelectedItem(), 
                    RazaCombo.getSelectedItem(), ColorCombo.getSelectedItem(),FechaText.getText(),
                    estado,TamanlText.getText(),
                    Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual));
            dispose();
        }else{
            jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PerdidoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerdidoRadioActionPerformed
        EncontradoRadio.setSelected(false);
    }//GEN-LAST:event_PerdidoRadioActionPerformed

    private void EncontradoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncontradoRadioActionPerformed
        PerdidoRadio.setSelected(false);
    }//GEN-LAST:event_EncontradoRadioActionPerformed

    private void ColonesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColonesRadioActionPerformed
        DolaresRadio.setSelected(false);
    }//GEN-LAST:event_ColonesRadioActionPerformed

    private void DolaresRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DolaresRadioActionPerformed
        ColonesRadio.setSelected(false);
    }//GEN-LAST:event_DolaresRadioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarButton;
    private javax.swing.JLabel ChipLabel;
    private javax.swing.JTextField ChipText;
    private javax.swing.JRadioButton ColonesRadio;
    private javax.swing.JComboBox ColorCombo;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JTextArea DescripcionText;
    private javax.swing.JRadioButton DolaresRadio;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JRadioButton EncontradoRadio;
    private javax.swing.JTextField FechaText;
    private javax.swing.JLabel ImagenLabel;
    private javax.swing.JTextField LugarText;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JRadioButton PerdidoRadio;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTextField RecompensaText;
    private javax.swing.JTextField TamanlText;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelaticeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean VerificaMascota(){
        if("".equals(NombreText.getText()) || "".equals(ChipText.getText()) ||
           "".equals(TamanlText.getText()) || "".equals(LugarText.getText()) ||
           "".equals(FechaText.getText()) || "".equals(DescripcionText.getText())){
            return false;
        }
        return true;
    }
}
