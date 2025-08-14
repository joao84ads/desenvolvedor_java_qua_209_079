package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        // estanciar as classes

        Conta usuario = new Conta(null, null, "001", "12345-6", 0);
        Scanner leia = new Scanner(System.in);

        // define os valores dos atributos
        System.out.println("Informe o nome do titular:");
        usuario.setTitular(leia.nextLine());
        System.out.println("Informe o CPF:");
        usuario.setCpf(leia.nextLine());
        // declaração de variavel
        int opcao;
        Double valor;

        do {
            //menu
            System.out.println("\nMenu:");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer saque");
            System.out.println("3 - Fazer depósito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    usuario.exibirDados();
                    break;
                case 2:
                    // System.out.print("Valor do saque: ");
                    // double saque = leia.nextDouble();
                    // if (usuario.sacar(saque)) {
                    //     System.out.println("Saque realizado com sucesso!");
                    // } else {
                    //     System.out.println("Saldo insuficiente ou valor inválido.");
                    // }
                    //tenario
                    System.out.println("Informe o valor do saque, em R$:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0 && valor <= usuario.getSaldo()) ? "Saque realizado com sucesso! Saldo: R$" + (usuario.getSaldo() - valor) : "Saldo insuficiente ou valor inválido.");
                    break;
                case 3:
                    // System.out.print("Valor do depósito: ");
                    // double deposito = leia.nextDouble();
                    // usuario.depositar(deposito);
                    // System.out.println("Depósito realizado com sucesso!");

                    System.out.println("Informe o valor do depósito, em R$:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito realizado com sucesso! Saldo: R$" + usuario.getdepositar(valor) : "Valor inválido para depósito.");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);




        leia.close();
    }   
} 

