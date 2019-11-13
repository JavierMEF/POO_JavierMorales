/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TecladoyColores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Alumno
 */
public class JButtonNum extends JButton{
   
    public JButtonNum(String etiqueta, Dimension dim, Color color){
    super(etiqueta);
     
        setMinimumSize(dim);
        Font aux = getFont();
        String fuente = aux.getFontName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo, 30);
        setFont(aux2);
        setBackground(color);
       
        
    }
    
}
