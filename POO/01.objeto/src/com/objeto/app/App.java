package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classes
        Scanner leia = new Scanner(System.in);
        // Pessoa usuario = new Pessoa("", 0 , 0.0);
        Pessoa usuario = new Pessoa();
        // define os valores dos atributos
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();
        System.out.println("Informe a altura em metros:");
        usuario.altura = leia.nextDouble();

        // output
       System.err.println(usuario.cumprimentar());
        //usuario.exibirDados();

       leia.close();

    }
}
