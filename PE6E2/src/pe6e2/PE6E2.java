package pe6e2;

import java.util.*;

public class PE6E2 {

    public static void comprobarResultadosPrimitiva(ArrayList<Apuesta> apuestas, int[][] primitivas, int sorteos) {
        int i = 0;
        int j = 0;
        int aciertos2 = 0;
        int aciertos3 = 0;
        int aciertos4 = 0;
        int aciertos5 = 0;
        int posicionPrimitiva = 0;
        boolean primitivaGanadora = false;

        while ((!primitivaGanadora) && (i < apuestas.size())) {
            if ((apuestas.get(i) instanceof Primitiva) && (posicionPrimitiva < primitivas.length)) {

                if (((Primitiva) apuestas.get(i)).getListaNum()[j] == (primitivas[posicionPrimitiva][j])) {
                    ((Primitiva) apuestas.get(i)).setAciertos(((Primitiva) apuestas.get(i)).getAciertos() + 1);
                }

                if ((j == 5) && (!primitivaGanadora)) {
                    posicionPrimitiva += 1;

                    switch (((Primitiva) apuestas.get(i)).getAciertos()) {
                        case 2:
                            aciertos2 += 1;
                            break;
                        case 3:
                            aciertos3 += 1;
                            break;
                        case 4:
                            aciertos4 += 1;
                            break;
                        case 5:
                            aciertos5 += 1;
                            break;
                        case 6:
                            System.out.println("Ha ganado la primitiva.");
                            ((Primitiva) apuestas.get(i)).mostrarApuesta();
                            System.out.println("2 aciertos: " + aciertos2);
                            System.out.println("3 aciertos: " + aciertos3);
                            System.out.println("4 aciertos: " + aciertos4);
                            System.out.println("5 aciertos: " + aciertos5);
                            break;
                        default:
                            break;
                    }
                    ((Primitiva) apuestas.get(i)).setAciertos(0);
                    j = 0;
                } else {
                    j++;
                }

                if (posicionPrimitiva == (primitivas.length - 1)) {
                    i++;
                }

            } else {
                i++;
            }

        }
        if ((!primitivaGanadora)&&(primitivas.length>0)) {
            System.out.println("No ha ganado.");
            System.out.println("2 aciertos: " + aciertos2);
            System.out.println("3 aciertos: " + aciertos3);
            System.out.println("4 aciertos: " + aciertos4);
            System.out.println("5 aciertos: " + aciertos5);
        }
    }

    public static void comprobarResultadosQuiniela(ArrayList<Apuesta> apuestas, String[][] quinielas, int simulacionesQuiniela) {

        boolean quinielaGanadora = false;
        int posicionQuiniela = 0;
        int i = 0;
        int j = 0;

        while ((!quinielaGanadora) && (i < apuestas.size())) {
            if ((apuestas.get(i) instanceof Quiniela) && (posicionQuiniela < quinielas.length)) {
                if (((Quiniela) apuestas.get(i)).getPartidos()[j].equals(quinielas[posicionQuiniela][j])) {
                    ((Quiniela) apuestas.get(i)).setAciertos(((Quiniela) apuestas.get(i)).getAciertos() + 1);
                }
                if ((j == (quinielas[i].length - 1)) && (!quinielaGanadora)) {
                    posicionQuiniela += 1;
                    ((Quiniela) apuestas.get(i)).setAciertos(0);
                    j = 0;
                } else {
                    j++;
                }
                if (((Quiniela) apuestas.get(i)).getAciertos() == 15) {
                    System.out.println("Ha ganado la primitiva.");
                    ((Quiniela) apuestas.get(i)).mostrarApuesta();
                    quinielaGanadora = true;
                }
                if (posicionQuiniela == (quinielas.length - 1)) {
                    i++;
                }
            } else {
                i++;
            }

        }
        if (!quinielaGanadora) {
            System.out.println("No hay quinielas premiadas.");
        }

    }

    public static void realizarSimulacion(ArrayList<Apuesta> apuestas) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas simulaciones de primitiva quieres hacer?");
        int simulacionesPrimitiva = Integer.parseInt(sc.nextLine());
        System.out.println("¿Cuantas simulaciones de quiniela quieres hacer?");
        int simulacionesQuiniela = Integer.parseInt(sc.nextLine());

        int primitivasSimuladas[][] = new int[simulacionesPrimitiva][6];

        for (int i = 0; i < simulacionesPrimitiva; i++) {
            int primitivaSimulada[] = new int[6];
            for (int j = 0; j < primitivaSimulada.length; j++) {
                primitivaSimulada[j] = (int) Math.floor(Math.random() * (0 - 49 + 1) + 49);
            }
            primitivasSimuladas[i] = primitivaSimulada;
        }
        String quinielasSimuladas[][] = new String[simulacionesQuiniela][15];

        String opciones[] = {"1", "2", "x"};

        for (int i = 0; i < simulacionesQuiniela; i++) {

            String quinielaSimulada[] = new String[15];

            for (int j = 0; j < quinielaSimulada.length; j++) {
                int posicionArray = new Random().nextInt(opciones.length);
                quinielaSimulada[j] = opciones[posicionArray];
            }
            quinielasSimuladas[i] = quinielaSimulada;
        }
        if (simulacionesPrimitiva > 0) {
            comprobarResultadosPrimitiva(apuestas, primitivasSimuladas, simulacionesPrimitiva);
        }

        if (simulacionesQuiniela > 0) {
            comprobarResultadosQuiniela(apuestas, quinielasSimuladas, simulacionesQuiniela);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Apuesta> apuestas = new ArrayList();

        boolean salir = false;
        while (!salir) {

            System.out.println("\t1) Crear apuesta Primitiva.");
            System.out.println("\t2) Crear apuesta Quiniela.");
            System.out.println("\t3) Realizar simulación.");
            System.out.println("\t4) Salir.");

            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    Primitiva p1 = new Primitiva();
                    try {
                        p1.crearApuestaPrimitiva();
                    } catch (Mayus ex) {
                        ex.mostarMensaje();
                        break;
                    }
                    apuestas.add(p1);
                    break;
                case 2:
                    Quiniela q1 = new Quiniela();
                    try {
                        q1.crearApuestaQuiniela();
                    } catch (Mayus ex) {
                        ex.mostarMensaje();
                        break;
                    }
                    apuestas.add(q1);
                    break;
                case 3:
                    if (apuestas.size() == 0) {
                        System.out.println("Aún no has hecho ninguna apuesta.");
                    } else {
                        realizarSimulacion(apuestas);
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
