package br.com.design.patterns.estrutural.decorator.produto;

import java.math.BigDecimal;

public class ProdutoCustomizadoDecorator extends ProdutoDecorator{
    public ProdutoCustomizadoDecorator(ProdutoInterface produto) {
        super(produto);
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(BigDecimal.valueOf(50));
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " customizada";
    }
}
