package br.com.design.patterns.criacional.abstractFactory.factories;

import br.com.design.patterns.criacional.abstractFactory.clientes.Cliente;
import br.com.design.patterns.criacional.abstractFactory.clientes.ClienteJuridico;
import br.com.design.patterns.criacional.abstractFactory.veiculos.Veiculo;
import br.com.design.patterns.criacional.abstractFactory.veiculos.VeiculoJuridico;

public class VeiculoClienteJuridicoFactory implements VeiculoClienteFactory {
    @Override
    public Cliente criarCliente(String nomeCliente) {
        String clientePadrao = nomeCliente.toUpperCase();
        return new ClienteJuridico(clientePadrao);
    }

    @Override
    public Veiculo criarVeiculo(String nomeVeiculo, String nomeCliente) {
        Cliente cliente = criarCliente(nomeCliente);
        return new VeiculoJuridico(nomeVeiculo, cliente);
    }
}
