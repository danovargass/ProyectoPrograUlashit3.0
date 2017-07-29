
package proyecto_final_progra;

import javax.swing.JOptionPane;

/*
 *
 * @author danovargas
 * @author hanaelbonilla
 * 
 */
public class Proyecto_Final_Progra {
    public static void main(String[] args) {
        
        Inventario ejecuta = new Inventario();
        /*ejecuta.llenarLibro();
        ejecuta.imprimeLibro();
        Clientes prueba = new Clientes();
        prueba.llenarUsuario();
        prueba.imprimeUsuario();*/
        //Cajero cajero1 = new Cajero();
        //cajero1.login();
        ejecuta.llenarLibro();
        ejecuta.buscarLibro();
    }
    
}
