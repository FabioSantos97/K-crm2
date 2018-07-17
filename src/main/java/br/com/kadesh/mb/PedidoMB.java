package br.com.kadesh.mb;

import br.com.kadesh.dao.impl.PedidoDao;
import br.com.kadesh.model.Pedido;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class PedidoMB implements Serializable{
    
    private PedidoDao pedidoDao = new PedidoDao();
    private List<Pedido> pedidos;
    private Pedido pedido;

    public PedidoMB() {
        selectAll();
    }
    
    public void selectAll(){
        pedidos = pedidoDao.findAll();
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
    
    
    
    
    
    

}
