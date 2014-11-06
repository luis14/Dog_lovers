package interfaz;

import Administrador.Administrador;
import Administrador.ModeloTablas;
import javax.swing.ImageIcon;

public class JControl extends javax.swing.JFrame {

    public JControl() {
        initComponents();
        DatosUsuario();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pefil de Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(!esAdmin()){
            TiposRazasItem.setVisible(false);
            TiposMascotasItem.setVisible(false);
            AdminItem.setVisible(false);
        }
    }
    
    private boolean esAdmin(){
        return Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getEsAdmin();
    }
    
    private void DatosUsuario(){
        NombreLabel1.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getNombre());
        ApellidoLabel1.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getApellido());
        UsernameLabel1.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getUsername());
        CorreoLabel1.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getCorreo());
        TelLabel1.setText(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getTelefono());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        PrincipalPanel = new javax.swing.JPanel();
        CorreoLabel1 = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JLabel();
        UsernameLabel1 = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        ApellidoLabel1 = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        NombreLabel1 = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        FotoLabel = new javax.swing.JLabel();
        PerfilLabel = new javax.swing.JLabel();
        DatosActualesLabel = new javax.swing.JLabel();
        MascotasPerdidasButton = new javax.swing.JButton();
        MascotasEncontradasButton = new javax.swing.JButton();
        CantidadLabel = new javax.swing.JLabel();
        LogoItem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TelLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInicio = new javax.swing.JTable();
        Menu = new javax.swing.JMenuBar();
        Registro = new javax.swing.JMenu();
        MascotaItem = new javax.swing.JMenuItem();
        CasaCunaItem = new javax.swing.JMenuItem();
        AdoptanteItem = new javax.swing.JMenuItem();
        Asociacion = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        MascotasItem = new javax.swing.JMenuItem();
        CasaCunaItem1 = new javax.swing.JMenuItem();
        AdoptanteItem1 = new javax.swing.JMenuItem();
        TiposRazasItem = new javax.swing.JMenuItem();
        TiposMascotasItem = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        MascotasItem1 = new javax.swing.JMenuItem();
        CasaCunaItem2 = new javax.swing.JMenuItem();
        AdoptanteItem2 = new javax.swing.JMenuItem();
        ListaNegraItem = new javax.swing.JMenuItem();
        DonacionesItem = new javax.swing.JMenuItem();
        Configuracion = new javax.swing.JMenu();
        FechaItem = new javax.swing.JMenuItem();
        AdminItem = new javax.swing.JMenuItem();
        Opciones = new javax.swing.JMenu();
        CerrarItem = new javax.swing.JMenuItem();
        SalirItem = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CorreoLabel1.setText("Correo");

        CorreoLabel.setText("Correo :");

        UsernameLabel1.setText("Username");

        UsernameLabel.setText("Username :");

        ApellidoLabel1.setText("Apellido");

        ApellidoLabel.setText("Apellido : ");

        NombreLabel1.setText("Nombre");

        NombreLabel.setText("Nombre :");

        FotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414706716_user_male2-128.png"))); // NOI18N

        PerfilLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PerfilLabel.setText("Perfil de Usuario");

        DatosActualesLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DatosActualesLabel.setText("Datos Actuales");

        MascotasPerdidasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830314_Help.png"))); // NOI18N
        MascotasPerdidasButton.setText("Mascotas Perdidas");
        MascotasPerdidasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasPerdidasButtonActionPerformed(evt);
            }
        });

        MascotasEncontradasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        MascotasEncontradasButton.setText("Mascota Encontrada");
        MascotasEncontradasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasEncontradasButtonActionPerformed(evt);
            }
        });

        CantidadLabel.setText("Cantidad :");

        LogoItem.setText("Logo");

        jLabel1.setText("Teléfono :");

        TelLabel1.setText("Telefono");

        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Perdido"));
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(1));
        TablaInicio.setAutoCreateRowSorter(true); // Para ordenar las tablas
        jScrollPane2.setViewportView(TablaInicio);

        javax.swing.GroupLayout PrincipalPanelLayout = new javax.swing.GroupLayout(PrincipalPanel);
        PrincipalPanel.setLayout(PrincipalPanelLayout);
        PrincipalPanelLayout.setHorizontalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                        .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PerfilLabel)
                            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(FotoLabel)
                                .addGap(34, 34, 34)
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(NombreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreLabel1))
                                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(ApellidoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ApellidoLabel1))
                                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(UsernameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UsernameLabel1))
                                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(CorreoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CorreoLabel1))
                                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TelLabel1))))
                            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(DatosActualesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(MascotasPerdidasButton)
                                .addGap(18, 18, 18)
                                .addComponent(MascotasEncontradasButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                        .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantidadLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PrincipalPanelLayout.setVerticalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(PerfilLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreLabel)
                                    .addComponent(NombreLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ApellidoLabel)
                                    .addComponent(ApellidoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UsernameLabel)
                                    .addComponent(UsernameLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CorreoLabel)
                                    .addComponent(CorreoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(TelLabel1)))
                            .addComponent(FotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatosActualesLabel)
                            .addComponent(MascotasPerdidasButton)
                            .addComponent(MascotasEncontradasButton)))
                    .addGroup(PrincipalPanelLayout.createSequentialGroup()
                        .addComponent(LogoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadLabel)
                .addContainerGap())
        );

        Registro.setText("Registrar");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        MascotaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830492_Pets.png"))); // NOI18N
        MascotaItem.setText("Mascotas");
        MascotaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotaItemActionPerformed(evt);
            }
        });
        Registro.add(MascotaItem);

        CasaCunaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830410_home-16.png"))); // NOI18N
        CasaCunaItem.setText("Casa Cuna");
        CasaCunaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasaCunaItemActionPerformed(evt);
            }
        });
        Registro.add(CasaCunaItem);

        AdoptanteItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684212_preferences-desktop-user.png"))); // NOI18N
        AdoptanteItem.setText("Adoptante");
        AdoptanteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptanteItemActionPerformed(evt);
            }
        });
        Registro.add(AdoptanteItem);

        Asociacion.setText("Asociación");
        Asociacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociacionActionPerformed(evt);
            }
        });
        Registro.add(Asociacion);

        Menu.add(Registro);

        Editar.setText("Editar");

        MascotasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830492_Pets.png"))); // NOI18N
        MascotasItem.setText("Mascotas");
        MascotasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasItemActionPerformed(evt);
            }
        });
        Editar.add(MascotasItem);

        CasaCunaItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830410_home-16.png"))); // NOI18N
        CasaCunaItem1.setText("Casa Cuna");
        Editar.add(CasaCunaItem1);

        AdoptanteItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684212_preferences-desktop-user.png"))); // NOI18N
        AdoptanteItem1.setText("Adoptante");
        Editar.add(AdoptanteItem1);

        TiposRazasItem.setText("Tipos de Razas");
        Editar.add(TiposRazasItem);

        TiposMascotasItem.setText("Tipos de Mascotas");
        Editar.add(TiposMascotasItem);

        Menu.add(Editar);

        Consultas.setText("Consultas");

        MascotasItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830492_Pets.png"))); // NOI18N
        MascotasItem1.setText("Mascotas");
        MascotasItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasItem1ActionPerformed(evt);
            }
        });
        Consultas.add(MascotasItem1);

        CasaCunaItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830410_home-16.png"))); // NOI18N
        CasaCunaItem2.setText("Casa Cuna");
        CasaCunaItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasaCunaItem2ActionPerformed(evt);
            }
        });
        Consultas.add(CasaCunaItem2);

        AdoptanteItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684212_preferences-desktop-user.png"))); // NOI18N
        AdoptanteItem2.setText("Adoptante");
        AdoptanteItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptanteItem2ActionPerformed(evt);
            }
        });
        Consultas.add(AdoptanteItem2);

        ListaNegraItem.setText("Lista Negra");
        ListaNegraItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaNegraItemActionPerformed(evt);
            }
        });
        Consultas.add(ListaNegraItem);

        DonacionesItem.setText("Donaciones");
        DonacionesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonacionesItemActionPerformed(evt);
            }
        });
        Consultas.add(DonacionesItem);

        Menu.add(Consultas);

        Configuracion.setText("Configuración");

        FechaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830523_date_task.png"))); // NOI18N
        FechaItem.setText("Fecha");
        Configuracion.add(FechaItem);

        AdminItem.setText("Administrador");
        Configuracion.add(AdminItem);

        Menu.add(Configuracion);

        Opciones.setText("Opciones");

        CerrarItem.setText("Cerrar Sesión ");
        CerrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarItemActionPerformed(evt);
            }
        });
        Opciones.add(CerrarItem);

        SalirItem.setText("Salir");
        SalirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirItemActionPerformed(evt);
            }
        });
        Opciones.add(SalirItem);

        Menu.add(Opciones);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MascotaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotaItemActionPerformed
        JRegistroMascotas mascota = new JRegistroMascotas();
        mascota.setVisible(true);
    }//GEN-LAST:event_MascotaItemActionPerformed

    private void MascotasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MascotasItemActionPerformed

    private void MascotasItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasItem1ActionPerformed
        JConsultaMascotas consultaMascota = new JConsultaMascotas(); 
        consultaMascota.setVisible(true);
    }//GEN-LAST:event_MascotasItem1ActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed

    }//GEN-LAST:event_RegistroActionPerformed

    private void CasaCunaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasaCunaItemActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isCasaCuna())){
            JCasaCuna casacuna = new JCasaCuna();
            casacuna.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_CasaCunaItemActionPerformed

    private void CerrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarItemActionPerformed
       JUsuario  usuario = new JUsuario();
       usuario.setVisible(true);
       dispose();
    }//GEN-LAST:event_CerrarItemActionPerformed

    private void SalirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirItemActionPerformed
       dispose();
    }//GEN-LAST:event_SalirItemActionPerformed

    private void AdoptanteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptanteItemActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante())){
            JAdoptante adoptante = new JAdoptante();
            adoptante.setVisible(true);
        }else{
            
        }
    }//GEN-LAST:event_AdoptanteItemActionPerformed

    private void ListaNegraItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaNegraItemActionPerformed
       JListaNegra lista = new JListaNegra();
       lista.setVisible(true);
    }//GEN-LAST:event_ListaNegraItemActionPerformed

    private void AsociacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociacionActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAsociacion())){
            JAsociacion asiciacion = new JAsociacion();
            asiciacion.setVisible(true);
        }
    }//GEN-LAST:event_AsociacionActionPerformed

    private void DonacionesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonacionesItemActionPerformed
        JDonaciones donaciones = new JDonaciones(); 
        donaciones.setVisible(true);
    }//GEN-LAST:event_DonacionesItemActionPerformed

    private void AdoptanteItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptanteItem2ActionPerformed
        JConsultaAdoptantes consultaAdoptantes = new JConsultaAdoptantes(); 
        consultaAdoptantes.setVisible(true);
    }//GEN-LAST:event_AdoptanteItem2ActionPerformed

    private void CasaCunaItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasaCunaItem2ActionPerformed
        JConsultaCasaCuna consultaCasaCuna = new JConsultaCasaCuna(); 
        consultaCasaCuna.setVisible(true);
    }//GEN-LAST:event_CasaCunaItem2ActionPerformed

    private void MascotasPerdidasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasPerdidasButtonActionPerformed
        // TODO add your handling code here:
        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Perdido"));
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(1));
    }//GEN-LAST:event_MascotasPerdidasButtonActionPerformed

    private void MascotasEncontradasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasEncontradasButtonActionPerformed
        // TODO add your handling code here:
        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Encontrado"));
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(1));
    }//GEN-LAST:event_MascotasEncontradasButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdminItem;
    private javax.swing.JMenuItem AdoptanteItem;
    private javax.swing.JMenuItem AdoptanteItem1;
    private javax.swing.JMenuItem AdoptanteItem2;
    private javax.swing.JLabel ApellidoLabel;
    private javax.swing.JLabel ApellidoLabel1;
    private javax.swing.JMenuItem Asociacion;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JMenuItem CasaCunaItem;
    private javax.swing.JMenuItem CasaCunaItem1;
    private javax.swing.JMenuItem CasaCunaItem2;
    private javax.swing.JMenuItem CerrarItem;
    private javax.swing.JMenu Configuracion;
    private javax.swing.JMenu Consultas;
    private javax.swing.JLabel CorreoLabel;
    private javax.swing.JLabel CorreoLabel1;
    private javax.swing.JLabel DatosActualesLabel;
    private javax.swing.JMenuItem DonacionesItem;
    private javax.swing.JMenu Editar;
    private javax.swing.JMenuItem FechaItem;
    private javax.swing.JLabel FotoLabel;
    private javax.swing.JMenuItem ListaNegraItem;
    private javax.swing.JLabel LogoItem;
    private javax.swing.JMenuItem MascotaItem;
    private javax.swing.JButton MascotasEncontradasButton;
    private javax.swing.JMenuItem MascotasItem;
    private javax.swing.JMenuItem MascotasItem1;
    private javax.swing.JButton MascotasPerdidasButton;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel NombreLabel1;
    private javax.swing.JMenu Opciones;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JMenu Registro;
    private javax.swing.JMenuItem SalirItem;
    private javax.swing.JTable TablaInicio;
    private javax.swing.JLabel TelLabel1;
    private javax.swing.JMenuItem TiposMascotasItem;
    private javax.swing.JMenuItem TiposRazasItem;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel UsernameLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
