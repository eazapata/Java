/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6e2;

import java.util.*;

public class P6E2 {
    
    public static void realizarSimulacion(ArrayList<Apuesta> apuestas,int primitivas, int quinielas){
        int dosAciertos;
        int cuatroAciertos;
        int seisAciertos;
        
        for(int i = 0; i <primitivas; i++){
            if (apuestas.get(i) instanceof Primitiva){
                ((Primitiva)apuestas.get(i)).simularPrimitiva();
                
            }
        }
        
        
    }

    public static void main(String[] args) {
        ArrayList<Apuesta> apuestas = new ArrayList();

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\t1) Crear apuesta Primitiva.");
            System.out.println("\t2) Crear apuesta Quiniela.");
            System.out.println("\t3) Realizar simulación.");
            System.out.println("\t4) Salir");
            
            int opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1:
                    Primitiva p1 = new Primitiva();
                    p1.crearApuestaPrimitiva();
                    apuestas.add(p1);
                    p1.mostrarApuesta();
                    break;
                case 2:
                    Quiniela q1 = new Quiniela();
                    q1.crearApuestaQuiniela();
                    apuestas.add(q1);
                    break;
                    
                case 3:
                    System.out.println("Indica las simulaciones de la primitiva:");
                    int simulacionesPrimitiva = Integer.parseInt(sc.nextLine());
                    System.out.println("Indica las simulaciones de la quiniela");
                    int simulacionesQuiniela = Integer.parseInt(sc.nextLine());
                    realizarSimulacion(apuestas,simulacionesPrimitiva,simulacionesQuiniela);
                    break;
                    
                case 4:
                    salir = true;
                
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

}
