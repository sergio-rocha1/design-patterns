# Projeto Editor de Imagens com Memento

Este projeto demonstra o uso do padrão de design Memento em Java, implementado para gerenciar o estado de um editor de imagens, permitindo operações como salvar e restaurar estados anteriores (undo). O Memento é um padrão comportamental que ajuda a restaurar o estado anterior de um objeto sem expor detalhes de sua implementação interna.

## Sobre o Memento

O padrão Memento é utilizado para capturar e externalizar o estado interno de um objeto de maneira que ele possa ser restaurado para esse estado mais tarde, sem violar o encapsulamento. Esse padrão é muito utilizado em aplicações que necessitam de uma funcionalidade de desfazer (CTRL+Z).

### Quando Usar o Memento

- Quando é necessário permitir a possibilidade de salvar e restaurar estados anteriores de um objeto sem violar seu encapsulamento.
- Quando a implementação de desfazer é necessária.
- Para fazer backups de estados de objetos sem que outras partes do sistema tenham acesso direto aos estados internos do objeto.

### Intenção Oficial

Capturar e externalizar um estado interno de um objeto de modo que o objeto possa ser restaurado para esse estado posteriormente, sem violar o encapsulamento.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Classes de Memento**:
    - `Memento`: Interface que define os métodos para obter detalhes do estado.
    - `MementoConcreto`: Implementação concreta de `Memento`, que armazena o estado do objeto `EditorImagem`.

- **Classe Originadora**:
    - `EditorImagem`: Classe que cria um memento para salvar seu estado e restaura seu estado a partir de um memento.

- **Cuidador**:
    - `EditorImagemBackupManager`: Responsável por gerenciar os mementos criados, permitindo salvar e desfazer estados do objeto `EditorImagem`.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá criar instâncias do editor de imagens, realizar modificações de formato, salvar e restaurar estados, mostrando o uso do padrão Memento.

## Consequências

- **Boas**:
    - Desacopla a responsabilidade de gerenciamento de estados da classe originadora.
    - Facilita a restauração de estados.

- **Ruins**:
    - Consumo de memória pode ser elevado com muitos backups.
    - A classe cuidadora precisa acompanhar as mudanças nas classes originadoras para garantir a integridade dos estados.

## Exemplo de Saída

A execução do programa resultará na demonstração da capacidade de alterar formatos de arquivo, salvar e restaurar os estados anteriores, mostrando a eficiência do padrão Memento em um aplicativo prático.

