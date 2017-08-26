package proyecto_final_progra;

import javax.swing.JOptionPane;
import static proyecto_final_progra.BuscarLibro.biblioteca;

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
        jScrollPane3 = new javax.swing.JScrollPane();
        ClienteDisplay = new javax.swing.JTextArea();
        BuscarClienteBtn = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FacturaDisplay = new javax.swing.JTextArea();

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

        AlquilerBtn.setText("Alquilar");
        AlquilerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlquilerBtnMouseClicked(evt);
            }
        });

        RetornoBtn.setText("Retorno");
        RetornoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetornoBtnMouseClicked(evt);
            }
        });
        RetornoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetornoBtnActionPerformed(evt);
            }
        });

        ClientesBtn.setText("Buscar Clientes");
        ClientesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesBtnMouseClicked(evt);
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

        ClienteDisplay.setColumns(20);
        ClienteDisplay.setRows(5);
        jScrollPane3.setViewportView(ClienteDisplay);

        BuscarClienteBtn.setText("Agregar Cliente");
        BuscarClienteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarClienteBtnMouseClicked(evt);
            }
        });

        FacturaDisplay.setColumns(20);
        FacturaDisplay.setRows(5);
        jScrollPane2.setViewportView(FacturaDisplay);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(InventarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgregaInvBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(ClientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarClienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(AlquilerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FacturaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RetornoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RetornoBtn)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregaInvBtn)
                    .addComponent(InventarioBtn)
                    .addComponent(ClientesBtn)
                    .addComponent(BuscarClienteBtn)
                    .addComponent(AlquilerBtn)
                    .addComponent(FacturaBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    BuscarCliente Esencial = new BuscarCliente();
    
    //los botones que no esten comentados individualmente basicamente se encargan de llamar otras ventanas
    //donde se ejecutan las tareas de cada ventana.
    
    private void BuscarClienteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarClienteBtnMouseClicked
        // TODO add your handling code here:

        IngresarCliente ejecuta = new IngresarCliente();
        ejecuta.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BuscarClienteBtnMouseClicked

    private void AgregaInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregaInvBtnActionPerformed
        // TODO add your handling code here:
        IngresoLibro ejecuta = new IngresoLibro();
        ejecuta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregaInvBtnActionPerformed

    private void FacturaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacturaBtnMouseClicked

        //Este metodo hace la suma y la impresion de los datos pertinentes para la factura de cada alquiler
        try {
            if (alquiler != 0) {
                FacturaDisplay.setText("" + biblioteca.libros[i] + "Su monto a pagar seria: " + (biblioteca.libros[i].precio * alquiler) + " colones\n"
                        + baseClientes.cliente[e]);
            }

        } catch (java.lang.NullPointerException e) {

        }
    }//GEN-LAST:event_FacturaBtnMouseClicked

    private void ClientesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesBtnMouseClicked

        try {
            BuscarCliente ejecuta1 = new BuscarCliente();
            ejecuta1.setVisible(true);
            this.dispose();
        } catch (java.lang.NumberFormatException e) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesBtnMouseClicked

    private void AlquilerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlquilerBtnMouseClicked
        try {
            if (Esencial.confirmacion == true) {
                alquiler = Integer.parseInt(JOptionPane.showInputDialog("Cuantos dias se va a llevar el libro?"));
            } else if (Esencial.confirmacion == false) {
                JOptionPane.showMessageDialog(null, "Primero esocoja el libro y el cliente");
            }
        } catch (java.lang.NumberFormatException e) {
        }
            //este metodo se encarga de regristrar cuantos dias se van a cobrar a la hora de imprimir la factura
            //de cada alquiler.
    }//GEN-LAST:event_AlquilerBtnMouseClicked

    private void InventarioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBtnMouseClicked
        // TODO add your handling code here

        BuscarLibro ejecuta = new BuscarLibro();
        ejecuta.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_InventarioBtnMouseClicked

    private void RetornoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetornoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RetornoBtnActionPerformed

    private void RetornoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RetornoBtnMouseClicked
        //este metodo se hace cargo de registrar la devolucion de un libro

        int diasAlquilados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos dias han transcurrido desde la fecha de prestamo"));
        if (diasAlquilados > alquiler) {
            JOptionPane.showMessageDialog(null, "Tiene una mora de: " + diasAlquilados * 1000);
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por devolver el libro a tiempo.");
        }

    }//GEN-LAST:event_RetornoBtnMouseClicked
    int alquiler, costoDiario;
    Inventario biblioteca = new Inventario();
    Clientes baseClientes = new Clientes();
    int i, e;

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
    private javax.swing.JToggleButton BuscarClienteBtn;
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
