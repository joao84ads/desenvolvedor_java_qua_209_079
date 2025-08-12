package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
           // instancia a classes
        Conta usuario = new Conta("", "", "0001", "12345-6", 0.0);
        Scanner leia =new Scanner(System.in);

        // define os valores dos atributos
        System.out.println("Informe o nome do titular:");
        usuario.titular = leia.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = leia.nextLine();
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
                    System.out.println((valor > 0 && valor <= usuario.saldo) ? "Saque realizado com sucesso! Saldo: R$" + (usuario.saldo - valor) : "Saldo insuficiente ou valor inválido.");
                    break;
                case 3:
                    // System.out.print("Valor do depósito: ");
                    // double deposito = leia.nextDouble();
                    // usuario.depositar(deposito);
                    // System.out.println("Depósito realizado com sucesso!");

                    System.out.println("Informe o valor do depósito, em R$:");
                    valor = leia.nextDouble();
                    System.out.println((valor > 0) ? "Depósito realizado com sucesso! Saldo: R$" + usuario.depositar(valor) : "Valor inválido para depósito.");
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
        //  *Crie um programa com uma classe chamada conta, com os 
        //  * seguintes atributos:
        //  * - Titular da conta
        //  * - CPF do Titular
        //  * - Agência
        //  * - Número da conta
        //  * - Saldo
        //  * O usúario deverá informar o nome do titular e o cpf, e 
        //  * o programa exibe um meno com as seguintes operações:
        //  * - exibir dados da conta
        //  * - fazer saque
        //  * - fazer depósito
        //  * - sair do programa
