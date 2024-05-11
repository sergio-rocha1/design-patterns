package br.com.design.patterns.proxy;

// Não alteramos a implementação Original
// Usamos Herança para fazer o Proxy
public class LogProdutoDAO extends ProdutoDAO {

    @Override
    public Object find(int id) {
        System.out.println("Buscando o produto com o ID " + id);
        Object produto = super.find(id);
        System.out.println("Produto com ID " + id + " encontrado");
        return produto;
    }
}
