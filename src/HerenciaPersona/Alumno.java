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
public class Alumno extends Persona{
    private int boleta;
    private String planAcademico;
    
    public Alumno() {
        boleta = 0;
        planAcademico="";
    }
    public Alumno(String nombre, int edad, double peso, boolean seguro, int boleta, String planAcademico){
        super(nombre,edad,peso,seguro);
        this.boleta=0;
        this.planAcademico="";
    }
    
    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the planAcademico
     */
    public String getPlanAcademico() {
        return planAcademico;
    }

    /**
     * @param planAcademico the planAcademico to set
     */
    public void setPlanAcademico(String planAcademico) {
        this.planAcademico = planAcademico;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nEdad: "+getEdad()+"\nPeso: "+getPeso()+"\nSeguro: "+getSeguro()+"\nBoleta: "+
                getBoleta()+"\nPlan Academico: "+getPlanAcademico());
    }
}
