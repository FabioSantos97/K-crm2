

package br.com.kadesh.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vendedor extends Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @ManyToOne
    private TipoVendedor tipoVendedor;
    private String cnpj;
    private String nomeFantasia;
    private String telefone;
    
    @OneToMany
    private List<Cliente> clientes;

    public Vendedor() {
        
    }

    public Vendedor(int id, TipoVendedor tipoVendedor, String cnpj, String nomeFantasia, String telefone, List<Cliente> clientes) {
        this.id = id;
        this.tipoVendedor = tipoVendedor;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.telefone = telefone;
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoVendedor getTipoVendedor() {
        return tipoVendedor;
    }

    public void setTipoVendedor(TipoVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    
   
    
    
    
    
    
}
