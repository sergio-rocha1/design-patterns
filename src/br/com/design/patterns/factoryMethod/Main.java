package br.com.design.patterns.factoryMethod;

import br.com.design.patterns.factoryMethod.factories.CarroFactory;
import br.com.design.patterns.factoryMethod.veiculos.Carro;
import br.com.design.patterns.factoryMethod.veiculos.Veiculo;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<String> nomes = Arrays.asList("Joana", "Jose", "Maria", "Joao");

    public static void main(String[] args) {
        // Sem o Factory Method
        Carro fusca = new Carro("Fusca");
        fusca.buscar("Joana");
        fusca.parar();

        // Com o Factory Method
        Veiculo veiculo = new CarroFactory().getVeiculo("Jetta");
        veiculo.buscar("Jose");

        // Algoritmo para buscar um veiculo
        AlgoritmoVeiculosRandomico algoritmo = new AlgoritmoVeiculosRandomico();
        for (int i = 0; i < 10; i++) {
            Veiculo veiculo1 = algoritmo.buscarRandom();
            veiculo1.buscar(escolherNome());
            System.out.println("----");
        }

        // Usando o Factory Method
        System.out.println("\n");
        CarroFactory carroFactory = new CarroFactory(); // Factory Method
        Veiculo veiculoBuscar = carroFactory.definirCarroBuscar("Rafael", "Ferrari"); // Usando método definirCarroBuscar
        veiculo.getTipo();
    }

    public static String escolherNome() {
        return nomes.get((int) (Math.random() * nomes.size()));
    }
}
