package br.com.design.patterns.decorator;

import br.com.design.patterns.decorator.produto.Camiseta;
import br.com.design.patterns.decorator.produto.ProdutoCustomizadoDecorator;
import br.com.design.patterns.decorator.produto.ProdutoPintadoDecorator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Camiseta camiseta = new Camiseta(BigDecimal.TEN);
        ProdutoPintadoDecorator camisetaComEstampa = new ProdutoPintadoDecorator(camiseta);
        ProdutoPintadoDecorator camisetaComDuplaEstampa = new ProdutoPintadoDecorator(camisetaComEstampa);
        ProdutoCustomizadoDecorator camisetaCustomizada = new ProdutoCustomizadoDecorator(camisetaComEstampa);

        // Mostrando camiseta sem estampa - Retorno: "Camiseta com um preco de: 10"
        System.out.println(camiseta.getDescricao() + " com um preco de: " + camiseta.getPreco());

        // Mostrando camiseta com 2 estampas - Retorno: "Camiseta pintada com um preco de: 20"
        System.out.println(camisetaComEstampa.getDescricao() + " com um preco de: " + camisetaComEstampa.getPreco());

        // Mostrando camiseta com 2 estampas - Retorno: "Camiseta pintada pintada com um preco de: 30"
        System.out.println(camisetaComDuplaEstampa.getDescricao() + " com um preco de: " + camisetaComDuplaEstampa.getPreco());

        // Mostrando camiseta com 1 customizacao - Retorno: "Camiseta pintada customizada com um preco de: 70"
        System.out.println(camisetaCustomizada.getDescricao() + " com um preco de: " + camisetaCustomizada.getPreco());
    }
}
