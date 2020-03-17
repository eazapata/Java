package p6e1;

import java.util.*;

public class P6E1 {

    public static void mostrarOpciones() {
        System.out.println("\t1) Cubo.");
        System.out.println("\t2) Esfera.");
        System.out.println("\t3) Ortoedro.");
        System.out.println("\t4) Piramide.");
        System.out.println("\t5) Salir.");

    }

    public static void main(String[] args) {
        try {
            Scanner lector = new Scanner(System.in);
            boolean salir = false;

            Cubo c1 = new Cubo();
            Esfera e1 = new Esfera();
            Ortoedro o1 = new Ortoedro();
            Piramide p1 = new Piramide();
            while (!salir) {

                System.out.println("======== M E N U ========");
                System.out.println("\t1) Calcular area.");
                System.out.println("\t2) Calcular volumen.");
                System.out.println("\t3) Mostrar caracteristicas.");
                System.out.println("\t4) Salir.");

                String opcion = lector.nextLine();
                if (opcion.equals("")) {
                    throw new SinContenido();
                }

                switch (opcion) {
                    case "1":
                        boolean salirArea = false;
                        while (!salirArea) {
                            System.out.println("MENÚ ÁREA");
                            mostrarOpciones();
                            String opcionArea = lector.nextLine();
                            if (opcionArea.equals("")) {
                                throw new SinContenido();
                            }
                            switch (opcionArea) {
                                case "1":
                                    c1.calcularArea(opcion);
                                    break;
                                case "2":
                                    e1.calcularArea(opcion);
                                    break;
                                case "3":
                                    o1.calcularArea(opcion);
                                    break;
                                case "4":
                                    p1.calcularArea(opcion);
                                    break;
                                case "5":
                                    salirArea = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        }
                        break;
                    case "2":
                        boolean salirVolumen = false;
                        while (!salirVolumen) {
                            System.out.println("MENÚ VOLUMEN");
                            mostrarOpciones();
                            String opcionVolumen = lector.nextLine();
                            if (opcionVolumen.equals("")) {
                                throw new SinContenido();
                            }
                            switch (opcionVolumen) {
                                case "1":
                                    c1.calcularVolumen(opcion);
                                    break;
                                case "2":
                                    e1.calcularVolumen(opcion);
                                    break;
                                case "3":
                                    o1.calcularVolumen(opcion);
                                    break;
                                case "4":
                                    p1.calcularVolumen(opcion);
                                    break;
                                case "5":
                                    salirVolumen = true;
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                            }
                        }
                        break;
                    case "3":
                        System.out.println("Calculadora de Eduardo Zapata");
                        System.out.println("Cubo");
                        c1.imprimirCaracteristicas(opcion);
                        System.out.println("");
                        System.out.println("Esfera");
                        e1.imprimirCaracteristicas(opcion);
                        System.out.println("");
                        System.out.println("Ortoedro");
                        o1.imprimirCaracteristicas(opcion);
                        System.out.println("");
                        System.out.println("Piramide");
                        p1.imprimirCaracteristicas(opcion);
                        break;
                    case "4":
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        } catch (NumberFormatException area) {
            System.out.println("Has introducido un valor alfabético en lugar de uno númerico.");
        } catch (SinContenido vacio) {
            System.out.println(vacio);

        }
    }
}
