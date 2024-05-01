package br.com.design.patterns.abstractFactory.factories;

import br.com.design.patterns.abstractFactory.clientes.Cliente;
import br.com.design.patterns.abstractFactory.clientes.ClienteFisico;
import br.com.design.patterns.abstractFactory.veiculos.Veiculo;
import br.com.design.patterns.abstractFactory.veiculos.VeiculoFisico;

public class VeiculoClienteFisicoFactory implements VeiculoClienteFactory{
    @Override
    public Cliente criarCliente(String nomeCliente) {
        String clientePadrao = nomeCliente.toUpperCase();
        return new ClienteFisico(clientePadrao);
    }

    @Override
    public Veiculo criarVeiculo(String nomeVeiculo, String nomeCliente) {
        Cliente cliente = criarCliente(nomeCliente);
        return new VeiculoFisico(nomeVeiculo, cliente);
    }
}
