package br.com.design.patterns.state;

public class PedidoPendente implements PedidoCompraState {

    private String nome = "Pedido Pendente";
    private PedidoCompra pedidoCompra;

    public PedidoPendente(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public void aprovarPagamento() {
        this.pedidoCompra.setEstado(new PedidoAprovado(this.pedidoCompra));
    }

    @Override
    public void rejeitarPagamento() {
        this.pedidoCompra.setEstado(new PedidoReprovado(this.pedidoCompra));
    }

    @Override
    public void aguardarPagamento() {
        System.out.println("O pedido já está no estado pagamento pendente.");
    }

    @Override
    public void enviarPagamento() {
        System.out.println("Não é possivel enviar a NF ao cliente, pois o pedido está pendente!");
    }
}
