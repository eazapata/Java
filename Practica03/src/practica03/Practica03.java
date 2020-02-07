package practica03;

import java.util.*;

public class Practica03 {

    public static Cuenta obtenerCuenta(ArrayList<Cuenta> cuentas, String cuenta) {
        int i = 0;
        while (i < cuentas.size()) {
            
            if (cuenta.equals(cuentas.get(i).getNumcuenta())){
                return cuentas.get(i);
            }
            i++;
        }
        return null;
    }
    public static int iniciarSesion (ArrayList<Cuenta> cuentas,String cuenta,String pin){
        int indice = 0;
        while (indice<=cuentas.size()){
            if (cuenta.equalsIgnoreCase(cuentas.get(indice).getNumcuenta()) & (pin.equals(cuentas.get(indice).getPin()))){
                System.out.println("Ha iniciado sesión correctamente");
                return indice;
            }else{
                System.out.println("Número de cuenta o pin no correctos");
            }
        }
        return -1;
        
    }
    

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        boolean salir = false;

        while (!salir) {
            System.out.println("===================");
            System.out.println("    M E N Ú ");
            System.out.println("===================");
            System.out.println("1) Crear cuenta.");
            System.out.println("2) Iniciar sesión.");
            System.out.println("3) Salir");
            System.out.println("Indica tu opcion");

            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el numero de cuenta");
                    String num = lector.nextLine();
                    Cuenta cuenta = obtenerCuenta(cuentas,num);
                    if(cuenta == null) cuenta=Cuenta.crear_cuenta();
                
                    break;
                case 2:
                    System.out.println("Introduce el número de tu cuenta: ");
                    String numcuenta = lector.nextLine();
                    cuenta = obtenerCuenta(cuentas,numcuenta);
                    if(cuenta!=null)System.out.println("Ha iniciado sesión correctamente");
                    break;
                case 3:
                    salir = true;
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("La opción indicada no es válida");

            }
        }
    }

}
