package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciando uma classe
        PessoaFisica usuario = new PessoaFisica();
        Scanner leia = new Scanner(System.in);
        PessoaJuridica empresa = new PessoaJuridica();
        
        // definindo valores dos atributos do usuário
        System.out.println("Digite o nome do usuário:");
        usuario.nome = leia.nextLine();
        System.out.println("Digite o CPF do usuário:"); 
        usuario.cpf = leia.nextLine();
        System.out.println("Digite o telefone do usuário:");
        usuario.telefone = leia.nextLine();
        System.out.println("Digite o email do usuário:");
        usuario.email = leia.nextLine();
        System.out.println("Digite o endereço do usuário:");
        usuario.endereco = leia.nextLine();

        // definindo valores dos atributos da empresa
        System.out.println("Digite a razão social da empresa:");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Digite o nome fantasia da empresa:");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Digite o CNPJ da empresa:");
        empresa.cnpj = leia.nextLine();
        System.out.println("Digite o e-mail da empresa:");
        empresa.email = leia.nextLine();
        System.out.println("Digite o telefone da empresa:");
        empresa.telefone = leia.nextLine();
        System.out.println("Digite o endereço da empresa:");
        empresa.endereco = leia.nextLine();

        // Output 
        System.out.println("Nome do Usuário: " + usuario.nome);
        System.out.println("CPF do Usuário: " + usuario.cpf);
        System.out.println("Telefone do Usuário: " + usuario.telefone);
        System.out.println("Email do Usuário: " + usuario.email);
        System.out.println("Endereço do Usuário: " + usuario.endereco);
        System.out.println("Razão Social da Empresa: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia da Empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da Empresa: " + empresa.cnpj);
        System.out.println("E-mail da Empresa: " + empresa.email);
        System.out.println("Telefone da Empresa: " + empresa.telefone);
        System.out.println("Endereço da Empresa: " + empresa.endereco);

        


        // definindo valores para os atributos
        // usuario.nome = "João Pedro";
        // usuario.cpf = "123.456.789-00";
        // usuario.telefone = "(61) 92345-6789";
        // usuario.email = "usuario@gmail.com";
        // usuario.endereco = "Rua Exemplo, 123";
        
        // chamando o método cumprimentar
        // usuario.cumprimentar();
    
        // // exibindo os atributos
        // System.out.println("Nome: " + usuario.nome);
        // System.out.println("CPF: " + usuario.cpf);
        // System.out.println("Telefone: " + usuario.telefone);
        // System.out.println("Email: " + usuario.email);
        // System.out.println("Endereço: " + usuario.endereco);

        leia.close();
    }
}
