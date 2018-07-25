package br.com.kadesh.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ProdutoGrade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Produto produto;
    private int numeracao;

    public ProdutoGrade() {
    }

    public ProdutoGrade(int id, Produto produto, int numeracao) {
        this.id = id;
        this.produto = produto;
        this.numeracao = numeracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public String toString() {
        return produto.getDescricao() + " " + numeracao ;
    }
    
    

}
