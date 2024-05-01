# Projeto Home Theater com Facade

Este projeto demonstra a implementação do padrão de design Facade em Java para simplificar a interação com um sistema de home theater complexo. O Facade oferece uma interface unificada para controlar diversos componentes, como DVD player, projetor, tela e sistema de som, ocultando a complexidade do sistema subjacente.
## Sobre o Facade

O Facade é um padrão estrutural que cria uma interface simplificada para um subsistema complexo. Ele encapsula a complexidade do sistema e fornece uma interface mais fácil de usar, reduzindo o acoplamento entre o código do cliente e os subsistemas.

### Quando Usar o Facade

- Para simplificar a interface de um subsistema complexo.
- Para desacoplar o código do cliente da implementação do subsistema.
- Para lidar com a possibilidade de mudanças futuras na complexidade do subsistema.

### Componentes do Sistema
O sistema de home theater deste projeto inclui os seguintes componentes:
- DVD Player: Responsável por reproduzir DVDs.
- Projetor: Projeta a imagem do filme na tela.
- Tela: A superfície onde o filme é projetado.

## Estrutura do Projeto

O projeto está dividido em várias classes principais:

- **Interfaces de Componentes:**
  - `DvdPlayer`, `Projetor`, `Tela`: Interfaces para cada componente do sistema.
- **Implementações de Componentes:**
  - `DvdPlayerImpl`, `ProjetorImpl`, `TelaImpl`: Classes concretas que implementam as interfaces dos componentes.
- **Facade do Home Theater:**
  - `HomeTheaterFacade`: Classe que fornece uma interface simplificada para controlar todos os componentes do sistema.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.
2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá usar a `HomeTheaterFacade` para ligar o sistema, assistir um filme e desligar o sistema.

## Benefícios do Facade
- **Simplificação da interface**: O código do cliente não precisa lidar com a complexidade dos componentes individuais.
- **Desacoplamento**: As alterações na implementação dos componentes não afetam o código do cliente.
- **Maior flexibilidade**: É possível adicionar ou remover componentes do sistema sem afetar a interface da fachada.