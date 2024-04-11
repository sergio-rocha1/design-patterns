package br.com.design.patterns.factoryMethod;

import br.com.design.patterns.factoryMethod.factories.BicicletaFactory;
import br.com.design.patterns.factoryMethod.factories.CarroFactory;
import br.com.design.patterns.factoryMethod.veiculos.Veiculo;

public class AlgoritmoVeiculosRandomico {

    public Veiculo buscarRandom() {
        Veiculo veiculo;
        int random = (int) (Math.random() * 3);
        if (random == 0) {
            veiculo = new CarroFactory().getVeiculo("Jetta");
        } else if(random == 1) {
            veiculo = new CarroFactory().getVeiculo("Celta Preto");
        } else {
            veiculo = new BicicletaFactory().getVeiculo("Caloi");
        }

        return veiculo;
    }
}
