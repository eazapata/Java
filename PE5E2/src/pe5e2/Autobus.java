
package pe5e2;
import java.util.*;

public class Autobus extends Vehiculo {
    private int plazas;
    private int paradas;

    

    public Autobus(int plazas, int paradas, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.plazas = plazas;
        this.paradas = paradas;
    }

    public Autobus(Autobus bus) {
        super((Vehiculo)bus);
        this.plazas = bus.plazas;
        this.paradas = bus.paradas;
    }

    public Autobus() {
        super();
    }
    
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }
    
    @Override
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Plazas: "+getPlazas());
        System.out.println("Paradas: "+getParadas());
    }
    @Override
    public void pedirAlta(){
        Scanner lector = new Scanner(System.in);
        super.pedirAlta();
        System.out.println("Plazas: ");
        setPlazas(Integer.parseInt(lector.nextLine()));
        System.out.println("Paradas: ");
        int paradas=Integer.parseInt(lector.nextLine());
        while((paradas<3)||(paradas>20)){
            System.out.println("Las paradas mínimas serán 3 y no pueden superar las 20");
            paradas=Integer.parseInt(lector.nextLine());
        }
        setParadas(paradas);
    }
    
}
