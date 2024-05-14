# Projeto Marketplace com Mediator

Este projeto demonstra o uso do padrão de design Mediator em Java, implementado para gerenciar a interação entre vendedores e compradores em um marketplace. O Mediator é um padrão comportamental que ajuda a encapsular como um conjunto de objetos interage, promovendo um acoplamento fraco e permitindo que você varie suas interações sem alterar os objetos que enviam ou recebem mensagens.

## Sobre o Mediator

O padrão Mediator é utilizado para reduzir a complexidade de comunicação entre múltiplos objetos ou classes. Ele atua como um intermediário que controla e gerencia as interações entre diferentes objetos, permitindo que eles não tenham conhecimento direto uns dos outros, o que facilita a manutenção e a evolução do código.

### Quando Usar o Mediator

- Quando a complexidade das comunicações entre múltiplos objetos torna o sistema difícil de entender e manter.
- Quando o acoplamento entre as classes de um aplicativo torna difícil modificar, estender ou reutilizar as classes porque estão muito interligadas.

### Intenção Oficial

Definir um objeto que encapsula como um conjunto de objetos interage. O Mediator promove o acoplamento fraco ao evitar que os objetos se refiram explicitamente uns aos outros, permitindo que você varie suas interações.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Mediator**:
    - `Mediator`: Classe que implementa a mediação, coordenando os objetos `Vendedor` e `Comprador`.

- **Colleague**:
    - `Vendedor`: Representa o vendedor no marketplace, conhece seu mediator mas não seus colegas.
    - `Comprador`: Representa o comprador que interage com os vendedores através do mediator.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá demonstrar a interação entre compradores e vendedores usando o mediator para mediar essas interações.

## Consequências

- **Boas**:
    - Reduz o acoplamento direto entre os objetos, facilitando a manutenção e a evolução do sistema.
    - Centraliza o controle das interações em um único local, facilitando a gestão das comunicações.

- **Ruins**:
    - Pode levar à criação de mediators muito complexos que são difíceis de manter, conhecidos como "god class".

## Exemplo de Saída

A execução do programa resultará na demonstração de interações entre compradores e vendedores, onde todos se comunicam através de um mediator central, exemplificando o uso efetivo do padrão Mediator em uma aplicação prática.
