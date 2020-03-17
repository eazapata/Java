package p6e2;

import java.util.*;

public abstract class Apuesta {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private int numApuesta;
    private static int ultimoNum=1;

    public Apuesta(String nombre, String apellido1, String apellido2, int numApuesta) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.numApuesta = ultimoNum++;
    }

    public Apuesta() {
        this.numApuesta = ultimoNum++;
    }

    public Apuesta(Apuesta a1) {
        this.nombre = a1.nombre;
        this.apellido1 = a1.apellido1;
        this.apellido2 = a1.apellido2;
        this.numApuesta = a1.numApuesta;
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

    public int getNumApuesta() {
        return numApuesta;
    }

    public void setNumApuesta(int numApuesta) {
        this.numApuesta = numApuesta;
    }

    public static int getUltimoNum() {
        return ultimoNum;
    }

    public static void setUltimoNum(int ultimoNum) {
        Apuesta.ultimoNum = ultimoNum;
    }

    public void mostrarApuesta() {
        System.out.println("Número apuesta: " + this.getNumApuesta());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Primer apellido: " + this.getApellido1());
        System.out.println("Segundo apellido: " + this.getApellido2());

    }

    public void crearApuesta() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        this.setNombre(sc.nextLine());
        System.out.println("Primer apellido:");
        this.setApellido1(sc.nextLine());
        System.out.println("Segundo apellido: ");
        this.setApellido2(sc.nextLine());
    }

}
