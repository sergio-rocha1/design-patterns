package br.com.design.patterns.estrutural.proxy;

public class ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoService(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    public Object buscarProduto(int id) {
        return this.produtoDAO.find(id);
    }
}
