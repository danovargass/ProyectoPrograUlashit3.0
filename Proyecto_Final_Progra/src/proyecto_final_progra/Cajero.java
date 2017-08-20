
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
    
}
