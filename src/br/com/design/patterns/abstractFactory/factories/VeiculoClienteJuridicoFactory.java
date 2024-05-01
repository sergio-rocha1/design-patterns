package br.com.design.patterns.abstractFactory.factories;

import br.com.design.patterns.abstractFactory.clientes.Cliente;
import br.com.design.patterns.abstractFactory.clientes.ClienteJuridico;
import br.com.design.patterns.abstractFactory.veiculos.Veiculo;
import br.com.design.patterns.abstractFactory.veiculos.VeiculoJuridico;

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
