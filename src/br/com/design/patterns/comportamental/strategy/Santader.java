package br.com.design.patterns.comportamental.strategy;

import java.math.BigDecimal;

public class Santader implements CalculadoraJurosStrategyInterface{
    @Override
    public BigDecimal getTaxaDeJuros(Pedido pedido) {
        return BigDecimal.valueOf(0.20);
    }
}
