
package gestionarpersonas2;
import java.util.*;


public class Persona2 {
    
    private String nombre,apellidos;
    private int edad;
    InfoNif nif = new InfoNif();

    public Persona2(String nombre, String apellidos,int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona2() {
    }
    
    public Persona2(Persona2 p1) {
        this.nombre = p1.nombre;
        this.apellidos = p1.apellidos;
        this.edad = p1.edad;
    }  

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

   
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void solicitarDatos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Introduce tu apellido: ");
        this.setApellidos(lector.nextLine());
        System.out.println("Introduce tu edad: ");
        this.setEdad(Integer.parseInt(lector.nextLine()));
        nif.solicitarNif();
       
        
    }
    public void mostrarDatos(){
        System.out.println("Tu nombre es: "+this.getNombre());
        System.out.println("Tu apellido es: "+this.getApellidos());
        System.out.println("Tu edad es: "+this.getEdad());
        nif.mostrarNif();
        
    }
}
