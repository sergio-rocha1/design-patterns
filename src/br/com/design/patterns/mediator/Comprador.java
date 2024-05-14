package br.com.design.patterns.mediator;

/**
 * O Comprador não conversa com o Vendedor e o Vendedor não conversa com o Comprador.
 * Ambos conversam com o Mediator, e ele faz a intermediação entre os objetos.
 */
public class Comprador {
    private Mediator mediator;

    public Comprador(Mediator mediator) {
        this.mediator = mediator;
    }

    public void verProdutosDisponiveis() {
        mediator.mostrarProdutos();
    }

    public void comprarProduto(String id) {
        this.mediator.comprar(id);
    }
}
