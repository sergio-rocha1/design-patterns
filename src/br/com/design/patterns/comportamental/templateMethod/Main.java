package br.com.design.patterns.comportamental.templateMethod;

public class Main {

    public static void main(String[] args) {
        ProcessadorPagamento pagamentoCredito = new ProcessadorPagamentoCredito();
        pagamentoCredito.processarPagamento();

        System.out.println("\n\n");

        ProcessadorPagamento pagamentoPix = new ProcessadorPagamentoPix();
        pagamentoPix.processarPagamento();
    }
}
