package gestionarpersonas;

import java.util.Scanner;
import java.util.Set;

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String nif;

    public Persona(String nombre, String apellido1, String apellido2, int edad, String nif) {
        this.setNombre (nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.setEdad (edad);
        this.setNif(nif);
    }

    public Persona() {
    }

    public Persona(Persona p1) {
        this.nombre = p1.nombre;
        this.apellido1 = p1.apellido1;
        this.apellido2 = p1.apellido2;
        this.edad = p1.edad;
        this.nif = p1.nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
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

    public void setApellido2(String pellido2) {
        this.apellido2 = pellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
    public void solicitarDatos(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Escribe el nombre: ");
        this.setNombre(lector.nextLine());
        System.out.println("Escribe el primer apellido: ");
        this.setApellido1(lector.nextLine());
        System.out.println("Escribe el segundo apellido: ");
        this.setApellido2(lector.nextLine());
        System.out.println("Escribe la edad: ");
        this.setEdad(Integer.parseInt(lector.nextLine()));
        System.out.println("Escribe el nif: ");
        this.setNif(lector.nextLine());
    }
    public void mostrarAtributos(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Primer apellido: "+this.getApellido1());
        System.out.println("Segundo apellido: "+this.getApellido2());
        System.out.println("Edad "+this.getEdad());
        System.out.println("NIF "+this.getNif());
    }

}
