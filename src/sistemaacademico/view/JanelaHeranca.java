
package sistemaacademico.view;

import javax.swing.*;

public abstract class JanelaHeranca extends JFrame{
    
    
    public JanelaHeranca(){
        rootJanela();
        inicializarComponentes();
    }
    
    
     abstract void  inicializarComponentes();
     
     void rootJanela(){
     
         setTitle("root");
         setLocationRelativeTo(null);
         setResizable(false);
         //setSize(400, 400);
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     }
    
}
