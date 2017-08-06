/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_progra;

import javax.swing.JOptionPane;

/**
 *
 * @author danovargas
 */
public class BuscarCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarLibro
     */
    public BuscarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BusquedaCedulaBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventarioDisplayField = new javax.swing.JTextArea();
        BusquedaNombreBtn = new javax.swing.JToggleButton();
        Cerrar = new javax.swing.JToggleButton();
        BusquedaApellidoBtn1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Silom", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Cliente");

        BusquedaCedulaBtn.setText("Busqueda por Cedula");
        BusquedaCedulaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaCedulaBtnMouseClicked(evt);
            }
        });
        BusquedaCedulaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaCedulaBtnActionPerformed(evt);
            }
        });

        InventarioDisplayField.setColumns(20);
        InventarioDisplayField.setRows(5);
        jScrollPane1.setViewportView(InventarioDisplayField);

        BusquedaNombreBtn.setText("Busqueda por Nombre");
        BusquedaNombreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaNombreBtnMouseClicked(evt);
            }
        });
        BusquedaNombreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaNombreBtnActionPerformed(evt);
            }
        });

        Cerrar.setText("Cerrar");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        BusquedaApellidoBtn1.setText("Busqueda por Apellido");
        BusquedaApellidoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaApellidoBtn1MouseClicked(evt);
            }
        });
        BusquedaApellidoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaApellidoBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BusquedaCedulaBtn)
                            .addComponent(BusquedaNombreBtn)
                            .addComponent(BusquedaApellidoBtn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cerrar)
                        .addGap(58, 58, 58)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BusquedaCedulaBtn)
                        .addGap(37, 37, 37)
                        .addComponent(BusquedaNombreBtn)
                        .addGap(26, 26, 26)
                        .addComponent(BusquedaApellidoBtn1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Cerrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGap(63, 63, 63))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int alquiler, costoDiario, costoFinal;
    //static Inventario biblioteca = new Inventario();
    static Clientes baseClientes = new Clientes();
    int i, e, cont;
    static IngresarCliente ClientesRecientes = new IngresarCliente();
    static boolean confirmacion;
    private void BusquedaCedulaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaCedulaBtnMouseClicked
        // TODO add your handling code here:
        
      try {
            baseClientes.llenarUsuario();

            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));

            for (i = 0; i < baseClientes.cliente.length; i++) {
                if (baseClientes.cliente[i] != null) {
                    if (baseClientes.cliente[i].cedula == (busqueda)) {
                        InventarioDisplayField.setText("" + baseClientes.cliente[i]);
                        confirmacion = true;
                        break;
                    } else {
                    }
                } else {
                }
            }
        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }
        if (i == 15) {
            confirmacion = false;
            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
        }

    }//GEN-LAST:event_BusquedaCedulaBtnMouseClicked

    private void BusquedaNombreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaNombreBtnMouseClicked
        // TODO add your handling code here:
        try {
            baseClientes.llenarUsuario();

            String busqueda = JOptionPane.showInputDialog("Ingrese el nombre del cliente");

            for (i = 0; i < baseClientes.cliente.length; i++) {
                if (baseClientes.cliente[i] != null) {
                    if (baseClientes.cliente[i].nombre.equals(busqueda)) {
                        InventarioDisplayField.setText("" + baseClientes.cliente[i]);
                        confirmacion = true;
                        break;
                    } else {
                    }
                } else {
                }
            }
        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }
        if (i == 15) {
            confirmacion = false;
            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
        }


    }//GEN-LAST:event_BusquedaNombreBtnMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:
        MainMenu ejecuta = new MainMenu();
        ejecuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void BusquedaApellidoBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaApellidoBtn1MouseClicked
        try {
            baseClientes.llenarUsuario();

            String busqueda = JOptionPane.showInputDialog("Ingrese el apellido del cliente");

            for (i = 0; i < baseClientes.cliente.length; i++) {
                if (baseClientes.cliente[i] != null) {
                    if (baseClientes.cliente[i].apellido.equals(busqueda)) {
                        InventarioDisplayField.setText("" + baseClientes.cliente[i]);
                        confirmacion = true;
                        break;
                    } else {
                    }
                } else {
                }
            }
        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }
        if (i == 15) {
            confirmacion = false;
            JOptionPane.showMessageDialog(null, "No se encontro el cliente");
        }

    }//GEN-LAST:event_BusquedaApellidoBtn1MouseClicked

    private void BusquedaApellidoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaApellidoBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaApellidoBtn1ActionPerformed

    private void BusquedaCedulaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaCedulaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaCedulaBtnActionPerformed

    private void BusquedaNombreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaNombreBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaNombreBtnActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BusquedaApellidoBtn1;
    private javax.swing.JToggleButton BusquedaCedulaBtn;
    private javax.swing.JToggleButton BusquedaNombreBtn;
    private javax.swing.JToggleButton Cerrar;
    private javax.swing.JTextArea InventarioDisplayField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
