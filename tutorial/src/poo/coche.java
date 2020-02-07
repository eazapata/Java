/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author eduwo
 */
public class coche {

    private int ruedas, largo, ancho, peso, motor, peso_final;
    private String color;
    private boolean asientos_cuero, climatizador;

    public coche() {
        ruedas = 4;
        largo = 800;
        ancho = 400;
        peso = 500;
        motor = 1600;
    }

    public String mostrarDatos() {

        return "La plataforma del vehiculo tiene " + ruedas + " ruedas. "
                + "mide " + largo / 1000 + " metros de largo, "
                + 400 + " cm de ancho, la plataforma pesa " + peso
                + " y el motor es de " + motor + "cm cubicos.";
    }

    public void establecerColor(String color_coche) {

        color = color_coche;
    }

    public String decirColor() {
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero) {
        if (asientos_cuero == "si"){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }
        
    }
    public String decir_asientos(){
        if (asientos_cuero == true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche no tiene asientos de cuero";
        }
    }
}
