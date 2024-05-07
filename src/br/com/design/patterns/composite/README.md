# Padrão Composite: Composição de Objetos em Hierarquias

## Intenção Oficial

O padrão Composite tem como intenção compor objetos em estruturas de árvore para representar hierarquias parte-todo. Ele permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos. Isso é particularmente útil quando desejamos manipular estruturas complexas de forma uniforme, tratando tanto objetos individuais quanto composições da mesma maneira.

## Sobre o Composite

- **Categoria**: Estrutural
- **Contexto de Uso**: É mais adequado em estruturas que podem ser tratadas hierarquicamente, como árvores.
- **Prioriza**: Composição sobre herança.
- **Exemplo**: Por exemplo, consideremos o caso de produtos em uma loja. Um produto pode ser um item individual (como uma caixa de leite) ou uma composição de vários itens (como um fardo de leite, contendo várias caixas). O padrão Composite nos permite tratar tanto um único produto quanto uma composição de produtos da mesma maneira.

## Estrutura do Padrão de Projeto

- **Component**: Define a interface comum para todos os componentes da hierarquia.
- **Leaf**: Representa objetos individuais que não têm filhos na hierarquia.
- **Composite**: Representa objetos que têm filhos na hierarquia.

## Aplicabilidade

- Quando a estrutura de objetos pode ser representada hierarquicamente, como uma árvore.
- Quando desejamos que o código cliente trate objetos compostos e objetos simples da mesma maneira, permitindo o uso de polimorfismo.

## Consequências

- **Boas**:
    - Facilita a criação e manipulação de objetos complexos por composição.
    - Permite a geração fácil de hierarquias de objetos.
    - Facilita o uso de polimorfismo e recursão.
    - Facilita a adição de novos tipos de elementos na estrutura, seguindo o princípio OCP (Open/Closed Principle).
- **Ruins**:
    - Dependendo da estrutura, pode quebrar o princípio da segregação de interface (ISP), já que objetos do tipo "Leaf" tendem a ter métodos que não são usados ou não fazem nada.

## Exemplos de Implementação

- **Exemplo de Produto**: Veja o README [Exemplo de Produto](exemploProduto/README.md) para uma demonstração do uso do padrão Composite na representação de hierarquias de produtos.
- **Exemplo de Validações**: Consulte o README [Exemplo de Validações](exemploValidacao/README.md) para uma aplicação do padrão Composite na validação de valores.

## Conclusão

O padrão Composite é uma ferramenta poderosa para lidar com hierarquias parte-todo de forma uniforme. Ele nos permite compor objetos em estruturas complexas e tratá-los de maneira uniforme, promovendo flexibilidade e facilitando a manutenção e extensão do código.
