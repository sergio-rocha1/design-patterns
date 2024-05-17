package br.com.design.patterns.criacional.factoryMethod.veiculos;

public class Carro implements Veiculo {
    private final String nome;
    public Carro(String name) {
        this.nome = name;
    }
    @Override
    public void buscar(String nome) {
        System.out.println(this.nome + " está buscando " + nome);
    }

    @Override
    public void parar() {
        System.out.println("O carro do " + this.nome + " parou!");
    }

    @Override
    public void getTipo() {
        System.out.println("Carro");
    }
}
