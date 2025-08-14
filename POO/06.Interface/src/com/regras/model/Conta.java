package com.regras.model;

import com.regras.interfaces.IConta;

public class Conta implements IConta {
    // Atributos

    private String titular;
    private String cpf;
    private String agencia;
    private String nConta;
    private double saldo;

    // Constructor

    public Conta(String titular, String cpf, String agencia, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }

    // getters e setters

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome do Titular: " + this.titular);
        System.out.println("CPF do Titular: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.nConta);
        System.out.println("Saldo da Conta: " + String.format("%.2f", this.saldo));
    }

    @Override
    public double fazerDeposito(double valor) {
            this.saldo += valor;
            return this.saldo;
    }

    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public double getdepositar(Double valor) {
        this.saldo += valor;
        return this.saldo;
    }

}