package com.array.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in); 
        
        //declaração de arrays
        String[] nomes = new String[10];

        for(int i = 0; i < nomes.length; i++ ){
            System.out.println("Informe o " + (i + 1) + "º nome:");
            nomes[i] = leia.nextLine();
        }
        System.out.println("Lista de Nomes:");
        for(String nome : nomes) {
            System.out.println(nome);
        }


        leia.close();
    }
}
