package br.com.kadesh.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String descricao;
    private String referencia;
    private String numeroCa;
    private double custo;
    private double mcMinima;
    private boolean status;
    @OneToOne(cascade = {CascadeType.ALL})
    private Grupo grupo;

    @OneToOne(cascade = {CascadeType.ALL})
    private Familia familia;

    @OneToOne(cascade = {CascadeType.ALL})
    private Linha linha;

    public Produto() {
    }

    public Produto(int id, String descricao, String referencia, String numeroCa, double custo, double mcMinima, boolean status, Grupo grupo, Familia familia, Linha linha) {
        this.id = id;
        this.descricao = descricao;
        this.referencia = referencia;
        this.numeroCa = numeroCa;
        this.custo = custo;
        this.mcMinima = mcMinima;
        this.status = status;
        this.grupo = grupo;
        this.familia = familia;
        this.linha = linha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNumeroCa() {
        return numeroCa;
    }

    public void setNumeroCa(String numeroCa) {
        this.numeroCa = numeroCa;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMcMinima() {
        return mcMinima;
    }

    public void setMcMinima(double mcMinima) {
        this.mcMinima = mcMinima;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

}
