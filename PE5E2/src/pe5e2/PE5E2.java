package pe5e2;

import java.util.*;

public class PE5E2 {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        
        while (!salir) {
            System.out.println("\t1) Alta taxi.");
            System.out.println("\t2) Alta autobus.");
            System.out.println("\t3) Alta VTC.");
            System.out.println("\t4) Buscar vehículo por id.");
            System.out.println("\t5) Buscar vehiculo por matrícula.");
            System.out.println("\t6) Buscar primer taxi libre.");
            System.out.println("\t7) Buscar taxi concreto por id.");
            System.out.println("\t8) Mostrar vehículos.");
            System.out.println("\t9) Salir.");

            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    Vehiculo v1 = new Vehiculo();
                    v1.pedirAlta();
                    vehiculos.add(v1);
                    for(int i=0;i<vehiculos.size();i++){
                        vehiculos.get(i).mostrarAtributos();
                    }
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    salir=true;
                    break;

            }

        }
    }

}
