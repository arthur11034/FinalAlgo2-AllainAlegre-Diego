
package pkgfinal;


public class Trabajador extends Persona {
    
    String password;
    String email;

    public Trabajador(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean ingresar(String email, String password){
        return this.email.equals(email)&& this.password.equals(password);
    }
    
    public boolean salir(){
        return true;
    }
    
    public boolean crearVenta(Cliente cliente){
        return true;
    }
    
}
