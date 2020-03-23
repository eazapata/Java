package pe6e2;

import java.util.*;

public abstract class Apuesta {

    private String nombre, apellido1, apellido2;
    private int numApuesta;
    private static int ultimoNumApuesta = 1;

    public Apuesta() {
        this.setNumApuesta(ultimoNumApuesta++);
    }

    public Apuesta(String nombre, String apellido1, String apellido2, int numApuesta) {
        this.setNombre(nombre);
        this.setApellido1(apellido1);
        this.setApellido2(apellido2);
        this.setNumApuesta(ultimoNumApuesta++);
    }

    public Apuesta(Apuesta a1) {
        this.setNombre(a1.nombre);
        this.setApellido1(a1.apellido1);
        this.setApellido2(a1.apellido2);
        this.setNumApuesta(a1.ultimoNumApuesta++);
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

    public int getUltimoNumApuesta() {
        return ultimoNumApuesta;
    }

    public void setUltimoNumApuesta(int ultimoNumApuesta) {
        this.ultimoNumApuesta = ultimoNumApuesta;
    }

    public void mostrarApuesta() {
        System.out.println("Apuesta número:" + this.getNumApuesta());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Primer apellido: " + this.getApellido1());
        System.out.println("Segundo apellido: " + this.getApellido2());
    }

    public void crearApuesta() throws Mayus {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombreUsuario = sc.nextLine();
        if (!nombreUsuario.equals(nombreUsuario.toUpperCase())) {
            throw new Mayus("1");
        }

        System.out.println("Introduce tu primer apellido:");
        String apellidoPri = sc.nextLine();
        if (!apellidoPri.equals(apellidoPri.toUpperCase())) {
            throw new Mayus("2");
        }
        System.out.println("Introduce tu segundo apellido: ");
        String apellidoSeg = sc.nextLine();
        if (!apellidoSeg.equals(apellidoSeg.toUpperCase())) {
            throw new Mayus("3");
        }
        
        this.setNombre(nombreUsuario);
        this.setApellido1(apellidoPri);
        this.setApellido2(apellidoSeg);
    }
}


