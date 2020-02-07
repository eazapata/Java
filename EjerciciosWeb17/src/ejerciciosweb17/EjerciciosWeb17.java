package ejerciciosweb17;

import java.util.*;

public class EjerciciosWeb17 {

    public static void main(String[] args) {
        String dia;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día de la semana: ");
        dia = sc.nextLine();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es laboral");
                break;
            case "sabado":
            case "doming":
                System.out.println("No es laboral");
                break;
            default:
                System.out.println("Día no válido");
                break;

        }

    }

}
