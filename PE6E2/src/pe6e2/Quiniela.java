package pe6e2;

import java.util.*;

public class Quiniela extends Apuesta {

    private String[] partidos = new String[15];
    private int aciertos = 0;

    public Quiniela() {
        super();
    }

    public String[] getPartidos() {
        return partidos;
    }

    public void setPartidos(String[] partidos) {
        this.partidos = partidos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    @Override
    public void mostrarApuesta() {
        super.mostrarApuesta();
        System.out.println("Los números elegidos son: ");
        for (int i = 0; i < this.getPartidos().length; i++) {
            System.out.println(this.getPartidos()[i]);
        }
        System.out.println("Aciertos: " + this.getAciertos());
    }

    public void crearApuestaQuiniela() throws Mayus {
        Scanner sc = new Scanner(System.in);
        super.crearApuesta();
        //Este signo es el que introducirá el usuario
        for (int i = 0; i < this.getPartidos().length; i++) {
            System.out.println("Partido "+(i+1));
            String signo = sc.nextLine();
            while ((!signo.equals("1")) && (!signo.equals("2")) && (!signo.equalsIgnoreCase("x"))) {
                System.out.println("Los valores deben ser 1, 2 o X");
                signo = sc.nextLine();
            }
            this.getPartidos()[i] = signo;
        }
    }
}
