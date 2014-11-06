package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JUsuario extends javax.swing.JFrame {
    
    public JUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        ErrorLabel.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UsuarioLabel = new javax.swing.JLabel();
        ContraLabel = new javax.swing.JLabel();
        UsuarioText = new javax.swing.JTextField();
        LogInButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ContraText = new javax.swing.JPasswordField();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsuarioLabel.setText("Usuario :");

        ContraLabel.setText("Contraseña :");

        UsuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextActionPerformed(evt);
            }
        });

        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410683128_key_16.png"))); // NOI18N
        LogInButton.setText("Log in");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410309424_list-add-user.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(153, 0, 0));
        ErrorLabel.setText("Contraseña o Usuario Incorrecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogInButton)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraLabel)
                            .addComponent(UsuarioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioText)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ErrorLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ContraText))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioLabel)
                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraLabel)
                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInButton)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        if(VerificaUsuario()){
            JControl control = new JControl();
            control.setVisible(true);
            dispose();
        }
        else{
            ErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void UsuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JRegistrarUsuario  registro = new JRegistrarUsuario();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraLabel;
    private javax.swing.JPasswordField ContraText;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private boolean VerificaUsuario(){
        for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){
            if(UsuarioText.getText().equals(Administrador.ListaDeUsuarios.get(i).getUsername()) &&
               ContraText.getText().equals(Administrador.ListaDeUsuarios.get(i).getContrasenia())){
                Administrador.setUsuarioActual(i);
                return true;
            }
        }
        return false;
    }
}

