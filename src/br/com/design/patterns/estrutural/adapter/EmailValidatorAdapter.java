package br.com.design.patterns.estrutural.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Imagine que nessa classe, no método isEmail tem a biblioteca que faz a validação de e-mail
* Lembrando que terá um import da lib que faz a validação de e-mail */
public class EmailValidatorAdapter implements EmailValidatorProtocol {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    @Override
    public boolean isEmail(String value) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);

        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
