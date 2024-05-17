package br.com.design.patterns.comportamental.state;

public interface PedidoCompraState {
    String getName();
    void aprovarPagamento();
    void rejeitarPagamento();
    void aguardarPagamento();
    void enviarPagamento();
}
