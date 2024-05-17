package br.com.design.patterns.criacional.factoryMethod.factories;

import br.com.design.patterns.criacional.factoryMethod.veiculos.Veiculo;

public abstract class VeiculoFactory {
    // Metodo Factory
    public abstract Veiculo getVeiculo(String nomeVeiculo);

    public Veiculo definirCarroBuscar(String nome, String nomeVeiculo) {
        Veiculo veiculo = getVeiculo(nomeVeiculo);
        veiculo.buscar(nome);
        return veiculo;
    }
}
