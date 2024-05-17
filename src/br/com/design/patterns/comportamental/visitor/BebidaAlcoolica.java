package br.com.design.patterns.comportamental.visitor;

import java.math.BigDecimal;

public class BebidaAlcoolica extends ProdutoProtocol {
    BebidaAlcoolica(BigDecimal preco) {
        super("Bebida Alcoolica", preco);
    }


    @Override
    BigDecimal getPrecoComTaxa(TaxasVisitor visitor) {
        return visitor.calcularTaxasBebidaAlcoolica(this);
    }
}
