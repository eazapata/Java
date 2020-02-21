package pe5e2;

import java.util.*;

public class Vtc extends Vehiculo {

    private int maxHoras;
    private double radioAccion;
    private String ciudad;

    public Vtc(int maxHoras, double radioAccion, String ciudad, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.maxHoras = maxHoras;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }

    public Vtc(Vtc vt1) {
        super((Vehiculo) vt1);
        this.maxHoras = maxHoras;
        this.radioAccion = radioAccion;
        this.ciudad = ciudad;
    }

    public Vtc() {
        super();
    }

    public int getMaxHoras() {
        return maxHoras;
    }

    public void setMaxHoras(int maxHoras) {
        this.maxHoras = maxHoras;
    }

    public double getRadioAccion() {
        return radioAccion;
    }

    public void setRadioAccion(double radioAccion) {
        this.radioAccion = radioAccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Máximo de horas: " + getMaxHoras());
        System.out.println("Radio de acción: " + getRadioAccion());
        System.out.println("Ciudad: " + getCiudad());
        System.out.println("");
    }

    @Override
    public void pedirAlta() {
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Máximo de horas: ");
        setMaxHoras(Integer.parseInt(lector.nextLine()));
        System.out.println("Radio acción");
        setRadioAccion(Double.parseDouble(lector.nextLine()));
        System.out.println("Ciudad: ");
        setCiudad(lector.nextLine());
    }

}
