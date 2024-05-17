# Projeto de Controle Remoto com o Padrão Bridge

Este projeto demonstra o uso do padrão de design Bridge em Java, implementado para controlar dispositivos como rádios e TVs. O padrão Bridge é um padrão estrutural que tem a intenção de desacoplar uma abstração (controle remoto) de sua implementação (dispositivos), permitindo que ambos possam variar independentemente.

## Sobre o Padrão Bridge

O Bridge desacopla os componentes de alto nível de suas implementações específicas, proporcionando maior flexibilidade na configuração do software. Isso é útil em sistemas onde os componentes devem ser extensíveis e adaptáveis a diferentes situações e dispositivos.

### Quando Usar o Padrão Bridge

- Para evitar vinculação permanente entre a funcionalidade de interface e a implementação.
- Quando alterações na implementação de uma abstração devem ter mínimo impacto nos clientes.
- Quando você quer dividir e organizar um sistema com muitas classes.

## Estrutura do Projeto

O projeto está dividido nas seguintes classes principais:

- **Interface**:
    - `DeviceImplementation`: Define as operações que todos os dispositivos devem suportar (como ligar/desligar e ajustar volume).

- **Implementações Concretas**:
    - `Radio` e `TV`: Implementam a interface `DeviceImplementation`, definindo comportamentos específicos para cada tipo de dispositivo.

- **Abstrações**:
    - `ControleRemoto`: Representa uma abstração que pode operar qualquer dispositivo.
    - `ControleRemotoComVolume`: Extende `ControleRemoto` adicionando controle de volume.

- **Classe Principal**:
    - `Main`: Utiliza as abstrações para operar os dispositivos.

## Consequências do Padrão Bridge

### Pontos Positivos
- Separação de abstração e implementação permite múltiplas variações de implementação para uma abstração.
- Facilita a extensibilidade tanto das abstrações quanto das implementações.
- Promove o princípio de responsabilidade única (SRP) ao permitir que a evolução de aspectos funcionais e de implementação ocorra independentemente.

### Pontos Negativos
- Pode aumentar a complexidade do sistema devido à necessidade de criar uma ponte entre componentes.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**:
    - Execute o projeto com o comando `java Main`.
    - O programa irá demonstrar o controle de um dispositivo TV, alternando seu estado de energia e ajustando o volume.

## Exemplo de Saída

A execução do programa irá alternar o estado de energia do dispositivo TV, ajustar o volume e demonstrar a eficácia do desacoplamento entre a abstração e a implementação.

