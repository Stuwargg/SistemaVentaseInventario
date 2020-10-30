/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ListaD;
import Control.ProcesoD;
import Modelo.provedor;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuwar Giron Garcia
 */
public final class FrmProvededor extends javax.swing.JFrame {

    ListaD listaD = new ListaD();
    ProcesoD procesoD = new ProcesoD();
    provedor objprovedor;

    String[] cabecera = {"ID", "Ruc", "Nombre", "Telefono", "Direccion", "Razon"};
    DefaultTableModel modelo = new DefaultTableModel(null, cabecera);

    public FrmProvededor() {
        initComponents();
        tablaprovedr.setModel(modelo);
        setLocationRelativeTo(null);
        rboAdelante.setSelected(true);
        cargar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprovedr = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtTelfProvedor1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtRucProvedor1 = new javax.swing.JTextField();
        txtNameProvedor1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtDireccProvedor1 = new javax.swing.JTextField();
        txtRazonSProvedor1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnbuscarprovedor = new javax.swing.JButton();
        txtidprovedor = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnSaveprovedor = new javax.swing.JButton();
        btnUpdateprovedor = new javax.swing.JButton();
        btnDeleprovedor = new javax.swing.JButton();
        btnlimpiarcampoProvedor = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rboAdelante = new javax.swing.JRadioButton();
        rboAtras = new javax.swing.JRadioButton();
        btnlistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de provedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 70, 20));

        tablaprovedr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaprovedr.setPreferredSize(new java.awt.Dimension(300, 60));
        jScrollPane1.setViewportView(tablaprovedr);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 400, 110));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 420, 170));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion del provedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelfProvedor1.setBackground(new java.awt.Color(0, 0, 0));
        txtTelfProvedor1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtTelfProvedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtTelfProvedor1.setAutoscrolls(false);
        txtTelfProvedor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtTelfProvedor1.setOpaque(false);
        txtTelfProvedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelfProvedor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtTelfProvedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 150, 35));

        jLabel21.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("TELEFONO");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel22.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("NOMBRE");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        jLabel23.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ID");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtRucProvedor1.setBackground(new java.awt.Color(0, 0, 0));
        txtRucProvedor1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtRucProvedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtRucProvedor1.setAutoscrolls(false);
        txtRucProvedor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtRucProvedor1.setOpaque(false);
        txtRucProvedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucProvedor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtRucProvedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, 35));

        txtNameProvedor1.setBackground(new java.awt.Color(0, 0, 0));
        txtNameProvedor1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtNameProvedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtNameProvedor1.setAutoscrolls(false);
        txtNameProvedor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtNameProvedor1.setOpaque(false);
        txtNameProvedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameProvedor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtNameProvedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 35));

        jLabel24.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("DIRECCION");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtDireccProvedor1.setBackground(new java.awt.Color(0, 0, 0));
        txtDireccProvedor1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtDireccProvedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccProvedor1.setAutoscrolls(false);
        txtDireccProvedor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtDireccProvedor1.setOpaque(false);
        jPanel3.add(txtDireccProvedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, 35));

        txtRazonSProvedor1.setBackground(new java.awt.Color(0, 0, 0));
        txtRazonSProvedor1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtRazonSProvedor1.setForeground(new java.awt.Color(255, 255, 255));
        txtRazonSProvedor1.setAutoscrolls(false);
        txtRazonSProvedor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtRazonSProvedor1.setOpaque(false);
        txtRazonSProvedor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRazonSProvedor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtRazonSProvedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, 35));

        jLabel25.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("RAZON SOCIAL");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        btnbuscarprovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        btnbuscarprovedor.setBorder(null);
        btnbuscarprovedor.setBorderPainted(false);
        btnbuscarprovedor.setContentAreaFilled(false);
        btnbuscarprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarprovedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscarprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 40));

        txtidprovedor.setBackground(new java.awt.Color(0, 0, 0));
        txtidprovedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtidprovedor.setForeground(new java.awt.Color(255, 255, 255));
        txtidprovedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtidprovedor.setAutoscrolls(false);
        txtidprovedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtidprovedor.setOpaque(false);
        txtidprovedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidprovedorKeyTyped(evt);
            }
        });
        jPanel3.add(txtidprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 50, 30));

        jLabel26.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("RUC");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 320, 320));

        btnSaveprovedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnSaveprovedor.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveprovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnSaveprovedor.setText("GUARDAR");
        btnSaveprovedor.setBorder(null);
        btnSaveprovedor.setBorderPainted(false);
        btnSaveprovedor.setContentAreaFilled(false);
        btnSaveprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveprovedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 100, 40));

        btnUpdateprovedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnUpdateprovedor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateprovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnUpdateprovedor.setText("ACTUALIZAR");
        btnUpdateprovedor.setBorder(null);
        btnUpdateprovedor.setBorderPainted(false);
        btnUpdateprovedor.setContentAreaFilled(false);
        btnUpdateprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateprovedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 130, 40));

        btnDeleprovedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnDeleprovedor.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleprovedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btnDeleprovedor.setText("ELIMINAR");
        btnDeleprovedor.setBorder(null);
        btnDeleprovedor.setBorderPainted(false);
        btnDeleprovedor.setContentAreaFilled(false);
        btnDeleprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleprovedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, 40));

        btnlimpiarcampoProvedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnlimpiarcampoProvedor.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiarcampoProvedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_32px.png"))); // NOI18N
        btnlimpiarcampoProvedor.setText("NUEVO");
        btnlimpiarcampoProvedor.setBorder(null);
        btnlimpiarcampoProvedor.setBorderPainted(false);
        btnlimpiarcampoProvedor.setContentAreaFilled(false);
        btnlimpiarcampoProvedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarcampoProvedorMouseClicked(evt);
            }
        });
        jPanel1.add(btnlimpiarcampoProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, 40));

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

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rboAdelante.setBackground(new java.awt.Color(0, 51, 51));
        rboAdelante.setForeground(new java.awt.Color(255, 255, 255));
        rboAdelante.setText("Adelante");
        jPanel4.add(rboAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        rboAtras.setBackground(new java.awt.Color(0, 51, 51));
        rboAtras.setForeground(new java.awt.Color(255, 255, 255));
        rboAtras.setText("Atras");
        jPanel4.add(rboAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        btnlistar.setBackground(new java.awt.Color(0, 0, 0));
        btnlistar.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        btnlistar.setForeground(new java.awt.Color(255, 255, 255));
        btnlistar.setText("Listar");
        btnlistar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnlistar.setContentAreaFilled(false);
        btnlistar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });
        jPanel4.add(btnlistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 210, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelfProvedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfProvedor1KeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelfProvedor1KeyTyped

    private void txtRucProvedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucProvedor1KeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRucProvedor1KeyTyped

    private void txtNameProvedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameProvedor1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameProvedor1KeyTyped

    private void txtRazonSProvedor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSProvedor1KeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRazonSProvedor1KeyTyped

    private void btnlimpiarcampoProvedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarcampoProvedorMouseClicked
        limpiar();
    }//GEN-LAST:event_btnlimpiarcampoProvedorMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnSaveprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveprovedorActionPerformed
        if (txtidprovedor.getText().equals("") || txtNameProvedor1.getText().equals("") || txtTelfProvedor1.getText().equals("")
                || txtRucProvedor1.getText().equals("") || txtRazonSProvedor1.getText().equals("") || txtDireccProvedor1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ay campos vacios, porfavor revise el o los  campo vacio");
        } else {
            Object[] registro = {txtidprovedor.getText(), txtRucProvedor1.getText(), txtNameProvedor1.getText(), txtTelfProvedor1.getText(),
                txtDireccProvedor1.getText(), txtRazonSProvedor1.getText()};
            listaD.InsertarI(new provedor(registro));
            try {
                procesoD.insertarP(new provedor(registro));
                listar(0);
                limpiar();
                JOptionPane.showMessageDialog(null, "Se guardo con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al insertar en el archivo de texto");
            }
        }


    }//GEN-LAST:event_btnSaveprovedorActionPerformed

    private void btnbuscarprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarprovedorActionPerformed
        String nom = txtNameProvedor1.getText();
        provedor p = listaD.buscar(nom);

        if (p != null) {
            txtidprovedor.setText(String.valueOf(p.getId()));
            txtRucProvedor1.setText(String.valueOf(p.getRuc()));
            txtTelfProvedor1.setText(String.valueOf(p.getTelefono()));
            txtDireccProvedor1.setText(p.getDireccion());
            txtRazonSProvedor1.setText(p.getRazon());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el nombre del provedor " + nom);
        }
    }//GEN-LAST:event_btnbuscarprovedorActionPerformed

    private void btnUpdateprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateprovedorActionPerformed
        Object[] registro = {txtidprovedor.getText(), txtRucProvedor1.getText(), txtNameProvedor1.getText(), txtTelfProvedor1.getText(),
            txtDireccProvedor1.getText(), txtRazonSProvedor1.getText()};
        if (listaD.actualizar(new provedor(registro))) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            listar(0);
            limpiar();
            try {
                procesoD.actualizar(listaD.listar(0));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar en el archivo de texto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo el nombre " + txtNameProvedor1.getText());
        }
    }//GEN-LAST:event_btnUpdateprovedorActionPerformed

    private void btnDeleprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleprovedorActionPerformed
        if (listaD.eliminar(txtNameProvedor1.getText())) {
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            try {
                procesoD.actualizar(listaD.listar(0));
                listar(0);
                limpiar();
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro el nombre " + txtNameProvedor1.getText() + "del provedor");
        }
    }//GEN-LAST:event_btnDeleprovedorActionPerformed

    private void txtidprovedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidprovedorKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtidprovedorKeyTyped

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        if (rboAdelante.isSelected()) {
            listar(0);
        } else {
            listar(1);
        }
    }//GEN-LAST:event_btnlistarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tablaprovedr.getSelectedRow() >= 0) {
            try {
                DefaultTableModel tm = (DefaultTableModel) tablaprovedr.getModel();
                String nom = String.valueOf(tm.getValueAt(tablaprovedr.getSelectedRow(), 2));

                FrmProductos.txtprovedor.setText(nom);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debees seleccionar un cliente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    FrmInvetario z = new FrmInvetario();

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
            java.util.logging.Logger.getLogger(FrmProvededor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProvededor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProvededor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProvededor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmProvededor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnDeleprovedor;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnSaveprovedor;
    private javax.swing.JButton btnUpdateprovedor;
    private javax.swing.JButton btnbuscarprovedor;
    private javax.swing.JButton btnlimpiarcampoProvedor;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rboAdelante;
    private javax.swing.JRadioButton rboAtras;
    private javax.swing.JTable tablaprovedr;
    private javax.swing.JTextField txtDireccProvedor1;
    private javax.swing.JTextField txtNameProvedor1;
    private javax.swing.JTextField txtRazonSProvedor1;
    private javax.swing.JTextField txtRucProvedor1;
    private javax.swing.JTextField txtTelfProvedor1;
    private javax.swing.JTextField txtidprovedor;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtidprovedor.setText("");
        txtNameProvedor1.setText("");
        txtRucProvedor1.setText("");
        txtTelfProvedor1.setText("");
        txtDireccProvedor1.setText("");
        txtRazonSProvedor1.setText("");
    }

    private void listar(int i) {
        modelo.setRowCount(0);
        switch (i) {
            case 0: {
                for (provedor p : listaD.listar(0)) {
                    modelo.addRow(p.getinformacion());
                }
            }
            break;
            case 1: {
                for (provedor p : listaD.listar(1)) {
                    modelo.addRow(p.getinformacion());
                }
            }
            break;
        }
    }

    private void cargar() {
        modelo.setRowCount(0);
        try {
            procesoD.leer();
            for (provedor p : procesoD.lista) {
                modelo.addRow(p.getinformacion());
                listaD.InsertarI(p);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
