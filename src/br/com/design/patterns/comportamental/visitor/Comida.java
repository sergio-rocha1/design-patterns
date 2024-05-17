package br.com.design.patterns.comportamental.visitor;

import java.math.BigDecimal;

public class Comida extends ProdutoProtocol {
    Comida(BigDecimal preco) {
        super("Comida", preco);
    }


    @Override
    BigDecimal getPrecoComTaxa(TaxasVisitor visitor) {
        return visitor.calcularTaxasComida(this);
    }
}
