/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01e3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01E3 {

    public static void main(String[] args) {
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
                 suma_positivos+=positivos.get(i);
            }
            
            media_positivos = suma_positivos / total_positivos;

            int suma_negativos= 0;
            for (int i = 0; i < total_negativos; i++) {
                suma_negativos += negativos.get(i);
            }
            media_negativos = suma_negativos / total_negativos;
        
        entrada.close();
        System.out.println("La media de positivos es: "+media_positivos);
        System.out.println("La media de negativos es: "+media_negativos);
        System.out.println("El total de ceros que tenemos es: "+total_ceros);
        
    }
    

}
