package pe5e2;

import java.util.*;

public class Vehiculo {

    private final int id;
    private String matricula;
    private String modelo;
    private int potencia;
    private static int numVehiculos=1;

    
    public Vehiculo(int id, String matricula, String modelo, int potencia) {
        this.id = numVehiculos++;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;

    }

    public Vehiculo(Vehiculo v1) {
        this.id = numVehiculos++;
        this.matricula = v1.matricula;
        this.modelo = v1.modelo;
        this.potencia = v1.potencia;
    }

    public Vehiculo() {
        this.id=numVehiculos++;
    }

    public int getId() {
        return id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public static int getNumVehiculos() {
        return numVehiculos;
    }

    public static void setNumVehiculos(int numVehiculos) {
        Vehiculo.numVehiculos = numVehiculos;
    }
    
    public void mostrarAtributos() {
        System.out.println("Id " + getId());
        System.out.println("Mátricula " + getMatricula());
        System.out.println("Modelo " + getModelo());
        System.out.println("Potencia " + getPotencia());
    }

    public void pedirAlta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Mátricula: ");
        String matriculaAlta = lector.nextLine();
        while (!matriculaAlta.equals(matriculaAlta.toUpperCase())) {
            System.out.println("La mátricula tiene que ser en mayúsculas.");
            matriculaAlta = lector.nextLine();
        }
        setMatricula(matriculaAlta);
        System.out.println("Modelo: ");
        setModelo(lector.nextLine());
        System.out.println("Potencia");
        int potenciaVehiculo = Integer.parseInt(lector.nextLine());
        while (potenciaVehiculo <= 0) {
            System.out.println("La potencia debe ser mayor a 0.");
            potenciaVehiculo = Integer.parseInt(lector.nextLine());
        }
        setPotencia(potenciaVehiculo);
    }
}
