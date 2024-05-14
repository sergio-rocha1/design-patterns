package br.com.design.patterns.mediator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Vendedor vendedor1 = new Vendedor("Rogério");
        Vendedor vendedor2 = new Vendedor("Joaquim");

        vendedor1.adicionarProdutos(new Produto("NOTE01", "Notebook", new BigDecimal(3000)),
                new Produto("NOTE02", "Notebook Asus", new BigDecimal(4000)));

        vendedor2.adicionarProdutos(new Produto("CELL01", "Iphone 15", new BigDecimal(5500)),
                new Produto("CELL02", "Samsung S24", new BigDecimal(2350)));

        mediator.adicionarVendedores(vendedor1, vendedor2);

        Comprador comprador = new Comprador(mediator);
        comprador.verProdutosDisponiveis();

        System.out.println();
        comprador.comprarProduto("NOTE01");
        comprador.comprarProduto("CELL02");

        System.out.println();
        comprador.verProdutosDisponiveis();
    }
}
