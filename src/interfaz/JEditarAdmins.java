package interfaz;

import Administrador.ModeloTablas; 
import Administrador.Administrador;
import javax.swing.ImageIcon;

public class JEditarAdmins extends javax.swing.JFrame {

    public JEditarAdmins() {
        initComponents();
        CanitdadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Editar Admins");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAdmins = new javax.swing.JTable();
        FiltroText = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CanitdadLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Editar Administradores");

        TablaAdmins.setModel(ModeloTablas.tablaUsuariosAdmins());
        TablaAdmins.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane1.setViewportView(TablaAdmins);

        FiltroText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FiltroText.setText("Nombre");

        BuscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad:");

        CanitdadLabel.setText("Cantidad");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312443_user-worker-boss.png"))); // NOI18N
        jButton1.setText("Hacer Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(464, 464, 464))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(FiltroText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BuscarButton)
                            .addGap(461, 461, 461)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CanitdadLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroText)
                    .addComponent(BuscarButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CanitdadLabel)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        TablaAdmins.setModel(ModeloTablas.tablaUsuariosAdmins(FiltroText.getText()));
        TablaAdmins.setAutoCreateRowSorter(true); // Para ordenar las tablas    
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fila = TablaAdmins.getSelectedRow(); 
        String idUsuario = TablaAdmins.getValueAt(fila, 0).toString();  
        Administrador.ListaDeUsuarios.get(Integer.parseInt(idUsuario)-1).setEsAdmin(true); 
        TablaAdmins.setModel(ModeloTablas.tablaUsuariosAdmins());
        TablaAdmins.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JLabel CanitdadLabel;
    private javax.swing.JTextField FiltroText;
    private javax.swing.JTable TablaAdmins;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
