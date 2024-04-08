package br.com.design.patterns.strategy;

import java.math.BigDecimal;

public class Itau implements CalculadoraJurosStrategyInterface{
    @Override
    public BigDecimal getTaxaDeJuros(Pedido pedido) {
        return BigDecimal.valueOf(0.10);
    }
}
