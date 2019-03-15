import java.util.Scanner;

public class Password {
	private int longitud;
	private String contrase�a;

	public boolean esFuerte() {
		int CantMayusculas = 0, CantMinusculas = 0, CantNumeros = 0;
		boolean tipoCaracteres = true, resul = true;

		// MAYUSCULAS
		for (int i = 0; i < contrase�a.length(); i++) {
			if (contrase�a.charAt(i) >= 65 && contrase�a.charAt(i) <= 90) {
				CantMayusculas = CantMayusculas + 1;
			} else if (contrase�a.charAt(i) >= 97 && contrase�a.charAt(i) <= 122) {
				CantMinusculas = CantMinusculas + 1;
			} else if (contrase�a.charAt(i) >= 48 && contrase�a.charAt(i) <= 57) {
				CantNumeros = CantNumeros + 1;
			} else {
				tipoCaracteres = false;
				break;
			}
		}
		if (tipoCaracteres) {
			if (CantMayusculas > 2 && CantMinusculas > 1 && CantNumeros > 5) {
				resul = true;
			} else {
				resul = false;
			}
		} else {
			resul = false;
		}
		return resul;
	}

	public String generarPassword() {
		Scanner teclado;
		teclado = new Scanner(System.in);

		System.out.println("Inserte una contrase�a [+2 Mayusculas, +1 minusculas, +5 numeros y +11 caracteres]: ");
		String contrase�a = teclado.next();
		while (contrase�a.length() < 11) {
			System.out.println("Contrase�a debil!");
			System.out.println("Inserte una contrase�a [+2 Mayusculas, +1 minusculas, +5 numeros y +11 caracteres]: ");
			contrase�a = teclado.nextLine();
		}
		//teclado.close();

		return contrase�a;
	}

	public int longitudPassword(String pass) {
		return pass.length();
	}


	//GET-SET
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}


}
