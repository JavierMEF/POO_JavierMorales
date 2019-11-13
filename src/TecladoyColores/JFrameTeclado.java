/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoyColores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class JFrameTeclado extends JFrame{
    public JFrameTeclado(){
        inicializarComponentes();
        ListenerNum as=new ListenerNum();
        
        
        
    }

    private void inicializarComponentes() {
        
        JPanel panelTeclado = new JPanel(new GridLayout(10,4));
        
        Dimension dim = new Dimension(10,10);
        JButtonNum uno = new JButtonNum("1", dim, Color.CYAN);
        JButtonNum dos= new JButtonNum("2", dim, Color.CYAN);
        JButtonNum tres = new JButtonNum("3", dim, Color.CYAN);
        JButtonNum cuatro = new JButtonNum("4", dim, Color.CYAN);
        JButtonNum cinco = new JButtonNum("5", dim, Color.CYAN);
        JButtonNum seis = new JButtonNum("6", dim, Color.CYAN);
        JButtonNum siete = new JButtonNum("7", dim, Color.CYAN);
        JButtonNum ocho = new JButtonNum("8", dim, Color.CYAN);
        JButtonNum nueve = new JButtonNum("9", dim, Color.CYAN);
        JButtonNum cero = new JButtonNum("0", dim, Color.CYAN);
        JButtonNum a = new JButtonNum("A", dim, Color.CYAN);
        JButtonNum b = new JButtonNum("B", dim, Color.CYAN);
        JButtonNum c = new JButtonNum("C", dim, Color.CYAN);
        JButtonNum d = new JButtonNum("D", dim, Color.CYAN);
        JButtonNum e = new JButtonNum("E", dim, Color.CYAN);
        JButtonNum f = new JButtonNum("F", dim, Color.CYAN);
        JButtonNum g = new JButtonNum("G", dim, Color.CYAN);
        JButtonNum h = new JButtonNum("H", dim, Color.CYAN);
        JButtonNum i = new JButtonNum("I", dim, Color.CYAN);
        JButtonNum j = new JButtonNum("J", dim, Color.CYAN);
        JButtonNum k = new JButtonNum("K", dim, Color.CYAN);
        JButtonNum l = new JButtonNum("L", dim, Color.CYAN);
        JButtonNum m = new JButtonNum("M", dim, Color.CYAN);
        JButtonNum n = new JButtonNum("N", dim, Color.CYAN);
        JButtonNum ñ = new JButtonNum("Ñ", dim, Color.CYAN);
        JButtonNum o = new JButtonNum("O", dim, Color.CYAN);
        JButtonNum p = new JButtonNum("P", dim, Color.CYAN);
        JButtonNum q = new JButtonNum("Q", dim, Color.CYAN);
        JButtonNum r = new JButtonNum("R", dim, Color.CYAN);
        JButtonNum s = new JButtonNum("S", dim, Color.CYAN);
        JButtonNum t = new JButtonNum("T", dim, Color.CYAN);
        JButtonNum u = new JButtonNum("U", dim, Color.CYAN);
        JButtonNum v = new JButtonNum("V", dim, Color.CYAN);
        JButtonNum w = new JButtonNum("W", dim, Color.CYAN);
        JButtonNum x = new JButtonNum("X", dim, Color.CYAN);
        JButtonNum y = new JButtonNum("Y", dim, Color.CYAN);
        JButtonNum z = new JButtonNum("Z", dim, Color.CYAN);
        JButtonNum arriba = new JButtonNum("ARRIBA", dim, Color.CYAN);
        JButtonNum abajo = new JButtonNum("ABAJO", dim, Color.CYAN);
        JButtonNum izq = new JButtonNum("<-", dim, Color.CYAN);
        JButtonNum der = new JButtonNum("->", dim, Color.CYAN);
        
        
        panelTeclado.add(uno);
        panelTeclado.add(dos);
        panelTeclado.add(tres);
        panelTeclado.add(cuatro);
        panelTeclado.add(cinco);
        panelTeclado.add(seis);
        panelTeclado.add(siete);
        panelTeclado.add(ocho);
        panelTeclado.add(nueve);
        panelTeclado.add(cero);
        panelTeclado.add(a);
        panelTeclado.add(b);
        panelTeclado.add(c);
        panelTeclado.add(d);
        panelTeclado.add(e);
        panelTeclado.add(f);
        panelTeclado.add(g);
        panelTeclado.add(h);
        panelTeclado.add(i);
        panelTeclado.add(j);
        panelTeclado.add(k);
        panelTeclado.add(l);
        panelTeclado.add(m);
        panelTeclado.add(n);
        panelTeclado.add(ñ);
        panelTeclado.add(o);
        panelTeclado.add(p);
        panelTeclado.add(q);
        panelTeclado.add(r);
        panelTeclado.add(s);
        panelTeclado.add(t);
        panelTeclado.add(u);
        panelTeclado.add(v);
        panelTeclado.add(w);
        panelTeclado.add(x);
        panelTeclado.add(y);
        panelTeclado.add(z);
        panelTeclado.add(arriba);
        panelTeclado.add(abajo);
        panelTeclado.add(izq);
        panelTeclado.add(der);
        setLayout(new BorderLayout());
        add(panelTeclado,BorderLayout.CENTER);     
        
        
        
        
    }
    
}
