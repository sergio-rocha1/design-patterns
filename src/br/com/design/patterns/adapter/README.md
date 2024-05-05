# Projeto Validador de E-mail usando Adapter 

Este projeto demonstra a implementação do padrão de design Adapter em Java para adaptar a interface de uma biblioteca de validação de e-mail existente para um novo protocolo definido em uma interface.

## Sobre o Adapter

O Adapter é um padrão de design estrutural que permite que objetos com interfaces incompatíveis trabalhem juntos. Ele envolve um objeto existente com uma interface nova e compatível para que possa ser utilizado em um contexto diferente.

### Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Interface EmailValidatorProtocol**:
    - Define o protocolo para validação de e-mail.

- **Classe EmailValidatorAdapter**:
    - Implementação do Adapter que adapta a interface de uma biblioteca de validação de e-mail existente para o protocolo definido em `EmailValidatorProtocol`.

- **Classe Main**:
    - `Main`: Classe para demonstrar o uso do padrão Adapter para validar e-mails utilizando o protocolo definido em `EmailValidatorProtocol`.

## Como Executar o Projeto

Para rodar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar o programa.
    - O sistema irá demonstrar a validação de um endereço de e-mail utilizando a implementação do Adapter.

## Exemplo de Saída
```
O email informado é valido!
O email informado é valido!
```

Este exemplo ilustra o uso do padrão Adapter para adaptar a interface de uma biblioteca de validação de e-mail existente para um novo protocolo, permitindo que seja utilizado conforme necessário no sistema.

## Considerações sobre o Adapter

- **Vantagens**:
    - Permite a integração de sistemas existentes com novos sistemas sem alterar o código existente.
    - Ajuda a reutilizar código existente.
    - Promove a interoperabilidade entre diferentes componentes.

- **Desvantagens**:
    - Pode aumentar a complexidade do código devido à introdução de classes adaptadoras.
    - Pode resultar em overhead de desempenho devido à necessidade de adaptação em tempo de execução.