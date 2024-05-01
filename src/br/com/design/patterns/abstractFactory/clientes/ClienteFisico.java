package br.com.design.patterns.abstractFactory.clientes;

public class ClienteFisico implements Cliente {

    private final String nomeCliente;

    public ClienteFisico(String nome) {
        this.nomeCliente = nome;
    }

    @Override
    public String informarNomeCliente() {
        return this.nomeCliente;
    }
}
