package br.com.design.patterns.comportamental.templateMethod;

public class ProcessadorPagamentoCredito extends ProcessadorPagamento{
    @Override
    protected void debitar() {
        System.out.println("Debitando cartão de crédito...");
    }

    @Override
    protected void notificar() {
        System.out.println("Notificação especifica do cartão de crédito!");
    }

    @Override
    protected void notificarAdicional() {
        System.out.println("Notificação adicional do cartão de crédito");
    }
}
