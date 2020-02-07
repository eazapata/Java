package ejerciciosweb19;

import java.util.*;

public class EjerciciosWeb19 {

    public static void mostrarArray() {
        int array1[][] = new int[5][5];

        for (int i = 0; i < array1.length; i++) {
            System.out.println();
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = i + j;
                System.out.print(array1[i][j]);
            }
        }

    }

    public static void validarSimetrico() {
        int array[][] = new int[4][4];

        boolean iguales = true;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Introduce un número: ");
                int num = sc.nextInt();
                array[i][j] = num;
            }
        }
        int indice_i = 0;
        while (indice_i < array.length) {
            int indice_j = 0;
            while (iguales == true && indice_j < array[indice_i].length) {
                if (array[indice_i][indice_j] != array[indice_j][indice_i]) {
                    iguales = false;
                }
                indice_j++;
            }
            indice_i++;
        }
        if (iguales == true) {
            System.out.println("La matriz es simetrica ");
        } else {
            System.out.println("La matriz no es simetrica");
        }

        sc.close();
    }

    public static void sumarArray() {
        int matriz[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un número para la fila" + i + "de la matriz 1: ");
                int num = sc.nextInt();
                matriz[i][j] = num;
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce un número para la fila" + i + "de la matriz 2: ");
                int num = sc.nextInt();
                matriz2[i][j] = num;
            }
        }
        sc.close();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + matriz2[i][j] + " ");
            }
        }

    }

    public static void rellenarDiagonal() {

        int matriz[][] = new int[7][7];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            matriz[i][i] = 1;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }

        }

    }

    public static void enmarcar1() {
        int matriz[][] = new int[8][6];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
        }
    }

    public static void enmarcarUsuario() {
        Scanner sc = new Scanner(System.in);
        int alto;
        int largo;
        System.out.print("Indica la altura de la matriz: ");
        alto = sc.nextInt();
        System.out.print("Indica la longitud de la matriz: ");
        largo = sc.nextInt();
        int matriz[][] = new int[alto][largo];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        while (!salir) {

            System.out.println("1. Ejercicio 1: ");
            System.out.println("2. Ejercicio 2: ");
            System.out.println("3. Ejercicio 3: ");
            System.out.println("4. Ejercicio 4: ");
            System.out.println("5. Ejercicio 5: ");
            System.out.println("6. Ejercicio 6: ");
            System.out.println("7. Salir ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarArray();
                    break;
                case 2:
                    validarSimetrico();
                    break;
                case 3:
                    sumarArray();
                    break;
                case 4:
                    rellenarDiagonal();
                    break;
                case 5:
                    enmarcar1();
                    break;
                case 6:
                    enmarcarUsuario();
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.print("Opción no válida.");
                    break;
            }

        }
        sc.close();
    }

}
