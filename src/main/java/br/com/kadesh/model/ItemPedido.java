package br.com.kadesh.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ItemPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private ProdutoGrade produto;
    private int quantidade;
    private double preco;
    private double frete;
    private double icms;
    private double pisCofins;
    private double cprb;
    
    @OneToMany
    List<Opcional> opcionais;

    public ItemPedido() {
    }

    public ItemPedido(int id, ProdutoGrade produto, int quantidade, double preco, double frete, double icms, double pisCofins, double cprb) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.frete = frete;
        this.icms = icms;
        this.pisCofins = pisCofins;
        this.cprb = cprb;
    }

    public double getCprb() {
        return cprb;
    }

    public void setCprb(double cprb) {
        this.cprb = cprb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdutoGrade getProduto() {
        return produto;
    }

    public void setProduto(ProdutoGrade produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }

    public double getPisCofins() {
        return pisCofins;
    }

    public void setPisCofins(double pisCofins) {
        this.pisCofins = pisCofins;
    }

}
