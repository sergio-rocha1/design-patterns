package br.com.design.patterns.state;

public interface PedidoCompraState {
    String getName();
    void aprovarPagamento();
    void rejeitarPagamento();
    void aguardarPagamento();
    void enviarPagamento();
}
