
package simulcrojava;


public final class TarjetaDebito extends Tarjeta{
    private double saldo;

    public TarjetaDebito() {
    }

    public TarjetaDebito(double saldo, String nif, String pin, String nombre, String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
    }
    public TarjetaDebito(TarjetaDebito td) {
        super((Tarjeta)td);
        this.saldo = td.saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void mostrarTarjeta(){
        super.mostrarTarjeta();
        System.out.println("Saldo: "+getSaldo());
        
    }
}
