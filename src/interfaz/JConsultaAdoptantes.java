package interfaz; 

import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

public class JConsultaAdoptantes extends javax.swing.JFrame {

    public JConsultaAdoptantes() {
        initComponents(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Consulta De Adoptantes");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CalificacionCombo = new javax.swing.JComboBox();
        BuscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdoptantes = new javax.swing.JTable();
        CantidadText = new javax.swing.JLabel();
        CalificacionLabel = new javax.swing.JLabel();
        todosButton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consultas De Adoptantes");

        CalificacionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0","1", "2", "3", "4", "5" }));

        BuscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        tablaAdoptantes.setModel(ModeloTablas.tablaAdoptantes());
        tablaAdoptantes.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        tablaAdoptantes.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane1.setViewportView(tablaAdoptantes);

        CantidadText.setText(" Cantidad :");

        CalificacionLabel.setText("Calificacion");
        CalificacionLabel.setToolTipText("");

        todosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415536799_list-16.png"))); // NOI18N
        todosButton.setText("Todos");
        todosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosButtonActionPerformed(evt);
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
                    .addComponent(jLabel1)
                    .addComponent(CalificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CalificacionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todosButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
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
                .addComponent(CalificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalificacionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton)
                    .addComponent(todosButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadText)
                    .addComponent(CantidadLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void todosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosButtonActionPerformed
        // TODO add your handling code here:
        tablaAdoptantes.setModel(ModeloTablas.tablaAdoptantes());
        tablaAdoptantes.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_todosButtonActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
       tablaAdoptantes.setModel(ModeloTablas.tablaAdoptantes((String)CalificacionCombo.getSelectedItem()));
       tablaAdoptantes.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_BuscarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JComboBox CalificacionCombo;
    private javax.swing.JLabel CalificacionLabel;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAdoptantes;
    private javax.swing.JButton todosButton;
    // End of variables declaration//GEN-END:variables
}
