package com.QuatroPilares.app;

import java.util.Scanner;

import com.QuatroPilares.model.PessoaFisica;
import com.QuatroPilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        
        // ESTANCIANDO classes

        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        //INPUT de dados do usuário

        System.out.println("Informe os dados do usuário:\n");
        System.out.println("Informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe o CPF");
        usuario.setCpf(leia.nextLine());
        System.out.println("Informe a data de nascimento:");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("Informe o email:");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        usuario.setEndereco(leia.nextLine());
        System.out.println("\nUsuário cadastrado com sucesso!\n");

        //INPUT de dados da empresa

        System.out.println("Informe os dados da empresa:\n");
        System.out.println("Informe a razão social:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("Informe o nome fantasia:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Informe o CNPJ:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Informe o email:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Informe o telefone:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Informe o endereço:");
        empresa.setEndereco(leia.nextLine());
        System.out.println("\nEmpresa cadastrada com sucesso!\n");

        //OUTPUT dos dados do usuário

        System.out.println("\n Informações do usuário: \n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());
        
        //OUTPUT dos dados da empresa

        System.out.println("\n Informações da empresa: \n");
        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("Nome Fantasia: " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail: " + empresa.getEmail());
        System.out.println("Telefone: " + empresa.getTelefone());
        System.out.println("Endereço: " + empresa.getEndereco());
        
        leia.close();
    }
}
