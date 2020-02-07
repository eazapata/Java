package p01e5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01E5 {

    public static void main(String[] args) {
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
        for (int i = 0; i < (repeticiones*2);i++){
            System.out.print("|"+tablafin.get(i)+"|");
        }
        entrada.close();
    }
}
