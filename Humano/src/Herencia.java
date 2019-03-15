public class Herencia {
	public static void main(String args[]) {
		Humano a = new Humano("Rosa", "Perez");
		Ciudadano b = new Ciudadano("Rosa", "Perez", "12547585Q");
		Humano[] arregloDeHumanos = new Humano[2];
		arregloDeHumanos[0] = a;
		arregloDeHumanos[1] = b;
		identificarPolimorfico(arregloDeHumanos);
	}

	public static void identificarPolimorfico(Humano[] arregloDeHumanos) {
		for (int i = 0; i < arregloDeHumanos.length; i++) {
			System.out.println("Identificando (arreglo " + i + "): " + arregloDeHumanos[i].identificacion());
		}
	}
}