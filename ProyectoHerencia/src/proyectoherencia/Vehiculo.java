/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoherencia;

/**
 *
 * @author eduwo
 */
public class Vehiculo {
    
    private String matricula,numBastidor;

    public Vehiculo(String matricula, String numBastidor) {
        this.matricula = matricula;
        this.numBastidor = numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }
    public void realizarPruebas(){
        Persona p1= new Persona();
        p1.nombre="pepe";
    }
    
    
}
