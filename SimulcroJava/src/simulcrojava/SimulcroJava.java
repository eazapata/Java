package simulcrojava;

import java.util.*;

public class SimulcroJava {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            CajeroAutomatico c1 = new CajeroAutomatico();

            c1.mostrarBilletes();

            boolean salir = false;
            while (!salir) {
                System.out.println("");
                System.out.println("\t1) Sacar dinero");
                System.out.println("\t2) Salir");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:

                        c1.sacarDinero();
                        break;
                    case 2:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            }
        } catch (ExcepcionCajero ec) {
            ec.mensaje();
        }

    }

}
