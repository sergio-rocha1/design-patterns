package br.com.design.patterns.facade.implementacao;

import br.com.design.patterns.facade.interfaces.DvdPlayer;

public class DvdPlayerImpl implements DvdPlayer {
    @Override
    public void on() {
        System.out.println("Ligando DVD player");
    }

    @Override
    public void stop() {
        System.out.println("Parando DVD player");
    }

    @Override
    public void off() {
        System.out.println("Desligando DVD player");
    }

    @Override
    public void play(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }
}
