package br.com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class Loja implements Observer {
    private final String nome;

    public Loja(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Produto) {
            Produto produto = (Produto) arg;
            System.out.println("Notificação para a loja " + nome + ": O estoque do produto " + produto.getNome() + " mudou para " + produto.getQuantidade());
        }
    }
}
