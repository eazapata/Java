package p6e2;

import java.util.Scanner;

public class Quiniela extends Apuesta {

    private int partidos;
    private int aciertos;
    private String[] apuestaQuiniela = new String[15];

    public Quiniela() {
    }

    public Quiniela(int partidos, int aciertos, String nombre, String apellido1, String apellido2, int numApuesta) {
        super(nombre, apellido1, apellido2, numApuesta);
        this.partidos = partidos;
        this.aciertos = aciertos;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public String[] getApuestaQuiniela() {
        return apuestaQuiniela;
    }

    public void setApuestaQuiniela(String[] apuestaQuiniela) {
        this.apuestaQuiniela = apuestaQuiniela;
    }

    public void crearApuestaQuiniela() {
        super.crearApuesta();
        Scanner sc = new Scanner(System.in);
        super.crearApuesta();
        for (int i = 0; i < this.getApuestaQuiniela().length; i++) {
            System.out.println("Introduce un número: ");
            String signo = sc.nextLine();
            while ((!signo.equals("1")) || (signo.equals("x"))||(!signo.equals("2"))) {
                System.out.println("Debe introducir 1, 2 o x");
                signo = sc.nextLine();
            }
            this.getApuestaQuiniela()[i] = signo;
        }

    }
    

}
