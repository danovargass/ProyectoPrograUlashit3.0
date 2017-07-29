
package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Cajero {
    
    private String nombre;
    private int id;
    
    public void login(){ //Funcion de Log-in, tiene un for para poder repetir el ingreso en caso erroneo de contrasena
    	for (int i=0; i==1 ;i++){
    		nombre =JOptionPane.showInputDialog("Ingrese su nombre");
        	id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
            if (id == 1155 && nombre.contains("Juan")){
            		JOptionPane.showMessageDialog(null, "Su ingreso ha sido correcto");
            	} else{
            		JOptionPane.showMessageDialog(null, "Ingreso erroneo");
            		i = i-1;
            	}
            }
    	}
    	
    
    public void logout(){
        
        
        
    }
    
}
