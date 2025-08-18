package com.atividade04.model;

public class Pessoa {
    // Atributos
    private String nome;
    private double peso;
    private double altura;
    
    //Construtor    

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltur() {
        return this.altura;
    }

    public void setAltur(double altura) {
        this.altura = altura;
    }

    // Método para calcular IMC
    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }
    
    /*
     * public String diagnostico(double imc) {
     * return (imc <= 18.5) ? "Abaixo do peso" :
     * (imc < 25) ? "Peso normal" :
     * (imc < 30) ? "Sobrepeso" :                
     * (imc < 35) ? "Obesidade grau I" :
     * (imc < 40) ? "Obesidade grau II"
     * : "Obesidade grau III";
     * }
     */
            
    }


