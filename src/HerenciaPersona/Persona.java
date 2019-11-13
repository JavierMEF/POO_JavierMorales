/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaPersona;

/**
 *
 * @author fran_
 */
public class Persona{

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private int edad;
    private double peso;
    private boolean seguro;
    
    public Persona() {
        nombre=" ";
        edad = 25;
        peso = 68;
        seguro = true;
        
    }

    public Persona(String nombre, int edad, double peso, boolean seguro) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.seguro = seguro;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the seguro
     */
    public boolean getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }
    
}
