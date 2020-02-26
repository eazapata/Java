package pe5e2;

import java.util.*;

public class Taxi extends Vehiculo {

    private final int licencia;
    private boolean estado;
    private int num_taxista;
    private static int numLicencias = 100;

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
        String libre = lector.nextLine().toLowerCase();
        if (libre.equals("si")) {
            setEstado(true);
        } else {
            setEstado(false);
        }
        System.out.println("Taxistas trabajando con la misma licencia: ");
        setNum_taxista(Integer.parseInt(lector.nextLine()));

    }

    public static void buscarTaxiLibre(ArrayList<Vehiculo> vehiculos) {
        int i = 0;
        boolean encontrado = false;
        while ((i < vehiculos.size()) && (!encontrado)) {
            if ((vehiculos.get(i) instanceof Taxi) && (((Taxi) vehiculos.get(i)).isEstado())) {
                encontrado = true;
                System.out.println("Id: " + vehiculos.get(i).getId());
                ((Taxi) vehiculos.get(i)).setEstado(false);
                System.out.println("Estado:" + ((Taxi) vehiculos.get(i)).isEstado());
            } else {
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("No hay taxis disponibles");
        }
    }

    public static void buscarTaxi(ArrayList<Vehiculo> vehiculos,int idTaxi) {
        int i= 0;
        boolean encontrado = false;
        while ((i<vehiculos.size())&&(!encontrado)){
            if(idTaxi==vehiculos.get(i).getId()){
                encontrado=true;
                ((Taxi)vehiculos.get(i)).setEstado(true);
                System.out.println("El taxi con id "+vehiculos.get(i).getId()+" está libre");
            }else{
                i++;
            }
        }
        if(!encontrado)System.out.println("Taxi no encontrado.");
    }

}
