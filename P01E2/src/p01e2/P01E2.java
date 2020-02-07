/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01e2;

import java.util.Scanner;

public class P01E2 {

    public static void main(String[] args) {
        int lista[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número");
            Scanner num = new Scanner(System.in);
            lista[i] = num.nextInt();
        }
        System.out.print("Estos son los números que se han introducido: ");
        for (int i = lista.length -1; i >= 0; i--) {
            System.out.print(lista[i]);
        }
    }
}
