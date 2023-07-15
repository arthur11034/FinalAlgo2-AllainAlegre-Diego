
package pkgfinal;
import java.util.Date;

public class Venta {
    float total;
    Date fecha;
    boolean estado;
    Producto [] carrito;
    int cantidadProductos;
    

    public Venta(){
        carrito = new Producto[10];
        cantidadProductos=0;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float tota) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void agregarProducto(Producto producto) {
        if (cantidadProductos < carrito.length) {
            carrito[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("El carrito está lleno.");
        }
    }
    
    public void eliminarProducto(Producto producto, int cantidad) {
        int cantidadEliminada = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            if (carrito[i].equals(producto)) {
                carrito[i] = null;
                cantidadEliminada++;
                if (cantidadEliminada == cantidad) {
                    break;
                }
            }
        }
        
        int index = 0;
        Producto[] nuevoCarrito = new Producto[carrito.length];
        for (int i = 0; i < cantidadProductos; i++) {
            if (carrito[i] != null) {
                nuevoCarrito[index] = carrito[i];
                index++;
            }
        }

        carrito = nuevoCarrito;
        cantidadProductos -= cantidadEliminada;
    }
    
   public float validarCarrito() {
        float total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += carrito[i].getPrecio();
        }
        this.total = total;
        return total;
    }
}
