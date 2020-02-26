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
        this.maxHoras = vt1.maxHoras;
        this.radioAccion = vt1.radioAccion;
        this.ciudad = vt1.ciudad;
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
        int horas=Integer.parseInt(lector.nextLine());
        while(horas>24){
            System.out.println("Las horas no pueden superar las 24");
            horas=Integer.parseInt(lector.nextLine());
        }
        setMaxHoras(horas);
        System.out.println("Radio acción");
        double radio=Double.parseDouble(lector.nextLine());
        while(radio>50){
            System.out.println("El radio no puede superar los 50km");
            radio=Double.parseDouble(lector.nextLine());
        }
        setRadioAccion(radio);
        System.out.println("Ciudad: ");
        setCiudad(lector.nextLine());
    }
    

}
