package br.com.design.patterns.proxy;

public class ProdutoDAO {

    public ProdutoDAO() {
        simulaTempoAlto();
    }

    public Object find(int id) {
        simulaTempoAlto();
        return new Object();
    }

    private void simulaTempoAlto() {
        try {
            // Cria conexão com banco de dados
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
