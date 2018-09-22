/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estacio
 */
public class Janela extends JanelaHeranca implements ActionListener{


    public Janela(){
        super();
        inicializarComponentes();
    }

    @Override
    void inicializarComponentes() {
        //exercicio 1a
        final int L = 70;
        final int H = 30;
        final int Y1 = 20;
        final int Y2 = 20;
        final int Y3 = 20;

        final int X1 = 20;
        final int X2 = 20;
        final int X3 = 20;

        setLayout(null);
        setSize(250,400);
        add(new JTextField()).setBounds(0,0,400,80);
        add(new JButton("1")).setBounds(50,80,L,H);
        add(new JButton("2")).setBounds(50,50,L,H);
        add(new JButton("3")).setBounds(50,50,L,H);
        add(new JButton("4")).setBounds(50,50,L,H);
        add(new JButton("5")).setBounds(50,50,L,H);
        add(new JButton("6")).setBounds(50,50,L,H);
        add(new JButton("7")).setBounds(50,50,L,H);
        add(new JButton("8")).setBounds(50,50,L,H);
        add(new JButton("9")).setBounds(50,50,L,H);
        add(new JButton("0")).setBounds(50,50,L,H);
        add(new JButton(",")).setBounds(50,50,L,H);
        add(new JButton("+")).setBounds(50,50,L,H);
        add(new JButton("-")).setBounds(50,50,L,H);
        add(new JButton("*")).setBounds(50,50,L,H);
        add(new JButton("/")).setBounds(50,50,L,H);
        add(new JButton("=")).setBounds(50,50,L,H);
    }
    @Override
    public void actionPerformed(ActionEvent e){



    }
}
