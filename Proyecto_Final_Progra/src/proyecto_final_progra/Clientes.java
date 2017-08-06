package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Clientes {

    	static Usuario cliente [] = new Usuario [5];
    
    public void llenarUsuario(){
        
        cliente[0] = new Usuario(1234, 1997, "EjemploNombre1", "EjemploApellido1");
        cliente[1] = new Usuario(5678, 1998, "EjemploNombre2", "EjemploApellido2");
        cliente[2] = new Usuario(9012, 1999, "EjemploNombre3", "EjemploApellido3");
        cliente[3] = new Usuario(3456, 2000, "EjemploNombre4", "EjemploApellido4");
        cliente[4] = new Usuario(7890, 2001, "EjemploNombre5", "EjemploApellido5");
        
    }
    
    public void demo(){
        
        
        
    }
    
    
    public void imprimeUsuario(){
        
        for(int i=0; i<cliente.length;i++){
            JOptionPane.showMessageDialog(null, "La informacion del cliente es" + cliente[i]);
        }
}
}