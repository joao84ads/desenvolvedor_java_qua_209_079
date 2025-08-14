package com.QuatroPilares.model;

final public class PessoaFisica extends Pessoa {
    
    // Atributos

    private String nome;
    private String dataNascimento;
    private String cpf;

    // Construtor

    public PessoaFisica(String email, String telefone, String endereco, String nome, String dataNascimento, String cpf) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }
    
    // Getters e Setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
