package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class Jusuario1 extends javax.swing.JFrame {

    public Jusuario1() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        ErrorLabel.setVisible(false);
    }
    
    
    private int VerificaUsuario(){
        for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){
            if(UsuarioText.getText().equals(Administrador.ListaDeUsuarios.get(i).getUsername()) &&
               ContraText.getText().equals(Administrador.ListaDeUsuarios.get(i).getContrasenia())){
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        ContraLabel = new javax.swing.JLabel();
        ContraText = new javax.swing.JPasswordField();
        UsuarioText = new javax.swing.JTextField();
        registrarButton = new javax.swing.JButton();
        LogInButton = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10755057_847539941933847_199279157_n.jpg"))); // NOI18N

        UsuarioLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioLabel.setText("Usuario :");

        ContraLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ContraLabel.setForeground(new java.awt.Color(0, 0, 0));
        ContraLabel.setText("Contraseña :");

        ContraText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        UsuarioText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UsuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextActionPerformed(evt);
            }
        });

        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrarButton.setForeground(new java.awt.Color(0, 0, 0));
        registrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410309424_list-add-user.png"))); // NOI18N
        registrarButton.setText("Registrar");
        registrarButton.setToolTipText("");
        registrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarButtonMouseExited(evt);
            }
        });
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(0, 0, 0));
        LogInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410683128_key_16.png"))); // NOI18N
        LogInButton.setText("Iniciar Sesión");
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInButtonMouseExited(evt);
            }
        });
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        ErrorLabel.setText("Contraseña o Usuario Incorrecto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ErrorLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(UsuarioLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ContraLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LogInButton)
                            .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarButton)
                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInButton)
                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ContraLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioTextActionPerformed

    private void registrarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarButtonMouseEntered
        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 13));
    }//GEN-LAST:event_registrarButtonMouseEntered

    private void registrarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarButtonMouseExited
        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_registrarButtonMouseExited

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        JRegistrarUsuario  registro = new JRegistrarUsuario(false);
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void LogInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseEntered
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 13));
    }//GEN-LAST:event_LogInButtonMouseEntered

    private void LogInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseExited
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_LogInButtonMouseExited

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        if(VerificaUsuario() != -1){
            Administrador.setUsuarioActual(VerificaUsuario());
            JControl control = new JControl();
            control.setVisible(true);
            dispose();
        }
        else{
            ErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_LogInButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraLabel;
    private javax.swing.JPasswordField ContraText;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables
}
