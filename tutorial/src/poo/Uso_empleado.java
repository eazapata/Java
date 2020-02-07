
package poo;

import java.util.Scanner;


public class Uso_empleado {
    public static void main(String[] args) {
        
        Empleado empleado1 = Empleado.pedirDatos();
        System.out.println(empleado1.getNombre()+empleado1.getSueldo()+empleado1.getAlta());
        
        
        

    }
}