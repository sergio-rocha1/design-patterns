# Projeto de Produtos com Decorator Pattern

Este projeto demonstra o uso do padrão de design Decorator em Java, implementado para adicionar funcionalidades a objetos de produtos, como camisetas e canetas, de maneira flexível e extensível. O Decorator Pattern é um padrão estrutural que permite a adição de responsabilidades a objetos de forma dinâmica, e é uma alternativa flexível à criação de subclasses para extensão de funcionalidades.

## Sobre o Decorator Pattern

O Decorator Pattern envolve um conjunto de classes decoradoras que são usadas para estender as funcionalidades de objetos concretos, implementando a mesma interface. Ele permite que comportamentos sejam adicionados a objetos individuais, seja estaticamente ou dinamicamente, sem afetar o comportamento de outros objetos da mesma classe.

### Quando Usar o Decorator Pattern

- Quando a extensão por meio de herança é impraticável ou resulta em uma hierarquia muito grqnde de classes.
- Quando a funcionalidade deve ser adicionada/removida dinamicamente a objetos.
- Quando é necessário adicionar funcionalidades a objetos específicos de uma classe, sem afetar outros objetos da mesma classe.

### Como Adicionar Novos Decoradores

Para adicionar novos tipos de decoradores ao projeto, siga estes passos:

1. **Definir uma Nova Classe Decoradora**: Crie uma nova classe que estenda `ProdutoDecorator`. Esta classe representará um novo tipo de decorador (ex: `ProdutoEmbaladoDecorator`).
2. **Implementar os Métodos Decoradores**: Na sua nova classe decoradora, sobrescreva os métodos necessários para adicionar a nova funcionalidade ao produto.
3. **Utilizar o Decorador**: Na classe `Main`, instancie o produto original com o novo decorador para adicionar as funcionalidades desejadas.

## Estrutura do Projeto

O projeto está dividido em várias classes principais:

- **Interfaces e Classes de Produtos**:
    - `ProdutoInterface`: Interface comum a todos os produtos.
    - `Camiseta`, `Caneta`: Implementações concretas de `ProdutoInterface`.

- **Classes de Decoradores**:
    - `ProdutoDecorator`: Classe abstrata base para decoradores.
    - `ProdutoPintadoDecorator`, `ProdutoCustomizadoDecorator`: Subclasses de `ProdutoDecorator` que adicionam funcionalidades específicas aos produtos.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar todas as classes do projeto.
2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá criar instâncias de produtos, aplicar diferentes decoradores e imprimir os resultados no terminal, demonstrando a flexibilidade do Decorator Pattern.

## Exemplo de Saída

A execução do programa pode resultar em saídas como:
 ```
    Camiseta com um preco de: 10
    Camiseta pintada com um preco de: 20
    Camiseta pintada pintada com um preco de: 30
    Camiseta pintada customizada com um preco de: 70
 ```

Este exemplo ilustra como o Decorator Pattern pode ser utilizado para adicionar novas funcionalidades, como pintura e customização, a produtos simples de forma dinâmica e reversível.

