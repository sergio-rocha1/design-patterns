# Projeto de Estilos de Borda com Padrão Flyweight

Este projeto demonstra o uso do padrão de design Flyweight em Java, implementado para gerenciar estilos de borda de forma eficiente em um editor gráfico, economizando memória ao compartilhar estilos comuns entre diferentes objetos gráficos.

## Sobre o Padrão Flyweight

O Flyweight é um padrão de otimização que visa economizar memória ao compartilhar estados intrínsecos de objetos entre múltiplas instâncias, adequado para sistemas com um alto volume de objetos semelhantes.

### Quando Usar o Flyweight

- Em sistemas de design gráfico onde estilos de borda são aplicados repetidamente a diversos elementos gráficos.
- Quando é essencial reduzir o consumo de memória devido à grande quantidade de objetos.
- Quando os objetos compartilham partes de seu estado que não mudam frequentemente (estado intrínseco).

### Como Implementar o Flyweight

Para implementar o padrão Flyweight em estilos de borda, siga estes passos:

1. **Identificar os Estados**: Separe o estado intrínseco (estilo de borda) que pode ser compartilhado do estado extrínseco (cor da borda) que varia entre os objetos.
2. **Criar uma Fábrica de Estilos de Borda**: Desenvolva uma fábrica que gerencia a criação e compartilhamento dos estilos de borda.
3. **Utilizar a Fábrica no Editor**: No editor gráfico, utilize a fábrica para aplicar estilos de borda compartilhados aos elementos gráficos conforme necessário.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Interfaces e Classes de Estilo de Borda**:
  - `EstiloBorda`: Interface comum para todos os estilos de borda.
  - `EstiloBordaConcreto`: Implementação concreta do `EstiloBorda` para estilos compartilhados.
  - `EstiloBordaNaoCompartilhado`: Implementação do `EstiloBorda` para estilos não compartilhados.

- **Fábrica de Estilos de Borda**:
  - `FabricaDeEstilosDeBorda`: Classe que gerencia a criação e o compartilhamento de estilos de borda.

- **Cliente (Editor Gráfico)**:
  - `EditorGrafico`: Classe que demonstra o uso de estilos de borda através da fábrica em diversos elementos gráficos.

## Como Executar o Projeto

Para executar este projeto, proceda da seguinte forma:

1. **Compilar o Projeto**:
  - Navegue até o diretório do projeto no terminal.
  - Execute o comando `javac EditorGrafico.java` para compilar o projeto.
2. **Executar o Projeto**:
  - Execute o projeto com o comando `java EditorGrafico`.
  - O programa irá aplicar estilos de borda aos elementos gráficos, demonstrando o uso eficiente da memória.

## Exemplo de Saída

A execução do programa resultará na demonstração de aplicação de estilos de borda a diferentes elementos gráficos, mostrando como o uso compartilhado de estilos intrínsecos economiza memória.
