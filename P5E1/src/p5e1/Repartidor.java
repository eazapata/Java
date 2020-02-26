
package p5e1;

import java.util.Scanner;


public class Repartidor extends Empleado {
    private int horasTrabajadas;
    private String zona;

    public Repartidor() {
    }
    
    
    
    public Repartidor(int horasTrabajadas, String zona, String nombre, String apellido1, String apellido2, String nif, int edad, double salario) {
        super(nombre, apellido1, apellido2, nif, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.zona = zona;
    }
    public Repartidor(Repartidor r1){
        super((Empleado)r1);
        this.horasTrabajadas = r1.horasTrabajadas;
        this.zona = r1.zona;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Horas trabajadas: "+this.getHorasTrabajadas());
        System.out.println("Zona: "+this.getZona());
    }
    @Override
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        
        super.pedirAlta();
        System.out.println("Horas trabajadas:");
        this.setHorasTrabajadas(Integer.parseInt(lector.nextLine()));
        System.out.println("Zona: ");
        this.setZona(lector.nextLine());
    }
    
}
