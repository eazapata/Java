
package ejerciciosweb;
import java.util.*;

public class EjerciciosWeb {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de 'a': ");
        int a = sc.nextInt();
        System.out.print("Introduce el valor de 'b': ");
        int b = sc.nextInt();
        System.out.print("Introduce el valor de 'c': ");
        int c = sc.nextInt();
        
        sc.close();
        
        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        
        System.out.println("La solucion de x1: "+x1);
        System.out.println("La solucion de x2: "+x2);
    }
    
}
