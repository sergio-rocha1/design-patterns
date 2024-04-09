# Projeto de Automação Residencial Utilizando o Padrão Command

Este projeto é uma demonstração prática do padrão de design Command, implementado em Java. O padrão Command é utilizado para encapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar solicitações e implementar operações reversíveis.

## Sobre o Padrão Command

O padrão Command transforma uma solicitação em um objeto independente que contém toda a informação sobre a solicitação. Isso inclui o método a ser chamado, os argumentos necessários e o objeto (conhecido como "receiver") que irá executar a operação. Ele é particularmente útil em cenários onde é necessário executar uma série de operações, desfazer/refazer operações e manter um histórico de ações executadas.

### Quando Usar o Command

- Quando você quer parametrizar objetos com operações.
- Quando você quer colocar operações em fila, agendar sua execução, ou executá-las remotamente.
- Quando você precisa implementar operações reversíveis.

### Como Adicionar Novos Comandos

Para adicionar novos comandos ao projeto, siga estes passos:

1. **Definir uma Nova Classe de Comando**: Crie uma nova classe que implemente a interface `SmartHouseCommand`. Esta classe representará uma nova operação que você deseja que seus dispositivos da casa inteligente possam realizar.

2. **Implementar os Métodos do Comando**: Em sua nova classe de comando, implemente os métodos `execute` e `undo`. Isso definirá o que acontecerá quando o comando for executado e o que será feito para desfazer essa ação.

3. **Integrar o Novo Comando**: No ponto de entrada do programa (por exemplo, na classe `Main`), instancie o seu novo comando e adicione-o ao `SmartHouseApp` usando o método `addCommand`. Agora, você pode executar e desfazer seu novo comando conforme necessário.

### Como Executar o Projeto

Para executar este projeto, você precisará ter o JDK instalado em sua máquina. Siga estes passos:

1. **Compilar o Projeto**: Navegue até o diretório do projeto no terminal e execute o comando `javac Main.java` para compilar o projeto.

2. **Executar o Projeto**: Após a compilação, execute o projeto com o comando `java Main`.

3. **Observar a Saída**: O programa irá executar uma série de comandos relacionados ao controle da iluminação da casa inteligente, incluindo ligar/desligar e ajustar a intensidade da luz, e em seguida, imprimirá os resultados no terminal.