package br.com.design.patterns.chainOfResponsability;

public abstract class OrcamentoBaseHandler {
    protected OrcamentoBaseHandler next = null;

    public OrcamentoBaseHandler setNextHandler(OrcamentoBaseHandler handler) {
        this.next = handler;
        return handler;
    }
    public OrcamentoCliente handle(OrcamentoCliente orcamento) {
        if (this.next != null) {
            return this.next.handle(orcamento);
        }
        return orcamento;
    }
}
