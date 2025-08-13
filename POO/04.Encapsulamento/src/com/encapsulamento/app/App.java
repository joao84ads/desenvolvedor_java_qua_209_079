package com.encapsulamento.app;
 
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar um objeto da classe Pessoa
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();
        
        // inputs
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe a idade:");
        usuario.setIdade(leia.nextInt());

        // outputs
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

        // Encerrando o scanner
        leia.close();
    }
}
