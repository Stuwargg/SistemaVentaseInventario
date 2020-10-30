package Vista;

import Control.PilaVenta;
import Control.ProcesoPila;
import Modelo.Detalle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class FrmNuevaVenta extends javax.swing.JFrame {

    /**
     * Creates new form NuevaVenta
     */
    ProcesoPila p = new ProcesoPila();
    PilaVenta pila = new PilaVenta();
    Detalle objDe;

    String[] cabe = {"Codigo", "Descripcion", "Cantidad", "Precio", "Total a pagar"};
    DefaultTableModel modelo;

    public FrmNuevaVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel(null, cabe);
        tablaVentaNueva.setModel(modelo);
        btnUpdateVentaNueva.setVisible(false);

        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdniCli = new javax.swing.JTextField();
        txtnomCli = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentaNueva = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtmontoxventa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnguardarVentaNueva = new javax.swing.JButton();
        btnUpdateVentaNueva = new javax.swing.JButton();
        btnDeleVentaNueva = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblstockactual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripcion");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtprecio.setEditable(false);
        txtprecio.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(255, 255, 255));
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtprecio.setOpaque(false);
        jPanel3.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 370, 30));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtcodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtcodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcodigo.setOpaque(false);
        jPanel3.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 370, 30));

        txtnombre.setEditable(false);
        txtnombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtnombre.setOpaque(false);
        jPanel3.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 370, 30));

        txtcantidad.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtcantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcantidad.setOpaque(false);
        jPanel3.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 370, 30));

        txtstock.setEditable(false);
        txtstock.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtstock.setForeground(new java.awt.Color(255, 255, 255));
        txtstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtstock.setOpaque(false);
        jPanel3.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 370, 30));

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText(".....");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, 30));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel3.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, 570, 230));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DNI");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtdniCli.setEditable(false);
        txtdniCli.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtdniCli.setForeground(new java.awt.Color(255, 255, 255));
        txtdniCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtdniCli.setOpaque(false);
        jPanel4.add(txtdniCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 370, 30));

        txtnomCli.setEditable(false);
        txtnomCli.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtnomCli.setForeground(new java.awt.Color(255, 255, 255));
        txtnomCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtnomCli.setOpaque(false);
        jPanel4.add(txtnomCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 370, 30));

        jButton1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText(".....");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 20, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 570, 110));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVentaNueva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaVentaNueva);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 540, 130));

        jButton3.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 60, -1));

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Listar");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setDefaultCapable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        txtmontoxventa.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtmontoxventa.setForeground(new java.awt.Color(255, 255, 255));
        txtmontoxventa.setBorder(null);
        txtmontoxventa.setOpaque(false);
        jPanel2.add(txtmontoxventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 110, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total de la venta");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 570, 210));

        btnguardarVentaNueva.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnguardarVentaNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnguardarVentaNueva.setText("GUARDAR");
        btnguardarVentaNueva.setBorder(null);
        btnguardarVentaNueva.setBorderPainted(false);
        btnguardarVentaNueva.setContentAreaFilled(false);
        btnguardarVentaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarVentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarVentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardarVentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 130, 40));

        btnUpdateVentaNueva.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnUpdateVentaNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnUpdateVentaNueva.setText("ACTUALIZAR");
        btnUpdateVentaNueva.setBorder(null);
        btnUpdateVentaNueva.setBorderPainted(false);
        btnUpdateVentaNueva.setContentAreaFilled(false);
        btnUpdateVentaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateVentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateVentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 200, 40));

        btnDeleVentaNueva.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnDeleVentaNueva.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleVentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btnDeleVentaNueva.setText("ELIMINAR");
        btnDeleVentaNueva.setBorder(null);
        btnDeleVentaNueva.setBorderPainted(false);
        btnDeleVentaNueva.setContentAreaFilled(false);
        btnDeleVentaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleVentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleVentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleVentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 130, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock actual");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblstockactual.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lblstockactual.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblstockactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 70, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmCliente cli = new FrmCliente();
        cli.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmProductos pr = new FrmProductos();
        pr.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnguardarVentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarVentaNuevaActionPerformed
        if (txtcodigo.getText().equals("") || txtnombre.getText().equals("") || txtprecio.getText().equals("")
                || txtstock.getText().equals("") || txtcantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ay campos vacios, porfavor revise el o los  campo vacio");
        } else {
            int stockActul = 0, cantidad = 0, stock = 0;
            cantidad = Integer.parseInt(txtcantidad.getText());
            stock = Integer.parseInt(txtstock.getText());
            if (cantidad > stock) {
                JOptionPane.showMessageDialog(null, "No hay stock");
            } else {
                stockActul = stock - cantidad;
                Object[] fila = {txtcodigo.getText(), txtnombre.getText(), txtcantidad.getText(), txtprecio.getText()};
                objDe = new Detalle(fila);
                pila.push(objDe);
                float suma = 0;
                try {
                    p.insertaR(objDe);
                    listar();
                    limpiar();
                    suma = suma + objDe.TPagar();

                    JOptionPane.showMessageDialog(null, "Registrado con exito");
                    txtmontoxventa.setText(String.valueOf(suma));
                } catch (Exception e) {
                }
            }

            lblstockactual.setText(String.valueOf(stockActul));
        }


    }//GEN-LAST:event_btnguardarVentaNuevaActionPerformed

    private void btnUpdateVentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVentaNuevaActionPerformed
        Object[] fila = {txtcodigo.getText(), txtnombre.getText(), Integer.parseInt(txtcantidad.getText()), Double.parseDouble(txtprecio.getText())};
        objDe = new Detalle(fila);
        if (pila.actualizar(objDe)) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            listar();
