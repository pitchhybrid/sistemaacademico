
package sistemaacademico.controller;

import javax.swing.*;

public abstract class JanelaHeranca extends JFrame{
    
    
    public JanelaHeranca(){
        rootJanela();
    }
     
     private void rootJanela(){
     
         setTitle("root");
         setLocationRelativeTo(null);
         setResizable(false);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
}
