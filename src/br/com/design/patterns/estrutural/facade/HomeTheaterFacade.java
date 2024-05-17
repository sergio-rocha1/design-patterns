package br.com.design.patterns.estrutural.facade;

import br.com.design.patterns.estrutural.facade.interfaces.DvdPlayer;
import br.com.design.patterns.estrutural.facade.interfaces.Projetor;
import br.com.design.patterns.estrutural.facade.interfaces.Tela;

public class HomeTheaterFacade {
    private final DvdPlayer dvd;
    private final Projetor projetor;
    private final Tela tela;

    public HomeTheaterFacade(DvdPlayer dvd, Projetor projetor, Tela tela) {
        this.dvd = dvd;
        this.projetor = projetor;
        this.tela = tela;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir filme...");
        projetor.on();
        projetor.wideScreenMode();
        tela.down();
        dvd.on();
        dvd.play(filme);
    }

    public void desligar() {
        System.out.println("Desligando sistema de home theater...");
        projetor.off();
        tela.up();
        dvd.stop();
        dvd.off();
    }
}
