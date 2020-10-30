package Vista;

import Control.ColaCategoria;
import Control.ProcesoCola;
import Modelo.Categoria;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Stuwar Giron Garcia
 */
public class FrmCategoria extends javax.swing.JFrame {

    ProcesoCola p = new ProcesoCola();
    ColaCategoria cola = new ColaCategoria();
    Categoria objCat;

    String[] cabe = {"Codigo", "Categoria"};
    DefaultTableModel modelo = new DefaultTableModel(null, cabe);

    public FrmCategoria() {
        initComponents();
        this.setLocationRelativeTo(null);
        tablacategoria.setModel(modelo);
        cargar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtcategoria = new javax.swing.JTextField();
        txtcodgio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        btnguardarcliente = new javax.swing.JButton();
        btnUpdatecliente = new javax.swing.JButton();
        btnDelecliente = new javax.swing.JButton();
        btnlimpiarcampocliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacategoria = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcategoria.setBackground(new java.awt.Color(111, 174, 2));
        txtcategoria.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtcategoria.setForeground(new java.awt.Color(255, 255, 255));
        txtcategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcategoria.setOpaque(false);
        jPanel2.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, 35));

        txtcodgio.setBackground(new java.awt.Color(111, 174, 2));
        txtcodgio.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtcodgio.setForeground(new java.awt.Color(255, 255, 255));
        txtcodgio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodgio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcodgio.setOpaque(false);
        jPanel2.add(txtcodgio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 50, 35));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORIA:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 30));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CODIGO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 480, 120));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 50));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 50));

        btnguardarcliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnguardarcliente.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnguardarcliente.setText("GUARDAR");
        btnguardarcliente.setBorder(null);
        btnguardarcliente.setBorderPainted(false);
        btnguardarcliente.setContentAreaFilled(false);
        btnguardarcliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 40));

        btnUpdatecliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnUpdatecliente.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatecliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnUpdatecliente.setText("ACTUALIZAR");
        btnUpdatecliente.setBorder(null);
        btnUpdatecliente.setBorderPainted(false);
        btnUpdatecliente.setContentAreaFilled(false);
        btnUpdatecliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdatecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdatecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 150, 40));

        btnDelecliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnDelecliente.setForeground(new java.awt.Color(255, 255, 255));
        btnDelecliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btnDelecliente.setText("ELIMINAR");
        btnDelecliente.setBorder(null);
        btnDelecliente.setBorderPainted(false);
        btnDelecliente.setContentAreaFilled(false);
        btnDelecliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 130, 40));

        btnlimpiarcampocliente.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnlimpiarcampocliente.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiarcampocliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_new_32px.png"))); // NOI18N
        btnlimpiarcampocliente.setText("NUEVO");
        btnlimpiarcampocliente.setBorder(null);
        btnlimpiarcampocliente.setBorderPainted(false);
        btnlimpiarcampocliente.setContentAreaFilled(false);
        btnlimpiarcampocliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlimpiarcampocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcampoclienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiarcampocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 120, 40));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablacategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablacategoria);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 150));

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 470, 220));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnguardarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarclienteActionPerformed
        Object[] registro = {txtcodgio.getText(), txtcategoria.getText()};
        objCat = new Categoria(registro);
        cola.encolar(objCat);
        try {
            p.insertar(objCat);
            JOptionPane.showMessageDialog(null, "Guardao exito");
            listar();
            limpiar();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnguardarclienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        objCat = cola.buscar(txtcodgio.getText());
        if (objCat != null) {
            txtcategoria.setText(objCat.getT_categoria());
        } else {
            JOptionPane.showMessageDialog(null, "La categoria buscada no existe");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnUpdateclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateclienteActionPerformed
        Object[] registro = {txtcodgio.getText(), txtcategoria.getText()};
        objCat = new Categoria(registro);
        if (cola.actualizar(objCat)) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            listar();
            limpiar();
            try {
                p.actualizar(cola.listado());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "La categoria a actualizar no existe");
        }
    }//GEN-LAST:event_btnUpdateclienteActionPerformed

    private void btnDeleclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleclienteActionPerformed
        if (!cola.empty()) {
            cola.desencolar();
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            listar();
            limpiar();
            try {
                p.actualizar(cola.listado());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay elementos en la Tabla");
        }
    }//GEN-LAST:event_btnDeleclienteActionPerformed

    private void btnlimpiarcampoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcampoclienteActionPerformed
        limpiar();
    }//GEN-LAST:event_btnlimpiarcampoclienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tablacategoria.getSelectedRow() >= 0 ) {
            try {
                DefaultTableModel tm = (DefaultTableModel) tablacategoria.getModel();
                String cat = String.valueOf(tm.getValueAt(tablacategoria.getSelectedRow(), 1));
                

                FrmProductos.txtcategoria.setText(cat);
                
            } catch (Exception e) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debees seleccionar un cliente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnDelecliente;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JButton btnUpdatecliente;
    private javax.swing.JButton btnguardarcliente;
    private javax.swing.JButton btnlimpiarcampocliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablacategoria;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtcodgio;
    // End of variables declaration//GEN-END:variables

    private void listar() {
        modelo.setRowCount(0);
        for (Categoria c : cola.listado()) {
            modelo.addRow(c.getInformacion());
        }
    }

    private void cargar() {
        modelo.setRowCount(0);
        try {
            p.leer();
            for (Categoria c : p.lista) {
                modelo.addRow(c.getInformacion());
                cola.encolar(c);
            }
        } catch (Exception e) {
        }

    }

    private void limpiar() {
        txtcodgio.setText("");
        txtcategoria.setText("");
    }
}
