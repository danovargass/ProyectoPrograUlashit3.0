
package proyecto_final_progra;


//esta clase "libro" esta establecida basada en un constructor, setters, getters y un toString
//su funcion principal es crear un objeto q se pueda popular o llenar de diversas clases de 
//ser necesario.

public class Libro {
    
    int id, publicacion;
    String nombre, autor, editorial;    

    public Libro(int id, int publicacion, String nombre, String autor, String editorial) {
        this.id = id;
        this.publicacion = publicacion;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Detalle del libro:\n"
                + "-Id: " + id + "\n"
                + "-Publicacion: " + publicacion + "\n"
                + "-Nombre: " + nombre + "\n"
                + "-Autor: " + autor + "\n"
                + "-Editorial: " + editorial+"\n"
                + "";
    }
    
    
    
}
