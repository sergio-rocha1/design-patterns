package br.com.design.patterns.comportamental.iterator;

import java.util.Iterator;

/**
 * Interface para um protocolo de iteração que permite reiniciar a iteração.
 * Esta interface estende o Iterator padrão para adicionar um método de reset.
 *
 * @param <T> o tipo de elementos retornados por este iterator.
 */
public interface IteratorProtocol<T> extends Iterator<String> {

    /**
     * Reinicia o iterador para a posição inicial.
     */
    void reset();

    /**
     * Retorna o próximo elemento na iteração.
     *
     * @return o próximo elemento se disponível, caso contrário, retorna null.
     */
    @Override
    String next();

    /**
     * Verifica se há mais elementos a serem iterados.
     *
     * @return true se houver mais elementos, false caso contrário.
     */
    @Override
    boolean hasNext();
}
