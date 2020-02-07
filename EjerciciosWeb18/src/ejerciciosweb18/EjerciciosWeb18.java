package ejerciciosweb18;

import java.util.*;

public class EjerciciosWeb18 {

    public static void main(String[] args) {
        int min;
        int max;
        int aleatorios=10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el minimo: ");
        min = sc.nextInt();
        System.out.println("Introduce el máximo: ");
        max = sc.nextInt();
        for (int i=0;i<aleatorios;i++){
            int numAleatorio=(int)Math.floor(Math.random()*(min-max)+max);
            System.out.println(numAleatorio);
            
        }
        
        

    }

}
