# Projeto Prototype em Java

Este projeto demonstra o uso do padrão de design Prototype em Java para clonar objetos de uma sessão de usuário. O padrão Prototype é um padrão criacional que permite copiar objetos existentes sem fazer o código depender de suas classes.

## Sobre o Prototype

O Prototype é ideal para situações onde a criação de um objeto é complexa ou requer muito recurso. Este padrão permite uma maneira de copiar um objeto existente enquanto se mantém independente de sua classe concreta.

### Quando Usar o Prototype

- Quando os objetos de uma classe têm apenas algumas diferenças entre si; a clonagem pode permitir maior eficiência.
- Quando a criação de objetos diretamente, usando classes, é complicada ou ineficiente.

### Como Implementar a Clonagem

1. **Definir a Interface Prototype**: Que inclui um método `clone()`.
2. **Implementar o Prototype em uma Classe Concreta**: Como `UserSession`, que implementa a clonagem de suas instâncias.
3. **Utilizar o Método `clone()`**: Para criar cópias do objeto quando necessário.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Interface Prototype**:
    - `Prototype`: Interface com o método `clone()`.

- **Implementações Concretas**:
    - `UserSession`: Implementação da interface `Prototype` que permite a clonagem de suas instâncias.

- **Classe Main**:
    - `Main`: Classe para demonstrar o uso do Prototype clonando um objeto `UserSession`.

## Como Executar o Projeto

Para rodar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar o programa.
    - O sistema irá demonstrar a clonagem de uma sessão de usuário e a modificação das preferências sem afetar o original.

## Exemplo de Saída
```
Original: UserSession{userId='User123', configuration='ConfiguracaoComplexa', userPreferences=[DarkMode, NotificationsOn]}
Clonada: UserSession{userId='User123', configuration='ConfiguracaoComplexa', userPreferences=[DarkMode, NotificationsOn, UseHighContrast]}
```

Este exemplo ilustra a clonagem de um objeto `UserSession`, modificando as preferências do usuário clonado sem afetar o original. Demonstrando a eficácia e a simplicidade do padrão Prototype em situações que requerem cópias de objetos.

