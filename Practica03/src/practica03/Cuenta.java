package practica03;

import java.util.*;

public class Cuenta {

    private String cliente, numcuenta,pin;
    private double interes, saldo;

    public Cuenta(String cliente, String numcuenta,String pin, double interes, double saldo) {
        this.cliente = cliente;
        this.numcuenta = numcuenta;
        this.pin=pin;
        this.interes = interes;
        this.saldo = saldo;
        
    }

    public Cuenta() {
    }

    public Cuenta(Cuenta cuenta1) {
        this.cliente = cuenta1.cliente;
        this.numcuenta = cuenta1.numcuenta;
        this.interes = cuenta1.interes;
        this.saldo = cuenta1.saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(String numcuenta) {
        this.numcuenta = numcuenta;
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
    
    public static Cuenta crear_cuenta(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String cliente=lector.nextLine();
        System.out.println("Introduce el número de cuenta a crear: ");
        String numcuenta=lector.nextLine();
        System.out.println("Introduce el pin de la cuenta");
        String pin=lector.nextLine();
        System.out.println("Introduce el tipo de interés");
        double interes=Double.parseDouble(lector.nextLine());
        System.out.println("Indica el saldo de la cuenta");
        double saldo=lector.nextDouble();
        return new Cuenta(cliente,numcuenta,pin,interes,saldo);
        
    }

    public boolean ingreso() {
        Scanner lector = new Scanner(System.in);
        double ingreso;
        System.out.println("Introduce la cantidad a ingresar: ");
        ingreso = Double.parseDouble(lector.nextLine());
        while(ingreso < 0){
            System.out.println("La cantidad debe ser mayor a 0");
        }
        this.saldo += ingreso; 
        System.out.println("Opreración realizada con exito.");
        return true;
    }
    
    public boolean reintegro(){
        Scanner lector = new Scanner(System.in);
        double reintegro;
        System.out.println("Introduce tu cuenta");
        this.setNumcuenta(lector.nextLine()); 
        System.out.println("Introduce la cantidad a retirar:");
        reintegro = Double.parseDouble(lector.nextLine());
        while (saldo<reintegro){
            System.out.println("Saldo insuficiente introduzca otra cantidad:");
            reintegro= Double.parseDouble(lector.nextLine());
        }
        saldo-=reintegro;
        System.out.println("Opreración realizada con exito.");
        return true;
    }
    
    
    
   
   
    
    
    
   
}
