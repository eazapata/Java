package p4e1;

import java.util.*;

public class P4E1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        boolean salir = false;

        while (!salir) {
            System.out.println("\t1) Añadir película.");
            System.out.println("\t2) Reservar peliculas.");
            System.out.println("\t3) Listar peliculas.");
            System.out.println("\t4) Buscar pelicula");
            System.out.println("\t5) Salir");
            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    Pelicula peli = Pelicula.añadirPelicula();
                    if (peli != null) {
                        peliculas.add(peli);
                    }
                    break;
                case 2:
                    Pelicula.reservarPelicula(peliculas);
                case 3:
                    Pelicula.listarPeliculas(peliculas);
                    break;
                case 4:
                    Pelicula.buscarPeliculas(peliculas);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

    }

}
