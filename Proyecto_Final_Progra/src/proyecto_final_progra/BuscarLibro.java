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
public class BuscarLibro extends javax.swing.JFrame {

    /**
     * Creates new form BuscarLibro
     */
    public BuscarLibro() {
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
        BusquedaIDBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        InventarioDisplayField = new javax.swing.JTextArea();
        BusquedaPublicacionBtn = new javax.swing.JToggleButton();
        Cerrar = new javax.swing.JToggleButton();
        BusquedaLibroBtn1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Silom", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Buscar libro");

        BusquedaIDBtn.setText("Busqueda por Id");
        BusquedaIDBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaIDBtnMouseClicked(evt);
            }
        });

        InventarioDisplayField.setColumns(20);
        InventarioDisplayField.setRows(5);
        jScrollPane1.setViewportView(InventarioDisplayField);

        BusquedaPublicacionBtn.setText("Busqueda por año de publicacion");
        BusquedaPublicacionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaPublicacionBtnMouseClicked(evt);
            }
        });

        Cerrar.setText("Cerrar");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        BusquedaLibroBtn1.setText("Busqueda por nombre de Libro");
        BusquedaLibroBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaLibroBtn1MouseClicked(evt);
            }
        });
        BusquedaLibroBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaLibroBtn1ActionPerformed(evt);
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
                            .addComponent(BusquedaIDBtn)
                            .addComponent(BusquedaPublicacionBtn)
                            .addComponent(BusquedaLibroBtn1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE))
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
                        .addComponent(BusquedaIDBtn)
                        .addGap(37, 37, 37)
                        .addComponent(BusquedaPublicacionBtn)
                        .addGap(26, 26, 26)
                        .addComponent(BusquedaLibroBtn1)
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
    static Inventario biblioteca = new Inventario();
    Clientes baseClientes = new Clientes();
    int i, e, cont;
    static IngresoLibro bibliotecaRecientes = new IngresoLibro();
    boolean error, confirmacion;

    private void BusquedaIDBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaIDBtnMouseClicked
        // TODO add your handling code here:
        confirmacion = true;
        try {
            biblioteca.llenarLibro();

            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del libro"));

            for (i = 0; i < biblioteca.libros.length; i++) {
                if (biblioteca.libros[i].id == (busqueda)) {
                    Libro despliega = biblioteca.libros[i];
                    InventarioDisplayField.setText("" + biblioteca.libros[i]);
                    confirmacion = true;
                    break;
                } else {
                    confirmacion = false;
                }
//            }
//            if (confirmacion == false) {
//                for (i = 0; i < bibliotecaRecientes.ingresaLibros.length; i++) {
//                    if (bibliotecaRecientes.ingresaLibros[i].id == (busqueda)) {
//                        Libro despliega = bibliotecaRecientes.ingresaLibros[i];
//                        InventarioDisplayField.setText("" + bibliotecaRecientes.ingresaLibros[i]);
//                        confirmacion = true;
//                        cont = cont + 1;
//                        break;
//                    } else {
//
//                        confirmacion = false;
//                    }
//                }
                if (i == cont) {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro");
                }
            }

        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }

    }//GEN-LAST:event_BusquedaIDBtnMouseClicked

    private void BusquedaPublicacionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaPublicacionBtnMouseClicked
        // TODO add your handling code here:
        confirmacion = true;
        try {
            biblioteca.llenarLibro();

            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la publicacion del libro"));

            for (i = 0; i < biblioteca.libros.length; i++) {
                if (biblioteca.libros[i].publicacion == (busqueda)) {
                    Libro despliega = biblioteca.libros[i];
                    InventarioDisplayField.setText("" + biblioteca.libros[i]);
                    confirmacion = true;
                    break;
                } else {
                    confirmacion = false;
                }

//            if (confirmacion == false) {
//                for (i = 0; i < bibliotecaRecientes.ingresaLibros.length; i++) {
//                    if (bibliotecaRecientes.ingresaLibros[i].publicacion == (busqueda)) {
//                        Libro despliega = bibliotecaRecientes.ingresaLibros[i];
//                        InventarioDisplayField.setText("" + bibliotecaRecientes.ingresaLibros[i]);
//                        confirmacion = true;
//                        cont = cont + 1;
//                        break;
//                    } else {
//
//                        confirmacion = false;
//                    }
                if (i == cont) {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro");
                }
            }

        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }


    }//GEN-LAST:event_BusquedaPublicacionBtnMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_CerrarMouseClicked

    private void BusquedaLibroBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaLibroBtn1MouseClicked
        confirmacion = true;
        try {
            biblioteca.llenarLibro();

            String busqueda = JOptionPane.showInputDialog("Ingrese el nombre del libro");

            for (i = 0; i < biblioteca.libros.length; i++) {
                if (biblioteca.libros[i] != null) {
                    if (biblioteca.libros[i].nombre.equals(busqueda)) {
                        Libro despliega = biblioteca.libros[i];
                        InventarioDisplayField.setText("" + biblioteca.libros[i]);
                        confirmacion = true;
                        break;
                    } else {
                        confirmacion = false;
                    }
                }

//            if (!confirmacion) {
//                for (i = 0; i < bibliotecaRecientes.ingresaLibros.length; i++) {
//                    if (bibliotecaRecientes.ingresaLibros[i].nombre.equals(busqueda)) {
//                        Libro despliega = bibliotecaRecientes.ingresaLibros[i];
//                        InventarioDisplayField.setText("" + bibliotecaRecientes.ingresaLibros[i]);
//                        confirmacion = true;
//                        cont = cont + 1;
//                        break;
//                    } else {
//
//                        confirmacion = false;
//                    }
//                }
                if (i == cont) {
                    JOptionPane.showMessageDialog(null, "No se encontro el libro");
                }
            }

        } catch (NullPointerException e) {
        } catch (java.lang.NumberFormatException e) {

        }
    }//GEN-LAST:event_BusquedaLibroBtn1MouseClicked

    private void BusquedaLibroBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaLibroBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaLibroBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BusquedaIDBtn;
    private javax.swing.JToggleButton BusquedaLibroBtn1;
    private javax.swing.JToggleButton BusquedaPublicacionBtn;
    private javax.swing.JToggleButton Cerrar;
    private javax.swing.JTextArea InventarioDisplayField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
