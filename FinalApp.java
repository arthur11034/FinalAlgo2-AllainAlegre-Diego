
package pkgfinal;

import java.util.Date;

public class Final {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Mi Tienda", "123456789", "Dirección de la tienda");

        Cliente cliente1 = new Cliente("Juan", "juan@example.com", "password1");
        Cliente cliente2 = new Cliente("María", "maria@example.com", "password2");

        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        Categoria categoria1 = new Categoria("Electrónica", true);
        Categoria categoria2 = new Categoria("Ropa", true);

        tienda.agregarCategoria(categoria1);
        tienda.agregarCategoria(categoria2);

        Producto producto1 = new Producto(10.99f, "Televisor", 5, "Sony");
        Producto producto2 = new Producto(29.99f, "Camiseta", 10, "Nike");

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);

        Venta venta = new Venta();
        venta.setFecha(new Date());
        venta.agregarProducto(producto1);
        venta.agregarProducto(producto2);

        tienda.registrarVenta(venta);

        System.out.println("Total de la venta: $" + venta.getTotal());
        System.out.println("Fecha de la venta: " + venta.getFecha());

    }
}
