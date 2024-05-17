package br.com.design.patterns.chainOfResponsability;

public class OrcamentoCEOHandler extends OrcamentoBaseHandler {
    @Override
    public OrcamentoCliente handle(OrcamentoCliente orcamento) {
        System.out.println("O CEO trata qualquer orçamento!");
        orcamento.aprroved = true;
        return orcamento;
    }
}
