package p6e1;

import java.util.*;

public class Cubo implements InterfaceFigura {

    private double lado;

    public Cubo(double lado) {
        this.setLado(lado);

    }

    public Cubo() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea(String opcion) throws NumberFormatException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el lado del cubo: ");
        setLado(Double.parseDouble(lector.nextLine()));
        this.imprimirCaracteristicas(opcion);
    }

    @Override
    public void calcularVolumen(String opcion) {
        Scanner lector = new Scanner(System.in);
        try {

            System.out.println("Introduce el lado del cubo: ");
            setLado(Double.parseDouble(lector.nextLine()));
            this.imprimirCaracteristicas(opcion);

        } catch (NumberFormatException volumenException) {
            this.calcularVolumen(opcion);

        }
    }

    @Override
    public void imprimirCaracteristicas(String opcion) {

        if (opcion.equals("1")) {
            System.out.println("El area del cubo es: " + 6 * ((int) Math.pow(this.getLado(), 2)));

        } else if (opcion.equals("2")) {
            System.out.println("El volumen del cubo es: " + (int) Math.pow(getLado(), 3));

        } else {
            System.out.println("El area del cubo es: " + 6 * ((int) Math.pow(this.getLado(), 2)));
            System.out.println("El volumen del cubo es: " + (int) Math.pow(getLado(), 3));
            System.out.println("El lado del cubo es: " + getLado());

        }

    }

}
