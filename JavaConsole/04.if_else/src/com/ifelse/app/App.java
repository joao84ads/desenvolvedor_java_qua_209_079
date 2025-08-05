package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // isntancia o objeto Scanner
        Scanner leia = new Scanner(System.in);
        
        // declaração de variaveis
        String nome;
        int idade;

        // input (entrada de dados)
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        // estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        }
        else {
            System.err.println(nome + " é menor de idade.");
        }



        //fechar objeto leia
        leia.close();
    }
}
