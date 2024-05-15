package br.com.design.patterns.state;

public class PedidoAprovado implements PedidoCompraState {
    private String nome = "Pedido Aprovado";
    private PedidoCompra pedidoCompra;

    public PedidoAprovado(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void aprovarPagamento() {
        System.out.println("O pedido já está no estado pagamento aprovado.");
    }

    @Override
    public void rejeitarPagamento() {
        this.pedidoCompra.setEstado(new PedidoReprovado(this.pedidoCompra));
    }

    @Override
    public void aguardarPagamento() {
        this.pedidoCompra.setEstado(new PedidoPendente(this.pedidoCompra));
    }

    @Override
    public void enviarPagamento() {
        System.out.println("Enviando Nota Fiscal para o cliente!");
    }
}
