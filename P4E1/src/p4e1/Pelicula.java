
package p4e1;
import java.util.*;


public class Pelicula {
    private final int id;
    private static int num_titulos;
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
        this.id= num_titulos++;
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

    
    
    public static Pelicula añadirPelicula(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el titulo de la película:");
        String titulo = lector.nextLine();
        System.out.println("Introduce el director:");
        String director = lector.nextLine();
        System.out.println("Introduce la duración:");
        int duracion = Integer.parseInt(lector.nextLine());
        System.out.println("Introduce el género de la película:");
        String genero=lector.nextLine();
        System.out.println("Introduce el año de la pelicula:");
        String ano = lector.nextLine();
        System.out.println("Introduce la cantidad de películas:");
        int stock = Integer.parseInt(lector.nextLine());
        boolean disponibilidad = true;
        
        if (stock_total+stock<=max_peliculas){
            setStock_total(getStock_total()+stock);
            System.out.println("El stock actual del videoclub es: "+stock_total);
            return new Pelicula(titulo,director,duracion,genero,ano,disponibilidad,stock,0);
        }else{
            System.out.println("Ha superado el limite de stock: "+stock_total);
            return null;
        }
        
    }

    public static void listarPeliculas(ArrayList<Pelicula> peliculas){
        for (int i = 0;i<peliculas.size();i++){
            System.out.println("Id: "+peliculas.get(i).getId());
            System.out.println("Título: "+peliculas.get(i).getTitulo());
            System.out.println("Director: "+peliculas.get(i).getDirector());
            System.out.println("Género: "+peliculas.get(i).getGenero());
            System.out.println("Duración: "+peliculas.get(i).getDuracion());
            System.out.println("Disponibilidad: "+peliculas.get(i).isDisponibilidad());
        }
    }
}
