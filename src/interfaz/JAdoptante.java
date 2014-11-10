package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JAdoptante extends javax.swing.JFrame {

    private int adoptante;
    
    public JAdoptante(boolean editar) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Adoptante");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(editar){
            DatosEditar();
        }
    }
    
    private void DatosEditar(){
        for(int i = 0; i <Administrador.ListaDeAdoptantes.size(); i ++){
            if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual) == Administrador.ListaDeAdoptantes.get(i).getUsuario()){
                ResidenciaTextArea.setText(Administrador.ListaDeAdoptantes.get(i).getLugarDeResidencia());
                EspacioTextArea.setText(Administrador.ListaDeAdoptantes.get(i).getCantidadDeEsapcio());
                this.adoptante = i;
            }
        }
    }
    
    private boolean VerificaDatos(){
        return !("".equals(ResidenciaTextArea.getText()) || "".equals(EspacioTextArea.getText()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdoptanteLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CancelarLabel = new javax.swing.JButton();
        AceptarLabel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResidenciaTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        EspacioTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AdoptanteLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AdoptanteLabel.setText("Adoptante");

        CancelarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        CancelarLabel.setText("Cancelar");
        CancelarLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarLabelActionPerformed(evt);
            }
        });

        AceptarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarLabel.setText("Aceptar");
        AceptarLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarLabelActionPerformed(evt);
            }
        });

        jLabel1.setText("Lugar de Residencia :");

        jLabel2.setText("Cantidad de Espacio :");

        ResidenciaTextArea.setColumns(20);
        ResidenciaTextArea.setRows(5);
        jScrollPane1.setViewportView(ResidenciaTextArea);

        EspacioTextArea.setColumns(20);
        EspacioTextArea.setRows(5);
        jScrollPane2.setViewportView(EspacioTextArea);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Todos los espacios deben estar llenos.");
        jLabel3.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdoptanteLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdoptanteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarLabel)
                    .addComponent(AceptarLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarLabelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarLabelActionPerformed

    private void AceptarLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarLabelActionPerformed
        if(VerificaDatos()){
            if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante())){
                    Administrador.RegistrarAdoptante(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getNombre(),
                            Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCorreo(),
                            Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getTelefono(),
                            ResidenciaTextArea.getText(), EspacioTextArea.getText(), false,
                            Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual),
                            Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getImagen());
                    Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setAdoptante(true);
                    dispose();
            }else{
                    Administrador.ListaDeAdoptantes.get(adoptante).setLugarDeResidencia(ResidenciaTextArea.getText());
                    Administrador.ListaDeAdoptantes.get(adoptante).setCantidadDeEsapcio(EspacioTextArea.getText());
                    dispose();
            }
        }else{
                jLabel3.setVisible(true);
            }
    }//GEN-LAST:event_AceptarLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarLabel;
    private javax.swing.JLabel AdoptanteLabel;
    private javax.swing.JButton CancelarLabel;
    private javax.swing.JTextArea EspacioTextArea;
    private javax.swing.JTextArea ResidenciaTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
