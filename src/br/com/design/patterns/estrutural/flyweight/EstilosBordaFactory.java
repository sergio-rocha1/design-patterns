package br.com.design.patterns.estrutural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Fábrica de Estilos de Borda
public class EstilosBordaFactory {
    private Map<String, EstiloBordaFlyweight> estilos = new HashMap<>();

    public EstiloBordaFlyweight getEstiloBorda(String chaveEstilo) {
        if (!estilos.containsKey(chaveEstilo)) {
            estilos.put(chaveEstilo, new EstiloBordaConcreto(chaveEstilo));
        }
        return estilos.get(chaveEstilo);
    }
}
