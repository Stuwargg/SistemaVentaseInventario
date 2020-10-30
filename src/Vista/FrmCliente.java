package Vista;

import Control.ListaSimple;
import Control.ProcesoS;
import Modelo.Cliente;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class FrmCliente extends javax.swing.JFrame {

    // --------------- CLASES --------------------------------------//
    ListaSimple listaSimple = new ListaSimple();
    ProcesoS procesoS = new ProcesoS();
    /* para lista */
    Cliente objCliente;

    //----------------------------------------------------------------//
    // --------------- TABLAS --------------------------------------//
    String[] cabecera = {"ID", "DNI", "Nombre", "Telefono", "Direccion", "Razon"};
    DefaultTableModel modelo = new DefaultTableModel(null, cabecera);
    //----------------------------------------------------------------//
    TableRowSorter trs;

    public FrmCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        // --------------- TABLAS --------------------------------------//
        tablacliente.setModel(modelo);

        // ------------------------------------------------------------//
        // --------------- LISTAS SIMPLES -----------------------------//
        cargar();
        // ------------------------------------------------------------//
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txttelefonocliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtdnicliente = new javax.swing.JTextField();
        txtnombrecliente = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtdireccioncliente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtrazoncliente1 = new javax.swing.JTextField();
        txtidcliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablacliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnguardarcliente = new javax.swing.JButton();
        btnUpdatecliente = new javax.swing.JButton();
        btnlimpiarcampocliente = new javax.swing.JButton();
        btnbuscarcliente = new javax.swing.JButton();
        btnDelecliente = new javax.swing.JButton();
        rboDNI = new javax.swing.JRadioButton();
        rboNombre = new javax.swing.JRadioButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, 50));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txttelefonocliente.setBackground(new java.awt.Color(0, 0, 0));
        txttelefonocliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txttelefonocliente.setForeground(new java.awt.Color(255, 255, 255));
        txttelefonocliente.setAutoscrolls(false);
        txttelefonocliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txttelefonocliente.setOpaque(false);
        txttelefonocliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoclienteKeyTyped(evt);
            }
        });
        jPanel3.add(txttelefonocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 150, 35));

        jLabel21.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TELEFONO");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("NOMBRE");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ID");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtdnicliente.setBackground(new java.awt.Color(0, 0, 0));
        txtdnicliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtdnicliente.setForeground(new java.awt.Color(255, 255, 255));
        txtdnicliente.setAutoscrolls(false);
        txtdnicliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtdnicliente.setOpaque(false);
        txtdnicliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniclienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtdnicliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 150, 35));

        txtnombrecliente.setBackground(new java.awt.Color(0, 0, 0));
        txtnombrecliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtnombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        txtnombrecliente.setAutoscrolls(false);
        txtnombrecliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtnombrecliente.setOpaque(false);
        txtnombrecliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreclienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtnombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 150, 35));

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DIRECCION");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtdireccioncliente.setBackground(new java.awt.Color(0, 0, 0));
        txtdireccioncliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtdireccioncliente.setForeground(new java.awt.Color(255, 255, 255));
        txtdireccioncliente.setAutoscrolls(false);
        txtdireccioncliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtdireccioncliente.setOpaque(false);
        jPanel3.add(txtdireccioncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 150, 35));

        jLabel25.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("RAZON SOCIAL");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtrazoncliente1.setBackground(new java.awt.Color(0, 0, 0));
        txtrazoncliente1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtrazoncliente1.setForeground(new java.awt.Color(255, 255, 255));
        txtrazoncliente1.setAutoscrolls(false);
        txtrazoncliente1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtrazoncliente1.setOpaque(false);
        txtrazoncliente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazoncliente1KeyTyped(evt);
            }
        });
        jPanel3.add(txtrazoncliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 150, 35));

        txtidcliente.setBackground(new java.awt.Color(111, 174, 2));
        txtidcliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtidcliente.setForeground(new java.awt.Color(255, 255, 255));
        txtidcliente.setAutoscrolls(false);
        txtidcliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtidcliente.setOpaque(false);
        txtidcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidclienteKeyTyped(evt);
            }
        });
        jPanel3.add(txtidcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, 20));

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("DNI/RUC");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 300));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Clientes TXT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacliente.setPreferredSize(new java.awt.Dimension(300, 60));
        jScrollPane2.setViewportView(tablacliente);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, 140));

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Añardir");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 420, 220));

        btnguardarcliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnguardarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnguardarcliente.setText("GUARDAR");
        btnguardarcliente.setBorder(null);
        btnguardarcliente.setBorderPainted(false);
        btnguardarcliente.setContentAreaFilled(false);
        btnguardarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 110, 40));

        btnUpdatecliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnUpdatecliente.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatecliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnUpdatecliente.setText("ACTUALIZAR");
        btnUpdatecliente.setBorder(null);
        btnUpdatecliente.setBorderPainted(false);
        btnUpdatecliente.setContentAreaFilled(false);
        btnUpdatecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdatecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 120, 40));

        btnlimpiarcampocliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnlimpiarcampocliente.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiarcampocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_32px.png"))); // NOI18N
        btnlimpiarcampocliente.setText("NUEVO");
        btnlimpiarcampocliente.setBorder(null);
        btnlimpiarcampocliente.setBorderPainted(false);
        btnlimpiarcampocliente.setContentAreaFilled(false);
        btnlimpiarcampocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcampoclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiarcampocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 90, 40));

        btnbuscarcliente.setBackground(new java.awt.Color(0, 0, 0));
        btnbuscarcliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnbuscarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btnbuscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        btnbuscarcliente.setText("Buscar");
        btnbuscarcliente.setBorderPainted(false);
        btnbuscarcliente.setContentAreaFilled(false);
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 110, 30));

        btnDelecliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnDelecliente.setForeground(new java.awt.Color(255, 255, 255));
        btnDelecliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btnDelecliente.setText("ELIMINAR");
        btnDelecliente.setBorder(null);
        btnDelecliente.setBorderPainted(false);
        btnDelecliente.setContentAreaFilled(false);
        btnDelecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 110, 40));

        rboDNI.setBackground(new java.awt.Color(0, 51, 51));
        rboDNI.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        rboDNI.setForeground(new java.awt.Color(255, 255, 255));
        rboDNI.setText("DNI");
        jPanel1.add(rboDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        rboNombre.setBackground(new java.awt.Color(0, 51, 51));
        rboNombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        rboNombre.setForeground(new java.awt.Color(255, 255, 255));
        rboNombre.setText("NOMBRE");
        jPanel1.add(rboNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        txtFiltro.setBackground(new java.awt.Color(0, 51, 51));
        txtFiltro.setForeground(new java.awt.Color(114, 172, 2));
        txtFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 172, 2)));
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 330, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void txttelefonoclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoclienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoclienteKeyTyped

    private void txtdniclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniclienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtdniclienteKeyTyped

    private void txtnombreclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreclienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreclienteKeyTyped

    private void txtidclienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidclienteKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidclienteKeyTyped

    private void btnguardarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarclienteActionPerformed
        if (txtidcliente.getText().equals("") || txtdnicliente.getText().equals("") || txtnombrecliente.getText().equals("")
                || txtdireccioncliente.getText().equals("") || txttelefonocliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ay campos vacios, porfavor revise el o los  campo vacio");
        } else {
            objCliente = new Cliente(Integer.parseInt(txtidcliente.getText()), txtdnicliente.getText(), txtnombrecliente.getText(), Integer.parseInt(txttelefonocliente.getText()),
                    txtdireccioncliente.getText(), txtrazoncliente1.getText());
            listaSimple.insertarC(objCliente);
            try {
                procesoS.adicionar(objCliente);
                JOptionPane.showMessageDialog(null, "Guardao exito");
                listar();
                limpiarcampos();
            } catch (Exception e) {
            }
        }


    }//GEN-LAST:event_btnguardarclienteActionPerformed

    private void txtrazoncliente1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazoncliente1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrazoncliente1KeyTyped

    private void btnUpdateclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateclienteActionPerformed
        objCliente = new Cliente(Integer.parseInt(txtidcliente.getText()), txtdnicliente.getText(), txtnombrecliente.getText(), Integer.parseInt(txttelefonocliente.getText()),
                txtdireccioncliente.getText(), txtrazoncliente1.getText());
        boolean encontrado = listaSimple.actualizarC(objCliente);
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");

            try {
                procesoS.actualizar(listaSimple.listarC());
                listar();
                limpiarcampos();
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }


    }//GEN-LAST:event_btnUpdateclienteActionPerformed

    private void btnDeleclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleclienteActionPerformed
        if (objCliente != null) {
            boolean encontrado = listaSimple.eliminar(objCliente);
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "Se elimino correctamente");
                try {
                    procesoS.actualizar(listaSimple.listarC());
                    listar();
                    limpiarcampos();
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Eror al intentar eliminar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se puede eliminar ya que el elemento buscado no existe");
        }


    }//GEN-LAST:event_btnDeleclienteActionPerformed

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed
        objCliente = new Cliente();

        if (rboDNI.isSelected()) {
            objCliente = listaSimple.buscarC(txtdnicliente.getText(), "1");
        } else if (rboNombre.isSelected()) {
            objCliente = listaSimple.buscarC(txtnombrecliente.getText(), "2");
        } else {
            JOptionPane.showMessageDialog(null, "Elija las opciones de busqueda por dni o nombre");
        }

        if (objCliente != null) {
            txtidcliente.setText(String.valueOf(objCliente.getId()));
            txtdnicliente.setText(objCliente.getDni());
            txtnombrecliente.setText(objCliente.getNombre());
            txttelefonocliente.setText(String.valueOf(objCliente.getTelefono()));
            txtdireccioncliente.setText(objCliente.getDireccion());
            txtrazoncliente1.setText(objCliente.getRazon());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el elemento a buscar");
        }


    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    private void btnlimpiarcampoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcampoclienteActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_btnlimpiarcampoclienteActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtFiltro.getText(), 2));
            }

        });
        trs = new TableRowSorter(modelo);
        tablacliente.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tablacliente.getSelectedRow() >= 0) {
            try {
                DefaultTableModel tm = (DefaultTableModel) tablacliente.getModel();
                String dni = String.valueOf(tm.getValueAt(tablacliente.getSelectedRow(), 1));
                String nom = String.valueOf(tm.getValueAt(tablacliente.getSelectedRow(), 2));

                FrmNuevaVenta.txtdniCli.setText(dni);
                FrmNuevaVenta.txtnomCli.setText(nom);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debees seleccionar un cliente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnDelecliente;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnUpdatecliente;
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btnguardarcliente;
    private javax.swing.JButton btnlimpiarcampocliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rboDNI;
    private javax.swing.JRadioButton rboNombre;
    private javax.swing.JTable tablacliente;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtdireccioncliente;
    private javax.swing.JTextField txtdnicliente;
    private javax.swing.JTextField txtidcliente;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtrazoncliente1;
    private javax.swing.JTextField txttelefonocliente;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        modelo.setRowCount(0);
        try {
            procesoS.leer();
            for (Cliente c : procesoS.listado) {
                listaSimple.insertarC(c);
                Object[] fila = {c.getId(), c.getDni(), c.getNombre(), c.getTelefono(), c.getDireccion(), c.getRazon()};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
        }
    }

    private void listar() {
        modelo.setRowCount(0);
        try {
            procesoS.leer();
            for (Cliente c : procesoS.listado) {
                Object[] fila = {c.getId(), c.getDni(), c.getNombre(), c.getTelefono(), c.getDireccion(), c.getRazon()};
                modelo.addRow(fila);
            }
        } catch (Exception e) {
        }
    }

    public void limpiarcampos() {
        txtidcliente.setText("");
        txtdnicliente.setText("");
        txtnombrecliente.setText("");
        txtdireccioncliente.setText("");
        txttelefonocliente.setText("");
        txtrazoncliente1.setText("");
    }
}
