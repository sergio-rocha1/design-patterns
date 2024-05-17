package br.com.design.patterns.estrutural.proxy;

// Exemplo usando Composição
public class ProdutoDAO2 implements IProdutoDAO2 {

    public ProdutoDAO2() {
        simulaTempoAlto();
    }

    private void simulaTempoAlto() {
        try {
            // Simula um tempo alto
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object find(long id) {
        // Busca produto na base de dados e retorna
        simulaTempoAlto();
        return new Object();
    }
}
