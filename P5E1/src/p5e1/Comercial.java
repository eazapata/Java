
package p5e1;

import java.util.Scanner;


public final class Comercial extends Empleado{
    private int ventasRealizadas;
    private double comision;

    public Comercial() {
    }

    

    public Comercial(int ventasRealizadas, double comision, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.ventasRealizadas = ventasRealizadas;
        this.comision = comision;
        
    }
    public Comercial(Comercial c1) {
        super((Empleado)c1);
        this.ventasRealizadas = c1.ventasRealizadas;
        this.comision = c1.comision;
        
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Ventas realizadas:"+this.getVentasRealizadas());
        System.out.println("Comisión: "+this.getComision());
    }
    @Override
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Ventas realizadas: ");
        this.setVentasRealizadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Comision:");
        this.setComision(Double.parseDouble(lector.nextLine()));
    }
}
