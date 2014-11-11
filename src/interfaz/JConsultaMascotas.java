package interfaz;

import Administrador.Administrador;
import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

public class JConsultaMascotas extends javax.swing.JFrame {

    public JConsultaMascotas() {
        initComponents();
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Consulta De Mascotas");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EstadoCombo = new javax.swing.JComboBox();
        TipoCombo = new javax.swing.JComboBox();
        ColorCombo = new javax.swing.JComboBox();
        TamanioCombo = new javax.swing.JComboBox();
        RazaCombo = new javax.swing.JComboBox();
        BuscarButton = new javax.swing.JButton();
        estadoLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        Tamanio = new javax.swing.JLabel();
        RazaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsultaMascotas = new javax.swing.JTable();
        CantidadText = new javax.swing.JLabel();
        chipTextField = new javax.swing.JTextField();
        todosButton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();
        BuscarChip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta De Mascotas");

        EstadoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.EstadosToArray()));

        TipoCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeTipos()));
        TipoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoComboActionPerformed(evt);
            }
        });

        ColorCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.ColoresToArray()));
        ColorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorComboActionPerformed(evt);
            }
        });

        TamanioCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.TamanioToArray()));

        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(0)));

        BuscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        estadoLabel.setText("Estado:");
        estadoLabel.setToolTipText("");

        colorLabel.setText("Color:");
        colorLabel.setToolTipText("");

        TipoLabel.setText("Tipo:");
        TipoLabel.setToolTipText("");

        Tamanio.setText("Tamaño");
        Tamanio.setToolTipText("");

        RazaLabel.setText("Raza:");

        TablaConsultaMascotas.setModel(ModeloTablas.tablaMascotas());
        TablaConsultaMascotas.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaConsultaMascotas.setAutoCreateRowSorter(true); // Para ordenar las tablas
        TablaConsultaMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaConsultaMascotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaConsultaMascotas);

        CantidadText.setText("Cantidad: ");

        chipTextField.setText("Chip");

        todosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415536799_list-16.png"))); // NOI18N
        todosButton.setText("Todos");
        todosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosButtonActionPerformed(evt);
            }
        });

        CantidadLabel.setText("Cantidad");

        BuscarChip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        BuscarChip.setText("Buscar");
        BuscarChip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarChipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CantidadText)
                                .addGap(7, 7, 7)
                                .addComponent(CantidadLabel))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(chipTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EstadoCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE)
                                    .addComponent(estadoLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(colorLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TipoLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TamanioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tamanio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RazaLabel))
                                        .addGap(31, 31, 31)
                                        .addComponent(BuscarButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(todosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BuscarChip))))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tamanio)
                    .addComponent(RazaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstadoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamanioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton)
                    .addComponent(todosButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarChip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadLabel)
                    .addComponent(CantidadText))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorComboActionPerformed

    private void TipoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoComboActionPerformed
        int posicion = TipoCombo.getSelectedIndex();
        RazaCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.HacerArrayDeRazas(posicion)));
    }//GEN-LAST:event_TipoComboActionPerformed

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        TablaConsultaMascotas.setModel(ModeloTablas.tablaMascotas(EstadoCombo.getSelectedItem().toString(), ColorCombo.getSelectedItem().toString(), 
                                       TipoCombo.getSelectedItem().toString(), TamanioCombo.getSelectedItem().toString(), RazaCombo.getSelectedItem().toString()));
        TablaConsultaMascotas.setAutoCreateRowSorter(true); // Para ordenar las tablas
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void todosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosButtonActionPerformed
         TablaConsultaMascotas.setModel(ModeloTablas.tablaMascotas());
         TablaConsultaMascotas.setAutoCreateRowSorter(true); // Para ordenar las tablas
         CantidadLabel.setText(ModeloTablas.getContadorUniversal());
    }//GEN-LAST:event_todosButtonActionPerformed

    private void TablaConsultaMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMascotasMouseClicked
        int fila = TablaConsultaMascotas.getSelectedRow();
        String idAnimal = TablaConsultaMascotas.getValueAt(fila ,0).toString();
        JMasInfo ventEmergente = new JMasInfo();
        ventEmergente.actualizarDatosEnVentana(Integer.valueOf(idAnimal)-1);
        ventEmergente.setVisible(true);
    }//GEN-LAST:event_TablaConsultaMascotasMouseClicked

    private void BuscarChipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarChipActionPerformed
        TablaConsultaMascotas.setModel(ModeloTablas.tablaMascotasChip(chipTextField.getText()));
        TablaConsultaMascotas.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaConsultaMascotas.setAutoCreateRowSorter(true); // Para ordenar las tablas
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
    }//GEN-LAST:event_BuscarChipActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JButton BuscarChip;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JComboBox ColorCombo;
    private javax.swing.JComboBox EstadoCombo;
    private javax.swing.JComboBox RazaCombo;
    private javax.swing.JLabel RazaLabel;
    private javax.swing.JTable TablaConsultaMascotas;
    private javax.swing.JLabel Tamanio;
    private javax.swing.JComboBox TamanioCombo;
    private javax.swing.JComboBox TipoCombo;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JTextField chipTextField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton todosButton;
    // End of variables declaration//GEN-END:variables
}
