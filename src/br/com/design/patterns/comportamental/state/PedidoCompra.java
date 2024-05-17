package br.com.design.patterns.comportamental.state;

public class PedidoCompra implements PedidoCompraState {
    private PedidoCompraState estado = new PedidoPendente(this);

    public PedidoCompraState getState() {
        return this.estado;
    }

    public void setEstado(PedidoCompraState estadoPedido) {
        this.estado = estadoPedido;
        System.out.println("O estado do pedido agora é: " + this.estado.getName());
    }

    public String getNomeEstado() {
        return estado.getName();
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void aprovarPagamento() {
        this.estado.aprovarPagamento();
    }

    @Override
    public void rejeitarPagamento() {
        this.estado.rejeitarPagamento();
    }

    @Override
    public void aguardarPagamento() {
        this.estado.aguardarPagamento();
    }

    @Override
    public void enviarPagamento() {
        this.estado.enviarPagamento();
    }
}
