package interfaz;

import Administrador.Administrador;
import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

public class JPerfilAdoptante extends javax.swing.JFrame {
    
    private String estrellas = "0";
    private int ID;
    
    public JPerfilAdoptante(int AdoptanteEscogido) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pefil de Adoptante");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        ErrorLabel.setVisible(false);
        DatosUsuario(AdoptanteEscogido);
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
    }

    private void DatosUsuario(int Adoptante){
        Estrella(Administrador.ListaDeAdoptantes.get(Adoptante).getCalificacion());
        NombreLabel.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getNombre());
        TelefonoAdLabel1.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getTelefono());
        EmailAdLabel1.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getCorreo());
        ResidenciaLabel1.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getLugarDeResidencia());
        EspacioLabel1.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getCantidadDeEsapcio());
        ComentariosTextArea.setText(Administrador.ListaDeAdoptantes.get(Adoptante).getNotas());
        if(Administrador.ListaDeAdoptantes.get(Adoptante).getImagen() != null){
            FotoAdLabel.setIcon(Administrador.ListaDeAdoptantes.get(Adoptante).getImagen());
        }
        if(Administrador.ListaDeAdoptantes.get(Adoptante).getReportado()){
            ErrorLabel.setVisible(true);
        }
        this.ID = Adoptante;
    }            
                
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FotoAdLabel = new javax.swing.JLabel();
        PerfilAd = new javax.swing.JLabel();
        NombreAdLabel = new javax.swing.JLabel();
        TelefonoAdLabel = new javax.swing.JLabel();
        TelefonoAdLabel1 = new javax.swing.JLabel();
        EmailAdLabel = new javax.swing.JLabel();
        EmailAdLabel1 = new javax.swing.JLabel();
        ResidenciaLabel = new javax.swing.JLabel();
        ResidenciaLabel1 = new javax.swing.JLabel();
        EspacioLabel = new javax.swing.JLabel();
        EspacioLabel1 = new javax.swing.JLabel();
        ErrorLabel = new javax.swing.JLabel();
        CalificarLabel = new javax.swing.JLabel();
        estrella1 = new javax.swing.JLabel();
        estrella2 = new javax.swing.JLabel();
        estrella3 = new javax.swing.JLabel();
        estrella4 = new javax.swing.JLabel();
        estrella5 = new javax.swing.JLabel();
        ComentarioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ComentarioArea = new javax.swing.JTextArea();
        ReportarButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ComentariosTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        FotoAdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414706716_user_male2-128.png"))); // NOI18N

        PerfilAd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PerfilAd.setText("Perfil de Adoptante");

        NombreAdLabel.setText("Nombre:");

        TelefonoAdLabel.setText("Telefono:");

        TelefonoAdLabel1.setText("Telefono");

        EmailAdLabel.setText("Email:");

        EmailAdLabel1.setText("Email");

        ResidenciaLabel.setText("Residencia:");

        ResidenciaLabel1.setText("Residencia");

        EspacioLabel.setText("Espacio:");

        EspacioLabel1.setText("Espacio");

        ErrorLabel.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErrorLabel.setText("Usuario en lista negra");
        ErrorLabel.setVisible(false);

        CalificarLabel.setText("Calificar:");

        estrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N
        estrella1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estrella1MouseClicked(evt);
            }
        });

        estrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N
        estrella2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estrella2MouseClicked(evt);
            }
        });

        estrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N
        estrella3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estrella3MouseClicked(evt);
            }
        });

        estrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N
        estrella4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estrella4MouseClicked(evt);
            }
        });

        estrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N
        estrella5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estrella5MouseClicked(evt);
            }
        });

        ComentarioLabel.setText("Comentar al Adoptante :");

        ComentarioArea.setColumns(20);
        ComentarioArea.setRows(5);
        jScrollPane1.setViewportView(ComentarioArea);

        ReportarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415536063_Cancel.png"))); // NOI18N
        ReportarButton.setText("Reportar Usuario");
        ReportarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportarButtonActionPerformed(evt);
            }
        });

        AceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684280_Check.png"))); // NOI18N
        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        NombreLabel.setText("Nombre");

        jLabel3.setText("Comentarios :");

        ComentariosTextArea.setEditable(false);
        ComentariosTextArea.setColumns(20);
        ComentariosTextArea.setRows(5);
        jScrollPane3.setViewportView(ComentariosTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PerfilAd)
                            .addComponent(NombreAdLabel)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelefonoAdLabel)
                                    .addComponent(EmailAdLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(EmailAdLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NombreLabel)
                                            .addComponent(TelefonoAdLabel1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResidenciaLabel)
                                    .addComponent(EspacioLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EspacioLabel1)
                                    .addComponent(ResidenciaLabel1))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CalificarLabel)
                                    .addComponent(ComentarioLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(estrella1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estrella2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estrella3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estrella4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(estrella5))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ErrorLabel)
                                    .addComponent(ReportarButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(FotoAdLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(AceptarButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PerfilAd)
                    .addComponent(ErrorLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FotoAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreAdLabel)
                            .addComponent(NombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoAdLabel)
                            .addComponent(TelefonoAdLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailAdLabel)
                            .addComponent(EmailAdLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResidenciaLabel)
                            .addComponent(ResidenciaLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EspacioLabel)
                            .addComponent(EspacioLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ReportarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CalificarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(estrella4)
                                .addComponent(estrella5)
                                .addComponent(estrella1)
                                .addComponent(estrella3))
                            .addComponent(estrella2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComentarioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AceptarButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estrella1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrella1MouseClicked
        estrellas = "1";
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
    }//GEN-LAST:event_estrella1MouseClicked

    private void estrella2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrella2MouseClicked
        estrellas = "2";
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
    }//GEN-LAST:event_estrella2MouseClicked

    private void estrella3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrella3MouseClicked
        estrellas = "3";
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
    }//GEN-LAST:event_estrella3MouseClicked

    private void estrella4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrella4MouseClicked
        estrellas = "4";
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
    }//GEN-LAST:event_estrella4MouseClicked

    private void estrella5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrella5MouseClicked
        estrellas = "5";
        estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
    }//GEN-LAST:event_estrella5MouseClicked

    private void ReportarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportarButtonActionPerformed
        Administrador.ListaDeAdoptantes.get(ID).setReportado(true);
        ErrorLabel.setVisible(true);
    }//GEN-LAST:event_ReportarButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        Administrador.ListaDeAdoptantes.get(ID).setCalificacion(Integer.parseInt(estrellas));
        if(!"".equals(ComentarioArea.getText())){
            Administrador.ListaDeAdoptantes.get(ID).setNotas(ComentarioArea.getText());
        }
        dispose();
    }//GEN-LAST:event_AceptarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JLabel CalificarLabel;
    private javax.swing.JTextArea ComentarioArea;
    private javax.swing.JLabel ComentarioLabel;
    private javax.swing.JTextArea ComentariosTextArea;
    private javax.swing.JLabel EmailAdLabel;
    private javax.swing.JLabel EmailAdLabel1;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JLabel EspacioLabel;
    private javax.swing.JLabel EspacioLabel1;
    private javax.swing.JLabel FotoAdLabel;
    private javax.swing.JLabel NombreAdLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel PerfilAd;
    private javax.swing.JButton ReportarButton;
    private javax.swing.JLabel ResidenciaLabel;
    private javax.swing.JLabel ResidenciaLabel1;
    private javax.swing.JLabel TelefonoAdLabel;
    private javax.swing.JLabel TelefonoAdLabel1;
    private javax.swing.JLabel estrella1;
    private javax.swing.JLabel estrella2;
    private javax.swing.JLabel estrella3;
    private javax.swing.JLabel estrella4;
    private javax.swing.JLabel estrella5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void Estrella(int calificacion){
        switch(calificacion){
            case 0:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                break;
            case 1:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                break;
            case 2:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                break;
            case 3:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                break;
            case 4:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
                break;
            case 5:
                estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
                break;
            default:
                break;
        }
    }
}
