package br.com.design.patterns.estrutural.composite.exemploValidacao;

// Leaf
public class ValidaString extends ValidacaoComponent{

    @Override
    boolean validar(Object... valores) {
        if (valores == null || valores.length == 0) {
            return false;
        }

        for (Object valor : valores) {
            if (!(valor instanceof String) || ((String) valor).isEmpty()) {
                return false;
            }
        }

        return true;
    }
}
