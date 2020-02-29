package pruebas;

import java.util.*;

public class Pruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados Centígrados:");
        gradosC = sc.nextDouble();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC + " oC = " + gradosF + " oF");
    }
}
