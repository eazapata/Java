package p6e2;

import java.util.*;

public class Primitiva extends Apuesta {

    private int[] listaNum = new int[6];
    private int aciertos = 0;

    public Primitiva(String nombre, String apellido1, String apellido2, int numApuesta) {
        super(nombre, apellido1, apellido2, numApuesta);
    }

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
        System.out.println("Número primitiva: ");
        for (int i = 0; i < this.getListaNum().length; i++) {
            System.out.print(this.getListaNum()[i]);
        }
        System.out.println("Aciertos: " + this.getAciertos());

    }

    public void crearApuestaPrimitiva() {
        Scanner sc = new Scanner(System.in);
        super.crearApuesta();
        for (int i = 0; i < this.getListaNum().length; i++) {
            System.out.println("Introduce un número: ");
            int num = Integer.parseInt(sc.nextLine());
            while ((num < 1) || (num > 49)) {
                System.out.println("El número debe estar entre 1 y 49");
                num = Integer.parseInt(sc.nextLine());
            }
            this.getListaNum()[i] = num;
        }
    }
    public void simularPrimitiva(){
        int[] simulacionPrimitiva = new int[6];
        int dosAciertos;
        int cuatroAciertos;
        int seisAciertos;
        
        
        for(int i = 0; i < simulacionPrimitiva.length; i++){
            Random r = new Random();
            simulacionPrimitiva[i]=r.nextInt(49-1+1);
        }
        
        
        for( int i = 0; i < simulacionPrimitiva.length;i++){
            System.out.print(simulacionPrimitiva[i]);
        }
        
        
    }
    
}
