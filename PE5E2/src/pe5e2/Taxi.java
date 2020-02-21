
package pe5e2;


public class Taxi extends Vehiculo{
    
    private int licencia;
    private boolean estado;
    private int num_taxista;

   

    public Taxi(int licencia, boolean estado, int num_taxista, int id, String matricula, String modelo, int potencia) {
        super(id, matricula, modelo, potencia);
        this.licencia = licencia;
        this.estado = estado;
        this.num_taxista = num_taxista;
    }
     public Taxi(Taxi t1) {
        super((Vehiculo)t1);
        this.licencia = licencia;
        this.estado = estado;
        this.num_taxista = num_taxista;
    }
    

    
    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
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
    public void mostrarAtributos(){
        super.mostrarAtributos();
        System.out.println("Licencia: "+getLicencia());
        System.out.println("Estado: "+isEstado());
        System.out.println("Taxistas con la misma licencia: "+getNum_taxista());
        
    }
    @Override
    public void pedirAlta(){
        
        
    }
    
}
