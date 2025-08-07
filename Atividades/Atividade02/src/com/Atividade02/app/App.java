package com.Atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Declaração de variáveis
        String nome, escolha;
        int idade;
        boolean autorizado = false;

        // inoput
        System.out.println("Informe o seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe a sua idade:");
        idade = leia.nextInt();
        // Limpeza de buffer
        leia.nextLine();

        //Loop
        
        do{
            System.out.println("-------CINE JAVA-------");
            System.out.println("Escolha uma sala:");
            System.out.println("Sala 1  - O Poderoso Chefão - 14 anos");
            System.out.println("Sala 2 - Toy Story - Livre");
            System.out.println("Sala 3 - 300 - 16 anos");
            System.out.println("Sala 4 - Dark Web: Cicada 3301 - 16 anos");
            System.out.println("Sala 5 - Eu, Robô - 10 anos");
            System.out.println("Sala 6 - Um Maluco no Golfe - 12 anos");
            escolha = leia.nextLine();

            // escolha caso
            switch (escolha) {
                case "1":
                    if (idade >= 14) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme O Poderoso Chefão.");
                        autorizado = true;
                        return;
                    }
                    break;
                case "2":
                    if (idade >= 0) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme Toy Story.");
                        autorizado = true;
                        return;
                    }
                    break;
                case "3":
                    if (idade >= 16) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme 300.");
                        autorizado = true;
                        return;
                    }
                    break;
                case "4":
                    if (idade >= 16) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme Dark Web: Cicada 3301.");
                        autorizado = true;
                        return;
                    }
                    break;
                case "5":
                    if (idade >= 10) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme Eu, Robô.");
                        autorizado = true;
                        return;
                    }
                    break;
                case "6":
                    if (idade >= 12) {
                        System.out.println(nome + " ,O Ingresso foi autorizado para o filme Um Maluco no Golfe.");
                        autorizado = true;
                        return;
                    }
                    break;

                default:
                    System.out.println("Opção invalida.");
            }
        if (!autorizado) {
            System.out.println("Você ainda não tem idade permitida. Tente novamente.");
        continue;
            
        }
        leia.close();
        }while (true);
    
    } 
    
}
    
