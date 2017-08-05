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
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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
        InventarioBtn = new javax.swing.JToggleButton();
        AlquilerBtn = new javax.swing.JToggleButton();
        RetornoBtn = new javax.swing.JToggleButton();
        ClientesBtn = new javax.swing.JToggleButton();
        FacturaBtn = new javax.swing.JToggleButton();
        AgregaInvBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventarioDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacturaDisplay = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ClienteDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Silom", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Principal");

        InventarioBtn.setText("Buscar Inventario");
        InventarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InventarioBtnMouseClicked(evt);
            }
        });
        InventarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioBtnActionPerformed(evt);
            }
        });

        AlquilerBtn.setText("Alquilar");
        AlquilerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlquilerBtnMouseClicked(evt);
            }
        });
        AlquilerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlquilerBtnActionPerformed(evt);
            }
        });

        RetornoBtn.setText("Retorno");

        ClientesBtn.setText("Clientes");
        ClientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesBtnMouseClicked(evt);
            }
        });
        ClientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesBtnActionPerformed(evt);
            }
        });

        FacturaBtn.setText("Factura");
        FacturaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FacturaBtnMouseClicked(evt);
            }
        });

        AgregaInvBtn.setText("Agregar a Inventario");
        AgregaInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregaInvBtnActionPerformed(evt);
            }
        });

        InventarioDisplay.setColumns(20);
        InventarioDisplay.setRows(5);
        jScrollPane1.setViewportView(InventarioDisplay);

        FacturaDisplay.setColumns(20);
        FacturaDisplay.setRows(5);
        jScrollPane2.setViewportView(FacturaDisplay);

        ClienteDisplay.setColumns(20);
        ClienteDisplay.setRows(5);
        jScrollPane3.setViewportView(ClienteDisplay);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(InventarioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgregaInvBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlquilerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RetornoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FacturaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InventarioBtn)
                    .addComponent(AlquilerBtn)
                    .addComponent(ClientesBtn)
                    .addComponent(RetornoBtn)
                    .addComponent(FacturaBtn)
                    .addComponent(AgregaInvBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 273, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlquilerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlquilerBtnActionPerformed
        // TODO add your handling code here:

        ////////
        //este es el menu que se estaria desplegando ahorita, digame que sugerencias tiene.
        ///////

    }//GEN-LAST:event_AlquilerBtnActionPerformed
    int alquiler, costoDiario, costoFinal;
    Inventario biblioteca = new Inventario();
    Clientes baseClientes = new Clientes();
    int i, e;
    private void InventarioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBtnMouseClicked
        // TODO add your handling code here
        

        BuscarLibro ejecuta = new BuscarLibro();
        ejecuta.setVisible(true);

//        try {
//            biblioteca.llenarLibro();
//
//            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del libro"));
//
//            for (i = 0; i < biblioteca.libros.length; i++) {
//                if (biblioteca.libros[i].id == (busqueda)) {
//                    System.out.println("entro");
//                    //JOptionPane.showMessageDialog(null, "Su libro es: " + libros[i]);
//                    Libro despliega = biblioteca.libros[i];
//                    InventarioDisplay.setText("" + biblioteca.libros[i]);
//                    break;
//                } else {
//
//                }
//
//            }
//            System.out.println("no se encontro");
//        } catch (NullPointerException e) {
//            System.out.println("Se cae no se por que....");
//        }
        try {
            biblioteca.llenarLibro();

            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del libro"));

            for (i = 0; i < biblioteca.libros.length; i++) {
                if (biblioteca.libros[i].id == (busqueda)) {
                    Libro despliega = biblioteca.libros[i];
                    InventarioDisplay.setText("" + biblioteca.libros[i]);

                    break;
                } else {
                }
            }
            if (i == 5) {
                JOptionPane.showMessageDialog(null, "No se encontro el libro");
            }
        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }

    }//GEN-LAST:event_InventarioBtnMouseClicked

    private void FacturaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturaBtnMouseClicked
        // TODO add your handling code here:

        FacturaDisplay.setText("" + biblioteca.libros[i] + "Su monto a pagar seria: " + costoFinal + "colones\n"
                + baseClientes.cliente[e]);
        try {
            System.out.println("i = " + i + "e = " + e);
            if (alquiler != 0) {
                FacturaDisplay.setText("" + biblioteca.libros[i] + "Su monto a pagar seria: " + (biblioteca.libros[i].precio * alquiler) + "colones\n"
                        + baseClientes.cliente[e]);
            }

        } catch (java.lang.NullPointerException e) {

        }

    }//GEN-LAST:event_FacturaBtnMouseClicked

    private void AlquilerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlquilerBtnMouseClicked
        try {
            alquiler = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias se va a llevar el libro?"));
        } catch (java.lang.NumberFormatException e) {

        }

// TODO add your handling code here:
    }//GEN-LAST:event_AlquilerBtnMouseClicked

    private void ClientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesBtnActionPerformed

    private void ClientesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesBtnMouseClicked

        try {
            baseClientes.llenarUsuario();

            int busquedaCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente"));

            for (e = 0; e < baseClientes.cliente.length; e++) {
                if (baseClientes.cliente[e].cedula == (busquedaCliente)) {
                    //JOptionPane.showMessageDialog(null, "Su libro es: " + libros[i]);

                    ClienteDisplay.setText("" + baseClientes.cliente[e]);
                    break;
                } else {

                }
                System.out.println("no se encontro");

            }

            if (e == 5) {
                JOptionPane.showMessageDialog(null, "No se encontro el cliente");
            }catch (NullPointerException e) {
                        
                }catch (java.lang.NumberFormatException e) {

                }

            // TODO add your handling code here:
    }//GEN-LAST:event_ClientesBtnMouseClicked

    private void AgregaInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregaInvBtnActionPerformed
        // TODO add your handling code here:  
        IngresoLibro ejecuta = new IngresoLibro();
        ejecuta.setVisible(true);

    }//GEN-LAST:event_AgregaInvBtnActionPerformed


    private void InventarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InventarioBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AgregaInvBtn;
    private javax.swing.JToggleButton AlquilerBtn;
    private javax.swing.JTextArea ClienteDisplay;
    private javax.swing.JToggleButton ClientesBtn;
    private javax.swing.JToggleButton FacturaBtn;
    private javax.swing.JTextArea FacturaDisplay;
    private javax.swing.JToggleButton InventarioBtn;
    private javax.swing.JTextArea InventarioDisplay;
    private javax.swing.JToggleButton RetornoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
