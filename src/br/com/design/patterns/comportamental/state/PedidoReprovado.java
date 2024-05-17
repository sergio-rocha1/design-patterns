package br.com.design.patterns.comportamental.state;

public class PedidoReprovado implements PedidoCompraState {
    private String nome = "Pedido Rejeitado";
    private PedidoCompra pedidoCompra;

    public PedidoReprovado(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void aprovarPagamento() {
        System.out.println("Não é possivel aprovar o pagamento pois o pedido ja foi recusado.");
    }

    @Override
    public void rejeitarPagamento() {
        System.out.println("O pedido já está no estado de pagamento rejeitado.");
    }

    @Override
    public void aguardarPagamento() {
        System.out.println("Não é possivel colocar o pedido pendente pois o pedido ja foi recusado.");
    }

    @Override
    public void enviarPagamento() {
        System.out.println("Não é possivel enviar NF pois o pedido está recusado!");
    }
}
