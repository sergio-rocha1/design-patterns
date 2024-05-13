package br.com.design.patterns.iterator;

import java.util.List;

/**
 * Implementação concreta de IteratorProtocol para uma lista de nomes.
 */
public class NomesIterator implements IteratorProtocol<String> {

    private final List<String> nomes;
    private int posicaoAtual = 0;

    /**
     * Construtor que inicializa o iterador com uma lista específica de nomes.
     *
     * @param nomes a lista de nomes para iterar.
     */
    public NomesIterator(List<String> nomes) {
        this.nomes = nomes;
    }

    /**
     * Reinicia o iterador para a primeira posição.
     */
    @Override
    public void reset() {
        posicaoAtual = 0;
    }

    /**
     * Retorna o próximo nome na lista ou notifica que não há mais elementos.
     *
     * @return o próximo nome se disponível; caso contrário, notifica que não há mais elementos e retorna null.
     */
    @Override
    public String next() {
        if (!hasNext()) {
            System.out.println("Não há mais elementos!");
            return null;
        }
        return nomes.get(posicaoAtual++);
    }

    /**
     * Verifica se há mais nomes a serem retornados na iteração.
     *
     * @return true se houver mais nomes, false caso contrário.
     */
    @Override
    public boolean hasNext() {
        return posicaoAtual < nomes.size();
    }
}
