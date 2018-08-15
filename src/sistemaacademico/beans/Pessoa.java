/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico.beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    public String nome;
    public String cpf;
    public char sexo;
    public String dataNascimento;
    public boolean ativo;
    public List<Telefone> telefones;
    public List<Endereco> enderecos;
    
    public Pessoa(){
    ArrayList<Telefone> telefones = new ArrayList<Telefone>();
    ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones.add((Telefone) telefones);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos.add((Endereco) enderecos);
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

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", sexo=" + sexo +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", ativo=" + ativo +
                ", telefones=" + telefones +
                ", enderecos=" + enderecos +
                '}';
    }
}
