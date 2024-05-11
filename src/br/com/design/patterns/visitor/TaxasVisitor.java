package br.com.design.patterns.visitor;

import java.math.BigDecimal;

public interface TaxasVisitor {
    BigDecimal calcularTaxasComida(Comida comida);
    BigDecimal calcularTaxasBebidaAlcoolica(BebidaAlcoolica bebidaAlcoolica);
    BigDecimal calcularTaxasCigarro(Cigarro cigarro);
}
