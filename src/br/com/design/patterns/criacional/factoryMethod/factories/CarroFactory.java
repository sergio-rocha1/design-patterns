package br.com.design.patterns.criacional.factoryMethod.factories;

import br.com.design.patterns.criacional.factoryMethod.veiculos.Carro;
import br.com.design.patterns.criacional.factoryMethod.veiculos.Veiculo;

public class CarroFactory extends VeiculoFactory {
    @Override
    public Veiculo getVeiculo(String nomeVeiculo) {
        return new Carro(nomeVeiculo);
    }
}
