package br.com.design.patterns.criacional.factoryMethod.veiculos;

public class Bicicleta implements Veiculo {

    public String nome;

    public Bicicleta(String nomeBicicleta) {
        this.nome = nomeBicicleta;
    }
    @Override
    public void buscar(String nome) {

    }

    @Override
    public void parar() {

    }

    @Override
    public void getTipo() {
        System.out.println("Bicicleta");
    }
}
