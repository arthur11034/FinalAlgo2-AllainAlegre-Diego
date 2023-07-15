
package pkgfinal;


public class Tienda {
    
    String nombre;
    String ruc;
    String direccion;
    Cliente [] clientes;
    Categoria [] categorias;
    Producto [] productos;
    int cantidadClientes;
    int cantidadCategorias;
    int cantidadProductos;

    public Tienda(String nombre, String ruc, String direccion, int maxClientes, int maxCategorias, int maxProductos) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new Cliente[maxClientes];
        this.categorias = new Categoria[maxCategorias];
        this.productos = new Producto[maxProductos];
        this.cantidadClientes = 0;
        this.cantidadCategorias = 0;
        this.cantidadProductos = 0;
    }
    
    public void agregarCliente(Cliente cliente) {
        if (cantidadClientes < clientes.length) {
            clientes[cantidadClientes] = cliente;
            cantidadClientes++;
        } else {
            System.out.println("No se puede agregar más clientes.");
        }
    }
    
    public void agregarCategoria(Categoria categoria) {
        if (cantidadCategorias < categorias.length) {
            categorias[cantidadCategorias] = categoria;
            cantidadCategorias++;
        } else {
            System.out.println("No se puede agregar más categorías.");
        }
    }
    public void agregarProducto(Producto producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
        } else {
            System.out.println("No se puede agregar más productos.");
        }
    }
    
    public Producto buscarProductosPorCategoria(Categoria categoria) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getCategoria().equals(categoria)) {
                return productos[i];
            }
        }
        return null;
    }
    
    public Producto buscarProductosPorNombre(String nombre) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                return productos[i];
            }
        }
        return null; // No se encontró ningún producto con el nombre especificado
    }
    
    public Persona autenticar(String email, String password) {
        for (int i = 0; i < cantidadClientes; i++) {
            if (clientes[i].getEmail().equals(email) && clientes[i].getPassword().equals(password)) {
                return clientes[i];
            }
        }
        return null; // No se encontró ningún cliente con el email y password especificados
    }
}
