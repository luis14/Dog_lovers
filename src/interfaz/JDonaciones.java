package interfaz;

import Administrador.ModeloTablas;

public class JDonaciones extends javax.swing.JFrame {

    public JDonaciones() {
        initComponents(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Donaciones"); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FiltroText = new javax.swing.JTextField();
        AsociacionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDonaciones = new javax.swing.JTable();
        CantidadText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Donaciones ");

        FiltroText.setText("Asociacion / Donante");
        FiltroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroTextActionPerformed(evt);
            }
        });

        AsociacionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        AsociacionButton.setText("Buscar");
        AsociacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociacionButtonActionPerformed(evt);
            }
        });

        TablaDonaciones.setModel(ModeloTablas.tablaDeDonaciones());
        TablaDonaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane1.setViewportView(TablaDonaciones);

        CantidadText.setText(" Cantidad :");

        jButton1.setText("Monto Totales");

        jButton2.setText("Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CantidadLabel.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(FiltroText, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(AsociacionButton)
                                    .addGap(308, 308, 308)
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2)
                                    .addGap(3, 3, 3))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CantidadText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsociacionButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadText)
                    .addComponent(CantidadLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroTextActionPerformed

    private void AsociacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociacionButtonActionPerformed
        TablaDonaciones.setModel(ModeloTablas.tablaDeDonaciones(FiltroText.getText()));
        TablaDonaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
    }//GEN-LAST:event_AsociacionButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TablaDonaciones.setModel(ModeloTablas.tablaDeDonaciones());
        TablaDonaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsociacionButton;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JTextField FiltroText;
    private javax.swing.JTable TablaDonaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
