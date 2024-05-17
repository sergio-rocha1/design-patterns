package br.com.design.patterns.comportamental.strategy;

import java.math.BigDecimal;

public interface CalculadoraJurosStrategyInterface {

    BigDecimal getTaxaDeJuros(Pedido pedido);
}
