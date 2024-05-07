package br.com.design.patterns.composite.exemploValidacao;

public abstract class ValidacaoComponent {
    abstract boolean validar(Object... valores);
}
