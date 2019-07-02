/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.controller;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class MenuPrincipal extends JanelaHeranca {
    
    JPanel pan = new JPanel(new FlowLayout(10,1,FlowLayout.LEFT));
    
    public MenuPrincipal() {
        
    configurarComponentes();
    configurarMenu();
    
    }
    
    private void configurarComponentes(){
        setSize(600,400);
        setVisible(true);
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    private void configurarMenu(){
        JMenuBar barra = new JMenuBar();
        JMenu cadastro = new JMenu("Cadastros");
              cadastro.add(new JMenuItem("Adicionar Aluno"));
              cadastro.add(new JMenuItem("Adicionar Professor"));
        JMenu consulta = new JMenu("Consultas");
        	  consulta.add(new JMenuItem("Consultar Aluno"));
        	  consulta.add(new JMenuItem("Consultar Professor"));
        JMenu processos = new JMenu("Processos");
              processos.add(new JMenuItem("Gerenciar Professor"));
              processos.add(new JMenuItem("Gerenciar Aluno"));
        JMenu relatorios = new JMenu("Relatorios");
        	  relatorios.add(new JMenuItem("Mostrar Dia"));
        	  
        barra.add(cadastro);
        barra.add(consulta);
        barra.add(processos);
        barra.add(relatorios);
        pan.add(barra);
        add(pan);
    }
    
    public static void main(String[] args) {
    	new MenuPrincipal();
    }
    
}
