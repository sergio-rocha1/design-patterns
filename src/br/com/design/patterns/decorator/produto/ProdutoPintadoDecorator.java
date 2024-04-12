package br.com.design.patterns.decorator.produto;

import java.math.BigDecimal;

public class ProdutoPintadoDecorator extends ProdutoDecorator {

    public ProdutoPintadoDecorator(ProdutoInterface produto) {
        super(produto);
    }

    @Override
    public BigDecimal getPreco() {
        return super.getPreco().add(BigDecimal.TEN);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " pintada";
    }
}
