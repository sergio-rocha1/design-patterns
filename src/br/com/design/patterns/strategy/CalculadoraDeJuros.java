package br.com.design.patterns.strategy;

import java.math.BigDecimal;

public class CalculadoraDeJuros {

    private CalculadoraJurosStrategyInterface calculadorDeJuros;

    CalculadoraDeJuros(CalculadoraJurosStrategyInterface calculadorDeJuros) {
        this.calculadorDeJuros = calculadorDeJuros;
    }

    public void setCalculadorDeJuros(CalculadoraJurosStrategyInterface calculadorDeJuros) {
        this.calculadorDeJuros = calculadorDeJuros;
    }

    public BigDecimal calculaJuros(Pedido pedido) {
        return pedido.getTotal().multiply(calculadorDeJuros.getTaxaDeJuros(pedido));
    }
}
