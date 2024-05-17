# Projeto de Clientes e Veículos com Abstract Factory

Este projeto demonstra o uso do padrão de design Abstract Factory em Java para criar famílias de objetos relacionados a clientes e veículos. O Abstract Factory é um padrão criacional que ajuda na criação de famílias de objetos sem especificar suas classes concretas.

## Sobre o Abstract Factory

O Abstract Factory é ideal para situações onde há necessidade de criar grupos de objetos que precisam funcionar juntos. Este padrão permite que as classes sejam configuradas com uma fábrica específica que automaticamente cria o tipo correto de objeto, facilitando a manutenção e a expansão do código.

### Quando Usar o Abstract Factory

- Quando seu sistema precisa ser independente de como seus produtos são criados, compostos e representados.
- Quando seu sistema precisa ser configurado com uma família de produtos.
- Quando a família de produtos é projetada para ser usada junta.

### Como Implementar Novas Famílias de Objetos

1. **Definir Interfaces de Produto**: No caso deste projeto, `Cliente` e `Veiculo`.
2. **Implementar Classes Concretas**: Como `ClienteFisico`, `ClienteJuridico`, `VeiculoFisico`, e `VeiculoJuridico`.
3. **Criar Factories Concretas**: Implementações de `VeiculoClienteFactory` para clientes e veículos físicos e jurídicos.
4. **Utilizar as Factories**: Substituir a criação direta de objetos cliente e veículo pelo uso das factories.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes principais:

- **Interfaces de Produto**:
    - `Cliente`: Interface para clientes.
    - `Veiculo`: Interface para veículos.

- **Implementações Concretas de Produtos**:
    - `ClienteFisico`, `ClienteJuridico`: Implementações da interface `Cliente`.
    - `VeiculoFisico`, `VeiculoJuridico`: Implementações da interface `Veiculo`.

- **Factories**:
    - `VeiculoClienteFactory`: Interface para factories que criam clientes e veículos.
    - `VeiculoClienteJuridicoFactory`, `VeiculoClienteFisicoFactory`: Factories concretas que criam os tipos específicos de clientes e veículos.

## Como Executar o Projeto

Para rodar este projeto, siga os passos abaixo:

1. **Compilar o Projeto**:
    - Navegue até o diretório do projeto no terminal.
    - Execute `javac *.java` para compilar todas as classes.

2. **Executar o Projeto**:
    - Execute `java Main` para iniciar o programa.
    - O sistema irá demonstrar a criação e utilização de clientes e veículos conforme as especificações das factories.

## Exemplo de Saída

Este exemplo ilustra como as diferentes factories (VeiculoClienteJuridicoFactory e VeiculoClienteFisicoFactory) criam objetos de clientes e veículos compatíveis. Demonstrando a flexibilidade e extensibilidade do padrão Abstract Factory, cada tipo de veículo é associado corretamente ao seu tipo de cliente.