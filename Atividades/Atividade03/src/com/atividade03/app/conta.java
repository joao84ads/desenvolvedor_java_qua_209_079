package com.atividade03.app;

public class Conta {
    public String titular;
    public String cpf;
    public String agencia = "0001";
    public String numeroConta = "12345-6";
    public double saldo = 0.0;

    public Conta(String titular, String cpf, String agencia, String numeroConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo: R$ " + String.format("%.2f", this.saldo));
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return saldo;
        } else {
            System.out.println("Valor inválido para depósito.");    
            return saldo;
                
        }
        }
    }

