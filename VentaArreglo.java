
package pkgfinal;


public class VentaArreglo {
    int indice;
    Venta [] ventas;
    
    public VentaArreglo(int tamaño){
        ventas= new Venta [tamaño];
        indice=0;
    }
    public boolean registrarVenta(Venta venta){
        if(indice<ventas.length){
            ventas[indice]=venta;
            indice++;
            return true;
        }
        return false;
    }
}
