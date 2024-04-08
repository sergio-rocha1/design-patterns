package br.com.design.patterns.strategy;

import java.math.BigDecimal;

public class Pedido {
    private BigDecimal totalPedido;

    Pedido(BigDecimal total) {
        this.totalPedido = total;
    }

    public BigDecimal getTotal() {
        return totalPedido;
    }

    public void setTotal(BigDecimal total) {
        this.totalPedido = total;
    }

}
