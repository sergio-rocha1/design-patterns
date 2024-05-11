package br.com.design.patterns.proxy;

public class Main {

    public static void main(String[] args) {
        ProdutoDAO produtoDAO2 = new CacheProdutoDAO();

        ProdutoDAO produtoDAO = new LogProdutoDAO();

        ProdutoService produtoService = new ProdutoService(produtoDAO2);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);

        LazyProdutoDAO produtoDAO3 = new LazyProdutoDAO();
        produtoDAO3.find(1);
        produtoDAO3.find(1);
    }
}
