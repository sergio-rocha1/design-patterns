package br.com.design.patterns.decorator.produto;

import java.math.BigDecimal;

public class Camiseta implements ProdutoInterface {
    private final BigDecimal preco;

    public Camiseta(BigDecimal preco) {
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
