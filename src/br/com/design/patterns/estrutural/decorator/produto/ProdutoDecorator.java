package br.com.design.patterns.estrutural.decorator.produto;

import java.math.BigDecimal;

public class ProdutoDecorator implements ProdutoInterface {

    private final ProdutoInterface produto;

    public ProdutoDecorator(ProdutoInterface produto) {
        this.produto = produto;
    }

    @Override
    public BigDecimal getPreco() {
        return this.produto.getPreco();
    }

    @Override
    public String getDescricao() {
        return this.produto.getDescricao();
    }
}
