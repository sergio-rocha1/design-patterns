# Projeto com Padrão Proxy

Este projeto demonstra o uso do padrão de design Proxy em Java, implementado para controlar o acesso a objetos de banco de dados com funcionalidades adicionais como logs e cache. O padrão Proxy é um padrão estrutural que fornece um substituto ou marcador de localização para outro objeto para controlar o acesso a esse objeto.

## Sobre o Padrão Proxy

O padrão Proxy é utilizado para criar um intermediário que atua entre a chamada de um objeto e sua execução. É especialmente útil para controlar o acesso, realizar operações antes ou depois da execução do objeto real, adicionar logs, gerenciar a autenticação, e outras funcionalidades sem alterar o objeto real.

### Quando Usar o Proxy

- Para adicionar funcionalidades como logging e cache sem modificar o código original.
- Para controlar o acesso a recursos que podem ser caros ou sensíveis.
- Para gerenciar o ciclo de vida de objetos ou realizar ações antes e após operações no objeto real.

### Estrutura do Projeto

O projeto inclui várias classes que demonstram o uso do padrão Proxy:

- **Classes de Base de Dados**:
    - `ProdutoDAO`: Classe original que simula acesso a um banco de dados.
    - `LogProdutoDAO`: Proxy que adiciona logs às operações de `ProdutoDAO`.
    - `CacheProdutoDAO`: Proxy que adiciona caching às operações de `ProdutoDAO`.

- **Factories e Interfaces**:
    - `IProdutoDAO2`: Interface para as operações do DAO.
    - `ProdutoDAO2`: Implementação da interface com funcionalidades básicas.
    - `LazyProdutoDAO`: Proxy que implementa inicialização preguiçosa.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.
2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá demonstrar o uso de Proxies para adicionar logs e caching, bem como a inicialização preguiçosa.

## Exemplo de Saída

A execução do programa resultará em logs no console indicando as operações realizadas, os objetos acessados através dos proxies e os resultados das operações de cache e logs.

