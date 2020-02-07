
package gestionarpersonas2;
import java.util.Scanner;


public class InfoNif {
    private String num_nif, direccion, padre, madre;

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public InfoNif(String num_nif, String padre, String madre) {
        this.num_nif = num_nif;
        this.padre = padre;
        this.madre = madre;
    }

    public InfoNif() {
    }
    

    public String getNum_nif() {
        return num_nif;
    }

    public String getPadre() {
        return padre;
    }

    public String getMadre() {
        return madre;
    }

    public void setNum_nif(String num_nif) {
        this.num_nif = num_nif;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }
    public void solicitarNif(){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introduce tu nif: ");
        this.setNum_nif(lector.nextLine());
        System.out.println("Introduce tu dirección: ");
        this.setDireccion(lector.nextLine());
        System.out.println("Introduce el nombre de tu padre: ");
        this.setPadre(lector.nextLine());
        System.out.println("Introduce el nombre de tu madre: ");
        this.setMadre(lector.nextLine());
    }
    public void mostrarNif(){
        System.out.println("Tu nif es: "+this.getNum_nif());
        System.out.println("Tu dirección es "+this.getDireccion());
        System.out.println("Tu padre es "+this.getPadre());
        System.out.println("Tu madre es: "+this.getMadre());
    }
}
