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
        ContraText = new javax.swing.JPasswordField();
        ErrorLabel = new javax.swing.JLabel();
        registrarButton = new javax.swing.JButton();
        LogInButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        UsuarioLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioLabel.setText("Usuario :");

        ContraLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ContraLabel.setForeground(new java.awt.Color(255, 255, 255));
        ContraLabel.setText("Contraseña :");

        UsuarioText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UsuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioTextActionPerformed(evt);
            }
        });

        ContraText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        ErrorLabel.setText("Contraseña o Usuario Incorrecto");

        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        registrarButton.setForeground(new java.awt.Color(0, 153, 0));
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
        LogInButton.setForeground(new java.awt.Color(0, 153, 0));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UsuarioLabel)
                            .addComponent(ContraLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addComponent(ErrorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogInButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuarioLabel)
                    .addComponent(registrarButton)
                    .addComponent(UsuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraLabel)
                    .addComponent(LogInButton)
                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorLabel)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10755057_847539941933847_199279157_n.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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

    private void UsuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioTextActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        JRegistrarUsuario  registro = new JRegistrarUsuario();
        registro.setVisible(true);
        dispose();
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void LogInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseEntered
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 13));
    }//GEN-LAST:event_LogInButtonMouseEntered

    private void LogInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseExited
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_LogInButtonMouseExited

    private void registrarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarButtonMouseEntered
        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 13));
    }//GEN-LAST:event_registrarButtonMouseEntered

    private void registrarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarButtonMouseExited
        registrarButton.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_registrarButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContraLabel;
    private javax.swing.JPasswordField ContraText;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JTextField UsuarioText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables

    private int VerificaUsuario(){
        for(int i = 0; i < Administrador.ListaDeUsuarios.size(); i++){
            if(UsuarioText.getText().equals(Administrador.ListaDeUsuarios.get(i).getUsername()) &&
               ContraText.getText().equals(Administrador.ListaDeUsuarios.get(i).getContrasenia())){
                return i;
            }
        }
        return -1;
    }
}

