package proyecto_final_progra;

//esta clase "Usuario" esta establecida basada en un constructor, setters, getters y un toString
//su funcion principal es crear un objeto q se pueda popular o llenar de diversas clases de 
//ser necesario.

public class Usuario {
	 int cedula, numeroTelefono;
	 String nombre, apellido;
	
	public Usuario(int cedula, int numeroTelefono, String nombre, String apellido) {
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;
        this.nombre = nombre;
        this.apellido = apellido;
	}
	
	 public int getcedula() {
	        return cedula;
	    }

	    public void setcedula(int cedula) {
	        this.cedula = cedula;
	    }

	    public int getnumeroTelefono() {
	        return numeroTelefono;
	    }

	    public void setnumeroTelefono(int numeroTelefono) {
	        this.numeroTelefono = numeroTelefono;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getapellido() {
	        return apellido;
	    }

	    public void setAapellido(String apellido) {
	        this.apellido = apellido;
	    }


	    @Override
	    public String toString() {
	        return "Detalle del usuario:\n"
	                + "-cedula: " + cedula + "\n"
	                + "-numeroTelefono: " + numeroTelefono + "\n"
	                + "-Nombre: " + nombre + "\n"
	                + "-Apellido: " + apellido + "\n"
	                + "";
	    }
}
