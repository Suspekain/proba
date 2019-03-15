import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Contacto> agenda = new ArrayList<Contacto>();
	Contacto c = new Contacto(" ", 0);

	public static void main(String[] args) {
		int menu;
		do {
			System.out.println("Menú:");
			System.out.println(" 1. Añadir nuevo contacto");
			System.out.println(" 2. Ver lista de contactos");
			System.out.println(" 3. Buscar contacto");
			System.out.println(" 4. Eliminar contacto");
			System.out.println(" 5. Salir");
			System.out.println("Introduzca opción");
			menu = teclado.nextInt();

			switch (menu) {
			case 1:
				añadirContacto(agenda);
				break;
			case 2:
				listarContactos(agenda);
				break;
			case 3:
				buscaContacto(agenda);
				break;
			case 4:
				eliminarContacto(agenda);
				break;
			case 5: // Para evitar que entre a default
				break;
			default:
				System.out.println("Opción incorrecta. Elija otra");
			}
		} while (menu != 5);

	}

	private static void añadirContacto(ArrayList<Contacto> agenda) {
		String limpiar = teclado.nextLine();
		System.out.println("Nombre de nuevo contacto: ");
		String nombre = teclado.nextLine();
		System.out.println("Numero de telefono de nuevo contacto: ");
		int telefono = teclado.nextInt();

		if (!existeContacto(nombre)) {
			Contacto c = new Contacto(nombre, telefono);
			agenda.add(c);
			System.out.println("El contacto se ha registrado en la agenda!");
		}

	}

	private static boolean existeContacto(String nombre) {
		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNombre().equals(nombre)) {
				System.out.println("El contacto ya existe!");
				return true;
			}
		}
		return false;

	}

	private static void listarContactos(ArrayList<Contacto> agenda) {
		System.out.println("El listado de la agenda: ");
		for (int i = 0; i < agenda.size(); i++) {
			System.out.println(agenda.get(i).getNombre() + " " + agenda.get(i).getTelefono());
		}
	}

	private static void buscaContacto(ArrayList<Contacto> agenda) {
		String limpiar = teclado.nextLine();
		System.out.println("Nombre del contacto que buscas: ");
		String nombre = teclado.nextLine();

		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNombre().equals(nombre)) {
				System.out.println("El numero del contacto " + nombre + " es: ");
				System.out.println(agenda.get(i).getTelefono());
			}
		}

	}

	private static void eliminarContacto(ArrayList<Contacto> agenda) {
		String limpiar = teclado.nextLine();
		System.out.println("Nombre del contacto que quieres eliminar: ");
		String nombre = teclado.nextLine();

		for (int i = 0; i < agenda.size(); i++) {
			if (agenda.get(i).getNombre().equals(nombre)) {
				agenda.remove(i);
				System.out.println("Contacto eliminado.");

			}
		}

	}
}
