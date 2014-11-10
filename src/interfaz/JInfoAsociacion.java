/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import Administrador.Administrador;
import java.awt.Color;
import java.awt.MouseInfo;
import javax.swing.BorderFactory;

/**
 *
 * @author Santiago
 */
public class JInfoAsociacion extends javax.swing.JFrame {

    /** Creates new form JInfoAsociacion */
    public JInfoAsociacion() {
        initComponents();
        if(MouseInfo.getPointerInfo().getLocation().getY() < 250){
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 35 );
        } else if(MouseInfo.getPointerInfo().getLocation().getY() < 450){
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 200 );
        }else{
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 250 );
        }
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.blue, 2));
    }
    public void actualizarDatosEnVentana(int ID){
        pNombreLabel.setText(Administrador.ListaDeAsociaciones.get(ID).getNombre());
        pCorreoLabel.setText(Administrador.ListaDeAsociaciones.get(ID).getCorreo());
        pPaginaLabel.setText(Administrador.ListaDeAsociaciones.get(ID).getPaginaWeb());
        misionTextArea.setText(Administrador.ListaDeAsociaciones.get(ID).getMission());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNombreLabel = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JLabel();
        WebLabel = new javax.swing.JLabel();
        MisionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        misionTextArea = new javax.swing.JTextArea();
        pCorreoLabel = new javax.swing.JLabel();
        pPaginaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        pNombreLabel.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        pNombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pNombreLabel.setText("Nombre");

        CorreoLabel.setText("Correo: ");

        WebLabel.setText("Página web: ");
        WebLabel.setToolTipText("");

        MisionLabel.setText("Misión: ");

        misionTextArea.setEditable(false);
        misionTextArea.setColumns(10);
        misionTextArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        misionTextArea.setLineWrap(true);
        misionTextArea.setRows(5);
        misionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(misionTextArea);

        pCorreoLabel.setText("Correo");

        pPaginaLabel.setText("Página");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(pNombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(MisionLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(WebLabel)
                                        .addComponent(CorreoLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pCorreoLabel)
                                        .addComponent(pPaginaLabel)))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pNombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoLabel)
                    .addComponent(pCorreoLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WebLabel)
                    .addComponent(pPaginaLabel))
                .addGap(18, 18, 18)
                .addComponent(MisionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        dispose();
    }//GEN-LAST:event_formMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JInfoAsociacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JInfoAsociacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JInfoAsociacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JInfoAsociacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInfoAsociacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JLabel MisionLabel;
    private javax.swing.JLabel WebLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea misionTextArea;
    private javax.swing.JLabel pCorreoLabel;
    private javax.swing.JLabel pNombreLabel;
    private javax.swing.JLabel pPaginaLabel;
    // End of variables declaration//GEN-END:variables

}