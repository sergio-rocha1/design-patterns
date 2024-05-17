# Projeto de Iteração com o Padrão Iterator

Este projeto demonstra o uso do padrão de design Iterator em Java, implementado para iterar sobre uma coleção de nomes de forma flexível e extensível. O padrão Iterator é um padrão comportamental que proporciona uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação subjacente.

## Sobre o Padrão Iterator

O Iterator desacopla os algoritmos de iteração da coleção, permitindo que diferentes iterações sejam aplicadas facilmente sem alterar a estrutura da coleção. É útil em sistemas onde as coleções de objetos precisam ser percorridas de várias maneiras, ou quando uma encapsulação completa da coleção é necessária.

### Quando Usar o Padrão Iterator

- Para evitar a exposição das estruturas internas da coleção.
- Quando uma coleção pode ter múltiplas formas de travessia.
- Para permitir uma travessia flexível e possivelmente simultânea de uma coleção sem interferência com a própria coleção.

## Estrutura do Projeto

O projeto está dividido nas seguintes classes principais:

- **Interfaces**:
    - `IteratorProtocol<T>`: Interface para criar iteradores que podem ser resetados.
    - `Iterable<T>`: Interface para objetos que podem ser iterados.

- **Implementações Concretas**:
    - `NomesIterator`: Implementa `IteratorProtocol<String>` para iterar sobre uma lista de nomes.
    - `ListaNomes`: Coleção que implementa `Iterable<String>` e contém os nomes a serem iterados.

- **Classe Principal**:
    - `Main`: Demonstra o uso de `ListaNomes` e `NomesIterator` para iterar sobre nomes e resetar a iteração.

## Consequências do Padrão Iterator

### Pontos Positivos
- Permite pausar a iteração e continuar posteriormente.
- Facilita múltiplas iterações paralelas da mesma coleção, usando diferentes objetos iteradores.
- Simplifica a adição de novos tipos de iteração sem alterar a coleção principal.
- Mantém o código da coleção limpo de algoritmos de travessia.
### Pontos Negativos
- Pode introduzir complexidade desnecessária em coleções simples que não exigem iterações complexas.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá iterar sobre a lista de nomes, imprimir cada nome e, após completar a iteração, resetar e repetir o processo.

## Exemplo de Saída

A execução do programa irá iterar sobre os nomes, imprimir cada um e, após o término da lista, avisar que não há mais elementos. Após um reset, a iteração acontece novamente.

