package br.com.design.patterns.comportamental.chainOfResponsability;

import java.math.BigDecimal;

public class OrcamentoDiretorHandler extends OrcamentoBaseHandler {
    @Override
    public OrcamentoCliente handle(OrcamentoCliente orcamento) {
        if(orcamento.getTotal().compareTo(new BigDecimal("50000")) <= 0){
            System.out.println("O diretor tratou o orçamento");
            orcamento.aprroved = true;
            return orcamento;
        }
        return super.handle(orcamento);
    }
}
