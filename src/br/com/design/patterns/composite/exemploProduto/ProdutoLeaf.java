package br.com.design.patterns.composite.exemploProduto;

import java.math.BigDecimal;

public class ProdutoLeaf extends ProdutoComponent {
    public String nomeProduto;
    public BigDecimal preco;

    public ProdutoLeaf(String nomeProduto, BigDecimal preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    @Override
    BigDecimal buscarPreco() {
        return this.preco;
    }

    @Override
    public String toString() {
        return this.nomeProduto;
    }
}
