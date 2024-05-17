# Projeto de Log Utilizando o Padrão Singleton

Este projeto demonstra o uso do padrão de design Singleton em Java, implementado para gerenciar um sistema de logs centralizado. O Singleton Pattern é um padrão criacional que garante a existência de uma única instância de uma classe em toda a aplicação, proporcionando um ponto de acesso global ao seu objeto.

## Sobre o Singleton Pattern

O Singleton Pattern é utilizado para controlar o acesso a recursos compartilhados, como conexões com banco de dados ou sistemas de logs, através de uma única instância. Este padrão é particularmente útil quando precisamos de um controle consistente e centralizado de operações.

### Quando Usar o Singleton Pattern

- Gerenciamento de conexão única com o banco de dados.
- Acesso controlado ao sistema de arquivos.
- Sistema centralizado de logs para monitorar atividades em aplicações.

### Estrutura do Projeto LogSingleton

O projeto `LogSingleton` inclui as seguintes classes principais:

- **LogSingleton**: Implementa o padrão Singleton para garantir que apenas uma instância do gerenciador de logs seja criada. Inclui métodos para enviar logs e erros para a saída padrão.

- **Main**: Classe principal que demonstra o uso do `LogSingleton`. Mostra como as mensagens de log e erro são geradas e como a instância é gerenciada de forma unificada.

## Características do LogSingleton

- **Construção Lazy**: A instância do `LogSingleton` só é criada quando necessária.
- **Acesso Global**: A instância pode ser acessada globalmente em qualquer parte da aplicação.
- **Não é possível passar parâmetros ao construtor**, garantindo que a configuração do sistema de logs seja uniforme e controlada.

## Como Executar o Projeto

Para executar o projeto LogSingleton, siga estes passos:

1. **Compilar o Projeto**:
    - Abra o terminal e navegue até o diretório do projeto.
    - Execute o comando `javac Main.java` para compilar a classe principal e a classe `LogSingleton`.

2. **Executar o Projeto**:
    - Execute o comando `java Main` no terminal.
    - Observe a saída dos logs para verificar a consistência do gerenciamento de logs.

## Exemplo de Saída

A execução do programa pode resultar em saídas como:
```
Instance: LogSingleton@4a574795
[ERROR] - Teste de erro
[LOG] - Teste de log enviado
Instance: LogSingleton@4a574795
```

Este exemplo ilustra a garantia de que a mesma instância do `LogSingleton` é usada para todo o gerenciamento de logs, demonstrando a eficácia do Singleton Pattern.


