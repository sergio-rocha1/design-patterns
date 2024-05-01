package br.com.design.patterns.abstractFactory.veiculos;

import br.com.design.patterns.abstractFactory.clientes.Cliente;

public class VeiculoFisico implements Veiculo {
    private final String veiculo;
    private final Cliente cliente;

    public VeiculoFisico(String nomeVeiculo, Cliente cliente){
        this.veiculo = nomeVeiculo;
        this.cliente = cliente;
    }

    @Override
    public void escolher() {
        System.out.println(this.veiculo + " físico, está buscando o " + cliente.informarNomeCliente());
    }
}
