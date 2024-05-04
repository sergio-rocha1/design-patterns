package br.com.design.patterns.templateMethod;

public class ProcessadorPagamentoPix extends ProcessadorPagamento{
    @Override
    protected void debitar() {
        System.out.println("Fazendo débito do pix do usuário...");
    }

    @Override
    protected void finalizarAdicional() {
        System.out.println("Fazendo finalização adicional do débito do pix...");
    }
}
