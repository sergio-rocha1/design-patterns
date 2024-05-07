### README - Exemplo de Validações

#### Introdução
Este exemplo demonstra o uso do padrão Composite para realizar validações em uma série de valores, onde uma validação pode ser um teste individual ou uma composição de vários testes.

#### Classes
- `ValidacaoComponent`: Classe abstrata que define a interface para todas as validações, incluindo um método para validar valores.
- `ValidaEmail`: Classe que realiza a validação de um email usando expressões regulares.
- `ValidaString`: Classe que valida se um valor é uma string não vazia.
- `ValidacaoComposite`: Classe que representa uma composição de validações.

#### Funcionamento
- Cada classe de validação implementa o método `validar()` para realizar o teste correspondente.
- `ValidacaoComposite` permite compor várias validações em uma única validação composta.
- O método `validar()` em `ValidacaoComposite` delega a chamada para cada validação filha e retorna verdadeiro apenas se todas as validações forem bem-sucedidas.

#### Exemplo de Uso
Consulte a classe `Main` para um exemplo de como usar validações individuais e composições de validações para validar valores.

