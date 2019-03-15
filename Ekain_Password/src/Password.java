import java.util.Scanner;

public class Password {
	private int longitud;
	private String contraseña;

	public boolean esFuerte() {
		int CantMayusculas = 0, CantMinusculas = 0, CantNumeros = 0;
		boolean tipoCaracteres = true, resul = true;

		// MAYUSCULAS
		for (int i = 0; i < contraseña.length(); i++) {
			if (contraseña.charAt(i) >= 65 && contraseña.charAt(i) <= 90) {
				CantMayusculas = CantMayusculas + 1;
			} else if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				CantMinusculas = CantMinusculas + 1;
			} else if (contraseña.charAt(i) >= 48 && contraseña.charAt(i) <= 57) {
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

		System.out.println("Inserte una contraseña [+2 Mayusculas, +1 minusculas, +5 numeros y +11 caracteres]: ");
		String contraseña = teclado.next();
		while (contraseña.length() < 11) {
			System.out.println("Contraseña debil!");
			System.out.println("Inserte una contraseña [+2 Mayusculas, +1 minusculas, +5 numeros y +11 caracteres]: ");
			contraseña = teclado.nextLine();
		}
		//teclado.close();

		return contraseña;
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


}
