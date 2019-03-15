
public class Revolver {
	private int posicion;
	private int bala;

	public boolean disparar() {
		if (posicion == bala) {
			return true;
		} else {
			return false;
		}
	}

	public void siguienteBala() {
		if (bala == 6) {
			bala = 1;
		} else {
			bala = bala + 1;
		}
	}
	
	public void toString() {
		System.out.println("Posicion del tambor: " + posicion);
		System.out.println("Posicion de la bala: " + bala);
		
	}
}