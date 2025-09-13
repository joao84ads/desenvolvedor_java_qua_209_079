package com.crud.app.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pessoa implements Serializable {
    // atributos
    private static final long serialVersionUID = 1L;

    @Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.AUTO)
=======
    @GeneratedValue(strategy=GenerationType.AUTO)
>>>>>>> 057acfe (Atualização da aula 12/09/2025)
    private long idPessoa;
    private String nome;
    private String cpf;
    private String email;

    // construtor
<<<<<<< HEAD
    public Pessoa(long idPessoa, String nome, String cpf, String email) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    //  geters e seters 
=======
    public Pessoa() {
    }
    

    // getters e setters
>>>>>>> 057acfe (Atualização da aula 12/09/2025)
    public long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD


=======
>>>>>>> 057acfe (Atualização da aula 12/09/2025)
}
