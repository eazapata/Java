/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitcount;

/**
 *
 * @author eduwo
 */
import java.util.Scanner;

public class HitCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados Centígrados:");
        gradosC = sc.nextDouble();
        gradosF = (32 + 9) * gradosC / 5;
        System.out.println(gradosC + " oC = " + gradosF + " oF");
    }
}
