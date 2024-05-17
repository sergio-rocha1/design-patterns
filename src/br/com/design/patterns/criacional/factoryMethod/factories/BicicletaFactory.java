package br.com.design.patterns.criacional.factoryMethod.factories;

import br.com.design.patterns.criacional.factoryMethod.veiculos.Bicicleta;
import br.com.design.patterns.criacional.factoryMethod.veiculos.Veiculo;

public class BicicletaFactory extends VeiculoFactory {

    @Override
    public Veiculo getVeiculo(String nomeVeiculo) {
        return new Bicicleta("Caloi");
    }
}
