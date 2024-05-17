package br.com.design.patterns.comportamental.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Comida comida = new Comida(BigDecimal.TEN);
        Cigarro cigarro = new Cigarro(BigDecimal.valueOf(5));
        BebidaAlcoolica bebidaAlcoolica = new BebidaAlcoolica(BigDecimal.valueOf(5));

        List<ProdutoProtocol> carrinhoDeCompras = new ArrayList<>();
        carrinhoDeCompras.add(comida);
        carrinhoDeCompras.add(cigarro);
        carrinhoDeCompras.add(bebidaAlcoolica);

        BigDecimal total = carrinhoDeCompras.stream().map(ProdutoProtocol::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        TaxaBrasilVisitor taxaBrasilVisitor = new TaxaBrasilVisitor();
        BigDecimal totalComTaxasBrasil = carrinhoDeCompras.stream().map(produto -> produto.getPrecoComTaxa(taxaBrasilVisitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        TaxaEstadosUnidosVisitor taxaUSAVisitor = new TaxaEstadosUnidosVisitor();
        BigDecimal totalComTaxasUSA = carrinhoDeCompras.stream().map(produto -> produto.getPrecoComTaxa(taxaUSAVisitor))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total sem taxas: " + total);
        System.out.println("Total COM taxas do BRASIL: " + totalComTaxasBrasil);
        System.out.println("Total COM taxas dos EUA: " + totalComTaxasUSA);

    }
}
