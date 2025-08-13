package com.polimorfismo.app;

final public class PessoaFisica extends Pessoa {
    //atributos
    public String nome;
    public String cpf;
    public String dataNascimento;
    //construtor
    public PessoaFisica(String nome, String cpf, String dataNascimento, String email, String telefone , String endereco) {
        super(email, telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + " , nasci no dia "
        + this.dataNascimento + ", meu CPF é " + this.cpf + ", moro no endereço " + this.endereco
        + ", meu telefone é " + this.telefone + " e meu email é " + this.email + ".";
    }

}
