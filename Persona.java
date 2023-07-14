/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;
import java.util.Date;

public class Persona {
    String nombre;
    String paterno;
    String materno;
    Date nacimiento;
    String numDocumento;

    public Persona(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacimiento = nacimiento;
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    
    
    
}

