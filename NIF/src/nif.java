import java.util.Scanner;

public class nif {

	private int dni;
	private char letra;

	public nif() {
	}

	public nif(int dni) {
		this.dni = dni;
		letra = calcularLetra();
	}

	private char calcularLetra() {
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		return letras[dni % 23];
	}

	public void leer() {
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduce tu DNI: ");
			dni = teclado.nextInt();
		} while (dni <= 0);
		letra = calcularLetra();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(dni);
		sb.append("-");
		sb.append(letra);
		return sb.toString();
	}

}