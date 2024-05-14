package br.com.design.patterns.mediator;

import java.math.BigDecimal;

public class Produto {
    private String ID;
    private String nome;
    private BigDecimal preco;

    public Produto(String ID, String nome, BigDecimal preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [ID=" + ID + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
