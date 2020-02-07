package poo;

import java.util.*;

public class Empleado {

    private String nombre;
    private double sueldo;
    private Date alta;
    private int dia, mes, año;

    public Empleado(String nombre, double sueldo, int dia, int mes, int año) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(año, (mes - 1), dia);
        this.alta = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void subirSueldo(double porcentaje){
        double aumento= sueldo*porcentaje/100;
        sueldo+=aumento;
    }
    public static Empleado pedirDatos(){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Indica tu nombre:");
        String nombre=lector.nextLine();
        System.out.println("Indica el sueldo");
        Double sueldo=Double.parseDouble(lector.nextLine());
        System.out.println("Indica el dia de alta:");
        int dia=Integer.parseInt(lector.nextLine());
        System.out.println("Indica el mes de alta:");
        int mes=Integer.parseInt(lector.nextLine());
        System.out.println("Indica el año de alta");
        int año=Integer.parseInt(lector.nextLine());
        
        return new Empleado(nombre,sueldo,dia,mes,año);
        
    }

}
