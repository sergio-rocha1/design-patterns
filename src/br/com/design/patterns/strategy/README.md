# Projeto de Cálculo de Juros com Padrão Strategy

Este projeto exemplifica o uso do padrão de design Strategy no contexto de cálculo de juros para pedidos, permitindo a troca flexível entre diferentes estratégias de cálculo de juros, representadas aqui por diferentes bancos (Itau e Santander).

## Pré-requisitos

Antes de iniciar, assegure-se de que você tem o JDK (Java Development Kit) instalado em sua máquina. Este projeto foi desenvolvido usando o JDK 8, mas versões mais recentes devem ser compatíveis.

## Configurando o Ambiente

1. **Clone o Repositório**: Primeiramente, clone o repositório do projeto para sua máquina local usando:
   git clone URL_DO_REPOSITÓRIO
2. **Abrindo o Projeto**: Abra a pasta do projeto clonado em sua IDE de Java preferida (por exemplo, IntelliJ IDEA, Eclipse, ou NetBeans).

## Compilando o Projeto

Para compilar o projeto, você pode utilizar o sistema de build integrado à sua IDE ou compilar manualmente através do terminal com o seguinte comando:
    javac -d bin src/br/com/design/patterns/strategy/*.java
Este comando compila todos os arquivos `.java` no diretório `src/br/com/design/patterns/strategy` e coloca os arquivos de classe resultantes no diretório `bin`.

## Executando o Projeto

Após compilar, você pode executar o projeto com o seguinte comando:
    java -cp bin br.com.design.patterns.strategy.Main
Isso irá executar a classe `Main`, iniciando o processo de cálculo de juros para um pedido usando inicialmente a estratégia do Itau, seguido pela estratégia do Santander, e exibirá os resultados no terminal.

## Entendendo o Código

O projeto utiliza o padrão Strategy para permitir a troca de algoritmos de cálculo de juros em tempo de execução sem alterar o código que usa o algoritmo de cálculo. A interface `CalculadoraJurosStrategyInterface` define o contrato para as estratégias de cálculo de juros, enquanto as classes `Itau` e `Santander` implementam esta interface, oferecendo diferentes taxas de juros. A classe `Pedido` representa um pedido com um valor total, e a classe `CalculadoraDeJuros` é responsável por calcular os juros do pedido usando a estratégia especificada.

## Conclusão

Este projeto demonstra a flexibilidade e a força do padrão de design Strategy, facilitando a adição de novas estratégias de cálculo de juros sem modificar o código existente que realiza o cálculo.




