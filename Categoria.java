
package pkgfinal;


public class Categoria {
    
    String nombre;
    boolean disponible;

    public Categoria(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean habilitar(){
        if(!disponible){
            disponible = true;
            return true;
        }
        return false;
    }
    
    public boolean deshabilitar(){
        if(disponible){
            disponible=false;
            return true;
        }
        return false;
    }
}
