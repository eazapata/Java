
package simulcrojava;


public class ExcepcionCajero extends Exception{
    private int cantidadCliente;

    public ExcepcionCajero(int cantidadCliente) {
        this.cantidadCliente = cantidadCliente;
    }

    public int getCantidadCliente() {
        return cantidadCliente;
    }

    public void setCantidadCliente(int cantidadCliente) {
        this.cantidadCliente = cantidadCliente;
    }
    
   public void mensaje(){
       System.out.println("Actualmente el cajero no dispone de efectivo suficiente para satisfacer la cantidad de"+ getCantidadCliente()+" € de su tarjeta");
       
   }
}
