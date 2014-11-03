package interfaz;

import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JAdoptante extends javax.swing.JFrame {

    public JAdoptante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Adoptante");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        ErrorLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdoptanteLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CancelarLabel = new javax.swing.JButton();
        AceptarLabel = new javax.swing.JButton();
        TelLabel = new javax.swing.JLabel();
        LugarLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LugarText = new javax.swing.JTextArea();
        CantidadLabel = new javax.swing.JLabel();
        TelText = new javax.swing.JTextField();
        ErrorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CantidadText = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

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

        TelLabel.setText("Teléfono :");

        LugarLabel.setText("Lugar de Residencia :");

        LugarText.setColumns(20);
        LugarText.setRows(5);
        jScrollPane1.setViewportView(LugarText);

        CantidadLabel.setText("Cantidad de Espacio :");

        TelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelTextActionPerformed(evt);
            }
        });

        ErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        ErrorLabel.setText("Todos los espacios deben estar llenos");

        CantidadText.setColumns(20);
        CantidadText.setRows(5);
        jScrollPane2.setViewportView(CantidadText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdoptanteLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CancelarLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AceptarLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TelLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(CantidadLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LugarLabel)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(ErrorLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(TelLabel)
                    .addComponent(TelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadLabel)
                    .addComponent(LugarLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(ErrorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarLabel)
                    .addComponent(AceptarLabel))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarLabelActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarLabelActionPerformed

    private void TelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelTextActionPerformed

    private void AceptarLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarLabelActionPerformed
        if(VerificaDatos()){
            Administrador.RegistrarAdoptante(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getNombre(),
                                             Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCorreo(),
                                             TelText.getText(), LugarText.getText(), CantidadText.getText(),false , 
                                             Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual));
            dispose();
        }else{
            ErrorLabel.setVisible(true);
        }
    }//GEN-LAST:event_AceptarLabelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarLabel;
    private javax.swing.JLabel AdoptanteLabel;
    private javax.swing.JButton CancelarLabel;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JTextArea CantidadText;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JLabel LugarLabel;
    private javax.swing.JTextArea LugarText;
    private javax.swing.JLabel TelLabel;
    private javax.swing.JTextField TelText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean VerificaDatos(){
        if("".equals(TelText.getText()) ||
           "".equals(TelText.getText()) || 
           "".equals(LugarText.getText())){
            return false;
        }else{
            return true;
        }
            
    }
}
