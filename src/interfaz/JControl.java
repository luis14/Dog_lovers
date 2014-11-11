package interfaz;

import Administrador.Administrador;
import Administrador.ModeloTablas;
import Imagenes.CargarImagen;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane; 
import interfaz.JMatch;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;

public class JControl extends javax.swing.JFrame {

    public JControl() {
        initComponents();
        DatosUsuario(); 
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pefil de Usuario");
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Mascota.jpg")).getImage());
        if(!esAdmin()){
            Configuracion.setVisible(false);   
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
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getImagen() != null){
            FotoLabel.setIcon(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).getImagen());
        }
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
        fotoButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        DatosActualesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInicio = new javax.swing.JTable();
        CantidadText = new javax.swing.JLabel();
        CantidadLabel = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        matchButton = new javax.swing.JButton();
        EstadosCombo = new javax.swing.JComboBox();
        ActualizarButton = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Registro = new javax.swing.JMenu();
        MascotaItem = new javax.swing.JMenuItem();
        CasaCunaItem = new javax.swing.JMenuItem();
        AdoptanteItem = new javax.swing.JMenuItem();
        Asociacion = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        CasaCunaItem1 = new javax.swing.JMenuItem();
        AdoptanteItem1 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        MascotasItem1 = new javax.swing.JMenuItem();
        CasaCunaItem2 = new javax.swing.JMenuItem();
        AdoptanteItem2 = new javax.swing.JMenuItem();
        AsociacionMenuItem = new javax.swing.JMenuItem();
        ListaNegraItem = new javax.swing.JMenuItem();
        DonacionesItem = new javax.swing.JMenuItem();
        Configuracion = new javax.swing.JMenu();
        FechaItem = new javax.swing.JMenuItem();
        AdminItem = new javax.swing.JMenuItem();
        TiposRazasItem = new javax.swing.JMenuItem();
        TiposMascotasItem = new javax.swing.JMenuItem();
        Opciones = new javax.swing.JMenu();
        CerrarItem = new javax.swing.JMenuItem();
        SalirItem = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrincipalPanel.setBackground(new java.awt.Color(0, 153, 153));
        PrincipalPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PrincipalPanel.setForeground(new java.awt.Color(0, 0, 0));

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

