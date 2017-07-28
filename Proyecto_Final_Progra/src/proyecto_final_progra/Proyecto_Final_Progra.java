
package proyecto_final_progra;

/*
 *
 * @author danovargas
 * @author hanaelbonilla
 * 
 */
public class Proyecto_Final_Progra {
//Daniel se la come toda sin manos
    public static void main(String[] args) {
        
        Inventario ejecuta = new Inventario();
        ejecuta.llenarLibro();
        ejecuta.imprimeLibro();
        Clientes prueba = new Clientes();
        prueba.llenarUsuario();
        prueba.imprimeUsuario();
        
    }
    
}
