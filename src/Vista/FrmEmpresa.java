package Vista;

import Control.ListaC;
import Control.ProcesoC;
import Modelo.DatosEmpresa;
import javax.swing.JOptionPane;

public class FrmEmpresa extends javax.swing.JFrame {

    ListaC listacircular = new ListaC();
    ProcesoC procesocircular = new ProcesoC();
    DatosEmpresa objEmp;

    /**
     * Creates new form Empresa
     */
    public FrmEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        carga();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtruc = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cborazon = new javax.swing.JComboBox<>();
        btnconsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de la empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CORREO");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RUC");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOMBRE");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DIRECCION");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TELEFONO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtcorreo.setBackground(new java.awt.Color(0, 0, 0));
        txtcorreo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtcorreo.setOpaque(false);
        jPanel4.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 370, 30));

        txtruc.setBackground(new java.awt.Color(0, 0, 0));
        txtruc.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtruc.setForeground(new java.awt.Color(255, 255, 255));
        txtruc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtruc.setOpaque(false);
        jPanel4.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 370, 30));

        txtnombre.setBackground(new java.awt.Color(0, 0, 0));
        txtnombre.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtnombre.setForeground(new java.awt.Color(255, 255, 255));
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtnombre.setOpaque(false);
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 370, 30));

        txtdireccion.setBackground(new java.awt.Color(0, 0, 0));
        txtdireccion.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txtdireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txtdireccion.setOpaque(false);
        jPanel4.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 370, 30));

        txttelefono.setBackground(new java.awt.Color(0, 0, 0));
        txttelefono.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        txttelefono.setForeground(new java.awt.Color(255, 255, 255));
        txttelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        txttelefono.setOpaque(false);
        jPanel4.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 370, 30));

        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_delete_file_32px_1.png"))); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.setBorder(null);
        btneliminar.setBorderPainted(false);
        btneliminar.setContentAreaFilled(false);
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 110, -1));

        btnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnMinimizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizar1MouseClicked(evt);
            }
        });
        jPanel4.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 50));

        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_32px.png"))); // NOI18N
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar1MouseClicked(evt);
            }
        });
        jPanel4.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, 50));

        btnguardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_save_24px.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.setBorder(null);
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel4.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 110, 30));

        btnactualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_update_left_rotation_32px.png"))); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.setBorder(null);
        btnactualizar.setBorderPainted(false);
        btnactualizar.setContentAreaFilled(false);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel4.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RAZON");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        cborazon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Publica", "Privada" }));
        cborazon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        cborazon.setOpaque(false);
        jPanel4.add(cborazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 370, 30));

        btnconsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_24px.png"))); // NOI18N
        btnconsulta.setText("BUSCAR");
        btnconsulta.setBorder(null);
        btnconsulta.setBorderPainted(false);
        btnconsulta.setContentAreaFilled(false);
        btnconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultaActionPerformed(evt);
            }
        });
        jPanel4.add(btnconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 570, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MouseClicked
        this.setState(FrmLogin.ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1MouseClicked

    private void btnCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar1MouseClicked
        dispose();
    }//GEN-LAST:event_btnCerrar1MouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        Object[] fila = {txtruc.getText(), txtnombre.getText(), txtdireccion.getText(), txttelefono.getText(), txtcorreo.getText(),
            cborazon.getSelectedItem().toString()};
        objEmp = new DatosEmpresa(fila);
        listacircular.insertar(objEmp);
        try {
            procesocircular.insertar(objEmp);
            limpiarcampos();
            JOptionPane.showMessageDialog(null, "Datos registrados con exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar registrar");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        Object[] fila = {txtruc.getText(), txtnombre.getText(), txtdireccion.getText(), txttelefono.getText(), txtcorreo.getText(),
            cborazon.getSelectedItem().toString()};
        objEmp = new DatosEmpresa(fila);
        if (listacircular.actualiar(objEmp)) {
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            limpiarcampos();
            try {
                procesocircular.actualizar(listacircular.listar());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "El ruc" + txtruc.getText() + "de la empresa a actualizar no existe");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (listacircular.eliminar(txtruc.getText())) {
            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            limpiarcampos();
            try {
                procesocircular.actualizar(listacircular.listar());
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "El RUC ingresado del cliente a eliminar no existe");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnconsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultaActionPerformed
        objEmp = listacircular.buscar(txtruc.getText());
        if (objEmp != null) {
            txtnombre.setText(objEmp.getNombre());
            txtdireccion.setText(objEmp.getDireccion());
            txttelefono.setText(String.valueOf(objEmp.getTelefono()));
            txtcorreo.setText(objEmp.getCorreo());
            switch (objEmp.getRazon()) {
                case "Publica":
                    cborazon.setSelectedIndex(1);
                    break;
                case "Privada":
                    cborazon.setSelectedIndex(2);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El ruc ingresado " + txtruc.getText() + "no existe");
        }
    }//GEN-LAST:event_btnconsultaActionPerformed

    public void limpiarcampos() {
        txtruc.setText("");
        txtnombre.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        cborazon.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(FrmEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel btnMinimizar1;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsulta;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cborazon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtruc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
public void carga() {
        try {
            procesocircular.leer();
            for (DatosEmpresa d : procesocircular.lista) {
                txtruc.setText(d.getRuc());
                txtnombre.setText(d.getNombre());
                txtdireccion.setText(d.getDireccion());
                txttelefono.setText(String.valueOf(d.getTelefono()));
                txtcorreo.setText(d.getCorreo());
                cborazon.setSelectedItem(d.getRazon());
                listacircular.insertar(d);
            }
        } catch (Exception e) {
        }
    }
}
