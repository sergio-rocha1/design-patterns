package br.com.design.patterns.estrutural.facade.implementacao;

import br.com.design.patterns.estrutural.facade.interfaces.Projetor;

public class ProjetorImpl implements Projetor {
    @Override
    public void on() {
        System.out.println("Ligando projetor");
    }

    @Override
    public void off() {
        System.out.println("Desligando projetor");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("Modo projetor em tela cheia");
    }
}
