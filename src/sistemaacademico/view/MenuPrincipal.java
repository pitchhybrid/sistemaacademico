/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.view;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class MenuPrincipal extends JanelaHeranca {
    JPanel pan = new JPanel(new FlowLayout(FlowLayout.LEFT));
    public MenuPrincipal() {
    configurarComponentes();
    }
    
    private void configurarComponentes(){
        setSize(600,400);
        setVisible(true);
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        configurarMenu();
    }
    public void configurarMenu(){
        JMenu menu = new JMenu("Arquivo");
        JMenuItem item1 = new JMenuItem("tste");
        
        menu.add(item1);
        pan.add(menu);
        add(pan);
    }
    
    public static void main(String[] args) {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
    
}
