/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;
    private String dataNascimento;
    private boolean ativo;
    private List<Telefone> telefone = new ArrayList<Telefone>();
    private List<Endereco> endereco = new ArrayList<Endereco>();
    
    public Pessoa(){}

    public void addTelefone(Telefone telefone){
        this.telefone.add(telefone);
    }

    public void addEndereco(Endereco endereco){
        this.endereco.add(endereco);
    }

    public List<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<Telefone> telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
