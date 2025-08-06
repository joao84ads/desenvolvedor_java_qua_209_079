package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        String nome;
        int opcao;
        double peso, altura, result;

        do {
            System.out.println("1 - Registrar novo usuario.");
            System.out.println("2 - Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();

            if (opcao == 1) {
                leia.nextLine();
                System.out.println("Informe o nome:");
                nome = leia.nextLine();
                System.out.println("Informe o seu peso:");
                peso = leia.nextDouble();
                System.out.println("Informe o altura:");
                altura = leia.nextDouble();

                // Calcular IMC
                result = peso / (altura * altura);

                // Verificar IMC
                if (result <= 16) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com magreza grave.");
                }
                if (result > 16 && result < 17) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com magreza moderada.");
                }
                if (result > 17.1 && result < 18.5) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com magreza leve.");
                }

                if (result > 18.51 && result < 25) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está saudavel");
                }

                if (result > 25.1 && result < 30) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com sobre peso");
                }

                if (result > 30.1 && result < 35) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com obesidade grau 1");
                }

                if (result > 35.1 && result < 40) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com obesidade grau 2");
                }

                if (result > 40.1) {
                    System.out.println(nome + " O seu IMC e de " + result + " é você está com obesidade grau 3");
                }

            }

        } while (opcao != 2);

        leia.close();
    }
}
