package br.com.design.patterns.comportamental.chainOfResponsability;

import java.math.BigDecimal;

public class OrcamentoManagerHandler extends OrcamentoBaseHandler{
    @Override
    public OrcamentoCliente handle(OrcamentoCliente orcamento) {
        if(orcamento.getTotal().compareTo(new BigDecimal("5000")) <= 0){
            System.out.println("O manager tratou o orçamento");
            orcamento.aprroved = true;
            return orcamento;
        }

        return super.handle(orcamento);
    }
}
