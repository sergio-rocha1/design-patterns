package br.com.design.patterns.criacional.abstractFactory.factories;

import br.com.design.patterns.criacional.abstractFactory.clientes.Cliente;
import br.com.design.patterns.criacional.abstractFactory.veiculos.Veiculo;

public interface VeiculoClienteFactory {
    Cliente criarCliente(String nomeCliente);
    Veiculo criarVeiculo(String nomeVeiculo, String nomeCliente);
}
