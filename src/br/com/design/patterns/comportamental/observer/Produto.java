package br.com.design.patterns.comportamental.observer;

public class Produto {

    private final String nome;

    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método para criar uma cópia do produto
    public Produto clone() {
        return new Produto(this.nome, this.quantidade);
    }
}
