package br.com.design.patterns.comportamental.observer;

public class Main {

    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Loja loja1 = new Loja("Loja A");
        Loja loja2 = new Loja("Loja B");

        estoque.addObserver(loja1);
        estoque.addObserver(loja2);

        Produto produto = new Produto("Camiseta", 50);
        estoque.setProduto(produto);

        estoque.alterarQuantidade(-10);
    }
}
