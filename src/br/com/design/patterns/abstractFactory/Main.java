package br.com.design.patterns.abstractFactory;


import br.com.design.patterns.abstractFactory.factories.VeiculoClienteFisicoFactory;
import br.com.design.patterns.abstractFactory.factories.VeiculoClienteJuridicoFactory;
import br.com.design.patterns.abstractFactory.veiculos.Veiculo;

public class Main {
    public static void main(String[] args) {

        final VeiculoClienteFisicoFactory clienteFisicoFactory = new VeiculoClienteFisicoFactory();
        final VeiculoClienteJuridicoFactory clienteJuridicoFactory = new VeiculoClienteJuridicoFactory();

        Veiculo veiculoJuridico = clienteJuridicoFactory.criarVeiculo("Nivus", "Manoel");
        Veiculo veiculoFisico = clienteFisicoFactory.criarVeiculo("Sandero", "Joao");

        veiculoJuridico.escolher();
        veiculoFisico.escolher();
    }
}
