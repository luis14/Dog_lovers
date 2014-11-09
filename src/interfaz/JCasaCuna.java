package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JCasaCuna extends javax.swing.JFrame {

    public JCasaCuna(boolean editar) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Casa Cuna");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(editar){
            DatosEditar();
        }
    }

    private void DatosEditar(){
        switch(Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).getTamanio()){
            case "Pequeño":
                TipoCombo.setSelectedIndex(0);
                break;
            case "Mediano":
                TipoCombo.setSelectedIndex(1);
                break;
            case "Grande":
                TipoCombo.setSelectedIndex(2);
                break;
        }
        switch (Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).getNecesitaAlimentacion()){
            case "Si":
                DanacionSiRadioButton.setSelected(true);
                break;
            case "No":
                DonacionNoRadioButton.setSelected(true);
                break;
        }
        TipoCombo.setSelectedIndex(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getTipoActual());
        RazaCombo.setSelectedIndex(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getRazaActual());
        RequerimientosText.setText(Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).getRequerimientos());
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
        TipoLabel = new javax.swing.JLabel();
        TipoCombo = new javax.swing.JComboBox();
        RazaLabel = new javax.swing.JLabel();
        DonacionLabel = new javax.swing.JLabel();
        DanacionSiRadioButton = new javax.swing.JRadioButton();
        DonacionNoRadioButton = new javax.swing.JRadioButton();
        CancelarButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RequerimientosText = new javax.swing.JTextArea();
        ErrorLabel = new javax.swing.JLabel();
        RazaCombo = new javax.swing.JComboBox();
        TamañoCombo = new javax.swing.JComboBox();

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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830410_home-16.png"))); // NOI18N
        jLabel1.setText("Casa Cuna");

        TipoLabel.setText("Tipo :");

        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeTipos()));
        TipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboActionPerformed(evt);
            }
        });

        RazaLabel.setText("Raza:");

        DonacionLabel.setText("Requiere de una donación para la alimentación :");

        DanacionSiRadioButton.setText("Si");
        DanacionSiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanacionSiRadioButtonActionPerformed(evt);
            }
        });

        DonacionNoRadioButton.setText("No");
        DonacionNoRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonacionNoRadioButtonActionPerformed(evt);
            }
        });

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        AceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño :");

        jLabel4.setText("Requerimientos :");

        RequerimientosText.setColumns(20);
        RequerimientosText.setRows(5);
        jScrollPane1.setViewportView(RequerimientosText);

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(153, 0, 0));
        ErrorLabel.setText("Todos los espacios deben estar llenos");
        ErrorLabel.setVisible(false);

        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(0)));

        TamañoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.TamanioToArray()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(DanacionSiRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DonacionNoRadioButton))
                            .addComponent(jLabel1)
                            .addComponent(DonacionLabel)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RazaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TipoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CancelarButton)
                                .addGap(53, 53, 53)
                                .addComponent(AceptarButton)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ErrorLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoLabel)
                            .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RazaLabel)
                            .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DonacionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DonacionNoRadioButton)
                            .addComponent(DanacionSiRadioButton))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        boolean donacion;
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isCasaCuna())){
            if(DanacionSiRadioButton.isSelected()){
                donacion = true;
            }else{
                donacion = false;
            }
            if(VerificaDatos()){
                Administrador.RegistrarCasaCuna((String)TipoCombo.getSelectedItem(), (String)RazaCombo.getSelectedItem(),
                        donacion, (String)TamañoCombo.getSelectedItem(), RequerimientosText.getText(), 
                        Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), 
                        Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getTelefono());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setCasaCuna(true);
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setCasaCunaActual(Administrador.ListaDeCasaCuna.size() - 1);
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setTipoActual(TipoCombo.getSelectedIndex());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setRazaActual(RazaCombo.getSelectedIndex());
                dispose();
            }else{
                ErrorLabel.setVisible(true);
            }
        }else{
            if(VerificaDatos()){
                if(DanacionSiRadioButton.isSelected()){
                    donacion = true;
                }else{
                    donacion = false;
                }
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setTipoActual(TipoCombo.getSelectedIndex());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setRazaActual(RazaCombo.getSelectedIndex());
                Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).setTamanio( (String)TamañoCombo.getSelectedItem());
                Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).setNecesitaAlimentacion(donacion);
                Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).setTipo((String)TipoCombo.getSelectedItem());
                Administrador.ListaDeCasaCuna.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCasaCunaActual()).setRaza((String)RazaCombo.getSelectedItem());
                dispose();
            }else{
                ErrorLabel.setVisible(true);
            }
        }
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void DanacionSiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanacionSiRadioButtonActionPerformed
        DonacionNoRadioButton.setSelected(false);
    }//GEN-LAST:event_DanacionSiRadioButtonActionPerformed

    private void DonacionNoRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonacionNoRadioButtonActionPerformed
        DanacionSiRadioButton.setSelected(false);
    }//GEN-LAST:event_DonacionNoRadioButtonActionPerformed

    private void TipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboActionPerformed
        int posicion = TipoCombo.getSelectedIndex();
        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(posicion)));
    }//GEN-LAST:event_TipoComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JRadioButton DanacionSiRadioButton;
    private javax.swing.JLabel DonacionLabel;
    private javax.swing.JRadioButton DonacionNoRadioButton;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTextArea RequerimientosText;
    private javax.swing.JComboBox TamañoCombo;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean VerificaDatos(){
        if("".equals(RequerimientosText.getText())){
            return false;
        }
        return true;
    }

}
