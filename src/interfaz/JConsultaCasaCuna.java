/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Administrador.Administrador; 
import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

public class JConsultaCasaCuna extends javax.swing.JFrame {

    public JConsultaCasaCuna() {
        initComponents(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Consulta Casa Cunas");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TipoCombo = new javax.swing.JComboBox();
        RazaCombo = new javax.swing.JComboBox();
        TamanioCombo = new javax.swing.JComboBox();
        DonacionDeAlimentoCombo = new javax.swing.JComboBox();
        BuscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCasaCuna = new javax.swing.JTable();
        CantidadText = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        Tamanio = new javax.swing.JLabel();
        RazaLabel = new javax.swing.JLabel();
        donacionLabel = new javax.swing.JLabel();
        todosButton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta De Casa Cuna");

        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeTipos()));
        TipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboActionPerformed(evt);
            }
        });

        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(0)));

        TamanioCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.TamanioToArray()));

        DonacionDeAlimentoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Si", "No", "Cualquiera" }));

        BuscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        TablaCasaCuna.setModel(ModeloTablas.tablaCasaCuna());
        TablaCasaCuna.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaCasaCuna.setAutoCreateRowSorter(true); // Para ordenar las tablas
        TablaCasaCuna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCasaCunaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCasaCuna);

        CantidadText.setText(" Cantidad :");

        TipoLabel.setText("Tipo:");
        TipoLabel.setToolTipText("");

        Tamanio.setText("Tamaño");
        Tamanio.setToolTipText("");

        RazaLabel.setText("Raza:");

        donacionLabel.setText("Para donativos:");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RazaLabel)
                            .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TamanioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tamanio))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(donacionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DonacionDeAlimentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BuscarButton)
                                .addGap(18, 18, 18)
                                .addComponent(todosButton))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CantidadText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazaLabel)
                    .addComponent(Tamanio)
                    .addComponent(donacionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamanioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DonacionDeAlimentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton)
                    .addComponent(todosButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadText)
                    .addComponent(CantidadLabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboActionPerformed
        int posicion = TipoCombo.getSelectedIndex();
        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(posicion)));
    }//GEN-LAST:event_TipoComboActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        TablaCasaCuna.setModel(ModeloTablas.tablaCasaCuna((String)TipoCombo.getSelectedItem(), (String)TamanioCombo.getSelectedItem(), 
                (String)RazaCombo.getSelectedItem(),(String)DonacionDeAlimentoCombo.getSelectedItem()));
        TablaCasaCuna.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void todosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosButtonActionPerformed
        // TODO add your handling code here:
        TablaCasaCuna.setModel(ModeloTablas.tablaCasaCuna());
        TablaCasaCuna.setAutoCreateRowSorter(true); // Para ordenar las tablas
    }//GEN-LAST:event_todosButtonActionPerformed

    private void TablaCasaCunaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCasaCunaMouseClicked
        int fila = TablaCasaCuna.getSelectedRow();
        String idAnimal = TablaCasaCuna.getValueAt(fila ,0).toString();
        JMasInfo ventEmergente = new JMasInfo();
        ventEmergente.actualizarDatosEnVentana(Integer.valueOf(idAnimal)-1);
        ventEmergente.setVisible(true);
    }//GEN-LAST:event_TablaCasaCunaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JComboBox DonacionDeAlimentoCombo;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTable TablaCasaCuna;
    private javax.swing.JLabel Tamanio;
    private javax.swing.JComboBox TamanioCombo;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JLabel donacionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton todosButton;
    // End of variables declaration//GEN-END:variables
}
