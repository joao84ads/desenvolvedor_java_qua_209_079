package com.ProjetoFinal.app.models;

import com.ProjetoFinal.app.models.Enums.CorCabelo;
import com.ProjetoFinal.app.models.Enums.CorOlhos;
import com.ProjetoFinal.app.models.Enums.TipoCabelo;
import com.ProjetoFinal.app.models.Enums.TipoCorpo;
import com.ProjetoFinal.app.models.Enums.TipoPele;

import jakarta.persistence.*;

@Entity
@Table(name = "caracteristicas")
public class Caracteristicas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCaracteristicas;

    // ENUMS
    @Enumerated(EnumType.STRING)
    private CorOlhos corOlhos;

    @Enumerated(EnumType.STRING)
    private CorCabelo corCabelo;

    @Enumerated(EnumType.STRING)
    private TipoCabelo tipoCabelo;

    @Enumerated(EnumType.STRING)
    private TipoCorpo tipoCorpo;

    @Enumerated(EnumType.STRING)
    private TipoPele pele;

    // SIM/NÃO
    private boolean tatuagem;
    private boolean cicatriz;

    // TEXTO LIVRE
    @Column(columnDefinition = "TEXT")
    private String observacoes;

    // Getters e Setters
    public Long getIdCaracteristicas () {
        return idCaracteristicas;
    }

    public void setIdCaracteristicas(Long idCaracteristicas) {
        this.idCaracteristicas = idCaracteristicas;
    }

    public CorOlhos getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(CorOlhos corOlhos) {
        this.corOlhos = corOlhos;
    }

    public CorCabelo getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(CorCabelo corCabelo) {
        this.corCabelo = corCabelo;
    }

    public TipoCabelo getTipoCabelo() {
        return tipoCabelo;
    }

    public void setTipoCabelo(TipoCabelo tipoCabelo) {
        this.tipoCabelo = tipoCabelo;
    }

    public TipoCorpo getTipoCorpo() {
        return tipoCorpo;
    }

    public void setTipoCorpo(TipoCorpo tipoCorpo) {
        this.tipoCorpo = tipoCorpo;
    }

    public TipoPele getPele() {
        return pele;
    }

    public void setPele(TipoPele pele) {
        this.pele = pele;
    }

    public boolean isTatuagem() {
        return tatuagem;
    }

    public void setTatuagem(boolean tatuagem) {
        this.tatuagem = tatuagem;
    }

    public boolean isCicatriz() {
        return cicatriz;
    }

    public void setCicatriz(boolean cicatriz) {
        this.cicatriz = cicatriz;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}
