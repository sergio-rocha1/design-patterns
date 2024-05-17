package br.com.design.patterns.estrutural.composite.exemploValidacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Leaf
public class ValidaEmail extends ValidacaoComponent {
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    @Override
    boolean validar(Object... valores) {
        if (valores == null || valores.length == 0) {
            return false;
        }

        for(Object valor : valores) {
            if (valor == null || !(valor instanceof String)) {
                return false;
            }

            String email = (String) valor;

            // Expressão regular para validar o padrão de e-mail
            Pattern pattern = Pattern.compile(REGEX_EMAIL);
            Matcher matcher = pattern.matcher(email);

            if(!matcher.matches()) {
                return false;
            }
        }

        return true;
    }
}
