package br.com.design.patterns.mediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mediator {
    private final List<Vendedor> vendedores;

    public Mediator() {
        this.vendedores = new ArrayList<>();
    }

    public void adicionarVendedores(Vendedor... vendedores) {
        this.vendedores.addAll(Arrays.asList(vendedores));
    }

    public Produto comprar(String ID) {
        for (Vendedor vendedor : vendedores) {
            Produto produto = vendedor.venderProduto(ID);
            if (produto != null) {
                System.out.println("Aqui está o produto: " + produto);
                return produto;
            }
        }
        System.out.println("Nenhum vendedor tem o produto com ID: " + ID);
        return null;
    }

    public void mostrarProdutos() {
        for (Vendedor vendedor : vendedores) {
            System.out.println("Produtos do vendedor: " + vendedor.getNomeVendedor());
            vendedor.mostrarProdutos();
        }
    }
}
