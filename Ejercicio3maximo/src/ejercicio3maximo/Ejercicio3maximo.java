/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3maximo;

public class Ejercicio3maximo {

    /**
     * funciona solamente para tablas de un tamaño de 1
     *
     */
    static int maximo(int t[]) {
        int max;
        max = t[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }

        return (max);
    }

    public static void main(String[] args) {
        int max;
        int t[];
        t = new int[6];
        for (int i = 2; i < t.length - 2; i++) {
            t[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Los valores son:");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        max = maximo(t);
        System.out.println("\nEl número mayor es: " + max);
    }
}
