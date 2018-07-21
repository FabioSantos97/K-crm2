package br.com.kadesh.mb;

import br.com.kadesh.dao.impl.ClienteDao;
import br.com.kadesh.dao.impl.CondPagDao;
import br.com.kadesh.dao.impl.PedidoDao;
import br.com.kadesh.dao.impl.TipoPedidoDao;
import br.com.kadesh.dao.impl.TransportadoraDao;
import br.com.kadesh.model.Cliente;
import br.com.kadesh.model.CondicaoPagamento;
import br.com.kadesh.model.Pedido;
import br.com.kadesh.model.TipoPedido;
import br.com.kadesh.model.Transportadora;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PedidoMB implements Serializable {

    private PedidoDao pedidoDao = new PedidoDao();
    private ClienteDao clienteDao = new ClienteDao();
    private CondPagDao condPagDao = new CondPagDao();
    private TransportadoraDao transportadoraDao = new TransportadoraDao();
    private TipoPedidoDao tipoPedidoDao = new TipoPedidoDao();

    private List<TipoPedido> tipoPedidos;
    private List<Transportadora> transportadoras;
    private List<CondicaoPagamento> condicoes;
    private List<Pedido> pedidos;
    private List<Cliente> clientes;
    private Pedido pedido;
    private Cliente cliente;
    private CondicaoPagamento condicaoPagamento;
    private Transportadora transportadora;
    private TipoPedido tipoPedido;

    public PedidoMB() {
        selectAll();
        pedido = new Pedido();
    }

    public void selectAll() {
        pedidos = pedidoDao.findAll();
        clientes = clienteDao.findAll();
        condicoes = condPagDao.findAll();
        transportadoras = transportadoraDao.findAll();
        tipoPedidos = tipoPedidoDao.findAll();
    }
    
    
    public void salvar(){
        
        
        
        pedidoDao.create(pedido);
    }
    
    
    public TransportadoraDao getTransportadoraDao() {
        return transportadoraDao;
    }

    public void setTransportadoraDao(TransportadoraDao transportadoraDao) {
        this.transportadoraDao = transportadoraDao;
    }

    public TipoPedidoDao getTipoPedidoDao() {
        return tipoPedidoDao;
    }

    public void setTipoPedidoDao(TipoPedidoDao tipoPedidoDao) {
        this.tipoPedidoDao = tipoPedidoDao;
    }

    public List<TipoPedido> getTipoPedidos() {
        return tipoPedidos;
    }

    public void setTipoPedidos(List<TipoPedido> tipoPedidos) {
        this.tipoPedidos = tipoPedidos;
    }

    public List<Transportadora> getTransportadoras() {
        return transportadoras;
    }

    public void setTransportadoras(List<Transportadora> transportadoras) {
        this.transportadoras = transportadoras;
    }

    public CondPagDao getCondPagDao() {
        return condPagDao;
    }

    public void setCondPagDao(CondPagDao condPagDao) {
        this.condPagDao = condPagDao;
    }

    public List<CondicaoPagamento> getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(List<CondicaoPagamento> condicoes) {
        this.condicoes = condicoes;
    }

    public PedidoDao getPedidoDao() {
        return pedidoDao;
    }

    public void setPedidoDao(PedidoDao pedidoDao) {
        this.pedidoDao = pedidoDao;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CondicaoPagamento getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public TipoPedido getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedido tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

}
