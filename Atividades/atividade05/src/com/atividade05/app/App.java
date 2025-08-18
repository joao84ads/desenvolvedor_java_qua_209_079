package com.atividade05.app;

import javax.swing.JOptionPane;

import com.atividade05.model.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
       Combustivel combustivel = new Combustivel(0, 0);

        // Solicitando valor da gasolina e alcool
                    combustivel.setAlcool(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Etanol: ").replace(",", ".")));
                    combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da gasolina: ").replace(",", ".")));
        // Exibindo o melhor combustivel
        JOptionPane.showMessageDialog(null, combustivel.VerificarMelhor());

        
    }
}
