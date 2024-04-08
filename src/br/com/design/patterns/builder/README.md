# Projeto Exemplo do Padrão Builder

Este projeto é uma demonstração prática do padrão de design Builder, implementado em Java. O padrão Builder é utilizado para construir um objeto complexo passo a passo. Ele é especialmente útil quando um objeto precisa ser criado com muitas possíveis configurações, algumas das quais podem ser opcionais.

## Sobre o Padrão Builder

O padrão Builder separa a construção de um objeto complexo de sua representação, permitindo que o mesmo processo de construção crie diferentes representações. Isso é alcançado por meio de um `BuilderInterface`, que especifica os passos para construir partes do objeto complexo, e classes concretas de builders que implementam esses passos e mantêm o estado do objeto que está sendo construído.

### Quando Usar o Builder

- Quando a criação de um objeto envolve muitos passos e nem todos os passos são necessários para todas as instâncias do objeto.
- Quando há muitos parâmetros no construtor, alguns dos quais podem ser opcionais, tornando difícil a criação de construtores sobrecarregados para cada possível combinação de parâmetros.
- Para encapsular a construção de um objeto e representar o processo de construção em etapas discretas.

### Como Adicionar Outros Builders

Com base no projeto atual, para adicionar novos builders, você deve seguir estes passos:

1. **Definir uma Nova Classe Builder**: Crie uma nova classe que implemente a interface `BuilderInterface`. Esta classe será responsável por construir uma versão específica do objeto `Framework`, possivelmente com um conjunto diferente de características.

2. **Implementar Métodos do Builder**: Em sua nova classe builder, implemente os métodos definidos na interface `BuilderInterface`, ajustando a construção do objeto `Framework` conforme necessário para atender às necessidades do novo builder.

3. **Instanciar e Usar o Novo Builder**: No ponto de entrada do programa (por exemplo, na classe `Main`), instancie o seu novo builder e use-o para construir um objeto `Framework` conforme desejado.

### Como Executar o Projeto

Para executar este projeto, você precisará ter o JDK instalado em sua máquina. Siga estes passos:

1. **Compilar o Projeto**: Navegue até o diretório do projeto no terminal e execute o seguinte comando para compilar o projeto:
   javac Main.java
2. **Executar o Projeto**: Após a compilação, execute o projeto com o comando:
   java Main
3. **Observar a Saída**: O programa irá construir uma instância do objeto `Framework` usando o `FrameworkFullBuilder` (ou qualquer outro builder que você tenha definido e escolhido executar), e em seguida, imprimirá os detalhes do objeto construído no terminal.
