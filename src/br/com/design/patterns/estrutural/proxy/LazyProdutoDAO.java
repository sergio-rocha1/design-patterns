package br.com.design.patterns.estrutural.proxy;

public class LazyProdutoDAO implements IProdutoDAO2 {

    private IProdutoDAO2 dadoReal;

    @Override
    public Object find(long id) {
        inicializaDAO();
        return dadoReal.find(id);
    }

    private void inicializaDAO() {
        if(dadoReal == null) {
            System.out.println("Produto DAO2 INICIALIZADO");
            dadoReal = new ProdutoDAO2();
        }
    }
}
