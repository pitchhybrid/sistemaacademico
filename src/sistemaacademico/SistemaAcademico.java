/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import sistemaacademico.beans.*;

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
        
        MostrarAluno();
        MostrarProfessor();
        
    }
    
    
    
    public static void MostrarAluno(){

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(123);
        aluno1.setNome("jose");
        aluno1.setCpf("123.456.789-00");
        aluno1.setSexo('M');
        aluno1.setAtivo(true);

        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(456);
        aluno2.setNome("maria");
        aluno2.setCpf("789.456.321-00");
        aluno2.setSexo('F');
        aluno2.setAtivo(true);

        ExecutarConsole(aluno1);
        ExecutarConsole(aluno2);

    }

    public static void MostrarProfessor(){

        Professor prof1 = new Professor();
        prof1.setMatricula(123);
        prof1.setNome("jose");
        prof1.setCpf("123.456.789-00");
        prof1.setSexo('M');
        prof1.setAtivo(true);

        Professor prof2 = new Professor();
        prof2.setMatricula(456);
        prof2.setNome("maria");
        prof2.setCpf("789.456.321-00");
        prof2.setSexo('F');
        prof2.setAtivo(true);

        ExecutarConsole(prof1);
        ExecutarConsole(prof2);

    }

    private static void ExecutarConsole(Pessoa pessoa) {

        System.out.println(pessoa);


    }
   
     
    
}
