package p5e1;

import java.util.*;

public class P5E1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;

        ArrayList<Empleado> empleados = new ArrayList();

        while (!salir) {

            System.out.println("\t1) Alta empleado.");
            System.out.println("\t2) Alta comercial");
            System.out.println("\t3) Alta repatidor.");
            System.out.println("\t4) Mostrar atributos.");
            System.out.println("\t5) Salir.");
            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    Empleado e1 = new Empleado();
                    e1.pedirAlta();
                    empleados.add(e1);
                    break;
                case 2:
                    Comercial c1 = new Comercial();
                    c1.pedirAlta();
                    empleados.add(c1);
                    break;
                case 3:
                    Repartidor r1 = new Repartidor();
                    r1.pedirAlta();
                    empleados.add(r1);
                    break;
                case 4:
                    for (int i = 0; i < empleados.size(); i++) {
                        if (empleados.get(i) instanceof Empleado) {
                            empleados.get(i).mostrarAtributos();
                            System.out.println("");
                        } else if (empleados.get(i) instanceof Comercial) {
                            ((Comercial) empleados.get(i)).mostrarAtributos();
                            System.out.println("");
                        }else{
                            ((Repartidor) empleados.get(i)).mostrarAtributos();
                            System.out.println("");
                        }
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }
    }

}
