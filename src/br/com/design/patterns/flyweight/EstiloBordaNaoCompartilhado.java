package br.com.design.patterns.flyweight;

// Estilo de Borda não compartilhado
class EstiloBordaNaoCompartilhado implements EstiloBordaFlyweight {
    private String configuracaoCompleta;

    public EstiloBordaNaoCompartilhado(String configuracaoCompleta) {
        this.configuracaoCompleta = configuracaoCompleta;
    }

    @Override
    public void aplicarEstilo(String corBorda) {
        System.out.println("Aplicando estilo de borda não compartilhado " + configuracaoCompleta + " com cor " + corBorda);
    }
}
