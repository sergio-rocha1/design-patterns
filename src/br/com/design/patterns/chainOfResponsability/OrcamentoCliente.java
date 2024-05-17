package br.com.design.patterns.chainOfResponsability;

import java.math.BigDecimal;

public class OrcamentoCliente {
    public boolean aprroved = false;
    private BigDecimal total;
    public OrcamentoCliente(BigDecimal total) {
        this.total = total;
    }


    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
