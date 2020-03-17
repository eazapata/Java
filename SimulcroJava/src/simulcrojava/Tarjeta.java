
package simulcrojava;


public class Tarjeta {
    private String nif;
    private String pin;
    private String nombre;
    private String apellido;

    public Tarjeta() {
    }

    public Tarjeta(String nif, String pin, String nombre, String apellido) {
        this.nif = nif;
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Tarjeta(Tarjeta t1) {
        this.nif = t1.nif;
        this.pin = t1.pin;
        this.nombre = t1.nombre;
        this.apellido = t1.apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void mostrarTarjeta(){
        System.out.println("");
        System.out.println("Nif: "+getNif());
        System.out.println("Pin: "+getPin());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
    }
    
    
}
