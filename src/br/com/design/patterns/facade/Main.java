package br.com.design.patterns.facade;

import br.com.design.patterns.facade.implementacao.DvdPlayerImpl;
import br.com.design.patterns.facade.implementacao.ProjetorImpl;
import br.com.design.patterns.facade.implementacao.TelaImpl;
import br.com.design.patterns.facade.interfaces.DvdPlayer;
import br.com.design.patterns.facade.interfaces.Projetor;
import br.com.design.patterns.facade.interfaces.Tela;

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
