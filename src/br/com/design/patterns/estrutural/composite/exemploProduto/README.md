### README - Exemplo de Produto

#### Introdução
Este exemplo demonstra o uso do padrão Composite para representar uma hierarquia de produtos, onde um produto pode ser um item individual ou uma composição de vários produtos.

#### Classes
- `ProdutoComponent`: Classe abstrata que define a interface para todos os produtos, incluindo métodos para buscar preço, adicionar e remover produtos.
- `ProdutoLeaf`: Classe que representa um produto individual, contendo um nome e um preço.
- `ProdutoComposite`: Classe que representa um produto composto, contendo uma lista de produtos filhos.

#### Funcionamento
- O método `buscarPreco()` em `ProdutoLeaf` retorna o preço do produto individual.
- Em `ProdutoComposite`, o método `buscarPreco()` itera sobre os produtos filhos, somando os preços individuais para calcular o preço total da composição.
- O método `toString()` em `ProdutoComposite` exibe o preço total e os produtos filhos de forma hierárquica.

#### Exemplo de Uso
Veja a classe `Main` para um exemplo de como criar e manipular produtos e composições de produtos.

