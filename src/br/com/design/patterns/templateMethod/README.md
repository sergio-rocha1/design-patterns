# Projeto de processador de pagamentos usando Template Method

Este projeto demonstra a implementação do padrão de design Template Method em Java para definir o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para subclasses. O Template Method permite que as subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

## Sobre o Template Method

O Template Method é um padrão de design comportamental que define a estrutura de um algoritmo em uma classe base, permitindo que subclasses forneçam implementações específicas para alguns passos do algoritmo.

### Quando Usar o Template Method

- Quando precisamos de variações de um mesmo algoritmo sem mudar a ordem de execução dos métodos.
- Quando percebemos que estamos usando herança para alterar apenas pequenos trechos de código de um algoritmo.

### Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Classe Abstrata Base**:
    - `ProcessadorPagamento`: Classe abstrata que define o esqueleto do algoritmo em seu método `processarPagamento()`, com passos que podem ser substituídos por subclasses. Além dos passos obrigatórios, essa classe oferece a possibilidade de inclusão de Hooks em pontos estratégicos do algoritmo.
        - **Hooks Disponíveis**:
            - `notificarAdicional()`: Hook que permite a inclusão de ações adicionais de notificação durante o processamento do pagamento.
            - `finalizarAdicional()`: Hook que permite a inclusão de ações adicionais de finalização após o processamento do pagamento.
- 
- **Implementações Concretas**:
    - `ProcessadorPagamentoCredito`: Implementação concreta da classe abstrata `ProcessadorPagamento` para processamento de pagamento com cartão de crédito.
    - `ProcessadorPagamentoPix`: Implementação concreta da classe abstrata `ProcessadorPagamento` para processamento de pagamento via Pix.

- **Classe Main**:
    - `Main`: Classe para demonstrar o uso do Template Method com as implementações concretas `ProcessadorPagamentoCredito` e `ProcessadorPagamentoPix`.

## Como Executar o Projeto

Para rodar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar o programa.
    - O sistema irá demonstrar o processamento de pagamentos com diferentes métodos.

## Exemplo de Saída
```
Reservando produtos
Validando cadastro
Debitando cartão de crédito...
Notificação especifica do cartão de crédito!
Notificando usuário
Finalizando compra
Notificação adicional do cartão de crédito

Reservando produtos
Validando cadastro
Fazendo débito do pix do usuário...
Notificando usuário
Finalizando compra
Fazendo finalização adicional do débito do pix...
```
Este exemplo ilustra o uso do padrão Template Method para processar pagamentos com diferentes métodos, mantendo a ordem de execução dos passos do algoritmo.