//            txtmontoxventa.setText(String.valueOf(objDe.montoTotal()));
            try {
                p.actualizar(pila.listado());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error al momento de actualizar");
        }


    }//GEN-LAST:event_btnUpdateVentaNuevaActionPerformed

    private void btnDeleVentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleVentaNuevaActionPerformed
        if (!pila.empty()) {
            pila.pop();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            listar();
//            txtmontoxventa.setText(String.valueOf(objDe.montoTotal()));
            try {
                p.actualizar(pila.listado());
                p.array.remove(0);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Pila se encuentra vacia");
        }
    }//GEN-LAST:event_btnDeleVentaNuevaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int select = tablaVentaNueva.getSelectedRow();

        try {
            if (select == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar una fila", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            } else {
                String cod, nom;
                int cant;
                double totalxpagar, pre;

                cod = tablaVentaNueva.getValueAt(select, 0).toString();
                nom = tablaVentaNueva.getValueAt(select, 1).toString();
                cant = Integer.parseInt(String.valueOf(tablaVentaNueva.getValueAt(select, 2).toString()));
                pre = Double.parseDouble(String.valueOf(tablaVentaNueva.getValueAt(select, 3).toString()));
                totalxpagar = Double.parseDouble(String.valueOf(tablaVentaNueva.getValueAt(select, 4).toString()));
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    modelo.removeRow(i);
                    i = i - 1;
                }

                Object datos[] = {cod, nom, cant, pre, totalxpagar};

                FrmVentas.modelVentas.addRow(datos);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se completo una accion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        x.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

//    public int suma() {
//        int contar = tablaVentaNueva.getRowCount();
//        int suma = 0;
//        for (int i = 0; i < contar; i++) {
//            suma = suma+Integer.parseInt(tablaVentaNueva.getValueAt(i, 4).toString());
//        }
//        return suma;
//    }
    FrmVentas x = new FrmVentas();

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
            java.util.logging.Logger.getLogger(FrmNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNuevaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnDeleVentaNueva;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnUpdateVentaNueva;
    private javax.swing.JButton btnguardarVentaNueva;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblstockactual;
    private javax.swing.JTable tablaVentaNueva;
    public static javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcodigo;
    public static javax.swing.JTextField txtdniCli;
    public static javax.swing.JTextField txtmontoxventa;
    public static javax.swing.JTextField txtnomCli;
    public static javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtprecio;
    public static javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables

    private void cargar() {
        modelo.setRowCount(0);
        try {
            p.leer();
            for (Detalle d : p.array) {
                modelo.addRow(d.getInfor());
            }

            for (int i = p.array.size() - 1; i >= 0; i--) {
                pila.push(new Detalle(p.array.get(i).getInfor()));
            }
        } catch (Exception e) {
        }
    }

    private void listar() {
        modelo.setRowCount(0);
        try {
            p.leer();
            for (Detalle d : pila.listado()) {
                modelo.addRow(d.getInfor());
            }
        } catch (Exception e) {
        }
    }

    private void limpiar() {
        txtcodigo.setText("");
        txtnombre.setText("");
        txtcantidad.setText("");
        txtprecio.setText("");
        txtstock.setText("");

        txtnomCli.setText("");
        txtdniCli.setText("");
    }

}
