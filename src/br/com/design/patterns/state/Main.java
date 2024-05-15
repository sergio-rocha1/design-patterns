package br.com.design.patterns.state;

public class Main {
    public static void main(String[] args) {
        PedidoCompra pedidoCompra = new PedidoCompra(); // Começa com pendente
        pedidoCompra.aprovarPagamento(); // Aprovado
        pedidoCompra.aguardarPagamento(); // Pendente
        pedidoCompra.enviarPagamento();

        pedidoCompra.rejeitarPagamento(); // Daqui não altera mais o estado
        pedidoCompra.aguardarPagamento(); // Não
        pedidoCompra.aprovarPagamento(); // Não
        pedidoCompra.enviarPagamento(); // Não
    }
}
