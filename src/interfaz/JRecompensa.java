/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author miuyin
 */
public class JRecompensa extends javax.swing.JFrame {

    int montoDeRecompensa; 
    /**
     * Creates new form JRecompensa
     */
    public JRecompensa(int monto) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);  
        montoDeRecompensa = monto; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        RecolectarButton = new javax.swing.JButton();
        DonarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Que desea hacer con su recompensa?");

        RecolectarButton.setText("Recolectar");
        RecolectarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecolectarButtonActionPerformed(evt);
            }
        });

        DonarButton.setText("Donar");
        DonarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(RecolectarButton)
                        .addGap(84, 84, 84)
                        .addComponent(DonarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecolectarButton)
                    .addComponent(DonarButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecolectarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecolectarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_RecolectarButtonActionPerformed

    private void DonarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonarButtonActionPerformed
        JAsociacionesParaDonar donar = new JAsociacionesParaDonar(montoDeRecompensa); 
        donar.setVisible(true);
        dispose();
    }//GEN-LAST:event_DonarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonarButton;
    private javax.swing.JButton RecolectarButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
