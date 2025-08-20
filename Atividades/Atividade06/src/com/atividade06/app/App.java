package com.atividade06.app;

import javax.swing.JOptionPane;

import model.Usuario;
import model.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario(
            null,
             null,
              null, 
              null,
               null,
                null);
        Veiculo veiculo = new Veiculo(null, null, null, null, null, null);

        // String[] opcoes = {

        // }
        //Input de dados do usuário
        usuario.setNome(JOptionPane.showInputDialog("Digite o nome do Proprietario do veiculo:"));
        usuario.setCpf(JOptionPane.showInputDialog("Digite o CPF do Proprietario do veiculo:"));
        usuario.setDataNascimento(JOptionPane.showInputDialog("Digite a data de nascimento do Proprietario do veiculo:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Digite o Telefone do Proprietario do veiculo:"));
        usuario.setEmail(JOptionPane.showInputDialog("Digite o E-mail do Proprietario do veiculo:"));
        usuario.setEndereco(JOptionPane.showInputDialog("Digite o Endereço do Proprietario do veiculo:"));
        //Input de dados do veiculo
        veiculo.setMarca(JOptionPane.showInputDialog("Digite a Marca do veiculo:"));
        veiculo.setModelo(JOptionPane.showInputDialog("Digite o Modelo do veiculo:"));
        veiculo.setPlaca(JOptionPane.showInputDialog("Digite a Placa do veiculo:"));
        veiculo.setAno(JOptionPane.showInputDialog("Digite o Ano do veiculo:"));
        veiculo.setCor(JOptionPane.showInputDialog("Digite o Cor do veiculo:"));
        veiculo.setProprietario(usuario);
        //Exibir dados do veiculo
        JOptionPane.showMessageDialog(
        null,
         veiculo.exibirDados(),
          "Dados do veiculo",
            JOptionPane.INFORMATION_MESSAGE
        );   
    }
}
