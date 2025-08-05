package com.ifelse_03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instacia a classe Scanner
        Scanner leia = new Scanner(System.in);
        
        // declaração de variáveis
        String nome;
        double nota;

        // input
        System.out.println("Informe o nome do aluno:");
        nome = leia.nextLine();
        System.out.println("Informe a nota do aluno:");
        nota = leia.nextDouble();

        // output
        if (nota >= 7 ) {
            System.out.println(nome + " está aprovado.");
        }
        else if (nota >= 5) {
            System.out.println(nome + " está de recuperação.");
        }
        else {
            System.out.println(nome + " está reprovado.");
        }



        // Fechar objeto leia
        leia.close();
    }
}
