import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Producto> productos = new ArrayList<Producto>();
	static ArrayList<Integer> carro = new ArrayList<Integer>();

	public static void main(String[] args) {
		int opcion = 0, adminopcion = 0, clienteopcion = 0;
		while (opcion != 3) {
			System.out.println();
			System.out.println("Elige una opcion:");
			System.out.println("1. Administrar almacen");
			System.out.println("2. Comprar");
			System.out.println("3. Salir");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 1:
				while (adminopcion != 6) {
					System.out.println();
					System.out.println("Elige una opcion:");
					System.out.println("1. Crear nuevo cliente");
					System.out.println("2. Crear nuevo producto");
					System.out.println("3. Modificar producto");
					System.out.println("4. Eliminar producto");
					System.out.println("5. Ver productos");
					System.out.println("6. Salir");
					adminopcion = teclado.nextInt();
					teclado.nextLine();

					switch (adminopcion) {
					case 1: // crear cliente
						crearCliente();
						break;
					case 2:// crear producto
						crearProducto();
						break;
					case 3:// modificar producto
						modificarProducto();
						break;
					case 4:// eliminar producto
						eliminarProducto();
						break;
					case 5: // ver productos
						verProductos();
						break;
					case 6:
						break;

					}

				} // administrador
			case 2:
				while (clienteopcion != 5) {
					System.out.println();
					System.out.println("Elige una opcion:");
					System.out.println("1. Ver productos");
					System.out.println("2. Ver carro");
					System.out.println("3. Añadir producto al carro");
					System.out.println("4. Eliminar producto del carro");
					System.out.println("5. Comprar");
					System.out.println("6. Salir");
					clienteopcion = teclado.nextInt();
					teclado.nextLine();

					switch (clienteopcion) {
					case 1: // ver productos
						verProductos();
						break;
					case 2:// ver carro
						verCarro();
						break;
					case 3:// añadir producto al carro
						añadirCarro();
						break;
					case 4:// eliminar producto del carro
						eliminarCarro();
						break;
					case 5: // comprar
						comprar();
						break;
					case 6: //
						break;
					}

				}
			case 3:
				break;

			} // switch
		} // while
	}

	private static void comprar() {
		System.out.println("Tu compra ha sido realizada:");
		verCarro();
		double total = 0;
		for (int i = 0; i <= carro.size() - 1; i++) {
			for (int j = 0; j <= productos.size() - 1; j++ ) {
				if (carro.get(i) == productos.get(j).getCodigo()) {
					total = total + productos.get(j).getPrecio();
				}
			}
		}
		System.out.println("Precio total: " + total);
	}

	private static void eliminarCarro() {
		System.out.println("Que producto desea quitar del carro? (codigo) ");
		int codigo = teclado.nextInt();
		
		for (int i = 0; i <= carro.size(); i++) {
			if (carro.get(i) == codigo) {
				carro.remove(i);
			}
		}
	}

	public static void crearCliente() {
		int edad;
		String nombre, dni;

		System.out.println("DNI:");
		dni = teclado.nextLine();
		System.out.println("Nombre:");
		nombre = teclado.nextLine();
		System.out.println("Edad:");
		edad = teclado.nextInt();

		clientes.add(new Cliente(dni, nombre, edad));
	}

	public static void crearProducto() {
		int codigo;
		String nombre;
		double precio;

		System.out.println("Codigo:");
		codigo = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Nombre:");
		nombre = teclado.nextLine();
		System.out.println("Precio:");
		precio = teclado.nextDouble();

		productos.add(new Producto(codigo, nombre, precio));
	}

	public static void modificarProducto() {
		System.out.println("Codigo de producto a modificar:");
		int codigo = teclado.nextInt();
		System.out.println("Nuevo nombre:");
		String nombre = teclado.nextLine();
		System.out.println("Nuevo precio:");
		double precio = teclado.nextDouble();
		for (int i = 0; i <= productos.size() - 1; i++) {
			if (productos.get(i).getCodigo() == codigo) {
				productos.get(i).setNombre(nombre);
				productos.get(i).setPrecio(precio);
				break;
			}
		}
	}

	private static void eliminarProducto() {
		System.out.println("Codigo de producto a eliminar:");
		int codigo = teclado.nextInt();
		for (int i = 0; i <= productos.size() - 1; i++) {
			if (productos.get(i).getCodigo() == codigo) {
				productos.remove(i);
				break;
			}
		}
	}

	private static void verProductos() {
		for (int i = 0; i <= productos.size() - 1; i++) {
			System.out.print(productos.get(i).getCodigo() + " " + productos.get(i).getNombre() + " "
					+ productos.get(i).getPrecio());
			System.out.println();
		}
	}

	private static void verCarro() {
		for (int i = 0; i <= carro.size() - 1; i++) {
			for (int j = 0; j <= productos.size() - 1; j++ ) {
				if (carro.get(i) == productos.get(j).getCodigo()) {
					System.out.println(productos.get(j).getCodigo() + " "
							+ productos.get(j).getNombre() + " "
							+ productos.get(j).getPrecio());
				}
			}
		}
	}

	private static void añadirCarro() {
		System.out.println("Codigo de producto a añadir:");
		int codigo = teclado.nextInt();

		carro.add(codigo);
	}
}
