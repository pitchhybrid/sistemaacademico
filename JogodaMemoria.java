/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author aluno
 */
public class JogodaMemoria extends JFrame implements ActionListener{
      private final String TITULO = "Jogo da Memoria";
      private final int LARGURA = 600;
      private final int ALTURA = 600;
      JPanel pan;
      JButton btn;
      
      public JogodaMemoria(){
          configurar();
          inicializar();
      }
      
    @Override
      public void actionPerformed(ActionEvent ae) {
    }
      
      public void configurar() {
        setTitle(this.TITULO);
        setSize(this.LARGURA, this.ALTURA);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }
      private void inicializar() {
         pan = new JPanel();
        pan.setLayout(new GridLayout(6,6));
        for(int i=0;i<36;i++){
            btn = new JButton();
            btn.setName(String.format("%d", i));
            btn.addActionListener(this);
           pan.add(btn);
            
        }
        add(pan);
     

        
    }
      
    public static void main(String[] args) {
       JogodaMemoria app = new JogodaMemoria();
       app.setVisible(true);
       app.setTitle(app.TITULO);
    }

    
}
