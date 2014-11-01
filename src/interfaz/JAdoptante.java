package interfaz;

import javax.swing.ImageIcon;

public class JAdoptante extends javax.swing.JFrame {

    public JAdoptante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Adoptante");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdoptanteLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CancelarLabel = new javax.swing.JButton();
        AceptarLabel = new javax.swing.JButton();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdoptanteLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                        .addComponent(AceptarLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AdoptanteLabel)
                .addGap(61, 61, 61)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarLabel;
    private javax.swing.JLabel AdoptanteLabel;
    private javax.swing.JButton CancelarLabel;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
