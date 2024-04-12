package br.com.design.patterns.decorator.produto;

import java.math.BigDecimal;

public class Caneta implements ProdutoInterface{
    private final BigDecimal preco;

    public Caneta(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public BigDecimal getPreco() {
        return this.preco;
    }

    @Override
    public String getDescricao() {
        return getClass().getSimpleName();
    }
}
