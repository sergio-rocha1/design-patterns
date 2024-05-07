package br.com.design.patterns.composite.exemploValidacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidacaoComposite extends ValidacaoComponent {
    private final List<ValidacaoComponent> validacoesFilhas = new ArrayList<>();

    void add(ValidacaoComponent... valores) {
        validacoesFilhas.addAll(Arrays.asList(valores));
    }

    void remove(ValidacaoComponent... valores){
        validacoesFilhas.removeAll(Arrays.asList(valores));
    }

    @Override
    boolean validar(Object... valores) {
        if(valores == null || valores.length == 0) {
            return false;
        }

        // Itera sobre todas as validações filhas e retorna false se alguma falhar
        for (ValidacaoComponent validacao : validacoesFilhas) {
            if(!validacao.validar(valores)) {
                return false;
            }
        }

        return true; // Retorna true se todas as validações forem bem-sucedidas
    }
}
