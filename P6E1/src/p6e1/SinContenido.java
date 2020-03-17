
package p6e1;


public class SinContenido extends Exception{
    private String mensaje;

   
    public SinContenido(String mensaje, String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
        this.mensaje = mensaje;
    }

    public SinContenido() {
    }
    

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public void mostrarMensaje(){
        System.out.println("No has introducido níngun valor.");
    }
    
    
}
