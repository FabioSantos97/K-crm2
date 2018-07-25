package br.com.kadesh.util;

import br.com.kadesh.dao.impl.ClienteDao;
import br.com.kadesh.dao.impl.CondPagDao;
import br.com.kadesh.dao.impl.EnderecoDao;
import br.com.kadesh.dao.impl.EstadoDao;
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
        
        
//        Estado estado = new Estado();
//        estado.setNome("Parana");
//        estado.setSigla("Pr");
//        estadoDao.create(estado);
//        
//        Endereco endereco = new Endereco();
//        endereco.setLogradouro("Benjamin Constant");
//        endereco.setBairro("centro");
//        endereco.setCep("84430-000");
//        endereco.setCidade("imbituva");
//        endereco.setComplemento("Barracao 3");
//        endereco.setEstado(estado);
//        enderecoDao.create(endereco);
//        
//        
//        
//        Cliente cliente =  new Cliente();
//        cliente.setCnpj("06.293.564/0001-46");
//        cliente.setInscricaoEstadual("8888888888");
//        cliente.setEmailNFE("nfe@kadesh");
//        cliente.setNomeFantasia("Kadesh Calçados");
//        cliente.setNumeroFuncionarios(500);
//        cliente.setRazaoSocial("Kadesh Calçados Profissionais");
//        cliente.setEndereco(endereco);
//        
//        clienteDao.create(cliente);
//        
//        
//        Linha linha = new Linha();
//        linha.setNome("Adventure");
//        linha.setDescricao("Adventure");
//        linha.setNomeReduzido("ADV");
//        
//        
//        Grupo grupo = new Grupo();
//        grupo.setNome("Kadesh");
//        grupo.setDescricao("Kadesh");
//        grupo.setNomeReduzido("KSH");
//        
//        Familia familia = new Familia();
//        familia.setNome("Botina");
//        familia.setDescricao("Botina");
//        familia.setNomeReduzido("BOT");
////        
//        Produto produto = new Produto();
//        produto.setDescricao("Botina Nobuck");
//        produto.setReferencia("35201");
//        produto.setNumeroCa("11107");
//        produto.setCusto(22.50);
//        produto.setMcMinima(10);
//        produto.setLinha(linha);
//        produto.setGrupo(grupo);
//        produto.setFamilia(familia);
//        produtoDao.create(produto);
//        
//        
//        
//        Transportadora transportadora = new Transportadora();
//        transportadora.setCnpj("01.654.447/0001-11");
//        transportadora.setNomeFantasia("BrassPress");
//        transportadora.setRazaoSocial("BrassPress LTDA");
//        transportadoraDao.create(transportadora);
//        
//        
//        CondicaoPagamento condicaoPagamento = new CondicaoPagamento();
//        condicaoPagamento.setCondicao("30/60/90");
//        condicaoPagamento.setIndiceFinaceiro(1);
//        condPagDao.create(condicaoPagamento);
//        
//        TipoPedido tipoPedido = new TipoPedido();
//        tipoPedido.setNome("Pedido de Venda");
//        tipoPedido.setDescricao("Venda");
//        tipoPedidoDao.create(tipoPedido);

        Produto produto = new Produto();
        produto = produtoDao.find(10);

        ProdutoGradeDao produtoGradeDao = new ProdutoGradeDao();
        ProdutoGrade pg = new ProdutoGrade();
        pg.setProduto(produto);
        pg.setNumeracao(34);
        produtoGradeDao.create(pg);
        
        ProdutoGrade pg2 = new ProdutoGrade();
        pg2.setProduto(produto);
        pg2.setNumeracao(35);
        produtoGradeDao.create(pg2);
        
        ProdutoGrade pg3 = new ProdutoGrade();
        pg3.setProduto(produto);
        pg3.setNumeracao(36);
        produtoGradeDao.create(pg3);
        
        ProdutoGrade pg4 = new ProdutoGrade();
        pg4.setProduto(produto);
        pg4.setNumeracao(37);
        produtoGradeDao.create(pg4);
        
        ProdutoGrade pg5 = new ProdutoGrade();
        pg5.setProduto(produto);
        pg5.setNumeracao(38);
        produtoGradeDao.create(pg5);
        
        ProdutoGrade pg6 = new ProdutoGrade();
        pg6.setProduto(produto);
        pg6.setNumeracao(39);
        produtoGradeDao.create(pg6);
        
        ProdutoGrade pg7 = new ProdutoGrade();
        pg7.setProduto(produto);
        pg7.setNumeracao(40);
        produtoGradeDao.create(pg7);
        
        ProdutoGrade pg8 = new ProdutoGrade();
        pg8.setProduto(produto);
        pg8.setNumeracao(41);
        produtoGradeDao.create(pg8);
        
        ProdutoGrade pg9 = new ProdutoGrade();
        pg9.setProduto(produto);
        pg9.setNumeracao(42);
        produtoGradeDao.create(pg9);
        
        
        
        
        
        

    }
}
