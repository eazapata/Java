
package p6e2;

public class NoMayus extends Exception {
    private String mensaje;

    public NoMayus(String mensaje, String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
        this.mensaje = mensaje;
    }

    public NoMayus() {
    }

   
    
    public void mostrarMensaje(){
        System.out.println("Tanto el nombre como los apellidos deben estar en mayúsculas");
    }
    
    
}
