package simulcrojava;

import java.util.*;

public class CajeroAutomatico {

    private static int ultimaIdCajero = 1;
    private int idCajero;
    private int[][] cargaBilletes = {{500, 10}, {200, 0}, {100, 0}, {50, 27}, {20, 0}, {10, 18}, {5, 25}};
    private ArrayList<Tarjeta> listaTarjetas = new ArrayList();

    public CajeroAutomatico() {
        this.idCajero = ultimaIdCajero++;
    }

    public CajeroAutomatico(int idCajero) {
        this.idCajero = ultimaIdCajero++;

    }

    public CajeroAutomatico(CajeroAutomatico c1) {
        this.idCajero = c1.ultimaIdCajero++;

    }

    public static int getUltimaIdCajero() {
        return ultimaIdCajero;
    }

    public static void setUltimaIdCajero(int ultimaIdCajero) {
        CajeroAutomatico.ultimaIdCajero = ultimaIdCajero;
    }

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }

    public int[][] getCargaBilletes() {
        return cargaBilletes;
    }

    public void setCargaBilletes(int[][] cargaBilletes) {
        this.cargaBilletes = cargaBilletes;
    }

    public void mostarCajero() {
        System.out.println(getIdCajero());
    }

    public void mostrarBilletes() {
        for (int i = 0; i < getCargaBilletes().length; i++) {
            System.out.println(getCargaBilletes()[i][1] + " billetes de " + getCargaBilletes()[i][0]);

        }
    }

    public ArrayList<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }

    public void setListaTarjetas(ArrayList<Tarjeta> listaTarjetas) {
        this.listaTarjetas = listaTarjetas;
    }

    public Tarjeta buscarTarjeta(ArrayList<Tarjeta> listaTarjetas) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean nifEncontrado = false;
        boolean pinConfirmado = false;
        System.out.println("Introduce tu NIF: ");
        String nif = sc.nextLine();
        
        while ((i < this.getListaTarjetas().size()) && (!nifEncontrado)) {
            if (nif.equals(listaTarjetas.get(i).getNif())) {
                nifEncontrado = true;
                System.out.println("Introduce tu pin: ");
                String pin = sc.nextLine();
                while (!pinConfirmado) {
                    if (pin.equals(listaTarjetas.get(i).getPin())) {
                        pinConfirmado = true;
                        System.out.println("Usuario identificado correctamente.");
                        return listaTarjetas.get(i);
                    } else {
                        System.out.println("Pin erroneo vuelve a intentarlo");
                        pin = sc.nextLine();
                    }
                }
            } else {
                i++;
            }
        }
        if (!nifEncontrado) {
            System.out.println("Tarjeta no encontrada");
        }

        return null;
    }

    public void sacarDinero() throws ExcepcionCajero {

        TarjetaDebito td1 = new TarjetaDebito(200000, "22a", "2103", "juan", "mora");
        TarjetaCredito tc1 = new TarjetaCredito(202000, 1500, "22b", "2103", "Toni", "l");
        listaTarjetas.add(td1);
        listaTarjetas.add(tc1);
        Tarjeta tarjeta = buscarTarjeta(this.getListaTarjetas());
        disminuirSaldoDisponible(tarjeta);

    }

    public void disminuirSaldoDisponible(Tarjeta tarjeta) throws ExcepcionCajero {
        Scanner sc = new Scanner(System.in);
        if (tarjeta != null) {
            System.out.println("Indica el dinero a sacar.");
            int cantidad = Integer.parseInt(sc.nextLine());
            if (tarjeta instanceof TarjetaDebito) {

                if (cantidad > ((TarjetaDebito) tarjeta).getSaldo()) {
                    System.out.println("No dispones de saldo suficiente");
                } else {
                    if (disminuirSaldoCajero(cantidad, this.getCargaBilletes())) {
                        ((TarjetaDebito) tarjeta).setSaldo(((TarjetaDebito) tarjeta).getSaldo() - cantidad);
                        System.out.println(((TarjetaDebito) tarjeta).getSaldo());
                        ((TarjetaDebito) tarjeta).mostrarTarjeta();
                    } else {
                        throw new ExcepcionCajero(cantidad);
                    }
                }
            } else {
                if (cantidad > ((TarjetaCredito) tarjeta).getSaldo() + ((TarjetaCredito) tarjeta).getCredito()) {
                    System.out.println("No dispones de la cantidad necesaria");
                } else {
                    if (disminuirSaldoCajero(cantidad, this.getCargaBilletes())) {
                        ((TarjetaCredito) tarjeta).setSaldo(((TarjetaCredito) tarjeta).getSaldo() - cantidad);
                        if (((TarjetaCredito) tarjeta).getSaldo() < 0) {
                            
                            ((TarjetaCredito) tarjeta).setCredito(((TarjetaCredito) tarjeta).getCredito() + ((TarjetaCredito) tarjeta).getSaldo());
                            
                            ((TarjetaCredito) tarjeta).setSaldo(0);
                            System.out.println(((TarjetaCredito) tarjeta).getSaldo());
                            System.out.println(((TarjetaCredito) tarjeta).getCredito());
                            ((TarjetaCredito) tarjeta).mostrarTarjeta();
                        }

                    } else {
                        throw new ExcepcionCajero(cantidad);
                    }

                }

            }

        }

    }

    public boolean disminuirSaldoCajero(int cantidad, int[][] cargaBilletes) {

        if ((cantidad % 500 == 0) && (cantidad / 500 <= this.getCargaBilletes()[0][1])) {
            cargaBilletes[0][1] = cargaBilletes[0][1] - (cantidad / 500);
            mostrarBilletes();
            return true;

        } else if ((cantidad % 50 == 0) && (cantidad / 50 <= cargaBilletes[3][1])) {

            cargaBilletes[3][1] = cargaBilletes[3][1] - (cantidad / 50);
            mostrarBilletes();
            return true;

        } else if ((cantidad % 10 == 0) && (cantidad / 10 <= cargaBilletes[5][1])) {
            cargaBilletes[5][1] = cargaBilletes[5][1] - (cantidad / 10);
            mostrarBilletes();
            return true;

        } else if ((cantidad % 5 == 0) && (cantidad / 5 <= cargaBilletes[6][1])) {

            cargaBilletes[6][1] = cargaBilletes[6][1] - (cantidad / 5);
            mostrarBilletes();
            return true;
        } else {
            return false;
        }
    }
}
