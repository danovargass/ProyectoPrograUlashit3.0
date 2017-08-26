
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Silom", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 43, 709, -1));

        BusquedaCedulaBtn.setText("Busqueda por Cedula");
        BusquedaCedulaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaCedulaBtnMouseClicked(evt);
            }
        });
        jPanel1.add(BusquedaCedulaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, 169, -1));

        InventarioDisplayField.setColumns(20);
        InventarioDisplayField.setRows(5);
        jScrollPane1.setViewportView(InventarioDisplayField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 156, 234, 306));

        BusquedaNombreBtn.setText("Busqueda por Nombre");
        BusquedaNombreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaNombreBtnMouseClicked(evt);
            }
        });
        jPanel1.add(BusquedaNombreBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 106, -1, -1));

        Cerrar.setText("Cerrar");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 265, 122, 60));

        BusquedaApellidoBtn1.setText("Busqueda por Apellido");
        BusquedaApellidoBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaApellidoBtn1MouseClicked(evt);
            }
        });
        jPanel1.add(BusquedaApellidoBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 106, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bla2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

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
            //este metodo se encarga de buscar dentro de las listas de clientes creadas, los clientes que igualen
            //los datos ingresados. Este en particular busca por Cedula.
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
            //este metodo al igual que el de arriba, se encarga de buscar dentro de las listas de clientes.
            //este busca por nombre de cliente.
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
            //este metodo busca por apellido. todas estas funciones estan dentro de una ventana de jFrame
            //que habilita estas funcionalidades.
    }//GEN-LAST:event_BusquedaApellidoBtn1MouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
