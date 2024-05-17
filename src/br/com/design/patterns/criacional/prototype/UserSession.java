package br.com.design.patterns.criacional.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserSession implements Prototype{

    private String idUsuario;
    private String configuracoes;

    private List<String> preferencias;

    public UserSession(String userId) {
        this.idUsuario = userId;
        this.configuracoes = carregarConfiguracoes();
        this.preferencias = carregarPreferenciasUsuario();
    }


    private String carregarConfiguracoes() {
        // Simula a carga de uma configuração complexa
        return "ConfiguracaoComplexa";
    }

    private List<String> carregarPreferenciasUsuario() {
        // Simula o carregamento de preferências do usuário
        return new ArrayList<>(Arrays.asList("DarkMode", "NotificationsOn"));
    }

    @Override
    public Prototype clone() {
        UserSession clone = new UserSession(this.idUsuario);
        clone.configuracoes = this.configuracoes;
        clone.preferencias = new ArrayList<>(this.preferencias);
        return clone;
    }

    @Override
    public String toString() {
        return "UserSession{" +
                "userId='" + idUsuario + '\'' +
                ", configuration='" + configuracoes + '\'' +
                ", userPreferences=" + preferencias +
                '}';
    }

    public List<String> getPreferencias() {
        return preferencias;
    }
}
