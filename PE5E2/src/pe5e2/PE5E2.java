package pe5e2;

import java.util.*;

public class PE5E2 {

    

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        boolean salir = false;
        Scanner lector = new Scanner(System.in);

        while (!salir) {
            System.out.println("\t1) Alta taxi.");
            System.out.println("\t2) Alta VTC.");
            System.out.println("\t3) Alta Autobus.");
            System.out.println("\t4) Buscar vehículo por id.");
            System.out.println("\t5) Buscar vehiculo por matrícula.");
            System.out.println("\t6) Buscar primer taxi libre.");
            System.out.println("\t7) Buscar taxi concreto por id.");
            System.out.println("\t8) Mostrar vehículos.");
            System.out.println("\t9) Salir.");

            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    Taxi t1 = new Taxi();
                    t1.pedirAlta();
                    vehiculos.add(t1);

                    break;
                case 2:
                    Vtc vtc1 = new Vtc();
                    vtc1.pedirAlta();
                    vehiculos.add(vtc1);
                    break;
                case 3:
                    Autobus a1 = new Autobus();
                    a1.pedirAlta();
                    vehiculos.add(a1);
                    break;
                case 4:
                    int i = 0;
                    boolean idEncontrado = false;
                    System.out.println("Indica el id que quieres buscar");
                    int id = Integer.parseInt(lector.nextLine());
                    while ((i < vehiculos.size()) && (!idEncontrado)) {
                        if (id == vehiculos.get(i).getId()) {
                            idEncontrado = true;
                            vehiculos.get(i).mostrarAtributos();
                        } else {
                            i++;
                        }

                    }
                    if (!idEncontrado) {
                        System.out.println("Vehiculo no encontrado");
                    }
                    break;
                case 5:
                    int j = 0;
                    boolean matriculaEncontrada = false;
                    System.out.println("Indica la matricula a buscar");
                    String matricula = lector.nextLine();
                    while ((j < vehiculos.size()) && (!matriculaEncontrada)) {
                        if (matricula.equals(vehiculos.get(j).getMatricula())) {
                            matriculaEncontrada = true;
                            vehiculos.get(j).mostrarAtributos();
                        } else {
                            j++;
                        }
                    }
                    if (!matriculaEncontrada) {
                        System.out.println("Vehiculo no encontrado");
                    }
                    break;

                case 6:
                    Taxi.buscarTaxiLibre(vehiculos);

                    break;
                case 7:
                    System.out.println("Introduce el id a buscar");
                    int idTaxi=Integer.parseInt(lector.nextLine());
                    Taxi.buscarTaxi(vehiculos,idTaxi);
                    break;
                case 8:
                    for (Vehiculo v : vehiculos) {
                        if (v instanceof Taxi) {
                            ((Taxi) v).mostrarAtributos();
                        } else if (v instanceof Autobus) {
                            ((Autobus) v).mostrarAtributos();
                        } else if (v instanceof Vtc) {
                            ((Vtc) v).mostrarAtributos();
                        } else {
                            v.mostrarAtributos();
                        }
                    }
                    break;
                case 9:
                    salir = true;
                    break;

            }

        }
    }

}
