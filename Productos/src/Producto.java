import java.util.Objects;

/**
 *
 * @author UsuarioPC5
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + ". Precio = " + precio;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) obj;
        // System.out.println(this.nombre + " -- " + other.nombre);
        if (!other.nombre.equals(this.nombre)) {
            return false;
        }
        if (other.precio != this.precio) {
            return false;
        }
        return true;
    }   
}