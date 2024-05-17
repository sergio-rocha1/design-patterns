package br.com.design.patterns.comportamental.observer;

import java.util.Observable;

public class Estoque extends Observable {

    private Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
        setChanged(); // Marcando que houve uma mudança
        notifyObservers(produto); // Notificando os observadores
    }

    public void alterarQuantidade(int quantidade) {
        if(produto != null) {
            int novaQuantidade = produto.getQuantidade() + quantidade;
            if (novaQuantidade >= 0) { // Verifica se a nova quantidade é não negativa
                produto.setQuantidade(novaQuantidade);
                setChanged(); // Marcando que houve uma mudança
                notifyObservers(produto); // Notificando os observadores
            } else {
                System.out.println("Operação inválida: estoque não pode ser negativo.");
            }
        }
    }
}
