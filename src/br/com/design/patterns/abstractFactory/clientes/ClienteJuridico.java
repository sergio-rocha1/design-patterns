package br.com.design.patterns.abstractFactory.clientes;

public class ClienteJuridico implements Cliente {

    private final String nomeCliente;

    public ClienteJuridico(String nome) {
        this.nomeCliente = nome;
    }

    @Override
    public String informarNomeCliente() {
        return this.nomeCliente;
    }
}
