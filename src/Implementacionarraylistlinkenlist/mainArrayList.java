/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacionarraylistlinkenlist;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author fran_
 */
public class mainArrayList {
    public static void main(String arg[]){
          List<Persona> ip= new ArrayList<Persona>();
          List<Persona> listalinked = new LinkedList<Persona>();
          Random r= new Random();
          Persona temp=null;
          long antes;
          int sumaraltura=0;
          for(int i=0;i<1000;i++){
              ip.add(new Persona(i,"Persona"+i,r.nextInt(100)+100));
          }
          Iterator<Persona> it=ip.iterator();
          while(it.hasNext()){
              temp=it.next();
              System.out.println(temp);
              sumaraltura +=temp.getAltura();
          }
          System.out.println("lama media del conjunto de personas es:"+sumaraltura/ip.size());
          System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");
            antes = System.nanoTime();
            ip.add(0,new Persona(10001,"Prueba",10001)); // Inserción en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes); 
            System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");
            antes = System.nanoTime();
            listalinked.add(0,new Persona(10001,"Prueba",10001));  // Inserción en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes);
    }
}
