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
public class Professor extends Pessoa {
    
    private int matricula;
    private String departamento;
    private String disciplinas[];

    public Professor() {
    super();
    }

    public Professor(int matricula, String departamento, String[] disciplinas) {
        this();
        this.matricula = matricula;
        this.departamento = departamento;
        this.disciplinas = disciplinas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    
}
