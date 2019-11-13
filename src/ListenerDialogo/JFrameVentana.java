/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListenerDialogo;


import calculadora.Display;
import calculadora.JButtonC;
import calculadora.ListenersGrises;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JFrameVentana extends JFrame {

    public JFrameVentana() {
        inicializarComponentes();
        
    }

    private void inicializarComponentes() {
        // crear el componente para la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        // creamos los botones
        Dimension dim = new Dimension(30,30);
        JButtonV showMessageDialog = new JButtonV("showMessageDialog", dim, Color.yellow);
        JButtonV showConfirmDialog = new JButtonV("showConfirmDialog", dim, Color.yellow);
        JButtonV showOptionDialog = new JButtonV("showOptionDialog", dim, Color.GREEN);
        JButtonV showInputDialog = new JButtonV("showInputDialog", dim, Color.GRAY);
       
        panelCentral.add(showMessageDialog);
        panelCentral.add(showConfirmDialog);
        panelCentral.add(showOptionDialog);
        panelCentral.add(showInputDialog);
        
        setLayout(new BorderLayout());
        add(panelCentral,BorderLayout.CENTER);
        
        Display display = new Display();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(),auxF.getStyle(),50);
        display.setFont(nueva);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
      
        ListenersDialogo orejon2 = new ListenersDialogo();
        showMessageDialog.addActionListener(orejon2);
        showConfirmDialog.addActionListener(orejon2);
        showOptionDialog.addActionListener(orejon2);
        showInputDialog.addActionListener(orejon2);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
    
}