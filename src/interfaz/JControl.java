package interfaz;

import Administrador.Administrador;
import Administrador.ModeloTablas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        jPanel1 = new javax.swing.JPanel();
        PerfilLabel = new javax.swing.JLabel();
        FotoLabel = new javax.swing.JLabel();
        NombreLabel = new javax.swing.JLabel();
        ApellidoLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        CorreoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TelLabel1 = new javax.swing.JLabel();
        CorreoLabel1 = new javax.swing.JLabel();
        UsernameLabel1 = new javax.swing.JLabel();
        ApellidoLabel1 = new javax.swing.JLabel();
        NombreLabel1 = new javax.swing.JLabel();
        LogoItem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DatosActualesLabel = new javax.swing.JLabel();
        MascotasPerdidasButton = new javax.swing.JButton();
        MascotasEncontradasButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInicio = new javax.swing.JTable();
        CantidadLabel = new javax.swing.JLabel();
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

        PrincipalPanel.setBackground(new java.awt.Color(0, 153, 0));
        PrincipalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PerfilLabel.setBackground(new java.awt.Color(0, 0, 0));
        PerfilLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PerfilLabel.setForeground(new java.awt.Color(0, 0, 0));
        PerfilLabel.setText("Perfil de Usuario");

        FotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414706716_user_male2-128.png"))); // NOI18N

        NombreLabel.setBackground(new java.awt.Color(0, 0, 0));
        NombreLabel.setForeground(new java.awt.Color(0, 0, 0));
        NombreLabel.setText("Nombre :");

        ApellidoLabel.setBackground(new java.awt.Color(0, 0, 0));
        ApellidoLabel.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoLabel.setText("Apellido : ");

        UsernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setText("Username :");

        CorreoLabel.setBackground(new java.awt.Color(0, 0, 0));
        CorreoLabel.setForeground(new java.awt.Color(0, 0, 0));
        CorreoLabel.setText("Correo :");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Teléfono :");

        TelLabel1.setBackground(new java.awt.Color(0, 0, 0));
        TelLabel1.setForeground(new java.awt.Color(0, 0, 0));
        TelLabel1.setText("Telefono");

        CorreoLabel1.setBackground(new java.awt.Color(0, 0, 0));
        CorreoLabel1.setForeground(new java.awt.Color(0, 0, 0));
        CorreoLabel1.setText("Correo");

        UsernameLabel1.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLabel1.setForeground(new java.awt.Color(0, 0, 0));
        UsernameLabel1.setText("Username");

        ApellidoLabel1.setBackground(new java.awt.Color(0, 0, 0));
        ApellidoLabel1.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoLabel1.setText("Apellido");

        NombreLabel1.setBackground(new java.awt.Color(0, 0, 0));
        NombreLabel1.setForeground(new java.awt.Color(0, 0, 0));
        NombreLabel1.setText("Nombre");

        LogoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10755057_847539941933847_199279157_n - copia (4).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PerfilLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FotoLabel)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NombreLabel)
                                .addGap(28, 28, 28)
                                .addComponent(NombreLabel1))
                            .addComponent(jLabel1)
                            .addComponent(CorreoLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLabel)
                                    .addComponent(ApellidoLabel))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(ApellidoLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CorreoLabel1)
                                            .addComponent(TelLabel1)
                                            .addComponent(UsernameLabel1))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoItem, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PerfilLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NombreLabel)
                                    .addComponent(NombreLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ApellidoLabel)
                                    .addComponent(ApellidoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(UsernameLabel)
                                    .addComponent(UsernameLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CorreoLabel)
                                    .addComponent(CorreoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(TelLabel1)))
                            .addComponent(FotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        DatosActualesLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DatosActualesLabel.setForeground(new java.awt.Color(0, 0, 0));
        DatosActualesLabel.setText("Datos Actuales");

        MascotasPerdidasButton.setBackground(new java.awt.Color(0, 153, 0));
        MascotasPerdidasButton.setForeground(new java.awt.Color(0, 0, 0));
        MascotasPerdidasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1414830314_Help.png"))); // NOI18N
        MascotasPerdidasButton.setText("Mascotas Perdidas");
        MascotasPerdidasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasPerdidasButtonActionPerformed(evt);
            }
        });

        MascotasEncontradasButton.setBackground(new java.awt.Color(0, 153, 0));
        MascotasEncontradasButton.setForeground(new java.awt.Color(0, 0, 0));
        MascotasEncontradasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410328586_search.png"))); // NOI18N
        MascotasEncontradasButton.setText("Mascota Encontrada");
        MascotasEncontradasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MascotasEncontradasButtonActionPerformed(evt);
            }
        });

        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Perdido"));
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(2));
        TablaInicio.setAutoCreateRowSorter(true); // Para ordenar las tablas
        TablaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInicioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaInicio);

        CantidadLabel.setText("Cantidad :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatosActualesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MascotasEncontradasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MascotasPerdidasButton)
                .addGap(462, 462, 462))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CantidadLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatosActualesLabel)
                    .addComponent(MascotasEncontradasButton)
                    .addComponent(MascotasPerdidasButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout PrincipalPanelLayout = new javax.swing.GroupLayout(PrincipalPanel);
        PrincipalPanel.setLayout(PrincipalPanelLayout);
        PrincipalPanelLayout.setHorizontalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, Short.MAX_VALUE))
                .addContainerGap())
        );
        PrincipalPanelLayout.setVerticalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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
        CasaCunaItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasaCunaItem1ActionPerformed(evt);
            }
        });
        Editar.add(CasaCunaItem1);

        AdoptanteItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410684212_preferences-desktop-user.png"))); // NOI18N
        AdoptanteItem1.setText("Adoptante");
        AdoptanteItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdoptanteItem1ActionPerformed(evt);
            }
        });
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
            .addComponent(PrincipalPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MascotaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotaItemActionPerformed
        JRegistroMascotas mascota = new JRegistroMascotas();
        mascota.setVisible(true);
    }//GEN-LAST:event_MascotaItemActionPerformed

    private void MascotasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasItemActionPerformed
        
    }//GEN-LAST:event_MascotasItemActionPerformed

    private void MascotasItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasItem1ActionPerformed
        JConsultaMascotas consultaMascota = new JConsultaMascotas(); 
        consultaMascota.setVisible(true);
    }//GEN-LAST:event_MascotasItem1ActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed

    }//GEN-LAST:event_RegistroActionPerformed

    private void CasaCunaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasaCunaItemActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isCasaCuna())){
            JCasaCuna casacuna = new JCasaCuna(false);
            casacuna.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Ya estas registrado/n como Casa Cuna");
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
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(2));
    }//GEN-LAST:event_MascotasPerdidasButtonActionPerformed

    private void MascotasEncontradasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MascotasEncontradasButtonActionPerformed
        // TODO add your handling code here:
        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Encontrado"));
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(2));
    }//GEN-LAST:event_MascotasEncontradasButtonActionPerformed

    private void TablaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInicioMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TablaInicioMouseClicked

    private void CasaCunaItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasaCunaItem1ActionPerformed
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isCasaCuna()){
        JCasaCuna casaCuna = new JCasaCuna(true);
        casaCuna.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No estas registrado/n como Casa Cuna");
        }
    }//GEN-LAST:event_CasaCunaItem1ActionPerformed

    private void AdoptanteItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptanteItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdoptanteItem1ActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
