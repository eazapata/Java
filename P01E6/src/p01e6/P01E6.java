package p01e6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01E6 {

    public static void main(String[] args) {
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

}
