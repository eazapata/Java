
package pe5e2;


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
        this.plazas = plazas;
        this.paradas = paradas;
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
    
    
}
