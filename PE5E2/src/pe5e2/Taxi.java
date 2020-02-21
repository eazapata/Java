package pe5e2;

import java.util.*;

public class Taxi extends Vehiculo {

    private final int licencia;
    private boolean estado;
    private int num_taxista;
    private static int numLicencias=100;

    public Taxi(int licencia, boolean estado, int num_taxista, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.licencia = licencia;
        this.estado = estado;
        this.num_taxista = num_taxista;
    }

    public Taxi(Taxi t1) {
        super((Vehiculo) t1);
        this.licencia = t1.numLicencias++;
        this.estado = t1.estado;
        this.num_taxista = t1.num_taxista;
    }

    public Taxi() {
        super();
        this.licencia = numLicencias++;
    }

    
    public static int getNumLicencias() {
        return numLicencias;
    }

    public static void setNumLicencias(int numLicencias) {
        Taxi.numLicencias = numLicencias;
    }

    public int getLicencia() {
        return licencia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNum_taxista() {
        return num_taxista;
    }

    public void setNum_taxista(int num_taxista) {
        this.num_taxista = num_taxista;
    }

    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Licencia: " + getLicencia());
        System.out.println("Estado: " + isEstado());
        System.out.println("Taxistas con la misma licencia: " + getNum_taxista());
        System.out.println("");

    }

    @Override
    public void pedirAlta() {
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Disponible (si/no): ");
        String libre=lector.nextLine().toLowerCase();
        if(libre.equals("si")){
            setEstado(true);
        }else{
            setEstado(false);
        }
        System.out.println("Taxistas trabajando con la misma licencia: ");
        setNum_taxista(Integer.parseInt(lector.nextLine()));
        

    }

}
