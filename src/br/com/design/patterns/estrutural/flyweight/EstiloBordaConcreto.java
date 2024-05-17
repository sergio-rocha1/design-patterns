package br.com.design.patterns.estrutural.flyweight;

// Implementação concreta de EstiloBorda que será compartilhada
class EstiloBordaConcreto implements EstiloBordaFlyweight {
    private String estilo;

    public EstiloBordaConcreto(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public void aplicarEstilo(String corBorda) {
        System.out.println("Aplicando estilo de borda " + estilo + " com cor " + corBorda);
    }
}
