# Aplicação do Padrão Observer

Este projeto demonstra a implementação do padrão de design Observer em Java para notificar lojas sobre mudanças no estoque de produtos.

## Intenção Oficial

- Define uma dependência um para muitos entre objetos, de modo que, quando um objeto muda de estado, todos os seus dependentes são automaticamente notificados e atualizados.

## Sobre o Observer

- Implementado com dois tipos de objetos: objetos observáveis (Observable) e objetos observadores (Observer).
- Objetos observáveis (Observable) têm uma referência para todos os seus observadores. Isso torna possível adicionar, remover e notificar todos os observadores quando seu estado muda.
- Objetos observadores (Observer) devem ter meios de receber notificação de seus observáveis. Geralmente isso é feito com apenas um método.

## Estrutura do Padrão de Projeto

- A interface `Observable` tem uma referência para todos os observers, e os métodos de adicionar, remover e notificar.

## Quando Usar o Observer?

- Quando precisamos notificar vários objetos sobre a mudança de estado de outros objetos.

## Consequências

- Boas:
    - Usa o SRP e OCP. Pode criar outros Observers facilmente.
    - Facilita a comunicação entre objetos em tempo de execução.
- Ruins:
    - Pode ser complexo ou impossível manter a ordem em que as notificações são enviadas.

## Funcionamento da Aplicação

A aplicação consiste nas seguintes classes principais:

- **Estoque**: Representa o objeto observável que mantém informações sobre o estoque de produtos. Ele notifica as lojas interessadas sobre mudanças no estoque.

- **Loja**: Representa o objeto observador que deseja receber notificações sobre mudanças no estoque. Implementa o método `update()` para reagir às notificações do estoque.

- **Produto**: Representa um produto com seu nome e quantidade em estoque.

- **Main**: Classe principal que demonstra o uso do padrão Observer. Ela cria um estoque, duas lojas e registra as lojas como observadores do estoque. Em seguida, atualiza o estoque com um novo produto e altera sua quantidade para demonstrar a notificação das lojas sobre mudanças no estoque de produtos.

## Como Executar a Aplicação

Para executar a aplicação, basta compilar todas as classes e executar a classe `Main`. Isso pode ser feito da seguinte forma:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar a aplicação.
    - O sistema irá demonstrar a notificação das lojas sobre mudanças no estoque de produtos.

## Exemplo de Saída
````
Notificação para a loja Loja A: O estoque do produto Camiseta mudou para 50
Notificação para a loja Loja B: O estoque do produto Camiseta mudou para 50
Notificação para a loja Loja A: O estoque do produto Camiseta mudou para 40
Notificação para a loja Loja B: O estoque do produto Camiseta mudou para 40
````
Este exemplo ilustra a notificação das lojas sobre mudanças no estoque de produtos.

## Conclusão

Através da implementação do padrão Observer, nossa aplicação permite que lojas interessadas sejam notificadas automaticamente sobre mudanças no estoque de produtos. Isso promove uma comunicação eficaz entre o estoque e as lojas, garantindo que as informações estejam sempre atualizadas.