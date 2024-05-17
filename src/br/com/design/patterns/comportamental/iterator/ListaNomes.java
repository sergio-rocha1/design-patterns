package br.com.design.patterns.comportamental.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe que gerencia uma coleção de nomes.
 */
public class ListaNomes implements Iterable<String> {

    private final List<String> nomes;

    /**
     * Construtor que inicializa a lista de nomes.
     */
    public ListaNomes() {
        this.nomes = new ArrayList<>();
    }

    /**
     * Retorna um IteratorProtocol para iterar sobre os nomes.
     *
     * @return um IteratorProtocol específico para esta lista de nomes.
     */
    @Override
    public IteratorProtocol<String> iterator() {
        return new NomesIterator(nomes);
    }

    /**
     * Adiciona um ou mais nomes à lista.
     *
     * @param novosNomes um array de nomes a ser adicionado à lista.
     */
    public void adicionarNomes(String... novosNomes) {
        nomes.addAll(Arrays.asList(novosNomes));
    }

    /**
     * Retorna todos os nomes na lista como um array.
     *
     * @return um array contendo todos os nomes na lista.
     */
    public String[] getNomes() {
        return nomes.toArray(new String[0]);
    }

    /**
     * Retorna o tamanho da lista de nomes.
     *
     * @return o número de nomes na lista.
     */
    public int tamanho() {
        return nomes.size();
    }
}
