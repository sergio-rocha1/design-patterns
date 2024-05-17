package br.com.design.patterns.comportamental.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vendedor {
    private final String nomeVendedor;
    private final List<Produto> produtos;
    private Mediator mediator;

    public Vendedor(String nomeVendedor) {
        this.produtos = new ArrayList<>();
        this.nomeVendedor = nomeVendedor;
    }

    public void mostrarProdutos() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    public void adicionarProdutos(Produto... produtos) {
        this.produtos.addAll(Arrays.asList(produtos));
    }

    public Produto venderProduto(String ID) {
        for (Produto produto : produtos) {
            if (produto.getID().equals(ID)) {
                Produto produtoVendido = produto;
                produtos.remove(produto);

                return produtoVendido;
            }
        }
        return null;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }
}
