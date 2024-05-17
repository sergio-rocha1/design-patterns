package br.com.design.patterns.criacional.abstractFactory.veiculos;

import br.com.design.patterns.criacional.abstractFactory.clientes.Cliente;

public class VeiculoJuridico implements Veiculo {
    private final String veiculo;
    private final Cliente cliente;

    public VeiculoJuridico(String nomeVeiculo, Cliente cliente){
        this.veiculo = nomeVeiculo;
        this.cliente = cliente;
    }

    @Override
    public void escolher() {
        System.out.println(this.veiculo + " jurídico, está buscando o " + cliente.informarNomeCliente());
    }
}
