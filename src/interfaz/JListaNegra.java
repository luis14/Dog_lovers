package interfaz;

import javax.swing.ImageIcon; 
import Administrador.ModeloTablas;

public class JListaNegra extends javax.swing.JFrame {

    public JListaNegra() {
        initComponents(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Lista Negra");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FiltroTextField = new javax.swing.JTextField();
        ActualizarFiltroButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListaNegra = new javax.swing.JTable();
        TodosButton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Lista Negra");

        jLabel2.setText(" Cantidad :");

        FiltroTextField.setText("Nombre");
        FiltroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltroTextFieldActionPerformed(evt);
            }
        });

        ActualizarFiltroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        ActualizarFiltroButton.setText("Buscar");
        ActualizarFiltroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarFiltroButtonActionPerformed(evt);
            }
        });

        TablaListaNegra.setModel(ModeloTablas.tablaListaNegra());
        TablaListaNegra.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaListaNegra.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane1.setViewportView(TablaListaNegra);

        TodosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415536799_list-16.png"))); // NOI18N
        TodosButton.setText("Todos");
        TodosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosButtonActionPerformed(evt);
            }
        });

        CantidadLabel.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadLabel))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FiltroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ActualizarFiltroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TodosButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ActualizarFiltroButton)
                    .addComponent(TodosButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CantidadLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroTextFieldActionPerformed

    private void ActualizarFiltroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarFiltroButtonActionPerformed
        TablaListaNegra.setModel(ModeloTablas.TablafiltroListaNegra(FiltroTextField.getText()));
        TablaListaNegra.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_ActualizarFiltroButtonActionPerformed

    private void TodosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosButtonActionPerformed
        TablaListaNegra.setModel(ModeloTablas.tablaListaNegra());
        TablaListaNegra.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_TodosButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarFiltroButton;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JTextField FiltroTextField;
    private javax.swing.JTable TablaListaNegra;
    private javax.swing.JButton TodosButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
