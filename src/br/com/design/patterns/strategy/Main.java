package br.com.design.patterns.strategy;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido(BigDecimal.valueOf(1000));
        Itau itau = new Itau();
        CalculadoraDeJuros calculadoraDeJuros = new CalculadoraDeJuros(itau);

        BigDecimal valorJuros = calculadoraDeJuros.calculaJuros(pedido);
        mostrarInfs(itau, pedido, valorJuros);

        Santader santander = new Santader();
        calculadoraDeJuros.setCalculadorDeJuros(santander);

        valorJuros = calculadoraDeJuros.calculaJuros(pedido);
        mostrarInfs(santander, pedido, valorJuros);
    }

    private static void mostrarInfs(CalculadoraJurosStrategyInterface banco, Pedido pedido, BigDecimal juros) {
        System.out.println("\n" + banco.getClass().getSimpleName() + ":");
        System.out.println("\nTotal: " + pedido.getTotal());
        System.out.println("\nJuros: " + juros);
        System.out.println("\nTotal com juros: " + pedido.getTotal().add(juros));
    }
}
