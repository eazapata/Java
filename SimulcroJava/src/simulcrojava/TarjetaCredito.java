
package simulcrojava;


public final class TarjetaCredito extends Tarjeta{
    private double saldo;
    private double credito;

    public TarjetaCredito() {
    }

    public TarjetaCredito(double saldo, double credito, String nif, String pin, String nombre, String apellido) {
        super(nif, pin, nombre, apellido);
        this.saldo = saldo;
        this.credito = credito;
    }
    public TarjetaCredito(TarjetaCredito tc) {
        super((Tarjeta)tc);
        this.saldo = tc.saldo;
        this.credito = tc.credito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    @Override
    public void mostrarTarjeta(){
        super.mostrarTarjeta();
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Crédito: "+getCredito());
    }
    
    
    
}
