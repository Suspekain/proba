class Ciudadano extends Humano {
	protected String documento;

	public Ciudadano(String nombre, String apellido, String documento) {
		// hace referencia a la clase Humano
		super(nombre, apellido);
		this.documento = documento;
	}

	public String identificacion() {
		// super.identificacion hace referencia a la clase Humano
		return super.identificacion() + ", documento: " + this.documento;
	}
}