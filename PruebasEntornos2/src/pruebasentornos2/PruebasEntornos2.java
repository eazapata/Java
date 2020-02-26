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
public class PruebasEntornos2 {

    static int maximo(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.print("Introduce un número:: ");
        a = Entrada.entero();
        System.out.print("Introduce otro número:: ");
        b = Entrada.entero();
        max = maximo(a, b);
        System.out.println("El número mayor es: " + max);
    }
}
