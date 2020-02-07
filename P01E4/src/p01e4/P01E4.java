
package p01e4;
import java.util.*;

public class P01E4 {

    public static void main(String[] args) {
        int repeticiones = 10;
        List<Integer> numeros = new ArrayList<>();
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i= 0; i < repeticiones; i ++){
           System.out.print("Introduce un número: ");
           int num = entrada.nextInt();
           numeros.add(num);
        }
        entrada.close();
   
        for (int i = 0; i < (repeticiones/2);i++){
            int posicion_final = (repeticiones -i)-1;
            System.out.println(numeros.get(i));
            System.out.println(numeros.get(posicion_final));
        }
    }
    
}
