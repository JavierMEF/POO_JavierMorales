/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacionarraylistlinkenlist;

/**
 *
 * @author fran_
 */
public class Persona {
   private int id;
   private String nombre;
   private int altura;

    public Persona(int id, String nombre, int altura) {
        this.id = id;
        this.nombre = nombre;
        this.altura = altura;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the alura
     */
    public int getAlura() {
        return altura;
    }

    /**
     * @param alura the alura to set
     */
    public void setAlura(int alura) {
        this.altura = alura;
    }
   public int getAltura(){
       return altura;
   }
   @Override
   public String toString(){
       return "Persona-> ID:"+id+" Nombre:"+nombre+" Altura:"+altura;
   }
}
