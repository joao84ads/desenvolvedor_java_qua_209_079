package model;

import com.atividade06.interfaces.IDados;

public class Veiculo implements IDados {
    private String marca;
    private String modelo;
    private String placa;
    private String ano;
    private String cor;
    private Usuario proprietario;
    

    public Veiculo(String marca, String modelo, String placa, String ano, String cor, Usuario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.proprietario = proprietario;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Usuario getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Usuario proprietario) {
        this.proprietario = proprietario;
    }

    
    
    
    
    @Override
    public String exibirDados() {
        return "Marca do veiculo: " + this.marca + "\n" +
               "Modelo do veiculo: " + this.modelo + "\n" +
               "Placa do veiculo: " + this.placa + "\n" +
               "Ano do veiculo: " + this.ano + "\n" +
               "Cordo veiculo: " + this.cor + "\n" +
               "Nome do proprietário do veiculo: " + this.proprietario.getNome()+ "\n" +
                "CPF do proprietário do veiculo: " + this.proprietario.getCpf() + "\n" +
                "Data de nascimento do proprietário do veiculo: " + this.proprietario.getDataNascimento() + "\n" +
                "Telefone do proprietário do veiculo: " + this.proprietario.getTelefone() + "\n" +
                "Email do proprietário do veiculo: " + this.proprietario.getEmail() + "\n" +
                "Endereço do proprietário do veiculo: " + this.proprietario.getEndereco() + "\n"
               ;
    }
        


    

}
