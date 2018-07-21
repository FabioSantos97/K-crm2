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
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Transportadora transportadora;
    @OneToOne
    private Endereco enderecoEntrega;
    @OneToOne
    private CondicaoPagamento condicaoPagamento;
    @OneToOne
    private TipoPedido tipoPedido;
    
    private String numeroOrdemCompra;
    private String observacoes;
    private String situacao;
    
    double valorTotal;
    int quantidade;
    
    @OneToMany
    private List<ItemPedido> itensPedido;

    public Pedido() {
    }
    
    
    public Pedido(int id, Cliente cliente, Transportadora transportadora, Endereco enderecoEntrega, CondicaoPagamento condicaoPagamento, TipoPedido tipoPedido, String numeroOrdemCompra, String observacoes, String situacao, List<ItemPedido> itensPedido) {
        this.id = id;
        this.cliente = cliente;
        this.transportadora = transportadora;
        this.enderecoEntrega = enderecoEntrega;
        this.condicaoPagamento = condicaoPagamento;
        this.tipoPedido = tipoPedido;
        this.numeroOrdemCompra = numeroOrdemCompra;
        this.observacoes = observacoes;
        this.situacao = situacao;
        this.itensPedido = itensPedido;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getNumeroOrdemCompra() {
        return numeroOrdemCompra;
    }

    public void setNumeroOrdemCompra(String numeroOrdemCompra) {
        this.numeroOrdemCompra = numeroOrdemCompra;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return this.cliente.getCnpj();
    }
    
    

}