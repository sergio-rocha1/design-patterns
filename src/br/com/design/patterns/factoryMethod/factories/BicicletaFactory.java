package br.com.design.patterns.factoryMethod.factories;

import br.com.design.patterns.factoryMethod.veiculos.Bicicleta;
import br.com.design.patterns.factoryMethod.veiculos.Veiculo;

public class BicicletaFactory extends VeiculoFactory {

    @Override
    public Veiculo getVeiculo(String nomeVeiculo) {
        return new Bicicleta("Caloi");
    }
}
