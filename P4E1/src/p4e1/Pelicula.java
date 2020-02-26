package p4e1;

import java.util.*;

public class Pelicula {

    private final int id;
    private static int num_titulos = 1;
    private static int stock_total;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private String ano;
    private boolean disponibilidad;
    private int stock;
    private int reservadas;
    private static final int max_peliculas = 3000;

    public Pelicula(String titulo, String director, int duracion, String genero, String ano, boolean disponibilidad, int stock, int reservadas) {
        this.id = num_titulos++; //Esta linea es para asignar de forma automatica un id
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.ano = ano;
        this.disponibilidad = disponibilidad;
        this.stock = stock;
        this.reservadas = reservadas;
    }

    public static int getStock_total() {
        return stock_total;
    }

    public static void setStock_total(int stock_total) {
        Pelicula.stock_total = stock_total;
    }

    public int getId() {
        return id;
    }

    public static int getNum_titulos() {
        return num_titulos;
    }

    public static void setNum_titulos(int num_titulos) {
        Pelicula.num_titulos = num_titulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getReservadas() {
        return reservadas;
    }

    public void setReservadas(int reservadas) {
        this.reservadas = reservadas;
    }

    public static int getMax_peliculas() {
        return max_peliculas;
    }

    public static Pelicula añadirPelicula() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el titulo de la película:");
        String titulo = lector.nextLine();
        System.out.println("Introduce el director:");
        String director = lector.nextLine();
        System.out.println("Introduce la duración:");
        int duracion = Integer.parseInt(lector.nextLine());
        System.out.println("Introduce el género de la película:");
        String genero = lector.nextLine();
        System.out.println("Introduce el año de la pelicula:");
        String ano = lector.nextLine();
        System.out.println("Introduce la cantidad de películas:");
        int stock = Integer.parseInt(lector.nextLine());
        boolean disponibilidad = true;

        if (stock_total + stock <= max_peliculas) {
            setStock_total(getStock_total() + stock);
            System.out.println("El stock actual del videoclub es: " + stock_total);
            return new Pelicula(titulo, director, duracion, genero, ano, disponibilidad, stock, 0);
        } else {
            System.out.println("Ha superado el limite de stock: " + stock_total);
            return null;
        }

    }

    //METODO PARA MOSTRAR EL CONTENIDO DE LOS ARRAYS PELICULA
    public static void listarPeliculas(ArrayList<Pelicula> pelis) {
        for (Pelicula p : pelis) {
            System.out.println("id " + p.getId());
            System.out.println("Tiutlo " + p.getTitulo());
            System.out.println("Director " + p.getDirector());
            System.out.println("Genero " + p.getGenero());
            System.out.println("Año " + p.getAno());
            System.out.println("Duracion " + p.getDuracion());
            System.out.println("Stock: " + p.getStock());
            System.out.println("Reservadas: " + p.getReservadas());
            System.out.println("Disponibilidad: " + p.isDisponibilidad());
            System.out.println("");
        }
    }

    public static void reservarPelicula(ArrayList<Pelicula> peliculas) {
        listarPeliculas(peliculas);
        Scanner lector = new Scanner(System.in);
        int i = 0;
        boolean encontrada = false;
        System.out.println("Introduce el id de la pelicula a reservar");
        /*buscaId es el id que busca el usuario*/
        int buscaId = Integer.parseInt(lector.nextLine());

        //Mientras no encuentre la pelicula y el indice sea menor que el tamño del arraylist buscara la pelicula indicada
        while ((i < peliculas.size()) && (!encontrada)) {
            if (buscaId == peliculas.get(i).getId()) {
                encontrada = true;
                //Si disponibilidad es false saldrá el aviso
                if (!peliculas.get(i).isDisponibilidad()) {
                    System.out.println("No quedan copias de esta pelicula");
                } else {
                    System.out.println("Indica las copias a reservar: ");
                    int copias = Integer.parseInt(lector.nextLine());
                    //Si la cantidad de copias reservadas es menor al stock permitirá reservar si no mostrará el siguiente mensaje.
                    if (peliculas.get(i).getReservadas() < peliculas.get(i).getStock()) {
                        peliculas.get(i).setReservadas(peliculas.get(i).getReservadas() + copias);
                    } else {
                        System.out.println("El videoclub no cuentas con tantas copias");
                    }
                    if (peliculas.get(i).getStock() == peliculas.get(i).getReservadas()) {
                        peliculas.get(i).setDisponibilidad(false);
                    } else {
                        peliculas.get(i).setDisponibilidad(true);
                    }
                }
            } else {
                i++;
            }
        }
        if (!encontrada) {
            System.out.println("Pelicula no encontrada");
        }
    }

