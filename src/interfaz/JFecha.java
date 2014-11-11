package interfaz;

import Administrador.Administrador;
import Administrador.Calendario;
import Administrador.EnviadorEmail;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JFecha extends javax.swing.JFrame {

    public JFecha() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Fecha");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FechaLabel = new javax.swing.JLabel();
        AnioLabel = new javax.swing.JLabel();
        AnioText = new javax.swing.JTextField();
        MesLabel = new javax.swing.JLabel();
        MesText = new javax.swing.JTextField();
        DiaLabel = new javax.swing.JLabel();
        DiaText = new javax.swing.JTextField();
        RestriccionLabel = new javax.swing.JLabel();
        AceptarButtonFecha = new javax.swing.JButton();
        cancelarButtonFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        FechaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FechaLabel.setText("Fecha");

        AnioLabel.setText("Año:");

        AnioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnioTextActionPerformed(evt);
            }
        });

        MesLabel.setText("Mes:");

        DiaLabel.setText("Día:");

        DiaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaTextActionPerformed(evt);
            }
        });

        RestriccionLabel.setText("Todos los datos ingresados tiene que ser numeros enteros");

        AceptarButtonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButtonFecha.setText("Aceptar");
        AceptarButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonFechaActionPerformed(evt);
            }
        });

        cancelarButtonFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        cancelarButtonFecha.setText("Cancelar");
        cancelarButtonFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonFechaActionPerformed(evt);
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
                        .addComponent(cancelarButtonFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AceptarButtonFecha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AnioLabel)
                                    .addComponent(MesLabel)
                                    .addComponent(DiaLabel))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AnioText, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(MesText)
                                    .addComponent(DiaText)))
                            .addComponent(FechaLabel)
                            .addComponent(RestriccionLabel))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FechaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestriccionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnioLabel)
                    .addComponent(AnioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MesLabel)
                    .addComponent(MesText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiaLabel)
                    .addComponent(DiaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarButtonFecha)
                    .addComponent(AceptarButtonFecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AnioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnioTextActionPerformed

    private void DiaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaTextActionPerformed

    private void cancelarButtonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonFechaActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarButtonFechaActionPerformed

    private void AceptarButtonFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonFechaActionPerformed
        try{
            Calendario.setFecha(Integer.valueOf(AnioText.getText()),
                                Integer.valueOf(MesText.getText()),
                                Integer.valueOf(DiaText.getText()));
            dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Los espacios deben estar llenos y ser numeros enteros");
        }
        for(int id = 0; id < Administrador.ListaDeMascotas.size(); id++){
            if(Administrador.ListaDeMascotas.get(id).getEstado().equals("Perdido")){
               String ColorDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getColor(); 
               String ChipDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getChip(); 
               String TamanioDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTamanio(); 
               String TipoDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getTipo(); 
               String RazaDeMascotaMatch = Administrador.ListaDeMascotas.get(id).getRaza(); 

               for(int i = 0; i < Administrador.ListaDeMascotas.size(); i++){ 
                  int contador = 0;  
                  Boolean encontrado = false; 
                  if(Administrador.ListaDeMascotas.get(i).getEstado().equals("Encontrado")){ 
                      encontrado = true;
                  }
                  if(ColorDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getColor())){
                      contador++; 
                  } 
                  if(ChipDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getChip()) || ChipDeMascotaMatch.equals(" ")){
                      contador++; 
                  } 
                  if(TamanioDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getTamanio())){
                      contador++; 
                  }  
                  if(contador >=1 && encontrado == true){  
                      if(TipoDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getTipo())){
                          if(RazaDeMascotaMatch.equals(Administrador.ListaDeMascotas.get(i).getRaza())){
                                String correoMascotaPerdida = Administrador.ListaDeMascotas.get(id).getUsuario().getCorreo();
                                String nombreMascotaPerdida = Administrador.ListaDeMascotas.get(id).getUsuario().getNombre() + " " +
                                                              Administrador.ListaDeMascotas.get(id).getUsuario().getApellido();
                                
                                String correoMascotaEncontrada = Administrador.ListaDeMascotas.get(i).getUsuario().getCorreo();
                                String nombreMascotaEncontrada = Administrador.ListaDeMascotas.get(i).getUsuario().getNombre() + " " +
                                                                 Administrador.ListaDeMascotas.get(i).getUsuario().getApellido();
                                
                                EnviadorEmail enviaCorreoPerdida = new EnviadorEmail(correoMascotaPerdida,nombreMascotaPerdida);
                                
                                EnviadorEmail enviaCorreoEncontrada = new EnviadorEmail(correoMascotaEncontrada,nombreMascotaEncontrada);
                                
                            }   
                      }
                  }

               }   
            }
        }
    }//GEN-LAST:event_AceptarButtonFechaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButtonFecha;
    private javax.swing.JLabel AnioLabel;
    private javax.swing.JTextField AnioText;
    private javax.swing.JLabel DiaLabel;
    private javax.swing.JTextField DiaText;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JLabel MesLabel;
    private javax.swing.JTextField MesText;
    private javax.swing.JLabel RestriccionLabel;
    private javax.swing.JButton cancelarButtonFecha;
    // End of variables declaration//GEN-END:variables
}
