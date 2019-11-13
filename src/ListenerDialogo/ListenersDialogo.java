/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListenerDialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ListenersDialogo implements ActionListener{
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonV aux = (JButtonV) e.getSource();
       switch(aux.getText()){
           
           case "showMessageDialog":{
              JOptionPane.showMessageDialog(null, "Hello World");
           break;
           }
           case "showConfirmDialog":{
               JOptionPane.showConfirmDialog(null, "¿Está seguro?");
           break;
           }
           case "showOptionDialog":{
               
String[] options = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
           break;
           }
           case "showInputDialog":{
               String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);
           break;
           }
           case "=":{
          
           break;
           }
       
       
       }
    }

   
    
}