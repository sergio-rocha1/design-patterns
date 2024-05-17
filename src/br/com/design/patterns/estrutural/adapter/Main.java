package br.com.design.patterns.estrutural.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String email = "exemplo1@adapter.com.br";

        // Sem o Adapter
        if(isEmail(email)) {
            System.out.println("O email informado é valido!");
        } else {
            System.out.println("O email informado é invalido!");
        }

        // Com o adapter
        if(validaEmail(new EmailValidatorAdapter(), email)) {
            System.out.println("O email informado é valido!");
        } else {
            System.out.println("O email informado é invalido!");
        }

    }

    // Imagine que aqui tenha uma biblioteca de validação de e-mail
    private static boolean isEmail(String email) {
        String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(EMAIL_REGEX);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean validaEmail(EmailValidatorProtocol validador, String value) {
        return validador.isEmail(value);
    }
}
