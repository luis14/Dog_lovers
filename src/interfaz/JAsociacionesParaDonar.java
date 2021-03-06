/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Administrador.ModeloTablas;
import Administrador.Administrador;
import javax.swing.JOptionPane;
/**
 *
 * @author miuyin
 */
public class JAsociacionesParaDonar extends javax.swing.JFrame {

    int monto; 
    /**
     * Creates new form JAsociacionesParaDonar
     */
    public JAsociacionesParaDonar(int monto) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); 
        this.monto = monto; 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsocias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        DonarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TablaAsocias.setModel(ModeloTablas.tablaAsociaiones());
        TablaAsocias.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaAsocias.setAutoCreateRowSorter(true); // Para ordenar las tablas
        TablaAsocias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAsociasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAsocias);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Escoga la asociación para donar");

        DonarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415662971_donate.png"))); // NOI18N
        DonarButton.setText("Donar");
        DonarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonarButtonActionPerformed(evt);
            }
        });

        CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(CancelarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DonarButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(DonarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonarButtonActionPerformed
        int fila = TablaAsocias.getSelectedRow();  
        if(fila == -1){
           JOptionPane.showMessageDialog(null,"¡No ha seleccionado ninguna asociación");
        }  
        else{ 
        String idAsociación = TablaAsocias.getValueAt(fila, 0).toString(); 
        Administrador.RegistrarDonacion(Administrador.ListaDeUsuarios.get(Administrador.getUsuarioActual()), 
                Administrador.ListaDeAsociaciones.get(Integer.parseInt(idAsociación)-1), monto); 
        dispose(); 
        }
    }//GEN-LAST:event_DonarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void TablaAsociasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAsociasMouseClicked
        int fila = TablaAsocias.getSelectedRow();
        String idAsociacion = TablaAsocias.getValueAt(fila ,0).toString();
        JInfoAsociacion ventEmergente = new JInfoAsociacion();
        ventEmergente.actualizarDatosEnVentana(Integer.valueOf(idAsociacion)-1);
        ventEmergente.setVisible(true);
    }//GEN-LAST:event_TablaAsociasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton DonarButton;
    private javax.swing.JTable TablaAsocias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
