import java.util.ArrayList;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		ArrayList<Password> contraseñas = new ArrayList<Password>(5);

		String contraseña;
		int longitud;

		// GENERAR CONTRASEÑAS
		for (int i = 0; i <= 4; i++) {
			Password pdw = new Password();
			contraseña = pdw.generarPassword();
			longitud = pdw.longitudPassword(contraseña);

			pdw.setContraseña(contraseña);
			pdw.setLongitud(longitud);

			contraseñas.add(pdw);
		}

		for (int i = 0; i < contraseñas.size(); i++) {
			System.out.println(contraseñas.get(i).getContraseña() + " " + contraseñas.get(i).getLongitud() + " " + contraseñas.get(i).esFuerte());
		}

	}

}
