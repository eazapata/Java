package p03e1;

import java.util.*;

public class Cuenta {

    private String nombre, numcuenta, pin;
    private double interes, saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String numcuenta, String pin, double interes, double saldo) {
        this.nombre = nombre;
        this.numcuenta = numcuenta;
        this.pin = pin;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta cuenta1) {
        this.nombre = cuenta1.nombre;
        this.numcuenta = cuenta1.numcuenta;
        this.pin = cuenta1.pin;
        this.interes = cuenta1.interes;
        this.saldo = cuenta1.saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    public static Cuenta crearCuenta() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número de cuenta");
        String numcuenta = lector.nextLine();
        System.out.println("Introduce tu nombre");
        String nombre = lector.nextLine();
        System.out.println("Introduce el pin de la cuenta");
        String pin = lector.nextLine();
        System.out.println("Introduce el tipo de interes: ");
        double interes = Double.parseDouble(lector.nextLine());
        System.out.println("Introduce el saldo de tu cuenta:");
        double saldo = Double.parseDouble(lector.nextLine());

        return new Cuenta(nombre, numcuenta, pin, interes, saldo);
    }
/*Posicion viene de fuera*/
    public boolean ingreso(ArrayList<Cuenta> cuentas, int posicion) {
        Scanner lector = new Scanner(System.in);
        double ingreso = 0;
        System.out.println("Indica la cantidad a ingresar.");
        ingreso = Double.parseDouble(lector.nextLine());
        while (ingreso <= 0) {
            System.out.println("La cantidad debe ser mayor a 0");
            ingreso = Double.parseDouble(lector.nextLine());
        }
        cuentas.get(posicion).setSaldo(this.getSaldo() + ingreso);
        System.out.println("Su saldo actual es " + cuentas.get(posicion).getSaldo());
        return true;
    }

    public boolean reintegro(ArrayList<Cuenta> cuentas, int posicion) {
        Scanner lector = new Scanner(System.in);
        double reintegro;
        System.out.println("Indica la cantidad a retirar.");
        reintegro = Double.parseDouble(lector.nextLine());
        while (cuentas.get(posicion).getSaldo() < reintegro) {
            System.out.println("No dispone de esa cantidad indique otra cantidad");
            reintegro = Double.parseDouble(lector.nextLine());
        }
        cuentas.get(posicion).setSaldo(this.getSaldo() - reintegro);
        System.out.println("Su saldo actual es: " + cuentas.get(posicion).getSaldo());
        return true;
    }

    public void transferencia(ArrayList<Cuenta> cuentas, int posicion) {
        Scanner lector = new Scanner(System.in);
        String destinoTrans;
        int posicion2 = 0;
        boolean encontrada = false;
        System.out.println("Indique la cuenta de destino: ");
        destinoTrans = lector.nextLine();
        while (posicion2 < cuentas.size() & (!encontrada)) {
            if (destinoTrans.equalsIgnoreCase(cuentas.get(posicion2).getNumcuenta())) {
                encontrada = true;
                System.out.println("Indique la cantidad a transferir");
                double transferencia = Double.parseDouble(lector.nextLine());
                if (transferencia > cuentas.get(posicion).getSaldo()) {
                    System.out.println("Cantidad superior a su saldo actual. Indique otra");
                    transferencia = Double.parseDouble(lector.nextLine());
                }
                cuentas.get(posicion).setSaldo(this.getSaldo()-transferencia);
                System.out.println("Su saldo restante es: "+cuentas.get(posicion).getSaldo());
                        
            }
            posicion2++;
        }
        if (!encontrada)System.out.println("Cuenta destino no encontrada.");
        
    }
}
