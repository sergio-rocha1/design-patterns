# Projeto Sistema de Pedidos com State

Este projeto demonstra o uso do padrão de design State em Java, implementado para gerenciar os diferentes estados de um pedido de compra. O padrão State é um padrão comportamental que permite que um objeto altere seu comportamento quando seu estado interno muda, como se o objeto tivesse mudado sua classe.

## Sobre o State

O padrão State é utilizado para encapsular os estados variados de um objeto dentro de classes estado específicas. Isso reduz a necessidade de condicionais no código e facilita a manutenção e evolução da aplicação.

### Intenção Oficial

Permite que um objeto altere seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado sua classe. Por exemplo, um pedido de e-commerce pode comportar-se de maneira diferente baseado no status do pagamento, evitando condicionais complexas e desacoplando o comportamento do estado do objeto.

### Quando Usar o State

- Quando um objeto pode se comportar de maneira diferente dependendo do seu estado atual.
- Quando é necessário evitar o uso de condicionais que alteram o comportamento da classe de acordo com valores dos campos.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Estado**:
    - `PedidoCompraState`: Interface que define os métodos para manipulação dos estados.
    - `PedidoPendente`, `PedidoAprovado`, `PedidoReprovado`: Classes que implementam a interface `PedidoCompraState`, representando os diferentes estados de um pedido.

- **Contexto**:
    - `PedidoCompra`: Classe que mantém uma referência ao estado atual do pedido e delega a ele a execução dos comportamentos específicos.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá demonstrar a transição de estados de um pedido, exibindo comportamentos específicos conforme o estado atual.

## Consequências

- **Boas**:
    - Desacopla a lógica de um estado da classe de contexto.
    - Permite a criação de novos estados apenas adicionando novas classes.
    - Elimina condicionais complexas da classe de contexto.

- **Ruins**:
    - Se existem poucas condicionais simples, aplicar este padrão pode deixar o código mais complexo do que o necessário.

## Exemplo de Saída

A execução do programa resultará na demonstração de transições de estado de um pedido, onde os métodos são chamados de acordo com o estado atual do pedido, exemplificando o uso efetivo do padrão State em uma aplicação prática.
