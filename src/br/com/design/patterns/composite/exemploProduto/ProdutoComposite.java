package br.com.design.patterns.composite.exemploProduto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoComposite extends ProdutoComponent {

    private final List<ProdutoComponent> produtosFilhos;

    public ProdutoComposite() {
        produtosFilhos = new ArrayList<>();
    }

    void add(ProdutoComponent... produtos) {
        this.produtosFilhos.addAll(Arrays.asList(produtos));
    }

    void remove(ProdutoComponent... produtos) {
        this.produtosFilhos.removeAll(Arrays.asList(produtos));
    }

    @Override
    BigDecimal buscarPreco() {
        return produtosFilhos.stream()
                .map(ProdutoComponent::buscarPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nProdutoComposite { ");
        builder.append("\npreço total=").append(buscarPreco()).append(", ");
        builder.append("\nprodutosFilhos=[");
        builder.append("\n" + produtosFilhos.stream()
                .map(produto -> produto.toString() + " (Preço: " + produto.buscarPreco() + ")")
                .collect(Collectors.joining(", ")));
        builder.append("] }");
        return builder.toString();
    }
}
