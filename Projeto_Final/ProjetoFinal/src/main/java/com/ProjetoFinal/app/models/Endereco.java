package com.ProjetoFinal.app.models;


import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.ProjetoFinal.app.models.Enums.Estado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEndereco;
    private String rua;
    private String cidade;
    private String bairro;

     @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "data_visto")
    private LocalDate dataVisto;

    // ENUMS
    @Enumerated(EnumType.STRING)
    private Estado estado = null;

    // Getters e Setters

    public Long getIdEndereco() {
        return this.idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

   public LocalDate getDataVisto() {
        return dataVisto;
    }

    public void setDataVisto(LocalDate dataVisto) {
        this.dataVisto = dataVisto;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
