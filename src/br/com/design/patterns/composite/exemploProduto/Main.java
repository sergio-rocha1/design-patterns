package br.com.design.patterns.composite.exemploProduto;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ProdutoLeaf camiseta = new ProdutoLeaf("Camiseta", BigDecimal.valueOf(40));
        ProdutoLeaf calca = new ProdutoLeaf("Bicicleta", BigDecimal.valueOf(120));
        ProdutoLeaf relogioRolex = new ProdutoLeaf("Relogio Rolex", BigDecimal.valueOf(10000));

        ProdutoComposite caixaPresente = new ProdutoComposite();
        caixaPresente.add(camiseta, calca, relogioRolex);

        System.out.println(caixaPresente);

        ProdutoLeaf perfume = new ProdutoLeaf("Perfume", BigDecimal.valueOf(300));
        ProdutoLeaf oculos = new ProdutoLeaf("Oculos Oakley", BigDecimal.valueOf(1000));

        ProdutoComposite caixaPresenteOpcional = new ProdutoComposite();
        caixaPresenteOpcional.add(perfume, oculos);

        caixaPresente.add(caixaPresenteOpcional);

        System.out.println(caixaPresente);
        System.out.println("\n Preco total das caixas: " + caixaPresente.buscarPreco());
    }
}
