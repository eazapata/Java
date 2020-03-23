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
                    ((Primitiva) apuestas.get(i)).setAciertos(0);
                    j = 0;
                }else{
                    j++;
                }
                if (((Primitiva) apuestas.get(i)).getAciertos() == 6) {
                    System.out.println("Enhorabuena la ha ganado la primitiva.");
                    ((Primitiva) apuestas.get(i)).mostrarApuesta();
                    primitivaGanadora = true;
                } else if (((Primitiva) apuestas.get(i)).getAciertos() == 2) {
                    aciertos2 += 1;
                } else if (((Primitiva) apuestas.get(i)).getAciertos() == 3) {
                    aciertos3 += 1;
                } else if (((Primitiva) apuestas.get(i)).getAciertos() == 4) {
                    aciertos4 += 1;
                } else if (((Primitiva) apuestas.get(i)).getAciertos() == 5) {
                    aciertos5 += 1;
                }
                if(posicionPrimitiva==(primitivas.length-1))i++;

            } else {
                i++;
            }

        }
        if (!primitivaGanadora) {
            System.out.println("No hay premios.");
            System.out.println("Dobles aciertos: " + aciertos2);
            System.out.println("Triples aciertos: " + aciertos3);
            System.out.println("Cuadruple aciertos: " + aciertos4);
            System.out.println("Quintuples aciertos: " + aciertos5);
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
                System.out.println(quinielaSimulada[j]);
            }
            quinielasSimuladas[i] = quinielaSimulada;
        }
        if(simulacionesPrimitiva>0)comprobarResultadosPrimitiva(apuestas, primitivasSimuladas, simulacionesPrimitiva);
        //comprobarResultadosQuiniela(apuestas,quinielasSimuladas,simulacionesQuiniela);

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
