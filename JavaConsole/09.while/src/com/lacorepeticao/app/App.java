package com.lacorepeticao.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Estanciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variável
        int n;

        // input
        System.out.println("Informe um número inteiro:");
        n = leia.nextInt();

        // enquanto
        while (n>= 0) {
            System.out.println(n);
            n--;   
        }
        // Fechar objeto leia
        leia.close();

    }
}
