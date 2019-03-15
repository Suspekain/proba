import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author UsuarioPC5
 */
public class ArrayListProductos {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        ArrayList<Producto> productos = new ArrayList<Producto>();
        do{
            // Mostrar menú
            System.out.println("Menú:");
            System.out.println(" 1. Añadir nuevo producto");
            System.out.println(" 2. Buscar producto");
            System.out.println(" 3. Eliminar producto");
            System.out.println(" 4. Ver lista de productos");
            System.out.println(" 5. Número de productos");
            System.out.println(" 6. Salir");
            System.out.println("Introduzca opción");
            // Leer opción
            opcion = scan.nextInt();
            scan.nextLine(); // Para que lea el salto el salto de línea
            // Según opción
            switch (opcion){
                case 1:
                    nuevoProducto(productos);
                    break;
                case 2:
                    buscarProducto(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    imprimeLista(productos);
                    break;
                case 5:
                    contarProductos(productos);
                    break;
                case 6: // Para evitar que entre a default
                    break;
                default:
                    System.out.println("Opción incorrecta. Elija otra");
            } // Fin switch
        }while(opcion != 6);
    } // Fin main
    
    // Método para añadir producto a la lista
    public static void nuevoProducto(ArrayList<Producto> productos){
        // Pedir datos y leerlos
        System.out.println("Introduzca nombre del producto");
        String nombre = scan.nextLine();
        System.out.println("Introduzca precio del producto");
        double precio = scan.nextDouble();
        scan.nextLine(); // Para que lea el salto el salto de línea
        // Crear objeto Producto
        Producto p = new Producto(nombre, precio);
        // Añadir el producto a la lista
        productos.add(p);
    }// Fin método nuevoProducto
    
    // Método para buscar un producto
    public static void buscarProducto(ArrayList<Producto> productos){
        // Pedir datos y leerlos
        System.out.println("Introduzca nombre del producto");
        String nombre = scan.nextLine();
        System.out.println("Introduzca precio del producto");
        double precio = scan.nextDouble();
        scan.nextLine(); // Para que lea el salto el salto de línea
        // Crear objeto Producto
        Producto p = new Producto(nombre, precio);
        // Buscar el producto
        int posicion = productos.indexOf(p);
        if (posicion >= 0)
            System.out.println("Está en la posición " + posicion);
        else
            System.out.println("No está en la lista de productos");
    }
    
    // Método para eliminar un producto
    public static void eliminarProducto(ArrayList<Producto> productos){
        // Pedimos que se introduzca la posición
        System.out.println("Introduzca posición del producto a eliminar");
        int posicion = scan.nextInt();
        // Antes de borrarlo lo extraemos para mostrarlo
        Producto p = productos.get(posicion);
        // Se muestra
        System.out.println("Se va a eliminar el producto " + p.toString());
        // Se elimina
        productos.remove(posicion);
    }
    
    // Método para imprimir Producto
    public static void imprimeLista(ArrayList<Producto> productos){
        System.out.println("PRODUCTOS: --> ");
        // Este for crea un Objeto de Producto llamado product que corresponde
        // a cada elemento de la lista según la iteración en la que esté
        for (Producto product: productos){
            // La llamada a toString puede omitirse, es implicita dentro de println
            System.out.println(" - " + product.toString());
        }
    }
    
    public static void contarProductos(ArrayList<Producto> productos){
        int numProductos = productos.size();
        System.out.println("La lista contiene " + numProductos + " productos");
    }
}