
public class Humano {
	protected String nombre;
	protected String apellido;

	public Humano(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String nombreCompleto() {
		return this.apellido + ", " + this.nombre;
	}

	public String identificacion() {
		return this.nombreCompleto();
	}
}
