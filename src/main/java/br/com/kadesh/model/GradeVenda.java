package br.com.kadesh.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GradeVenda implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @OneToOne
    private ProdutoGrade grade;
    private int quantidade;

    public GradeVenda() {
    }

    public GradeVenda(int id, ProdutoGrade grade, int quantidade) {
        this.id = id;
        this.grade = grade;
        this.quantidade = quantidade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdutoGrade getGrade() {
        return grade;
    }

    public void setGrade(ProdutoGrade grade) {
        this.grade = grade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    

}
