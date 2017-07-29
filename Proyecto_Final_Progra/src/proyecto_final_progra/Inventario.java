package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Inventario {

    //int i;
    Libro libros[] = new Libro[5];

    public void llenarLibro() {

        libros[0] = new Libro(1234, 1997, "EjemploNombre1", "EjemploAutor1", "EjemploEditorial1");
        libros[1] = new Libro(5678, 1998, "EjemploNombre2", "EjemploAutor2", "EjemploEditorial2");
        libros[2] = new Libro(9012, 1999, "EjemploNombre3", "EjemploAutor3", "EjemploEditorial3");
        libros[3] = new Libro(3456, 2000, "EjemploNombre4", "EjemploAutor4", "EjemploEditorial4");
        libros[4] = new Libro(7890, 2001, "EjemploNombre5", "EjemploAutor5", "EjemploEditorial5");

    }

    public void demo() {

    }

    public void imprimeLibro() {

        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
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
