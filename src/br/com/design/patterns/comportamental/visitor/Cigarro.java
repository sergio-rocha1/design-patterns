package br.com.design.patterns.comportamental.visitor;

import java.math.BigDecimal;

public class Cigarro extends ProdutoProtocol {
    Cigarro(BigDecimal preco) {
        super("Cigarro", preco);
    }

    @Override
    BigDecimal getPrecoComTaxa(TaxasVisitor visitor) {
        return visitor.calcularTaxasCigarro(this);
    }
}
