package br.com.design.patterns.chainOfResponsability;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        OrcamentoCliente orcamentoCliente = new OrcamentoCliente(BigDecimal.valueOf(50500));

        OrcamentoVendedorHandler vendedorHandler = new OrcamentoVendedorHandler();
        vendedorHandler.setNextHandler(new OrcamentoManagerHandler())
                .setNextHandler(new OrcamentoDiretorHandler())
                .setNextHandler(new OrcamentoCEOHandler());

        vendedorHandler.handle(orcamentoCliente);
    }
}
