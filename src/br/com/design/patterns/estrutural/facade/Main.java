package br.com.design.patterns.estrutural.facade;

import br.com.design.patterns.estrutural.facade.implementacao.DvdPlayerImpl;
import br.com.design.patterns.estrutural.facade.implementacao.ProjetorImpl;
import br.com.design.patterns.estrutural.facade.implementacao.TelaImpl;
import br.com.design.patterns.estrutural.facade.interfaces.DvdPlayer;
import br.com.design.patterns.estrutural.facade.interfaces.Projetor;
import br.com.design.patterns.estrutural.facade.interfaces.Tela;

public class Main {

    public static void main(String[] args) {
        // Criando instâncias das classes
        DvdPlayer dvdPlayer = new DvdPlayerImpl();
        Projetor projetor = new ProjetorImpl();
        Tela tela = new TelaImpl();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projetor, tela);
        homeTheaterFacade.assistirFilme("Star Wars");
        homeTheaterFacade.desligar();
    }
}
