package br.com.kadesh.util;

import br.com.kadesh.dao.impl.ClienteDao;
import br.com.kadesh.dao.impl.CondPagDao;
import br.com.kadesh.dao.impl.EnderecoDao;
import br.com.kadesh.dao.impl.EstadoDao;
import br.com.kadesh.dao.impl.FamiliaDao;
import br.com.kadesh.dao.impl.GrupoDao;
import br.com.kadesh.dao.impl.LinhaDao;
import br.com.kadesh.dao.impl.PedidoDao;
import br.com.kadesh.dao.impl.ProdutoDao;
import br.com.kadesh.dao.impl.ProdutoGradeDao;
import br.com.kadesh.dao.impl.TipoPedidoDao;
import br.com.kadesh.dao.impl.TransportadoraDao;
import br.com.kadesh.model.Cliente;
import br.com.kadesh.model.CondicaoPagamento;
import br.com.kadesh.model.Endereco;
import br.com.kadesh.model.Estado;
import br.com.kadesh.model.Familia;
import br.com.kadesh.model.Grupo;
import br.com.kadesh.model.Linha;
import br.com.kadesh.model.Pedido;
import br.com.kadesh.model.Produto;
import br.com.kadesh.model.ProdutoGrade;
import br.com.kadesh.model.TipoPedido;
import br.com.kadesh.model.Transportadora;
import java.util.List;

public class GerarTabelas {

    public static void main(String[] args) {

        PedidoDao pedidoDao = new PedidoDao();
        ClienteDao clienteDao = new ClienteDao();
        CondPagDao condPagDao = new CondPagDao();
        TransportadoraDao transportadoraDao = new TransportadoraDao();
        TipoPedidoDao tipoPedidoDao = new TipoPedidoDao();
        EnderecoDao enderecoDao = new EnderecoDao();
        EstadoDao estadoDao = new EstadoDao();
        ProdutoDao produtoDao = new ProdutoDao();
        LinhaDao linhaDao = new LinhaDao();
        FamiliaDao familiaDao = new FamiliaDao();
        GrupoDao grupoDao = new GrupoDao();

//        Transportadora transportadora = new Transportadora();
//        transportadora.setCnpj("01.654.447/0001-11");
//        transportadora.setNomeFantasia("BrassPress");
//        transportadora.setRazaoSocial("BrassPress LTDA");
//        transportadoraDao.create(transportadora);
//
//        Endereco endereco = new Endereco();
//        endereco.setLogradouro("Benjamin Constant");
//        endereco.setBairro("centro");
//        endereco.setCep("84430-000");
//        endereco.setCidade("imbituva");
//        endereco.setComplemento("Barracao 3");
//        endereco.setEstado(estadoDao.find(1));
////        enderecoDao.create(endereco);
//
//        Cliente cliente = new Cliente();
//        cliente.setCnpj("06.293.564/0001-46");
//        cliente.setInscricaoEstadual("8888888888");
//        cliente.setEmailNFE("nfe@kadesh");
//        cliente.setNomeFantasia("Kadesh Calçados");
//        cliente.setNumeroFuncionarios(500);
//        cliente.setRazaoSocial("Kadesh Calçados Profissionais");
//        cliente.setEndereco(endereco);
//
//        clienteDao.create(cliente);
        Produto produto = new Produto(0, "Botina Elastico", "35202", "11108", 25.50, 10, true, 0, 0, grupoDao.find(10), familiaDao.find(13), linhaDao.find(7));
        Produto produto2 = new Produto(0, "Botina Amarrar", "35201", "11109", 25.50, 10, true, 0, 0, grupoDao.find(10), familiaDao.find(13), linhaDao.find(7));
        Produto produto3 = new Produto(0, "Sapato Amarrar", "35101", "11110", 25.50, 10, true, 0, 0, grupoDao.find(10), familiaDao.find(13), linhaDao.find(7));
        Produto produto4 = new Produto(0, "Sapato Elastico", "35102", "11111", 25.50, 10, true, 0, 0, grupoDao.find(10), familiaDao.find(13), linhaDao.find(7));

        produtoDao.create(produto);
        produtoDao.create(produto2);
        produtoDao.create(produto3);
        produtoDao.create(produto4);

    }
}
