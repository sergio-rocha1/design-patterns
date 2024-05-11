package br.com.design.patterns.visitor;

import java.math.BigDecimal;

public class TaxaBrasilVisitor implements TaxasVisitor {
    @Override
    public BigDecimal calcularTaxasComida(Comida comida) {
        BigDecimal valorTaxa = comida.getPreco().multiply(BigDecimal.valueOf(0.05));
        return comida.getPreco().add(valorTaxa);
    }

    @Override
    public BigDecimal calcularTaxasBebidaAlcoolica(BebidaAlcoolica bebidaAlcoolica) {
        BigDecimal valorTaxa = bebidaAlcoolica.getPreco().multiply(BigDecimal.valueOf(0.5));
        return bebidaAlcoolica.getPreco().add(valorTaxa);
    }

    @Override
    public BigDecimal calcularTaxasCigarro(Cigarro cigarro) {
        BigDecimal valorTaxa = cigarro.getPreco().multiply(BigDecimal.valueOf(1.5));
        return cigarro.getPreco().add(valorTaxa);
    }
}
