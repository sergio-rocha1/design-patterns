package br.com.design.patterns.estrutural.facade.implementacao;

import br.com.design.patterns.estrutural.facade.interfaces.Tela;

public class TelaImpl implements Tela {
    @Override
    public void down() {
        System.out.println("Tela embaixo");
    }

    @Override
    public void up() {
        System.out.println("Tela em cima");
    }
}
