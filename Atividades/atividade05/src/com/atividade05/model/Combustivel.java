package com.atividade05.model;

public class Combustivel {
    private double gasolina;
    private double alcool;

    public Combustivel(double gasolina, double alcool) {
        this.gasolina = gasolina;
        this.alcool = alcool;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getAlcool() {
        return this.alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }
    
    public String VerificarMelhor() {
        if (this.alcool / this.gasolina < 0.7) {
            return "Abastecer com Alcool";
        } else {
            return "Abastecer com Gasolina";
        }
    }
}
