package br.com.design.patterns.iterator;

/**
 * Interface para objetos que podem ser iterados utilizando IteratorProtocol.
 *
 * @param <T> o tipo de elementos que podem ser iterados.
 */
public interface Iterable<T> {
    IteratorProtocol<T> iterator();
}
