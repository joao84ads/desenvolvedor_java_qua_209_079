package com.ifelse_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia a classe Scanner
        Scanner leia = new Scanner(System.in);
        
        // Declaração de variáveis
        String nome;
        int idade;
        double altura; 

        // input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe seu idade:");
        idade = leia.nextInt();
        System.out.println("Informe seu altura:");
        altura = leia.nextDouble();

        // Estrutura de decisão
        if (idade >= 12 && altura >= 1.15) {
            System.out.println(nome + " esta autorizado.");
        }
        else {
            System.out.println(nome + "não está autorizado.");
        }
        
        // Fechar objeto leia
        leia.close();
    }
}
