package interfaz;

import Administrador.Administrador;
import Imagenes.CargarImagen;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class JRegistroMascotas extends javax.swing.JFrame {

    private int MascotaEscogida;
    private Icon img = null;
    
    public JRegistroMascotas(int MascotaEscogida){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Mascotas");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(MascotaEscogida >= 0){
            DatosEditar(MascotaEscogida);
        }else{
            EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Perdido" , "Encontrado"}));
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
            if("Encontrado".equals(Administrador.ListaDeMascotas.get(MascotaEscogida).getEstado())){
                EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Encontrado", "Identificado" , "En Adopción"}));
            }else if("Perdido".equals(Administrador.ListaDeMascotas.get(MascotaEscogida).getEstado())){
                EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Perdido", "Recuperado"}));
            }else if("En Adopción".equals(Administrador.ListaDeMascotas.get(MascotaEscogida).getEstado())){
                EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"En Adopción", "Adoptado"}));
            }
            EstadoCombo.setSelectedItem((Object)Administrador.ListaDeMascotas.get(MascotaEscogida).getEstado());
            FechaText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getFechaDeEncontradoPerdido());
            RecompensaText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getMontoDeRecompensa());
            DescripcionText.setText(Administrador.ListaDeMascotas.get(MascotaEscogida).getDescripcion());
            if(Administrador.ListaDeMascotas.get(MascotaEscogida).getImagen() != null){
                ImgLabel.setIcon(Administrador.ListaDeMascotas.get(MascotaEscogida).getImagen());
            }
            this.MascotaEscogida = MascotaEscogida;
        }
    }
 
    private boolean VerificaMascota(){
        if("".equals(FechaText.getText()) || "".equals(DescripcionText.getText())){
            return false;
        }
        return true;
    }
    
    private String Chip(){
        if(jRadioButton1.isSelected()){
            return ChipText.getText();
        }else{
            return " ";
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
        registrarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ImagenLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        TipoCombo = new javax.swing.JComboBox();
        TamañoCombo = new javax.swing.JComboBox();
        EstadoCombo = new javax.swing.JComboBox();
        ImgLabel = new javax.swing.JLabel();

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
        CargarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarButtonActionPerformed(evt);
            }
        });

        EmailLabel.setText("Tamaño:");

        jLabel8.setText("Estado:");

        jLabel10.setText("Fecha:");

        FechaText.setText("Fecha en la que fue perdido o encontrado");

        jLabel11.setText("Recompensa:");

        jLabel12.setText("Descripción:");

        DescripcionText.setColumns(20);
        DescripcionText.setRows(5);
        jScrollPane1.setViewportView(DescripcionText);

        registrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312077_add.png"))); // NOI18N
        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Registro de Mascotas");

        ImagenLabel.setFocusTraversalPolicyProvider(true);

        errorLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(153, 0, 0));
        errorLabel.setText("Todos los espacios deben estar llenos.");
        errorLabel.setVisible(false);

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

        ImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mascotas sin foto.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RazaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NombreLabel)
                                .addGap(2, 2, 2)
                                .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ImagenLabel)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ColorLabel)
                                                .addGap(10, 10, 10)
                                                .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(EmailLabel)
                                                .addGap(5, 5, 5)
                                                .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(CargarButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ChipLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton2)
                                .addGap(2, 2, 2)
                                .addComponent(ChipText, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(errorLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(RecompensaText, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(EstadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registrarButton)
                                    .addComponent(cancelarButton))
                                .addGap(31, 31, 31))))
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoLabel)
                        .addGap(22, 22, 22)
                        .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TipoLabel)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(RazaLabel)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(ChipLabel))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(ChipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EstadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(FechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(RecompensaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(ImagenLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ColorLabel))
                            .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(EmailLabel))
                            .addComponent(TamañoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CargarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        if(VerificaMascota()){
            if(MascotaEscogida == -1){
                Administrador.RegistrarMascota(NombreLabel.getText(), (String)TipoCombo.getSelectedItem(),
                        (String)ColorCombo.getSelectedItem(),FechaText.getText(),(String)EstadoCombo.getSelectedItem(), 
                        (String)TamañoCombo.getSelectedItem(), Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual),
                        Chip(), (String)RazaCombo.getSelectedItem(), RecompensaText.getText(), DescripcionText.getText(),
                        img);
                dispose();
            }else{  
                String Estado;
                Estado = (String)EstadoCombo.getSelectedItem(); 
                boolean Verdad; 
                Verdad = Estado.equals("Identificado");
                if(Verdad){
                    JIdentificado identificado = new JIdentificado(MascotaEscogida); 
                    identificado.setVisible(true); 
                } 
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
                if(ImgLabel.getIcon() != null){
                    Administrador.ListaDeMascotas.get(MascotaEscogida).setImagen(ImgLabel.getIcon());
                }
                dispose();
            }
        }else{
            errorLabel.setVisible(true);
        }
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void ChipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChipTextActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jRadioButton2.setSelected(false);
        ChipText.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jRadioButton1.setSelected(false);
        ChipText.setText(" ");
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
        if(EstadoCombo.getSelectedIndex() == 1){
            NombreText.setText(" ");
            NombreText.setEditable(false);
            RecompensaText.setText(" ");
            RecompensaText.setEditable(false);
        }else{
            NombreText.setEditable(true);
            RecompensaText.setEditable(true);
        }
    }//GEN-LAST:event_EstadoComboActionPerformed

    private void CargarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarButtonActionPerformed
        CargarImagen portada = new CargarImagen();
        BufferedImage bookPortrait = portada.Cargar();
	ImageIcon imagen = new ImageIcon(bookPortrait.getScaledInstance(210,204,Image.SCALE_SMOOTH));
        img = imagen;
	ImgLabel.setIcon(imagen);
    }//GEN-LAST:event_CargarButtonActionPerformed

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
    private javax.swing.JLabel ImgLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTextField RecompensaText;
    private javax.swing.JComboBox TamañoCombo;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables

}
