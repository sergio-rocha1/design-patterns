# Projeto Exemplo do Padrão Strategy

Este projeto demonstra o uso do padrão de design Strategy, implementado em Java. O padrão Strategy é útil para situações em que é necessário selecionar um algoritmo de um conjunto de algoritmos em tempo de execução. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Sobre o Padrão Strategy

O padrão Strategy define uma família de algoritmos, encapsula cada um deles, e os torna intercambiáveis. A estratégia permite que o algoritmo varie independentemente dos clientes que o usam. Isso é feito por meio de uma interface que representa uma ação ou um conjunto de ações, e várias implementações dessa interface que representam diferentes algoritmos.

### Quando Usar o Strategy

- Quando há vários algoritmos para uma tarefa específica e o cliente deve ser capaz de escolher qual algoritmo usar durante o tempo de execução.
- Quando você quer evitar expor a complexidade dos algoritmos e suas estruturas de dados aos clientes.
- Quando uma classe possui muitos comportamentos e esses comportamentos aparecem como múltiplas condicionais em suas operações.

### Como Adicionar Novas Estratégias

Para adicionar novas estratégias ao projeto atual, siga estes passos:

1. **Definir uma Nova Classe de Estratégia**: Crie uma nova classe que implemente a interface `CalculadoraJurosStrategyInterface`. Esta classe representará uma nova estratégia de cálculo de juros.

2. **Implementar o Método de Estratégia**: Na sua nova classe de estratégia, implemente o método `getTaxaDeJuros`, definindo a lógica específica para calcular a taxa de juros conforme desejado.

3. **Utilizar a Nova Estratégia**: No cliente (por exemplo, na classe `Main` ou em qualquer outra parte do seu aplicativo onde seja necessário calcular juros), instancie a nova estratégia e passe-a para o construtor ou setter da classe `CalculadoraDeJuros`.

### Como Executar o Projeto

Para executar este projeto, é necessário ter o JDK instalado. Siga os passos abaixo:

1. **Compilar o Projeto**: Navegue até o diretório do projeto no terminal e compile o projeto com o comando:
   javac Main.java
2. **Executar o Projeto**: Após a compilação, execute o projeto com:
   java Main
3. **Verificar os Resultados**: O programa calculará e exibirá os juros para um `Pedido` usando diferentes estratégias (`Itau`, `Santander`), demonstrando a flexibilidade do padrão Strategy em tempo de execução.