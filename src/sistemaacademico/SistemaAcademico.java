/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.awt.FlowLayout;
import javax.swing.*;
import sistemaacademico.beans.*;
import sistemaacademico.view.*;

/**
 *
 * @author aluno
 */
public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bem-Vindo baitola");
        
        MostrarAluno(1,"jose","123.456.789-00",'M',true, new Telefone(1,"085","8888-8888"));
        MostrarAluno(2,"Maria","987.789.123-00",'F',true, new Telefone(1,"085","8888-9999"));
        MostrarProfessor(1,"Cicrano","456.789.123-12",'M',true, new Telefone(1,"085","7777-8888"));
        MostrarProfessor(2,"Fulana","456.123.789-78",'F',true, new Telefone(1,"085","8765-9999"));
      /* Janela janela = new Janela();
       janela.setVisible(true);
       janela.setTitle("janela");
       janela.setSize(400,200);
       
       //exercicio 1a
       janela.setLayout(new FlowLayout(FlowLayout.LEFT, 10,10));
       janela.add(new JLabel("Nome Completo:"));
       janela.add(new JTextField(15));
       janela.add(new JButton("Salvar"));
       
       //Exercicio 1B
       JButton botao     = new JButton("Salvar");
       JButton botao2    = new JButton("Cancelar");
       JLabel txt1       = new JLabel("Nome Completo:");
       JLabel txt2       = new JLabel("E-mail:");
       JTextField campo1 = new JTextField(); 
       JTextField campo2 = new JTextField();
       
       botao. setBounds(10,20,10,20);
       botao2.setBounds(20,60,10,20);
       txt1.  setBounds(10,20,15,40);
       txt2.  setBounds(10,40,15,50);
       campo1.setBounds(10,60,15,40);
       campo2.setBounds(10,40,15,40);
       
       
       janela.getContentPane().add(botao);
       janela.getContentPane().add(botao2);
       janela.getContentPane().add(txt1);
       janela.getContentPane().add(txt2);
       janela.getContentPane().add(campo1);
       janela.getContentPane().add(campo2);
    */
    }
    
    
    
    public static void MostrarAluno(int matricula,String nome,String cpf,char sexo,boolean ativo,Telefone telefone){

        Aluno aluno = new Aluno();
        aluno.setMatricula(matricula);
        aluno.setNome(nome);
        aluno.setCpf(cpf);
        aluno.setSexo(sexo);
        aluno.setAtivo(ativo);
        aluno.addTelefone(telefone);
        ExecutarConsole(aluno);


    }

    public static void MostrarProfessor(int matricula,String nome,String cpf,char sexo,boolean ativo,Telefone telefone){

        Professor prof = new Professor();
        prof.setMatricula(matricula);
        prof.setNome(nome);
        prof.setCpf(cpf);
        prof.setSexo(sexo);
        prof.setAtivo(ativo);
        prof.addTelefone(telefone);
        ExecutarConsole(prof);

    }

    private static void ExecutarConsole(Pessoa pessoa) {

        System.out.println(pessoa);


    }
   
     
    
}
