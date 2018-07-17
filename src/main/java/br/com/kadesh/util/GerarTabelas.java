package br.com.kadesh.util;

import br.com.kadesh.dao.impl.PedidoDao;
import br.com.kadesh.dao.impl.ProdutoDao;
import br.com.kadesh.model.Cliente;
import br.com.kadesh.model.Pedido;
import br.com.kadesh.model.Produto;
import java.util.List;



public class GerarTabelas {

    public static void main(String[] args) {

//        Produto p = new Produto();
//        ProdutoDao produtoDao = new ProdutoDao();
//        
//        produtoDao.saveOrUpdate(p);
        
        
        
        PedidoDao pedidoDao = new PedidoDao();
        Pedido pedido = new Pedido();
        
        List<Pedido> pedidos = pedidoDao.findAll();
        
        for (Pedido p : pedidos){
            System.out.println(p.toString());
        }
        
    }
}
    
    

