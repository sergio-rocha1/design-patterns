package br.com.design.patterns.strategy;

import java.math.BigDecimal;

public interface CalculadoraJurosStrategyInterface {

    BigDecimal getTaxaDeJuros(Pedido pedido);
}
