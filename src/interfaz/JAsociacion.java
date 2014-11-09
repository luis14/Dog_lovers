package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JAsociacion extends javax.swing.JFrame {

    public JAsociacion(boolean editar) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Asociación");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(editar){
            DatosEditar();
        }
    }

    private void DatosEditar(){
        NombreText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getNombre());
        MissionText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getMission());
        CedulaText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getCedulaJuridica());
        TelefonoText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getTelefono());
        CorreoText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getCorreo());
        PaginaText.setText(Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).getPaginaWeb());   
    }
    
    private boolean VerificaDatos(){
        return !("".equals(NombreText.getText()) || "".equals(CedulaText.getText()) ||
                "".equals(CorreoText.getText()) || "".equals(MissionText.getText()) ||
                "".equals(PaginaText.getText()) || "".equals(TelefonoText.getText()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AsociacionLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MissionText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        CedulaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelefonoText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CorreoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PaginaText = new javax.swing.JTextField();
        CancelarButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AsociacionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AsociacionLabel.setText("Asociación");

        jLabel1.setText("Nombre de la Asociación :");

        jLabel2.setText("Mission :");

        MissionText.setColumns(20);
        MissionText.setRows(5);
        jScrollPane1.setViewportView(MissionText);

        jLabel3.setText("Cédula Juridica");

        jLabel4.setText("Telefono de la Asociación :");

        jLabel5.setText("Correo de la Asociación :");

        jLabel6.setText("Página web de la Asociación");

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Todos los espacios deben estar llenos.");
        jLabel7.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CorreoText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CedulaText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TelefonoText, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(PaginaText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AsociacionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AsociacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PaginaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TelefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(AceptarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAsociacion()){
            if(VerificaDatos()){
                Administrador.RegistrarAsociacion(NombreText.getText(), MissionText.getText(),
                        CedulaText.getText(), TelefonoText.getText(), CorreoText.getText(), PaginaText.getText());
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setAsociacion(true);
                Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setAsociacionActual(Administrador.ListaDeAsociaciones.size()-1);
                dispose();
            }else{
                jLabel7.setVisible(true);
            }
        }else{
            if(VerificaDatos()){
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setNombre(NombreText.getText());
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setMission(MissionText.getText());
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setCedulaJuridica(CedulaText.getText());
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setTelefono(TelefonoText.getText());
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setCorreo(CorreoText.getText());
                Administrador.ListaDeAsociaciones.get(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getAsociacionActual()).setPaginaWeb(PaginaText.getText());
                dispose();
            }else{
                jLabel7.setVisible(true);
            }
        }
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JLabel AsociacionLabel;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JTextField CedulaText;
    private javax.swing.JTextField CorreoText;
    private javax.swing.JTextArea MissionText;
    private javax.swing.JTextField NombreText;
    private javax.swing.JTextField PaginaText;
    private javax.swing.JTextField TelefonoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
