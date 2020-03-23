package pe6e2;

public class Mayus extends Exception {

    String error;

    public Mayus(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void mostarMensaje() {
        switch (this.getError()) {
            case "1":
                System.out.println("El nombre debe estar en mayúsculas.");
                break;
            case "2":
                System.out.println("El primer apellido debe estar en mayúsculas.");
                break;
            case "3":
                System.out.println("El segundo apellido debe estar en mayúsculas.");
                break;
            default:
                System.out.println("La informacióm aportada debe estar en maýusculas");
        }
    }
}
