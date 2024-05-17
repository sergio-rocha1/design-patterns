# Projeto de Veículos com Factory Method

Este projeto demonstra o uso do padrão de design Factory Method em Java, implementado para criar objetos de veículos, como carros e bicicletas, de maneira flexível e extensível. O Factory Method é um padrão criacional que proporciona uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

## Sobre o Factory Method

O Factory Method encapsula a criação de objetos, permitindo que as classes deleguem a instânciação para suas subclasses. Ele é particularmente útil em sistemas onde é necessário gerenciar, manter ou manipular coleções de objetos que são similares em estrutura, mas variam no detalhe.

### Quando Usar o Factory Method

- Quando a criação de um objeto requer alguma lógica de negócio que não deve ser exposta ao cliente.
- Quando é necessário adicionar produtos ao programa sem quebrar o código existente, respeitando o Princípio Aberto/Fechado.
- Quando a classe prevê que o número de produtos pode aumentar no futuro.

### Como Adicionar Novos Veículos

Para adicionar novos tipos de veículos ao projeto, siga estes passos:

1. **Definir uma Nova Classe de Veículo**: Crie uma nova classe que implemente a interface `Veiculo`. Esta classe representará um novo tipo de veículo (ex: `Moto`).
2. **Implementar os Métodos do Veículo**: Na sua nova classe de veículo, implemente os métodos definidos na interface `Veiculo` (`buscar`, `parar`, `getTipo`).
3. **Criar uma Factory para o Veículo**: Desenvolva uma nova factory concreta que estenda `VeiculoFactory` e implemente o método `getVeiculo` para retornar instâncias do novo veículo.
4. **Utilizar a Nova Factory**: No ponto de entrada do programa (por exemplo, na classe `Main`), utilize a nova factory para criar instâncias do seu veículo conforme necessário.

## Estrutura do Projeto

O projeto está dividido em várias classes principais:

- **Interfaces e Classes de Veículos**:
    - `Veiculo`: Interface comum a todos os veículos.
    - `Carro`, `Bicicleta`: Implementações concretas de `Veiculo`.

- **Factories de Veículos**:
    - `VeiculoFactory`: Classe abstrata base para factories.
    - `CarroFactory`, `BicicletaFactory`: Subclasses de `VeiculoFactory` que criam objetos `Carro` e `Bicicleta`, respectivamente.

- **Utilitário de Teste**:
    - `AlgoritmoVeiculosRandomico`: Classe que demonstra o uso dinâmico das factories.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.
2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá criar instâncias de diferentes veículos utilizando as factories, executar métodos específicos e imprimir os resultados no terminal.

## Exemplo de Saída

A execução do programa irá resultar em saídas variadas dependendo dos veículos criados e das ações executadas, exemplificando o uso do Factory Method para flexibilidade e extensibilidade na criação de objetos.