    public static void buscarPeliculas(ArrayList<Pelicula> peliculas) {
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("    Buscar Peliculas ");
            System.out.println("\t1) Por titulo.");
            System.out.println("\t2) Por director.");
            System.out.println("\t3) Por género.");
            System.out.println("\t4) Por año.");
            System.out.println("\t5) Por duración.");
            System.out.println("\t6) Salir");

            int opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el titulo a buscar:");
                    String titulo = lector.nextLine();
                    ArrayList<Pelicula> resultadoTitulo = Pelicula.buscarTitulo(peliculas, titulo);
                    if (resultadoTitulo != null) {
                        listarPeliculas(resultadoTitulo);
                    } else {
                        System.out.println("No se encuentra la pelicula");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el nombre del director a buscar.");
                    String director = lector.nextLine();
                    ArrayList<Pelicula> resultadoDirector = buscarDirector(peliculas, director);
                    if (resultadoDirector != null) {
                        listarPeliculas(resultadoDirector);
                    } else {
                        System.out.println("No se encuentra la pelicula");
                    }
                    break;
                case 3:
                    System.out.println("Indica el genero a buscar: ");
                    String genero = lector.nextLine();
                    ArrayList<Pelicula> resultadoGenero = buscarGenero(peliculas, genero);
                    if (resultadoGenero != null) {
                        listarPeliculas(resultadoGenero);
                    } else {
                        System.out.println("No se encuentran peliculas");
                    }
                    break;
                case 4:
                    System.out.println("Indica el año a buscar: ");
                    String ano = lector.nextLine();
                    ArrayList<Pelicula> resultadoAno = buscarAno(peliculas, ano);
                    if (resultadoAno != null) {
                        listarPeliculas(resultadoAno);
                    } else {
                        System.out.println("No se encuentran peliculas");
                    }
                    break;
                case 5:
                    System.out.println("Indica la duración a buscar: ");
                    int duracion = Integer.parseInt(lector.nextLine());
                    ArrayList<Pelicula> resultadoDuracion = buscarDuracion(peliculas, duracion);
                    if (resultadoDuracion != null) {
                        listarPeliculas(resultadoDuracion);
                    } else {
                        System.out.println("No se encuentran peliculas");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }
    }

    public static ArrayList buscarTitulo(ArrayList<Pelicula> peliculas, String titulo) {
        ArrayList<Pelicula> busquedaTitulo = new ArrayList();
        for (Pelicula p : peliculas) {
            if (p.getTitulo().contains(titulo)) {
                busquedaTitulo.add(p);
                return busquedaTitulo;
            }
        }
        return null;

    }

    public static ArrayList buscarDirector(ArrayList<Pelicula> peliculas, String director) {
        ArrayList<Pelicula> busquedaDirector = new ArrayList();
        for (Pelicula p : peliculas) {
            if (p.getDirector().contains(director)) {
                busquedaDirector.add(p);
                return busquedaDirector;
                
            }
        }

        return null;
    }

    public static ArrayList buscarGenero(ArrayList<Pelicula> peliculas, String genero) {
        ArrayList<Pelicula> busquedaGenero = new ArrayList();
        for (Pelicula p : peliculas) {
            if (p.getGenero().contains(genero)) {
                busquedaGenero.add(p);
                return busquedaGenero;
            }
        }
        return null;
    }

    public static ArrayList buscarAno(ArrayList<Pelicula> peliculas, String ano) {
        ArrayList<Pelicula> busquedaAno = new ArrayList();
        for (Pelicula p : peliculas) {
            if (p.getAno().contains(ano)) {
                busquedaAno.add(p);
                return busquedaAno;
            }
        }
        return null;
    }

    public static ArrayList buscarDuracion(ArrayList<Pelicula> peliculas, int duracion) {
        ArrayList<Pelicula> busquedaDuracion = new ArrayList();
        for (Pelicula p : peliculas) {
            if (p.getDuracion() == duracion) {
                busquedaDuracion.add(p);
                return busquedaDuracion;
            }
        }
        return null;
    }

}
