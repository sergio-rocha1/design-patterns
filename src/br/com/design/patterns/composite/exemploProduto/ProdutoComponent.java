package br.com.design.patterns.composite.exemploProduto;

import java.math.BigDecimal;

public abstract class ProdutoComponent {

    abstract BigDecimal buscarPreco();

    void add(ProdutoComponent... produtos) {}

    void remove(ProdutoComponent... produtos) {}
}
