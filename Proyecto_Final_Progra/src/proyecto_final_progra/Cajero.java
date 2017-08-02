
package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Cajero {
    
    private String nombre;
    private int id;

    public Cajero(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /////////////
    
    //este metodo podria no estar y solo dejarse con los constructores y gets y sets
//    
//    ////////////
//    public void login(){ //Funcion de Log-in, tiene un for para poder repetir el ingreso en caso erroneo de contrasena
//    	try {
//            for (int i = 0; i == 0; i++) {
//                
//                //System.out.println("Ingreso");
//                //nombre = JOptionPane.showInputDialog("Ingrese su nombre");
//                //id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su id"));
//                if (id == 1155 && nombre.contains("Juan")) {
//                    JOptionPane.showMessageDialog(null, "Su ingreso ha sido correcto");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Ingreso erroneo");
//                    i = i - 1;
//                }
//            }
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Out of bounds");
//        }catch (NumberFormatException e) {
//            System.out.println("Por favor intente de nuevo");
//        }
//    }
    
    
    	
    
    public void logout(){
        
        
        
    }
    
}
