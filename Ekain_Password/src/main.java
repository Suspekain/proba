import java.util.ArrayList;
import java.util.function.Consumer;

public class main {

	public static void main(String[] args) {
		ArrayList<Password> contrase�as = new ArrayList<Password>(5);

		String contrase�a;
		int longitud;

		// GENERAR CONTRASE�AS
		for (int i = 0; i <= 4; i++) {
			Password pdw = new Password();
			contrase�a = pdw.generarPassword();
			longitud = pdw.longitudPassword(contrase�a);

			pdw.setContrase�a(contrase�a);
			pdw.setLongitud(longitud);

			contrase�as.add(pdw);
		}

		for (int i = 0; i < contrase�as.size(); i++) {
			System.out.println(contrase�as.get(i).getContrase�a() + " " + contrase�as.get(i).getLongitud() + " " + contrase�as.get(i).esFuerte());
		}

	}

}