        fotoButton.setText("Cambiar imagen");
        fotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoButtonActionPerformed(evt);
            }
        });

        EditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415669037_05_Edit_16x16.png"))); // NOI18N
        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FotoLabel))
                    .addComponent(PerfilLabel))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarButton)
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
                                    .addComponent(UsernameLabel1)))))
                    .addComponent(fotoButton))
                .addGap(18, 18, 18)
                .addComponent(LogoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PerfilLabel)
                            .addComponent(EditarButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(TelLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fotoButton)))))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        DatosActualesLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DatosActualesLabel.setText("Datos Actuales");

        TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Perdido"));
        matchButton.setEnabled(true);
        TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3));
        CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        TablaInicio.getTableHeader().setReorderingAllowed(false); //no permite mover los titulos
        TablaInicio.setAutoCreateRowSorter(true); // Para ordenar las tablas
        TablaInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInicioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaInicio);

        CantidadText.setText("Cantidad :");

        CantidadLabel.setText("Cantidad");

        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415669037_05_Edit_16x16.png"))); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        matchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415673004_plugin.png"))); // NOI18N
        matchButton.setText("Match");
        matchButton.setEnabled(false);
        matchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchButtonActionPerformed(evt);
            }
        });

        EstadosCombo.setModel(new javax.swing.DefaultComboBoxModel(Administrador.EstadosToArray()));

        ActualizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410683419_refresh.png"))); // NOI18N
        ActualizarButton.setText("Actualizar");
        ActualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DatosActualesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EstadosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(CantidadText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CantidadLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ActualizarButton)
                                .addGap(165, 165, 165)
                                .addComponent(matchButton)
                                .addGap(29, 29, 29)
                                .addComponent(editarButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DatosActualesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EstadosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ActualizarButton)))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadText)
                    .addComponent(CantidadLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout PrincipalPanelLayout = new javax.swing.GroupLayout(PrincipalPanel);
        PrincipalPanel.setLayout(PrincipalPanelLayout);
        PrincipalPanelLayout.setHorizontalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PrincipalPanelLayout.setVerticalGroup(
            PrincipalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        Asociacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415538969_user-group-16.png"))); // NOI18N
        Asociacion.setText("Asociación");
        Asociacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociacionActionPerformed(evt);
            }
        });
        Registro.add(Asociacion);

        Menu.add(Registro);

        Editar.setText("Editar");

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

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415538969_user-group-16.png"))); // NOI18N
        jMenuItem1.setText("Asociación");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Editar.add(jMenuItem1);

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

        AsociacionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415538969_user-group-16.png"))); // NOI18N
        AsociacionMenuItem.setText("Asociación");
        AsociacionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociacionMenuItemActionPerformed(evt);
            }
        });
        Consultas.add(AsociacionMenuItem);

        ListaNegraItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415672800_list-16.png"))); // NOI18N
        ListaNegraItem.setText("Lista Negra");
        ListaNegraItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaNegraItemActionPerformed(evt);
            }
        });
        Consultas.add(ListaNegraItem);

        DonacionesItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415662971_donate.png"))); // NOI18N
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
        FechaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaItemActionPerformed(evt);
            }
        });
        Configuracion.add(FechaItem);

        AdminItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312443_user-worker-boss.png"))); // NOI18N
        AdminItem.setText("Administrador");
        AdminItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminItemActionPerformed(evt);
            }
        });
        Configuracion.add(AdminItem);

        TiposRazasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415672611_animals-15-16.png"))); // NOI18N
        TiposRazasItem.setText("Tipos de Razas");
        TiposRazasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiposRazasItemActionPerformed(evt);
            }
        });
        Configuracion.add(TiposRazasItem);

        TiposMascotasItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415672727_animals-01-16.png"))); // NOI18N
        TiposMascotasItem.setText("Tipos de Mascotas");
        TiposMascotasItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiposMascotasItemActionPerformed(evt);
            }
        });
        Configuracion.add(TiposMascotasItem);

        Menu.add(Configuracion);

        Opciones.setText("Opciones");

        CerrarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1415539221_Log Out.png"))); // NOI18N
        CerrarItem.setText("Cerrar Sesión ");
        CerrarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarItemActionPerformed(evt);
            }
        });
        Opciones.add(CerrarItem);

        SalirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1410312667_button_cancel.png"))); // NOI18N
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
        JRegistroMascotas mascota = new JRegistroMascotas(-1);
        mascota.setVisible(true);
    }//GEN-LAST:event_MascotaItemActionPerformed

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
            JOptionPane.showMessageDialog(null,"Ya esta registrado como Casa Cuna");
        }
    }//GEN-LAST:event_CasaCunaItemActionPerformed

    private void CerrarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarItemActionPerformed
       Jusuario1  usuario = new Jusuario1();
       usuario.setVisible(true);
       dispose();
    }//GEN-LAST:event_CerrarItemActionPerformed

    private void SalirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirItemActionPerformed
       dispose();
    }//GEN-LAST:event_SalirItemActionPerformed

    private void AdoptanteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptanteItemActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante())){
            JAdoptante adoptante = new JAdoptante(false);
            adoptante.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Ya esta registrado como Adoptante");
        }
    }//GEN-LAST:event_AdoptanteItemActionPerformed

    private void ListaNegraItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaNegraItemActionPerformed
       JListaNegra lista = new JListaNegra();
       lista.setVisible(true);
    }//GEN-LAST:event_ListaNegraItemActionPerformed

    private void AsociacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociacionActionPerformed
        if(!(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAsociacion())){
            JAsociacion asociacion = new JAsociacion(false);
            asociacion.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Ya esta registrado como Asociación");
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

    private void TablaInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInicioMouseClicked
        int fila = TablaInicio.getSelectedRow();
        String idAnimal = TablaInicio.getValueAt(fila ,0).toString();
        JMasInfo ventEmergente = new JMasInfo();
        ventEmergente.actualizarDatosEnVentana(Integer.valueOf(idAnimal)-1);
        ventEmergente.setVisible(true);
    }//GEN-LAST:event_TablaInicioMouseClicked

    private void TiposMascotasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposMascotasItemActionPerformed
        JEditarTipos editarTipos = new JEditarTipos(); 
        editarTipos.setVisible(true);
    }//GEN-LAST:event_TiposMascotasItemActionPerformed

    private void TiposRazasItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposRazasItemActionPerformed
        JEditarRaza editarRaza = new JEditarRaza(); 
        editarRaza.setVisible(true);
    }//GEN-LAST:event_TiposRazasItemActionPerformed

    private void AdminItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminItemActionPerformed
        JEditarAdmins editarAdmins = new JEditarAdmins(); 
        editarAdmins.setVisible(true);
    }//GEN-LAST:event_AdminItemActionPerformed

    private void AsociacionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociacionMenuItemActionPerformed
        JConsultaAsociaciones asociacion = new JConsultaAsociaciones();
        asociacion.setVisible(true);
    }//GEN-LAST:event_AsociacionMenuItemActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        int fila = TablaInicio.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null,"¡No has seleccionado ninguna mascota para editar!");
        }else{
            String idUsuario = TablaInicio.getValueAt(fila, 0).toString(); 
            JRegistroMascotas registroMascotas = new JRegistroMascotas(Integer.parseInt(idUsuario)-1);
            registroMascotas.setVisible(true);
        }    
    }//GEN-LAST:event_editarButtonActionPerformed

    private void matchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchButtonActionPerformed
        int fila = TablaInicio.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null,"¡No has seleccionado ninguna mascota perdida para hacer match!");
        }else{
            String idUsuario = TablaInicio.getValueAt(fila, 0).toString(); 
            JMatch match = new JMatch(Integer.parseInt(idUsuario)-1); 
            match.setVisible(true);
        }
    }//GEN-LAST:event_matchButtonActionPerformed
    
    Icon img = null;
    private void fotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoButtonActionPerformed
        CargarImagen portada = new CargarImagen();
        BufferedImage bookPortrait = portada.Cargar();
	ImageIcon imagen = new ImageIcon(bookPortrait.getScaledInstance(210,204,Image.SCALE_SMOOTH));
        img = imagen;
	FotoLabel.setIcon(imagen);
        Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).setImagen(img);
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante()){
            int adoptante = 0;
            while(Administrador.ListaDeAdoptantes.get(adoptante).getUsuario() != Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual)){
                adoptante++;
            }
            Administrador.ListaDeAdoptantes.get(adoptante).setImagen(img);
        }
    }//GEN-LAST:event_fotoButtonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAsociacion()){
            JAsociacion asiciacion = new JAsociacion(true);
            asiciacion.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No estas registrado como Asociación");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void AdoptanteItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdoptanteItem1ActionPerformed
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isAdoptante()){
            JAdoptante adoptante = new JAdoptante(true);
            adoptante.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No estas registrado como Adoptante");
        }
    }//GEN-LAST:event_AdoptanteItem1ActionPerformed

    private void CasaCunaItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasaCunaItem1ActionPerformed
        if(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual).isCasaCuna()){
            JCasaCuna casaCuna = new JCasaCuna(true);
            casaCuna.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"No estas registrado como Casa Cuna");
        }
    }//GEN-LAST:event_CasaCunaItem1ActionPerformed

    private void ActualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarButtonActionPerformed
        String estadoEscogido = (String)EstadosCombo.getSelectedItem();
        if(estadoEscogido.equals("Encontrado")){
            matchButton.setEnabled(false);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Encontrado")); 
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3)); 
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(2)); 
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        } 
         if(estadoEscogido.equals("Perdido")){
            matchButton.setEnabled(true);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Perdido"));
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3)); 
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
         } 
          if(estadoEscogido.equals("Identificado")){
            matchButton.setEnabled(false);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Identificado"));
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3)); 
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        }  
         if(estadoEscogido.equals("En Adopción")){
            matchButton.setEnabled(false);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "En Adopción"));
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3)); 
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        }  
         if(estadoEscogido.equals("Adoptado")){
            matchButton.setEnabled(false);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Adoptado"));
            TablaInicio.removeColumn(TablaInicio.getColumnModel().getColumn(3)); 
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        } 
           if(estadoEscogido.equals("Recuperado")){
            matchButton.setEnabled(false);
            TablaInicio.setModel(ModeloTablas.tablaMascotas(Administrador.ListaDeUsuarios.get(Administrador.UsuarioActual), "Recuperado"));
            CantidadLabel.setText(ModeloTablas.getContadorUniversal());
        } 
    }//GEN-LAST:event_ActualizarButtonActionPerformed

    private void FechaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaItemActionPerformed
        JFecha fecha = new JFecha();
        fecha.setVisible(true);
    }//GEN-LAST:event_FechaItemActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        JRegistrarUsuario  registro = new JRegistrarUsuario(true);
        registro.setVisible(true);
    }//GEN-LAST:event_EditarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarButton;
    private javax.swing.JMenuItem AdminItem;
    private javax.swing.JMenuItem AdoptanteItem;
    private javax.swing.JMenuItem AdoptanteItem1;
    private javax.swing.JMenuItem AdoptanteItem2;
    private javax.swing.JLabel ApellidoLabel;
    public static javax.swing.JLabel ApellidoLabel1;
    private javax.swing.JMenuItem Asociacion;
    private javax.swing.JMenuItem AsociacionMenuItem;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JLabel CantidadText;
    private javax.swing.JMenuItem CasaCunaItem;
    private javax.swing.JMenuItem CasaCunaItem1;
    private javax.swing.JMenuItem CasaCunaItem2;
    private javax.swing.JMenuItem CerrarItem;
    private javax.swing.JMenu Configuracion;
    private javax.swing.JMenu Consultas;
    private javax.swing.JLabel CorreoLabel;
    public static javax.swing.JLabel CorreoLabel1;
    private javax.swing.JLabel DatosActualesLabel;
    private javax.swing.JMenuItem DonacionesItem;
    private javax.swing.JMenu Editar;
    private javax.swing.JButton EditarButton;
    private javax.swing.JComboBox EstadosCombo;
    private javax.swing.JMenuItem FechaItem;
    private javax.swing.JLabel FotoLabel;
    private javax.swing.JMenuItem ListaNegraItem;
    private javax.swing.JLabel LogoItem;
    private javax.swing.JMenuItem MascotaItem;
    private javax.swing.JMenuItem MascotasItem1;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JLabel NombreLabel;
    public static javax.swing.JLabel NombreLabel1;
    private javax.swing.JMenu Opciones;
    private javax.swing.JLabel PerfilLabel;
    private javax.swing.JPanel PrincipalPanel;
    private javax.swing.JMenu Registro;
    private javax.swing.JMenuItem SalirItem;
    private javax.swing.JTable TablaInicio;
    public static javax.swing.JLabel TelLabel1;
    private javax.swing.JMenuItem TiposMascotasItem;
    private javax.swing.JMenuItem TiposRazasItem;
    private javax.swing.JLabel UsernameLabel;
    public static javax.swing.JLabel UsernameLabel1;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton fotoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton matchButton;
    // End of variables declaration//GEN-END:variables
}
