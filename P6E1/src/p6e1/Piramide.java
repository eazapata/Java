package p6e1;

import java.util.*;

public class Piramide implements InterfaceFigura {

    private double lado, apotema, altura;

    public Piramide(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
        this.altura = altura;
    }

    public Piramide() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea(String opcion) throws NumberFormatException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el valor del lado de la base: ");
        this.setLado(Double.parseDouble(lector.nextLine()));
        System.out.println("Indica el valor del apotema: ");
        this.setApotema(Double.parseDouble(lector.nextLine()));
        this.imprimirCaracteristicas(opcion);

    }

    @Override
    public void calcularVolumen(String opcion) {
        Scanner lector = new Scanner(System.in);
        try {

            System.out.println("Indica el valor del lado de la base: ");
            this.setLado(Double.parseDouble(lector.nextLine()));
            System.out.println("Introduce la altura: ");
            this.setAltura(Double.parseDouble(lector.nextLine()));

        } catch (NumberFormatException volumenException) {
            this.calcularVolumen(opcion);

        }

    }

    @Override
    public void imprimirCaracteristicas(String opcion) {
        if (opcion.equals("1")) {
            System.out.println("El area de la pirámide es: " + this.getLado() * (2 * this.getApotema() + this.getLado()));

        } else if (opcion.equals("2")) {
            System.out.println("El volumen es: " + (((int) Math.pow(getLado(), 2)) * this.getAltura()));

        } else {
            System.out.println("El area de la pirámide es: " + this.getLado() * (2 * this.getApotema() + this.getLado()));
            System.out.println("El volumen es: " + (((int) Math.pow(getLado(), 2)) * this.getAltura()));
            System.out.println("El lado de la base es " + this.getLado() + " la altura es " + this.getAltura() + " y el valor del apotema es " + this.getApotema());
        }

    }
}
