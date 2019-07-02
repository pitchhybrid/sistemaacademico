/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.model;

/**
 *
 * @author aluno
 */
public class Aluno extends Pessoa{
    
    private int matricula;
    private String cursos[];

    public Aluno() {
    }

    public Aluno(int matricula, String[] cursos) {
        this.matricula = matricula;
        this.cursos = cursos;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }
    
    
}
