package p03e1;

import java.util.*;

public class P03E1 {

    public static Integer iniciarSesion(ArrayList<Cuenta> cuentas) {
        Scanner lector = new Scanner(System.in);
        int i = 0;
        boolean cuenta = false;
        boolean pinCuenta = false;

        System.out.println("introduce tu numero de cuenta:");
        String num = lector.nextLine();

        while ((i < cuentas.size()) && (!cuenta)) {
            if (num.equalsIgnoreCase(cuentas.get(i).getNumcuenta())) {
                cuenta = true;
                System.out.println("Cuenta confirmada");
            } else {
                i++;
            }
        }
        if (cuenta) {
            System.out.println("Introduce tu pin");
            String pin = lector.nextLine();

            if (pin.equals(cuentas.get(i).getPin())) {
                System.out.println("Pin correcto.");
                pinCuenta = true;
            } else {
                System.out.println("Pin incorrecto");
            }
        }
        if (pinCuenta) {
            return i;
        } else {
            System.out.println("Cuenta no encontrada");
            return -1;
        }
    }

    public static void main(String[] args) {

        ArrayList<Cuenta> cuentas = new ArrayList();
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("               M E N Ú        ");
            System.out.println("\t1) Crear cuenta.");
            System.out.println("\t2) Iniciar sesión.");
            System.out.println("\t3) Salir.");

            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    int i = 0;
                    boolean unica = true;
                    Cuenta cuenta = Cuenta.crearCuenta();

                    while ((i < cuentas.size()) & (unica)) {
                        if (cuenta.getNumcuenta().equals(cuentas.get(i).getNumcuenta())) {
                            unica = false;
                        }
                        i++;
                    }
                    if (!unica) {
                        System.out.println("La cuenta ya existe");
                        break;
                    }
                    cuentas.add(cuenta);
                    break;
                case 2:
                    int sesionIniciada = iniciarSesion(cuentas);
                    if (sesionIniciada != -1) {
                        System.out.println("Sesion iniciada");
                        boolean salir2 = false;
                        while (!salir2) {
                            System.out.println("\t1) Realizar ingreso.");
                            System.out.println("\t2) Sacar dinero.");
                            System.out.println("\t3) Realizar transferencia.");
                            System.out.println("\t4) Salir.");
                            int opcionsubmenu = Integer.parseInt((lector.nextLine()));

                            switch (opcionsubmenu) {
                                case 1:
                                    cuentas.get(sesionIniciada).ingreso(cuentas, sesionIniciada);
                                    break;
                                case 2:
                                    cuentas.get(sesionIniciada).reintegro(cuentas, sesionIniciada);
                                    break;
                                case 3:
                                    cuentas.get(sesionIniciada).transferencia(cuentas, sesionIniciada);
                                    break;
                                case 4:
                                    salir2 = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        }
                    }

                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");

            }
        }

    }

}
