package br.com.design.patterns.estrutural.flyweight;

// Classe cliente que usa estilos de borda
public class EditorGrafico {
    public static void main(String[] args) {
        EstilosBordaFactory fabrica = new EstilosBordaFactory();

        EstiloBordaFlyweight estilo1 = fabrica.getEstiloBorda("Pontilhado");
        EstiloBordaFlyweight estilo2 = fabrica.getEstiloBorda("Sólido");
        EstiloBordaFlyweight estilo3 = fabrica.getEstiloBorda("Pontilhado"); // Reutiliza o estilo pontilhado existente

        estilo1.aplicarEstilo("Vermelho");
        estilo2.aplicarEstilo("Azul");
        estilo3.aplicarEstilo("Verde");

        // Criando um estilo de borda não compartilhado
        EstiloBordaFlyweight estiloNaoCompartilhado = new EstiloBordaNaoCompartilhado("Estilo personalizado complexo");
        estiloNaoCompartilhado.aplicarEstilo("Preto");
    }
}