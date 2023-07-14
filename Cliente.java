
package pkgfinal;

import java.util.Date;


public class Cliente extends Persona {
    
    int celular;
    float dinero;

    public Cliente(int celular, float dinero, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }

    public int getCelular() {
        return celular;
    }

    public float getDinero() {
        return dinero;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    
    public boolean pagar(float monto){
        if (monto > dinero){
            return false;
        }
        dinero -= monto;
        return true;
    }
    
    public boolean recargarDinero(float monto){
        dinero += monto;
        return true;
    }
    
}
