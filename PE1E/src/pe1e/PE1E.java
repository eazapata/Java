
package pe1e;
import java.util.Scanner;

public class PE1E {

    
    public static void main(String[] args) {
       int lista[]=new int [5];
       for(int i=0; i<5 ;i++){
           System.out.println("Introduce un número");
           Scanner num = new Scanner(System.in);
           lista[i]=num.nextInt();
       }
       for (int i=0; i<lista.length; i++){
           System.out.print(lista[i]);
       }   
    }
}

