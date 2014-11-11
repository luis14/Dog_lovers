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
import javax.swing.ImageIcon;

/**
 *
 * @author Santiago
 */
public class JMasInfoAdoptante extends javax.swing.JFrame {

    /**
     * Creates new form JMasInfoAdoptante
     */
    public JMasInfoAdoptante() {
        initComponents();
        if(MouseInfo.getPointerInfo().getLocation().getY() < 250){
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 35 );
        } else if(MouseInfo.getPointerInfo().getLocation().getY() < 450){
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 200 );
        }else{
            setLocation((int) MouseInfo.getPointerInfo().getLocation().getX() - 20,
                        (int) MouseInfo.getPointerInfo().getLocation().getY() - 400 );
        }
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.blue, 2));
    }
    public void actualizarDatosEnVentana(int ID){
        pNombreLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getNombre());
        pTelefonoLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getTelefono());
        pReportadoLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getStringListaNegra());
        pCorreoLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getCorreo());
        pResidenciaLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getLugarDeResidencia());
        pEspacioLabel.setText(Administrador.ListaDeAdoptantes.get(ID).getCantidadDeEsapcio());
        if(Administrador.ListaDeAdoptantes.get(ID).getImagen() != null){
            ImgLabel.setIcon(Administrador.ListaDeAdoptantes.get(ID).getImagen());
        }
        NotasTextArea.setText(Administrador.ListaDeAdoptantes.get(ID).getNotas());
        int calificacion = Administrador.ListaDeAdoptantes.get(ID).getCalificacion();
        if(calificacion <= 0){
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        }else if(calificacion <= 1){
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        }else if(calificacion <= 2){
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        }else if(calificacion <= 3){
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        }else if(calificacion <= 4){
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star off.png")));
        }else{
            estrella1.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella2.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella3.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella4.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
            estrella5.setIcon(new ImageIcon(JPerfilAdoptante.class.getResource("/Imagenes/star-iconx24.png")));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImgLabel = new javax.swing.JLabel();
        NombreLabel1 = new java.awt.Label();
        telefonoLabel = new java.awt.Label();
        reporteLabel1 = new java.awt.Label();
        correoLabel = new java.awt.Label();
        calificacionLabel1 = new java.awt.Label();
        residenciaLabel = new java.awt.Label();
        tamanioLabel = new java.awt.Label();
        pEspacioLabel = new java.awt.Label();
        pResidenciaLabel = new java.awt.Label();
        pCorreoLabel = new java.awt.Label();
        pTelefonoLabel = new java.awt.Label();
        pReportadoLabel = new java.awt.Label();
        pNombreLabel = new java.awt.Label();
        estrella1 = new javax.swing.JLabel();
        estrella2 = new javax.swing.JLabel();
        estrella3 = new javax.swing.JLabel();
        estrella4 = new javax.swing.JLabel();
        estrella5 = new javax.swing.JLabel();
        notasLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotasTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        ImgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414706716_user_male2-128.png"))); // NOI18N

        NombreLabel1.setText("Nombre: ");

        telefonoLabel.setText("Teléfono:");

        reporteLabel1.setText("Reportado:");

        correoLabel.setText("Correo:");

        calificacionLabel1.setName(""); // NOI18N
        calificacionLabel1.setText("Calificación: ");

        residenciaLabel.setName(""); // NOI18N
        residenciaLabel.setText("Residencia: ");

        tamanioLabel.setName(""); // NOI18N
        tamanioLabel.setText("Espacio: ");

        pEspacioLabel.setName(""); // NOI18N
        pEspacioLabel.setText("Espacio");

        pResidenciaLabel.setName(""); // NOI18N
        pResidenciaLabel.setText("Residencia");

        pCorreoLabel.setText("Correo:");

        pTelefonoLabel.setText("Teléfono");

        pReportadoLabel.setText("Reportado");

        pNombreLabel.setText("Nombre");

        estrella1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N

        estrella2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N

        estrella3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N

        estrella4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N

        estrella5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/star off.png"))); // NOI18N

        notasLabel.setName(""); // NOI18N
        notasLabel.setText("Notas:");

        NotasTextArea.setEditable(false);
        NotasTextArea.setColumns(20);
        NotasTextArea.setLineWrap(true);
        NotasTextArea.setRows(5);
        jScrollPane1.setViewportView(NotasTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(notasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reporteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calificacionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(residenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamanioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEspacioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTelefonoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pReportadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pCorreoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pNombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pResidenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(estrella1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estrella5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NombreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(telefonoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(reporteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(correoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pNombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pTelefonoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pReportadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(pCorreoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(residenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tamanioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pResidenciaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pEspacioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calificacionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(estrella4)
                        .addComponent(estrella5)
                        .addComponent(estrella1)
                        .addComponent(estrella3))
                    .addComponent(estrella2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        dispose();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(JMasInfoAdoptante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMasInfoAdoptante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMasInfoAdoptante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMasInfoAdoptante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMasInfoAdoptante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImgLabel;
    private java.awt.Label NombreLabel1;
    private javax.swing.JTextArea NotasTextArea;
    private java.awt.Label calificacionLabel1;
    private java.awt.Label correoLabel;
    private javax.swing.JLabel estrella1;
    private javax.swing.JLabel estrella2;
    private javax.swing.JLabel estrella3;
    private javax.swing.JLabel estrella4;
    private javax.swing.JLabel estrella5;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label notasLabel;
    private java.awt.Label pCorreoLabel;
    private java.awt.Label pEspacioLabel;
    private java.awt.Label pNombreLabel;
    private java.awt.Label pReportadoLabel;
    private java.awt.Label pResidenciaLabel;
    private java.awt.Label pTelefonoLabel;
    private java.awt.Label reporteLabel1;
    private java.awt.Label residenciaLabel;
    private java.awt.Label tamanioLabel;
    private java.awt.Label telefonoLabel;
    // End of variables declaration//GEN-END:variables
}
