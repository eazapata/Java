package pe6e2;

import java.util.*;

public class Primitiva extends Apuesta {

    private int listaNum[] = new int[6];
    private int aciertos = 0;

    public Primitiva() {
        super();
    }

    public int[] getListaNum() {
        return listaNum;
    }

    public void setListaNum(int[] listaNum) {
        this.listaNum = listaNum;
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
        for (int i = 0; i < this.getListaNum().length; i++) {
            System.out.println(this.getListaNum()[i]);
        }
        System.out.println("Aciertos: " + this.getAciertos());
    }

    public void crearApuestaPrimitiva() throws Mayus{
        Scanner sc = new Scanner(System.in);
        super.crearApuesta();
        System.out.println("Introduce los 6 números.");
        for (int i = 0; i < this.getListaNum().length; i++) {
            int num = Integer.parseInt(sc.nextLine());
            while ((num < 1) || (num > 49)) {
                System.out.println("El número debe estar entre 1 y 49. Vuelva a introducirlo.");
                num = Integer.parseInt(sc.nextLine());
            }
            this.getListaNum()[i]=num;
        }
    }
   

}
