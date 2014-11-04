package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JRegistrarUsuario extends javax.swing.JFrame {

    public JRegistrarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Registro de Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegistroLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        ContraLabel = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ApellidoText = new javax.swing.JTextField();
        UsernameText = new javax.swing.JTextField();
        CorreoLabel = new javax.swing.JLabel();
        CorreoText = new javax.swing.JTextField();
        AceptarButton = new javax.swing.JButton();
        AtrasButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TelText = new javax.swing.JTextField();
        ContraText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistroLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        RegistroLabel.setText("Registro de Usuario");

        NombreLabel.setText("Nombre");

        ApellidoLabel.setText("Apellido");

        UsernameLabel.setText("Username");

        ContraLabel.setText("Contraseña");

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        ApellidoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoTextActionPerformed(evt);
            }
        });

        CorreoLabel.setText("Correo");

        AceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        AtrasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410683612_arrow-return-180-left.png"))); // NOI18N
        AtrasButton.setText("Atras");
        AtrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Teléfono :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegistroLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreLabel)
                        .addGap(127, 127, 127)
                        .addComponent(ApellidoLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(AtrasButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                            .addComponent(AceptarButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CorreoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(UsernameText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(CorreoLabel))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(ContraLabel)
                                .addComponent(ApellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(TelText)
                                .addComponent(ContraText)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegistroLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(ApellidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel)
                    .addComponent(ContraLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtrasButton)
                    .addComponent(AceptarButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasButtonActionPerformed
        JUsuario usuario = new JUsuario();
        usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_AtrasButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        if(VerificaUsuario()){
            Administrador.RegistrarUsuario(NombreText.getText(),ApellidoText.getText(),UsernameText.getText(),
                                       TelText.getText(), ContraText.getText(),false, CorreoText.getText());
            JUsuario usuario = new JUsuario();
            usuario.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void ApellidoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoTextActionPerformed

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
    private javax.swing.JPanel jPanel1;
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
