# Projeto de Taxação de Produtos usando o Padrão Visitor

Este projeto demonstra a implementação do padrão de design Visitor em Java para separar um algoritmo dos elementos sobre os quais opera. O Visitor permite a execução de operações em elementos de uma estrutura complexa, como a criada pelo padrão Composite, facilitando a manutenção e expansão do código.

## Sobre o Visitor

O Visitor é um padrão de design comportamental que representa uma operação a ser executada sobre os elementos de uma estrutura de objeto. Ele permite separar um algoritmo dos elementos sobre os quais opera, facilitando a adição de novas operações sem modificar as classes dos elementos.

### Quando Usar o Visitor

- Quando é necessário executar um algoritmo em todos os elementos de uma estrutura complexa.
- Quando queremos separar uma lógica complexa dos objetos que ela opera, utilizando objetos auxiliares.

### Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Classes de Produto**:
    - `ProdutoProtocol`: Classe abstrata que define a interface comum para todos os produtos.
    - `Comida`, `Cigarro`, `BebidaAlcoolica`: Classes concretas que estendem `ProdutoProtocol`, cada uma representando diferentes categorias de produtos.

- **Visitor Interfaces e Implementações**:
    - `TaxasVisitor`: Interface que define os métodos de visita para diferentes tipos de produtos.
    - `TaxaBrasilVisitor`, `TaxaEstadosUnidosVisitor`: Implementações concretas da interface `TaxasVisitor` que definem como as taxas são calculadas para cada tipo de produto em diferentes regiões.

- **Classe Main**:
    - `Main`: Classe para demonstrar o uso do padrão Visitor com diferentes `TaxasVisitor`.

## Como Executar o Projeto

Para rodar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar o programa.
    - O sistema demonstrará a taxação de diferentes produtos com taxas aplicadas para Brasil e EUA.

## Exemplo de Saída
```
Total sem taxas: 20
Total COM taxas do BRASIL: 30.50
Total COM taxas dos EUA: 28.0
```
Este exemplo ilustra o uso do padrão Visitor para calcular taxas sobre diferentes tipos de produtos, mantendo o código limpo e seguindo os princípios SRP e OCP.

## Consequências do Uso do Visitor

- **Vantagens**:
    - Limpeza do código de negócio.
    - Separação de algoritmos complexos em objetos auxiliares.
    - Suporta os princípios de SRP e OCP.

- **Desvantagens**:
    - A necessidade de atualização dos Visitors quando novos elementos são adicionados à estrutura.
    - Limitações de acesso devido ao encapsulamento, que pode restringir a visibilidade a certos membros dos elementos.
