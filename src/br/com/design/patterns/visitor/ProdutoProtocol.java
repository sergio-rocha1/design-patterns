package br.com.design.patterns.visitor;

import java.math.BigDecimal;

public abstract class ProdutoProtocol {
    private final String name;
    private final BigDecimal preco;

    ProdutoProtocol(String nome, BigDecimal preco) {
        this.name = nome;
        this.preco = preco;
    }

    String getName() {
        return this.name;
    }

    BigDecimal getPreco() {
        return this.preco;
    }

    abstract BigDecimal getPrecoComTaxa(TaxasVisitor visitor);
}
