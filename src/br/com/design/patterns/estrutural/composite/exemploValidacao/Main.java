package br.com.design.patterns.estrutural.composite.exemploValidacao;

public class Main {

    public static void main(String[] args) {
        ValidaEmail validaEmail = new ValidaEmail();
        ValidaString validaString = new ValidaString();

        ValidacaoComposite validacaoComposite = new ValidacaoComposite();
        validacaoComposite.add(validaEmail, validaString);

        System.out.println(validacaoComposite.validar("teste.exemplo@composite.com.br", "teste.teste"));
        System.out.println(validaString.validar("teste.teste"));
        System.out.println(validaString.validar(1));
    }
}
