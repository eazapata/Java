package p6e1;

import java.util.*;

public class Esfera implements InterfaceFigura {

    private double radio;

    public Esfera(double radio) {
        this.setRadio(radio);
    }

    public Esfera() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea(String opcion) throws NumberFormatException {
        Scanner lector = new Scanner(System.in);

        System.out.println("Indique el radio de la esfera: ");
        setRadio(Double.parseDouble(lector.nextLine()));
        this.imprimirCaracteristicas(opcion);

    }

    @Override
    public void calcularVolumen(String opcion) {
        Scanner lector = new Scanner(System.in);

        try {

            System.out.println("Indique el radio de la esfera: ");
            setRadio(Double.parseDouble(lector.nextLine()));
            this.imprimirCaracteristicas(opcion);
        } catch (NumberFormatException volumen) {
            this.calcularVolumen(opcion);
        }
    }

    @Override
    public void imprimirCaracteristicas(String opcion) {

        if (opcion.equals("1")) {
            System.out.println("El area de la esfera es: " + 4 * Math.PI * ((int) Math.pow(this.getRadio(), 2)));

        } else if (opcion.equals("2")) {
            System.out.println("El volumen es: " + (4 / 3) * Math.PI * ((int) Math.pow(getRadio(), 3)));

        } else {
            System.out.println("El area de la esfera es: " + 4 * Math.PI * ((int) Math.pow(this.getRadio(), 2)));
            System.out.println("El volumen es: " + (4 / 3) * Math.PI * ((int) Math.pow(getRadio(), 3)));
            System.out.println("El radio de la esfera es: " + getRadio());

        }

    }

}
