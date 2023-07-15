
package pkgfinal;


public class Producto {
    
    float precio;
    String nombre;
    int stock;
    String marca;

    public Producto(float precio, String nombre, int stock, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
            
    public boolean vender(int cantidad){
        if(cantidad <= stock){
            stock -= cantidad;
            return true;
        }
        return false;
    }
    
    public boolean reponer(int cantidad){
        stock += cantidad;
        return true;
    }
}
