package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JRegistroMascotas extends javax.swing.JFrame {

    private int MascotaEscogida;
    
    public JRegistroMascotas(int MascotaEscogida){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Mascotas");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(MascotaEscogida >= 0){
            DatosEditar(MascotaEscogida);
        }else{
            this.MascotaEscogida = MascotaEscogida;
        }
    }
    
    private void DatosEditar(int MascotaEscogida){
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual) == Administrador.ListaDeMascotas.get(MascotaEscogida).getUsuario()){
            TipoCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getTipo());
            RazaCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getRaza());
            TipoCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getTipo());
            NombreText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getNombre());
            if("".equals(Administrador.ListaDeMascotas.get(MascotaEscogida).getChip())){
                jRadioButton2.setSelected(true);
            }else{
                jRadioButton1.setSelected(true);
                ChipText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getChip());
            }
            ColorCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getColor());
            TamañoCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getTamanio());
            EstadoCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getEstado());
            FechaText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getFechaDeEncontradoPerdido());
            RecompensaText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getMontoDeRecompensa());
            DescripcionText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getDescripcion());
            this.MascotaEscogida = MascotaEscogida;
        }
    }
 
    private boolean VerificaMascota(){
        if("".equals(NombreText.getText()) ||
           "".equals(FechaText.getText()) || "".equals(DescripcionText.getText())){
            return false;
        }
        return true;
    }
    
    private String Chip(){
        if(jRadioButton1.isSelected()){
            return ChipText.getText();
        }else{
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RazaLabel = new javax.swing.JLabel();
        RazaCombo = new javax.swing.JComboBox();
        TipoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ChipLabel = new javax.swing.JLabel();
        ChipText = new javax.swing.JTextField();
        ColorLabel = new javax.swing.JLabel();
        ColorCombo = new javax.swing.JComboBox();
        CargarButton = new javax.swing.JButton();
        EmailLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FechaText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        RecompensaText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionText = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ImagenLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        TipoCombo = new javax.swing.JComboBox();
        TamañoCombo = new javax.swing.JComboBox();
        EstadoCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        RazaLabel.setText("Raza:");

        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(0)));
        RazaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaComboActionPerformed(evt);
            }
        });

        TipoLabel.setText("Tipo:");

        NombreLabel.setText("Nombre:");

        ChipLabel.setText("Chip:");

        ChipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChipTextActionPerformed(evt);
            }
        });

        ColorLabel.setText("Color:");

        ColorCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.ColoresToArray()));

        CargarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410329443_go-top-16.png"))); // NOI18N
        CargarButton.setText("Cargar imagen");

        EmailLabel.setText("Tamaño:");

        jLabel8.setText("Estado:");

        jLabel10.setText("Fecha:");

        FechaText.setText("Fecha en la que fue perdido o encontrado");

        jLabel11.setText("Recompensa:");

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

        ImagenLabel.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Todos los espacios deben estar llenos.");
        jLabel1.setVisible(false);

        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeTipos()));
        TipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboActionPerformed(evt);
            }
        });

        TamañoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.TamanioToArray()));

        EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.EstadosToArray()));
        EstadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoComboActionPerformed(evt);
            }
        });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ChipLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ChipText, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                        .addGap(35, 35, 35))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(EmailLabel)
                                                .addGap(5, 5, 5)
                                                .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ImagenLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CargarButton))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ColorLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(RecompensaText, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(EstadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(TipoLabel)
                                        .addGap(22, 22, 22)
                                        .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(RazaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(NombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TipoLabel)
                            .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EstadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RazaLabel)
                    .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(RecompensaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ChipLabel)
                                    .addComponent(ChipText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorLabel)
                            .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailLabel)
                            .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(ImagenLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(CargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(VerificaMascota()){
            if(MascotaEscogida == -1){
                Administrador.RegistrarMascota(NombreLabel.getText(), (String)TipoCombo.getSelectedItem(),
                        (String)ColorCombo.getSelectedItem(),FechaText.getText(),(String)EstadoCombo.getSelectedItem(), 
                        (String)TamañoCombo.getSelectedItem(), Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual),
                        Chip(), (String)RazaCombo.getSelectedItem(), RecompensaText.getText(), DescripcionText.getText());
                dispose();
            }else{ 
                Administrador.ListaDeMascotas.get(MascotaEscogida).setTipo((String)TipoCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setRaza((String)RazaCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setTipo((String)TipoCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setNombre(NombreText.getText());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setChip(Chip());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setColor((String)ColorCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setTamanio((String)TamañoCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setEstado((String)EstadoCombo.getSelectedItem());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setFechaDeEncontradoPerdido(FechaText.getText());
                Administrador.ListaDeMascotas.get(MascotaEscogida).setMontoDeRecompensa(RecompensaText.getText()); 
                Administrador.ListaDeMascotas.get(MascotaEscogida).setDescripcion(DescripcionText.getText()); 
                dispose();
            }
        }else{
            jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ChipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChipTextActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        ChipText.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        ChipText.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void TipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboActionPerformed
        int posicion = TipoCombo.getSelectedIndex();
        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(posicion)));
    }//GEN-LAST:event_TipoComboActionPerformed

    private void RazaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazaComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RazaComboActionPerformed

    private void EstadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoComboActionPerformed
          String Estado;
                Estado = (String)EstadoCombo.getSelectedItem(); 
                boolean Verdad; 
                Verdad = Estado.equals("Identificado");
                if(Verdad){
                    JIdentificado identificado = new JIdentificado(); 
                    identificado.setVisible(true); 
                } 
    }//GEN-LAST:event_EstadoComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CargarButton;
    private javax.swing.JLabel ChipLabel;
    private javax.swing.JTextField ChipText;
    private javax.swing.JComboBox ColorCombo;
    private javax.swing.JLabel ColorLabel;
    private javax.swing.JTextArea DescripcionText;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JComboBox EstadoCombo;
    private javax.swing.JTextField FechaText;
    private javax.swing.JLabel ImagenLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTextField RecompensaText;
    private javax.swing.JComboBox TamañoCombo;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
