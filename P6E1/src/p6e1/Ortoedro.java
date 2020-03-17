package p6e1;

import java.util.*;

public class Ortoedro implements InterfaceFigura {

    public Ortoedro(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public Ortoedro() {
    }

    private double largo, ancho, altura;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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
        System.out.println("Introduce el ancho: ");
        setAncho(Double.parseDouble(lector.nextLine()));
        System.out.println("Introduce el largo; ");
        setLargo(Double.parseDouble(lector.nextLine()));
        System.out.println("Introduce el alto:");
        setAltura(Double.parseDouble(lector.nextLine()));
        this.imprimirCaracteristicas(opcion);
    }

    @Override
    public void calcularVolumen(String opcion) {
        Scanner lector = new Scanner(System.in);
        try {

            System.out.println("Introduce el ancho: ");
            setAncho(Double.parseDouble(lector.nextLine()));
            System.out.println("Introduce el largo; ");
            setLargo(Double.parseDouble(lector.nextLine()));
            System.out.println("Introduce el alto:");
            setAltura(Double.parseDouble(lector.nextLine()));
            this.imprimirCaracteristicas(opcion);

        } catch (NumberFormatException volumenException) {
            this.calcularVolumen(opcion);

        }

    }

    @Override
    public void imprimirCaracteristicas(String opcion) {

        if (opcion.equals("1")) {
            System.out.println("El área del ortoedro es " + 2 * (this.getLargo() * this.getAncho() + this.getLargo() * this.getAltura() + this.getAncho() * this.getAltura()));

        } else if (opcion.equals("2")) {
            System.out.println("El volumen del ortoedro es: " + this.getLargo() * this.getAncho() * this.getAltura());

        } else {
            System.out.println("El largo es " + this.getLargo() + " ,el ancho es " + this.getAncho() + " y la altura es " + this.getAltura());
            System.out.println("El área del ortoedro es " + 2 * (this.getLargo() * this.getAncho() + this.getLargo() * this.getAltura() + this.getAncho() * this.getAltura()));
            System.out.println("El volumen del ortoedro es: " + this.getLargo() * this.getAncho() * this.getAltura());

        }

    }

}
