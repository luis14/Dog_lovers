package interfaz;

import Administrador.Administrador;
import interfaz.JControl;
import javax.swing.ImageIcon;

public class JRegistrarUsuario extends javax.swing.JFrame {
    
    private final boolean editar;
    
    public JRegistrarUsuario(boolean editar) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(editar){
            DatosEditar();
        }
        this.editar = editar;
    }

    private void DatosEditar(){
        NombreText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getNombre());
        ApellidoText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getApellido());
        UsernameText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getUsername());
        TelText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getTelefono());
        ContraText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getContrasenia());
        CorreoText.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCorreo());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        RegistroLabel = new javax.swing.JLabel();
        AtrasButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TelText = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JTextField();
        NombreText = new javax.swing.JTextField();
        UsernameText = new javax.swing.JTextField();
        ContraText = new javax.swing.JPasswordField();
        CorreoText = new javax.swing.JTextField();
        CorreoLabel = new javax.swing.JLabel();
        ContraLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RegistroLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        RegistroLabel.setForeground(new java.awt.Color(0, 0, 0));
        RegistroLabel.setText("Usuario");

        AtrasButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AtrasButton.setForeground(new java.awt.Color(0, 0, 0));
        AtrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410683612_arrow-return-180-left.png"))); // NOI18N
        AtrasButton.setText("Atras");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        AceptarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AceptarButton.setForeground(new java.awt.Color(0, 0, 0));
        AceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NombreLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombreLabel.setText("Nombre :");

        ApellidoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ApellidoLabel.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoLabel.setText("Apellido :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Teléfono :");

        TelText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ApellidoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ApellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextActionPerformed(evt);
            }
        });

        NombreText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        UsernameText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ContraText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        CorreoText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        CorreoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CorreoLabel.setForeground(new java.awt.Color(0, 0, 0));
        CorreoLabel.setText("Correo :");

        ContraLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ContraLabel.setForeground(new java.awt.Color(0, 0, 0));
        ContraLabel.setText("Contraseña :");

        UsernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Todos los espacios deben estar llenos");
        jLabel2.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NombreLabel)
                            .addComponent(ApellidoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ApellidoText)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(UsernameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ContraLabel)
                            .addComponent(CorreoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ContraText)
                            .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidoLabel)
                            .addComponent(ApellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameLabel)
                            .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ContraLabel)
                            .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoLabel)
                            .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AtrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                        .addComponent(AceptarButton))
                    .addComponent(RegistroLabel)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(RegistroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AtrasButton)
                            .addComponent(AceptarButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        if(VerificaUsuario()){
            if(editar){
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setNombre(NombreText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setApellido(ApellidoText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setUsername(UsernameText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setTelefono(TelText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setContrasenia(ContraText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setCorreo(CorreoText.getText());
                if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante()){
                    int adoptante = 0;
                    while(Administrador.ListaDeAdoptantes.get(adoptante).getUsuario() != Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual)){
                        adoptante++;
                    }
                    Administrador.ListaDeAdoptantes.get(adoptante).setNombre(NombreText.getText());
                    Administrador.ListaDeAdoptantes.get(adoptante).setCorreo(CorreoText.getText());
                    Administrador.ListaDeAdoptantes.get(adoptante).setTelefono(TelText.getText());
                }
                JControl.NombreLabel1.setText(NombreText.getText());
                JControl.ApellidoLabel1.setText(ApellidoText.getText());
                JControl.UsernameLabel1.setText(UsernameText.getText());
                JControl.CorreoLabel1.setText(CorreoText.getText());
                JControl.TelLabel1.setText(TelText.getText());
                dispose();
            }else{
                Administrador.RegistrarUsuario(NombreText.getText(),ApellidoText.getText(),UsernameText.getText(),
                        TelText.getText(), ContraText.getText(),false, CorreoText.getText(),null);
                JUsuario usuario = new JUsuario();
                usuario.setVisible(true);
                dispose();
            }
        }else{
            jLabel2.setVisible(true);
        }
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed
        if(editar){
            dispose();
        }else{
            JUsuario usuario = new JUsuario();
            usuario.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void ApellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextActionPerformed

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JTextField ApellidoText;
    private javax.swing.JButton AtrasButton;
    private javax.swing.JLabel ContraLabel;
    private javax.swing.JPasswordField ContraText;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JTextField CorreoText;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel RegistroLabel;
    private javax.swing.JTextField TelText;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private boolean VerificaUsuario(){
        if("".equals(NombreText.getText()) || "".equals(ApellidoText.getText()) || 
           "".equals(UsernameText.getText()) || "".equals(TelText.getText()) ||
           "".equals(ContraText.getText()) || false || "".equals(CorreoText.getText())){
            return false;
        }
        return true;
    }
}
