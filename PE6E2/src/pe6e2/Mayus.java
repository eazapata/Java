package pe6e2;


public class Mayus extends Exception{
    String mensaje;

    public Mayus() {
    super();
    }

    public Mayus(String mensaje, String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
        this.mensaje = mensaje;
    }
    
    public void mostarMensaje(){
        System.out.println("La información introducida no está en mayúsculas.");
    }
    
    
}
