/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasentornos2;

/**
 *
 * @author eduwo
 */
public class Ejercicio4maximo {

    static void mostrar(int a, int b) {
        int mayor = 0, menor;
// desconocemos el orden en el que vienen a y b.
// Lo que haremos es poner los valores correctos en mayor, menor.
        if (a < b) { // a es el mayor. Se podría utilizar la función

//maximo() implementada anteriormente.
            mayor = b;
            menor = a;
        } else { // en este caso b será el mayor mayor=b;
            menor = b;
            mayor = a;
        }
        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Introduzca primer número: ");
        a = Entrada.entero();
        System.out.print("Introduzca segundo número: ");
        b = Entrada.entero();
        mostrar(a, b);

    }
}
