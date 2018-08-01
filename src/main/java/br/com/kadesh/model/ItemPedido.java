package br.com.kadesh.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ItemPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    private List<GradeVenda> produtos;

    @OneToOne
    private Produto produto;
    private int quantidade;
    private double preco;
    private double frete;
    private double icms;
    private double pisCofins;
    private double cprb;

    @OneToMany
    private List<Opcional> opcionais;

    public ItemPedido() {
    }

    public ItemPedido(int id, List<GradeVenda> produtos, Produto produto, int quantidade, double preco, double frete, double icms, double pisCofins, double cprb, List<Opcional> opcionais) {
        this.id = id;
        this.produtos = produtos;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.frete = frete;
        this.icms = icms;
        this.pisCofins = pisCofins;
        this.cprb = cprb;
        this.opcionais = opcionais;
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

    public List<Opcional> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<Opcional> opcionais) {
        this.opcionais = opcionais;
    }

    public List<GradeVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<GradeVenda> produtos) {
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

}
