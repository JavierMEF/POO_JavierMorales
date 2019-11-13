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
public class Principal {
    public static void main(String arg[]){
        Alumno a1= new Alumno("francisco", 20, 67.2, true,2018670171 , "Ing.");
        a1.mostrarDatos();
        Maestro m1=new Maestro("pedro", 38, 89.5, true, "p2131c2135", "Ingles");
        m1.mostrarDatos();
    }
}
