package ejerciciosweb16;
//Escribe una aplicación con un String que contenga una contraseña cualquiera. 
//Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).

import java.util.*;

public class EjerciciosWeb16 {

    public static void main(String[] args) {
        String contraseña = "patata";
        String usrpass;
        int intentos = 3;
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce la contraseña: ");
            usrpass = sc.nextLine();
            if (usrpass.equals(contraseña)) {
                acierto = true;
            }
            intentos -= 1;

        } while (intentos > 0 & acierto == false);
        if (acierto == true){
            System.out.println("Enhorabuena");
        }
    }
    
}
