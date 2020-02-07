
public class Cuenta {
    private String cliente, cuenta;
    private double interes, saldo;

    public Cuenta(String cliente, String cuenta, double interes, double saldo) {
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta() {
    }
    public Cuenta(Cuenta cuenta1) {
        this.cliente = cuenta1.cliente;
        this.cuenta = cuenta1.cuenta;
        this.interes = cuenta1.interes;
        this.saldo = cuenta1.saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void ingreso (){
        System.out.println("Introduce la cantidad del ingreso: ");
        
        
    }
}
