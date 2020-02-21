
package p5e1;
import java.util.*;


public class Empleado {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarAtributos() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer apellido: "+this.getApellido1());
        System.out.println("Segundo apellido: "+this.getApellido2());
        System.out.println("Nif: "+this.getNif());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Salario: "+this.getSalario());
    }
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre=lector.nextLine();
        char[] mayus = nombre.toCharArray();
        
        while(!Character.isUpperCase(mayus[0])){
            System.out.println("La primera letra debe ser en mayúsculuas");
            nombre=lector.nextLine();
            mayus = nombre.toCharArray();
        }
        setNombre(nombre);
        System.out.println("Apellido 1: ");
        String apellidoPri=lector.nextLine();
        mayus = apellidoPri.toCharArray();
        while(!Character.isUpperCase(mayus[0])){
            System.out.println("La primera letra debe ser en mayúsculuas");
            apellidoPri=lector.nextLine();
            mayus = apellidoPri.toCharArray();
        }
        setApellido1(apellidoPri);
        
        System.out.println("Apellido 2: ");
        String apellidoSeg=lector.nextLine();
        mayus = apellidoSeg.toCharArray();
        while(!Character.isUpperCase(mayus[0])){
            System.out.println("La primera letra debe ser en mayúsculuas");
            apellidoSeg=lector.nextLine();
            mayus = apellidoSeg.toCharArray();
        }
        
        setApellido2(apellidoSeg);
        System.out.println("Nif: ");
        setNif(lector.nextLine());
        System.out.println("Edad: ");
        int años =Integer.parseInt(lector.nextLine());
        
        while(años<16){
            System.out.println("La edad no puede ser inferior a 16 años.");
            años=Integer.parseInt(lector.nextLine());
        }
        setEdad(años);
        
        System.out.println("Salario: ");
        setSalario(Double.parseDouble(lector.nextLine()));
        
        
    }

}
