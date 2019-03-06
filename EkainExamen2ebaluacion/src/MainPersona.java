import java.util.ArrayList;
import java.util.Scanner;

public class MainPersona {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Persona> personas = new ArrayList<Persona>();

	public static void main(String[] args) {

		int opcion = 0;
		while (opcion != 6) {
			System.out.println();
			System.out.println("Elige una opcion:");
			System.out.println("1. Crear nueva persona");
			System.out.println("2. Mostrar personas");
			System.out.println("3. Cantidad de personas");
			System.out.println("4. Listar personas por ciudad");
			System.out.println("5. Mayores de edad");
			System.out.println("6. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1: // crear persona
				leerPersonas();
				break;
			case 2:// mostrar persona
				mostrar();
				break;
			case 3:// cantidad de personas
				System.out.println("Cantidad de personas: " + numeroDePersonas());
				break;
			case 4:// Personas por ciudad
				System.out.println("Habitantes de que ciudad desea contar?");
				String ciudad = teclado.nextLine();
				System.out.println("Personas que viven en " + ciudad + " : " + cuantasPersonasVivenEn(ciudad));
				break;
			case 5: // mayores de edad
				System.out.println("Personas mayores de edad: " + personasMayoresDeEdad());
				break;
			case 6:
				break;

			}
		}
	}

	private static int personasMayoresDeEdad() {
		int cantidad = 0;
		for (int i = 0; i <= personas.size() - 1; i++) {
			if (personas.get(i).esMayorDeEdad()) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	private static int cuantasPersonasVivenEn(String ciudad) {
		int cantidad = 0;
		for (int i = 0; i <= personas.size() - 1; i++) {
			if (personas.get(i).getCiudad() == ciudad) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad;
	}

	private static int numeroDePersonas() {
		return personas.size();

	}

	private static void mostrar() {
		for (int i = 0; i <= personas.size() - 1; i++) {
			System.out.print(personas.get(i).getNombre() + " " + personas.get(i).getDireccion() + " "
					+ personas.get(i).getCodigoPostal() + " " + personas.get(i).getCiudad() + " "
					+ personas.get(i).getEdad());
			System.out.println();
		}
	}

	private static void leerPersonas() {
		System.out.println("Cuantas personas desea crear?");
		int cantidad = teclado.nextInt();

		for (int i = 1; i <= cantidad; i++) {
			teclado.nextLine();
			System.out.println();
			System.out.println("Creando persona: " + i + "/" + cantidad);
			System.out.println("Nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Direccion: ");
			String direccion = teclado.nextLine();
			System.out.println("Codigo postal: ");
			int codigoPostal = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Ciudad: ");
			String ciudad = teclado.nextLine();
			System.out.println("Edad: ");
			int edad = teclado.nextInt();
			teclado.nextLine();

			personas.add(new Persona(nombre, direccion, codigoPostal, ciudad, edad));
		}
	}

}
