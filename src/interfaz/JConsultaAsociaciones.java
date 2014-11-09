/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

/**
 *
 * @author miuyin
 */
public class JConsultaAsociaciones extends javax.swing.JFrame {

    public JConsultaAsociaciones() {
        initComponents(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Consulta De Asociaciones");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TituloText = new javax.swing.JLabel();
        CantidadText = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAsociaciones = new javax.swing.JTable();
        FiltroText = new javax.swing.JTextField();
        BuscarBotton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();
        TodosButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TituloText.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TituloText.setText("Consulta De Asociaciones");

        CantidadText.setText(" Cantidad :");

        TablaAsociaciones.setModel(ModeloTablas.tablaAsociaiones());
        TablaAsociaciones.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaAsociaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane2.setViewportView(TablaAsociaciones);

        FiltroText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FiltroText.setText("Asociación");
        FiltroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroTextActionPerformed(evt);
            }
        });

        BuscarBotton.setText("Buscar");
        BuscarBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBottonActionPerformed(evt);
            }
        });

        CantidadLabel.setText("Cantidad");

        TodosButton.setText("Todos");
        TodosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CantidadText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(FiltroText, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BuscarBotton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TodosButton))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBotton)
                    .addComponent(TodosButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BuscarBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBottonActionPerformed
        TablaAsociaciones.setModel(ModeloTablas.tablaAsociaiones(FiltroText.getText()));
        TablaAsociaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_BuscarBottonActionPerformed

    private void TodosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosButtonActionPerformed
        TablaAsociaciones.setModel(ModeloTablas.tablaAsociaiones());
        TablaAsociaciones.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_TodosButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBotton;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JTextField FiltroText;
    private javax.swing.JTable TablaAsociaciones;
    private javax.swing.JLabel TituloText;
    private javax.swing.JButton TodosButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
