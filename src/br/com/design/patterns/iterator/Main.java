package br.com.design.patterns.iterator;

import java.util.Arrays;

/**
 * Classe principal que demonstra o uso de ListaNomes e IteratorProtocol.
 */
public class Main {

    public static void main(String[] args) {
        ListaNomes listaNomes = new ListaNomes();
        listaNomes.adicionarNomes("Sergio", "Gustavo", "Otavio", "William", "Bruno");

        System.out.println("\nIteração:");
        IteratorProtocol<String> iterator = listaNomes.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n");
        iterator.next(); // Retornará "Não há mais elementos"

        iterator.reset();
        System.out.println("\nIteração após reset:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nTamanho da lista: " + listaNomes.tamanho());
        System.out.println("\nNomes na lista: " + Arrays.toString(listaNomes.getNomes()));
    }
}
