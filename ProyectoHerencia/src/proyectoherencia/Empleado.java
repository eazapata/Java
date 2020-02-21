
package proyectoherencia;


public class Empleado extends Persona{
    private double sueldo;
    private String nuss;
    
    
    public Empleado() {
    }

    public Empleado(double sueldo, String nuss) {
        this.sueldo = sueldo;
        this.nuss = nuss;
    }

    public Empleado(double sueldo, String nuss, String nombre, String apellido) {
        super(nombre, apellido);
        this.sueldo = sueldo;
        this.nuss = nuss;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNuss() {
        return nuss;
    }

    public void setNuss(String nuss) {
        this.nuss = nuss;
    }
    public void realizarPrueba(){
        
        
    }
    
}
