package br.com.design.patterns.estrutural.composite.exemploValidacao;

public abstract class ValidacaoComponent {
    abstract boolean validar(Object... valores);
}
