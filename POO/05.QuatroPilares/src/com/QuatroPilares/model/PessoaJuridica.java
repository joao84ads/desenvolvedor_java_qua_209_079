package com.QuatroPilares.model;

final public class PessoaJuridica extends Pessoa {
    
    // Atributos
    
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    
    // Construtor

    public PessoaJuridica(String email, String telefone, String endereco, String razaoSocial, String nomeFantasia, String cnpj) {
        super(email, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
    
    // Getters e Setters

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
