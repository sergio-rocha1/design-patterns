# Projeto Sistema de Aprovação de Orçamentos com Chain of Responsibility

Este projeto demonstra o uso do padrão de design Chain of Responsibility em Java, implementado para gerenciar o processo de aprovação de orçamentos em diferentes níveis hierárquicos de uma organização. O padrão Chain of Responsibility é um padrão comportamental que permite desacoplar o remetente de uma solicitação dos seus receptores, passando a solicitação ao longo da cadeia até que seja tratada por um objeto apropriado.

## Sobre o Chain of Responsibility

O padrão Chain of Responsibility é usado para passar uma solicitação entre uma sequência de objetos até que seja capturada por um objeto adequado. Este padrão é especialmente útil para implementar sequências de processamento em que várias etapas podem ser necessárias para tratar uma solicitação.

### Intenção Oficial

Evita o acoplamento do remetente de uma solicitação ao seu destinatário, dando a mais de um objeto a chance de tratar a solicitação. Encadeia os objetos receptores e passa a solicitação ao longo da cadeia até que um objeto a trate.

### Quando Usar o Chain of Responsibility

- Quando uma requisição precisa passar por uma sequência de operações até ser totalmente tratada.
- Quando é necessário evitar o uso de condicionais que alteram o comportamento da classe de acordo com valores dos campos.
- Quando queremos permitir que os objetos responsáveis pelo tratamento de requisição possam variar em tempo de execução.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Handler**:
    - `OrcamentoBaseHandler`: Classe abstrata base para os handlers.
    - `OrcamentoVendedorHandler`, `OrcamentoManagerHandler`, `OrcamentoDiretorHandler`, `OrcamentoCEOHandler`: Classes concretas que estendem `OrcamentoBaseHandler`, representando diferentes níveis de aprovação de orçamento.

- **Contexto**:
    - `OrcamentoCliente`: Classe que contém o total do orçamento e a flag de aprovação.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá demonstrar o processo de aprovação de orçamentos passando pelos diferentes handlers, cada um com sua própria lógica de tratamento de orçamento.

## Consequências

- **Boas**:
    - Desacopla o emissor da solicitação dos objetos que a tratam.
    - Permite mudanças na ordem e nos objetos da cadeia facilmente.
    - Aplica o Single Responsibility Principle e o Open/Closed Principle.

- **Ruins**:
    - Uma solicitação pode passar por toda a cadeia sem ser tratada.

## Exemplo de Saída

A execução do programa resultará na demonstração do processo de aprovação de um orçamento, onde cada handler pode aprovar ou passar o orçamento para o próximo na cadeia.
