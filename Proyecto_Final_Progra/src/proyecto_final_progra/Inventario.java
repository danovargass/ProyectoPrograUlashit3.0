package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Inventario {

    //int i;
    static Libro libros[] = new Libro[6];

    public void llenarLibro() {

        libros[1] = new Libro(1234, 1997, 857, "EjemploNombre1", "EjemploAutor1", "EjemploEditorial1");
        libros[2] = new Libro(5678, 1998, 900, "EjemploNombre2", "EjemploAutor2", "EjemploEditorial2");
        libros[3] = new Libro(9012, 1999, 500, "EjemploNombre3", "EjemploAutor3", "EjemploEditorial3");
        libros[4] = new Libro(3456, 2000, 400, "EjemploNombre4", "EjemploAutor4", "EjemploEditorial4");
        libros[5] = new Libro(7890, 2001, 750, "EjemploNombre5", "EjemploAutor5", "EjemploEditorial5");

    }

    public void demo() {

    }

    public void imprimeLibro() {

        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }

    }
    
    	public void buscarLibro(Libro libros[] ,int id){
    		int count = 0;
    		for(int i=0; i<libros.length;i++){
    			System.out.println("Su contador es" + count);
                    if ( libros[i].equals(id)){
    			 JOptionPane.showMessageDialog(null, "Su libro es: " + libros);
                    } else{
    			 JOptionPane.showMessageDialog(null, "No se encontre el libro");
                    }
    		
    		}
        }

    public void buscarLibro() {
 
        for (int i = 0; i < libros.length; i++) {
        
            int busqueda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del libro"));
            if (libros[i].id == (busqueda)) {
                System.out.println("Su nada es");
                JOptionPane.showMessageDialog(null, "Su libro es: " + libros[i]);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro el libro");
            }

        }
    }

}
