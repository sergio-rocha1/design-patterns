package br.com.design.patterns.abstractFactory.factories;

import br.com.design.patterns.abstractFactory.clientes.Cliente;
import br.com.design.patterns.abstractFactory.veiculos.Veiculo;

public interface VeiculoClienteFactory {
    Cliente criarCliente(String nomeCliente);
    Veiculo criarVeiculo(String nomeVeiculo, String nomeCliente);
}
