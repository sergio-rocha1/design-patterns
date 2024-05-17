package br.com.design.patterns.chainOfResponsability;

import java.math.BigDecimal;

public class OrcamentoVendedorHandler extends OrcamentoBaseHandler {
    @Override
    public OrcamentoCliente handle(OrcamentoCliente orcamento) {
        if(orcamento.getTotal().compareTo(new BigDecimal("1000")) <= 0){
            System.out.println("O vendedor tratou");
            orcamento.aprroved = true;
            return orcamento;
        }

        return super.handle(orcamento);
    }
}
