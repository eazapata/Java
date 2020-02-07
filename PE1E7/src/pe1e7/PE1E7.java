package pe1e7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PE1E7 {

    public static void metodo1() {
        int lista[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            Scanner num = new Scanner(System.in);
            lista[i] = num.nextInt();
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
        }
    }

    public static void metodo2() {
        int lista[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            Scanner num = new Scanner(System.in);
            lista[i] = num.nextInt();
        }
        System.out.print("Estos son los números que se han introducido: ");
        for (int i = lista.length - 1; i >= 0; i--) {
            System.out.print(lista[i]);
        }
    }

    public static void metodo3() {
        int repeticiones = 5;
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        int total_ceros = 0;
        int total_positivos;
        int total_negativos;
        int media_positivos = 0;
        int media_negativos = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < repeticiones; i++) {
            System.out.println("Introduce un número: ");
            int num = entrada.nextInt();

            if (num > 0) {
                positivos.add(num);
            } else if (num < 0) {
                negativos.add(num);
            } else {
                total_ceros++;
            }
        }

        total_positivos = positivos.size();
        total_negativos = negativos.size();

        int suma_positivos = 0;
        for (int i = 0; i < total_positivos; i++) {
            suma_positivos += positivos.get(i);
        }

        media_positivos = suma_positivos / total_positivos;

        int suma_negativos = 0;
        for (int i = 0; i < total_negativos; i++) {
            suma_negativos += negativos.get(i);
        }
        media_negativos = suma_negativos / total_negativos;

        entrada.close();
        System.out.println("La media de positivos es: " + media_positivos);
        System.out.println("La media de negativos es: " + media_negativos);
        System.out.println("El total de ceros que tenemos es: " + total_ceros);

    }

    public static void metodo4() {
        int repeticiones = 10;
        List<Integer> numeros = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduce un número: ");
            int num = entrada.nextInt();
            numeros.add(num);
        }
        entrada.close();

        for (int i = 0; i < (repeticiones / 2); i++) {
            int posicion_final = (repeticiones - i) - 1;
            System.out.println(numeros.get(i));
            System.out.println(numeros.get(posicion_final));
        }
    }

    public static void metodo5() {
        int repeticiones = 10;
        List<Integer> tabla1 = new ArrayList<>();
        List<Integer> tabla2 = new ArrayList<>();
        List<Integer> tablafin = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduce diez números");
            int num = entrada.nextInt();
            tabla1.add(num);
        }

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduce otros diez números");
            int num = entrada.nextInt();
            tabla2.add(num);
        }
        for (int i = 0; i < repeticiones; i++) {
            tablafin.add(tabla1.get(i));
            tablafin.add(tabla2.get(i));
        }
        System.out.println("El resultado de mezclar las tablas es: ");
        for (int i = 0; i < (repeticiones * 2); i++) {
            System.out.print("|" + tablafin.get(i) + "|");
        }
        entrada.close();
    }

    public static void metodo6() {
        int repeticiones = 12;
        List<Integer> tabla1 = new ArrayList<>();
        List<Integer> tabla2 = new ArrayList<>();
        List<Integer> tablafin = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduce doce números: ");
            int num = entrada.nextInt();
            tabla1.add(num);
        }

        for (int i = 0; i < repeticiones; i++) {
            System.out.print("Introduce otros doce números: ");
            int num = entrada.nextInt();
            tabla2.add(num);
        }
        for (int i = 0; i < 12; i += 3) {
            int segundo = i + 1;
            int tercero = i + 2;
            tablafin.add(tabla1.get(i));
            tablafin.add(tabla1.get(segundo));
            tablafin.add(tabla1.get(tercero));
            tablafin.add(tabla2.get(i));
            tablafin.add(tabla2.get(segundo));
            tablafin.add(tabla2.get(tercero));
        }
        System.out.print("El resultado de la tabla final es: ");
        for (int i = 0; i < tablafin.size(); i++) {
            System.out.print("|" + tablafin.get(i) + "|");
        }

        entrada.close();
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("Salir");

        int opcion = entrada.nextInt();
        switch (opcion) {
            case (1):
                metodo1();
                break;
            case (2):
                metodo2();
                break;
            case (3):
                metodo3();
                break;
            case (4):
                metodo4();
                break;
            case (5):
                metodo5();
                break;
            case (6):
                metodo6();
                break;
            case (7):
                break;
            default:
                System.out.println("Opción no válida");

        }

    }

}
