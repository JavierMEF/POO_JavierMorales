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
public class Maestro extends Persona {
   private String cedula;
   private String materia;

    public Maestro() {
        cedula = "";
        materia = "";
    }
    public Maestro(String nombre,int edad, double peso, boolean seguro, String cedula, String material){
        super(nombre,edad,peso,seguro);
        this.cedula="";
        this.materia="";
    
    }
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nPeso: "+getPeso()+"\nSeguro: "+getSeguro()+"\nCedula: "+
                getCedula()+"\nPlan Materia: "+getMateria());
    }
}
