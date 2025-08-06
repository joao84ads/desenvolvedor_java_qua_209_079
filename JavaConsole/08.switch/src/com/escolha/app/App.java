package com.escolha.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        int x, y;
        double result;
        String operacao;

        // input
        System.out.println("Informe o valor de x:");
        x = leia.nextInt();
        System.out.println("Informe o valor de y:");
        y = leia.nextInt();

        // Limpeza de buffer
        leia.nextLine();

        // menu
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar.");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("Operação desejada:");
        operacao = leia.nextLine();

        // Escolha caso
        switch (operacao) {
            case "1":
                result = x + y;
                System.out.println("O Resultado da soma é:" + result);
                break;

            case "2":
                result = x - y;
                System.out.println("O Resultado da subtração é:" + result);
                break;

            case "3":
                result = x * y;
                System.out.println("O Resultado da multiplicação é:" + result);
                break;

            case "4":
                result = x / y;
                System.out.println("O Resultado da divisão é:" + result);
                break;
            default:
                System.out.println("Operador inválido.");
        }

        leia.close();
    }
}
