package proyecto_final_progra;

import javax.swing.JOptionPane;

public class Inventario {

    static Libro libros[] = new Libro[15];
    static int cont = 5;

    public void llenarLibro() {

        libros[0] = new Libro(1234, 1997, 857, "EjemploNombre1", "EjemploAutor1", "EjemploEditorial1");
        libros[1] = new Libro(5678, 1998, 900, "EjemploNombre2", "EjemploAutor2", "EjemploEditorial2");
        libros[2] = new Libro(9012, 1999, 500, "EjemploNombre3", "EjemploAutor3", "EjemploEditorial3");
        libros[3] = new Libro(3456, 2000, 400, "EjemploNombre4", "EjemploAutor4", "EjemploEditorial4");
        libros[4] = new Libro(7890, 2001, 750, "EjemploNombre5", "EjemploAutor5", "EjemploEditorial5");

    }


}
