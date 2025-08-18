package com.atividade04.app;

import javax.swing.JOptionPane;

import com.atividade04.model.Pessoa;

public class App {
    public static void main(String[] args) {
        // Declarando uma instância de Pessoa
        Pessoa pessoa = new Pessoa("", 0, 0);
        
        // Solicitando o nome da pessoa
        pessoa.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        // Menu de opções
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Olá " + pessoa.getNome() + "!\nEscolha uma opção:\n1 - Calcular IMC\n2 - Sair"
            ));
            // Switch para tratar as opções
            switch (opcao) {
                case 1:
                    // Solicitando peso e altura
                    pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ").replace(",", ".")));
                    pessoa.setAltur(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ").replace(",", ".")));
                    double imc = pessoa.calcularIMC();
                    String mensagem = String.format("Seu IMC é: %.2f\n", imc);
                    // Classificação do IMC
                    if (imc <= 18) {
                        mensagem += "Abaixo do peso";
                    } else if (imc < 25) {
                        mensagem += "Peso normal";
                    } else if (imc < 30) {
                        mensagem += "Sobrepeso";
                    } else if (imc < 35) {
                        mensagem += "Obesidade grau I";
                    } else if (imc < 40) {
                        mensagem += "Obesidade grau II";
                    } else {
                        mensagem += "Obesidade grau III";
                    }
                    //  Exibindo o resultado
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                case 2:
                    // Exibindo mensagem de saída
                    JOptionPane.showMessageDialog(null,
                     "Saindo...");
                    break;
                default:
                    // Exibindo mensagem de opção inválida
                    JOptionPane.showMessageDialog(null,
                     "Opção inválida!");
            } 
        } while (opcao != 2);
    }
}
