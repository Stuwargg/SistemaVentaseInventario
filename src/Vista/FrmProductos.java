package Vista;

import Control.ListaCProd;
import Control.ProcesoCProd;
import Modelo.Productos;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuwar Giron Garcia
 */
public final class FrmProductos extends javax.swing.JFrame {

    ListaCProd lista = new ListaCProd();
    ProcesoCProd proceso = new ProcesoCProd();
    Productos objPro;

    String[] cabecera = {"codigo", "Nombre", "provedor", "categoria", "stock", "precio"};
    DefaultTableModel tablaP = new DefaultTableModel(null, cabecera);

    public FrmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.TablaProductos.setModel(tablaP);
        cargar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtdescrpcion = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        txtprovedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAñadirCategoria = new javax.swing.JButton();
        btnAñardirProvedor = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDele = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaProductos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 120));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Añardir");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 60, 20));

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_layers_32px_1.png"))); // NOI18N
        jButton3.setText("Inventario");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 620, 150));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categoria:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtprecio.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(255, 255, 255));
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtprecio.setOpaque(false);
        jPanel3.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 370, 30));

        txtcodigo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcodigo.setOpaque(false);
        jPanel3.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 370, 30));

        txtcategoria.setEditable(false);
        txtcategoria.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtcategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcategoria.setOpaque(false);
        jPanel3.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 370, 30));

        txtdescrpcion.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtdescrpcion.setForeground(new java.awt.Color(255, 255, 255));
        txtdescrpcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtdescrpcion.setOpaque(false);
        jPanel3.add(txtdescrpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 370, 30));

        txtstock.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtstock.setForeground(new java.awt.Color(255, 255, 255));
        txtstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtstock.setOpaque(false);
        jPanel3.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 370, 30));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 50));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, 30));

        txtprovedor.setEditable(false);
        txtprovedor.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtprovedor.setForeground(new java.awt.Color(255, 255, 255));
        txtprovedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtprovedor.setOpaque(false);
        jPanel3.add(txtprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 370, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Provedor:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, -1));

        btnAñadirCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadirCategoria.setText("....");
        btnAñadirCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        btnAñadirCategoria.setContentAreaFilled(false);
        btnAñadirCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirCategoria.setDefaultCapable(false);
        btnAñadirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCategoriaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñadirCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, 30));

        btnAñardirProvedor.setForeground(new java.awt.Color(255, 255, 255));
        btnAñardirProvedor.setText("....");
        btnAñardirProvedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        btnAñardirProvedor.setContentAreaFilled(false);
        btnAñardirProvedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñardirProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñardirProvedorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAñardirProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, 30));

        btnSave.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 100, -1));

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnUpdate.setText("Actualizar");
        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 110, -1));

        btnDele.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnDele.setForeground(new java.awt.Color(255, 255, 255));
        btnDele.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btnDele.setText("Elminar");
        btnDele.setBorder(null);
        btnDele.setBorderPainted(false);
        btnDele.setContentAreaFilled(false);
        btnDele.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleActionPerformed(evt);
            }
        });
        jPanel3.add(btnDele, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 110, -1));

        jButton1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_32px.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 620, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtcodigo.getText().equals("") || txtdescrpcion.getText().equals("") || txtprovedor.getText().equals("") || txtstock.getText().equals("")
                || txtprecio.getText().equals("") || txtcategoria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ay campos vacios, porfavor revise el o los  campo vacio");
        } else {
            Object[] fila = {txtcodigo.getText(), txtdescrpcion.getText(), txtprovedor.getText(), txtcategoria.getText(),
                txtstock.getText(), txtprecio.getText()};
            objPro = new Productos(fila);
            lista.insetarPro(objPro);

            try {
                proceso.insertar(objPro);
                listar();
                limpiar();
//                txtstock.setText(String.valueOf(objPro.actualizarStock()));
                JOptionPane.showMessageDialog(null, "Registrado con exito");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al intentar registrar");
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        objPro = lista.buscar(txtcodigo.getText());
        if (objPro != null) {
            txtdescrpcion.setText(objPro.getNombre());
            txtprovedor.setText(objPro.getProveedor());
            txtcategoria.setText(objPro.getCategoria());
            txtstock.setText(String.valueOf(objPro.getStock()));
            txtprecio.setText(String.valueOf(objPro.getPrecio()));
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Object[] fila = {txtcodigo.getText(), txtdescrpcion.getText(), txtprovedor.getText(), txtcategoria.getText(),
            txtstock.getText(), txtprecio.getText()};
        objPro = new Productos(fila);
        if (lista.actualizar(objPro)) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            listar();
            limpiar();
            try {
                proceso.actualizar(lista.listar());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo  " + txtcodigo.getText() + "  del producto no existe");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleActionPerformed
        if (lista.eliminar(txtcodigo.getText())) {
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            listar();
            limpiar();
            try {
                proceso.actualizar(lista.listar());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "El codigo ingresado del producto a eliminar no existe");
        }
    }//GEN-LAST:event_btnDeleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAñardirProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñardirProvedorActionPerformed
        FrmProvededor fp = new FrmProvededor();
        fp.setVisible(true);
    }//GEN-LAST:event_btnAñardirProvedorActionPerformed

    private void btnAñadirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCategoriaActionPerformed
        FrmCategoria fc = new FrmCategoria();
        fc.setVisible(true);
    }//GEN-LAST:event_btnAñadirCategoriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (TablaProductos.getSelectedRow() >= 0) {
            try {
                DefaultTableModel tm = (DefaultTableModel) TablaProductos.getModel();
                String cod = String.valueOf(tm.getValueAt(TablaProductos.getSelectedRow(), 0));
                String nom = String.valueOf(tm.getValueAt(TablaProductos.getSelectedRow(), 1));
                int stock = Integer.parseInt(String.valueOf(tm.getValueAt(TablaProductos.getSelectedRow(), 4)));
                double pre = Double.parseDouble(String.valueOf(tm.getValueAt(TablaProductos.getSelectedRow(), 5)));

                FrmNuevaVenta.txtcodigo.setText(cod);
                FrmNuevaVenta.txtnombre.setText(nom);
                FrmNuevaVenta.txtstock.setText(String.valueOf(stock));
                FrmNuevaVenta.txtprecio.setText(String.valueOf(pre));
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debees seleccionar un cliente");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    FrmInvetario z = new FrmInvetario();
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int select = TablaProductos.getSelectedRow();
        z.setVisible(true);
        try {
            if (select == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar una fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            } else {
                String cod, nom, prov;
                int cant;
                double pre;
                cod = TablaProductos.getValueAt(select, 0).toString();
                nom = TablaProductos.getValueAt(select, 1).toString();
                prov = TablaProductos.getValueAt(select, 3).toString();
                cant = Integer.parseInt(String.valueOf(TablaProductos.getValueAt(select, 4).toString()));
                pre = Double.parseDouble(String.valueOf(TablaProductos.getValueAt(select, 5).toString()));

                Object datos[] = {cod, nom, cant, prov, pre};

                FrmInvetario.modelInventario.addRow(datos);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se completo una accion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAñadirCategoria;
    private javax.swing.JButton btnAñardirProvedor;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnDele;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescrpcion;
    private javax.swing.JTextField txtprecio;
    public static javax.swing.JTextField txtprovedor;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        txtcodigo.setText("");
        txtprovedor.setText("");
        txtcategoria.setText("");
        txtdescrpcion.setText("");
        txtprecio.setText("");
        txtstock.setText("");
    }

    private void listar() {
        tablaP.setRowCount(0);
        for (Productos pr : lista.listar()) {
            tablaP.addRow(pr.getinfo());
        }
    }

    private void cargar() {
        tablaP.setRowCount(0);
        try {
            proceso.leer();
            for (Productos pr : proceso.lista) {
                tablaP.addRow(pr.getinfo());
                lista.insetarPro(pr);
            }
        } catch (Exception e) {
        }
    }

}
