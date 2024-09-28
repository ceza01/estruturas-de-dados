# Estrutura de Dados

Este repositório contém implementações em Java de estruturas de dados com o objetivo de 
proporcionar o aprendizado e compreensão das mesmas. Cada estrutura de dados é implementada em 
pastas e em classes separadas para facilitar a organização e entendimento do código. 

Embora Java 
e outras linguagens possuam classes ou bibliotecas que oferecem implementações prontas dessas 
estruturas de dados, entender como elas funcionam proporciona melhor compreensão do 
funcionamento do código e a possibilidade de adaptar essas estruturas conforme necessário.

## Estruturas implementadas (_em andamento_)
### 1. **Vetores**

**Classes implementadas**:
- `Vetor<T>`: Implementa a estrutura de um vetor genérico, com métodos para adicionar, buscar e remover elementos, além de gerenciar o redimensionamento automático do vetor quando necessário.

**Principais métodos**:
- `adiciona(T elemento)`: Adiciona um elemento ao final do vetor, aumentando sua capacidade se necessário.
- `adiciona(int posicao, T elemento)`: Insere um elemento em uma posição específica, deslocando os elementos subsequentes.
- `remove(int posicao)`: Remove um elemento da posição especificada e reorganiza o vetor.
- `removePorElemento(T elemento)`: Remove a primeira ocorrência de um elemento no vetor.
- `limpar()`: Remove todos os elementos do vetor.
- `buscar(int posicao)`: Retorna o elemento na posição especificada.
- `buscarElemento(T elemento)`: Busca um elemento e retorna sua posição no vetor.
- `contem(T elemento)`: Verifica se o vetor contém um determinado elemento.
- `ultimoIndiceDe(T elemento)`: Retorna a última posição em que o elemento foi encontrado no vetor.
- `tamanho()`: Retorna o número de elementos no vetor.
- `toString()`: Retorna uma representação em string do vetor.
- `aumentaCapacidade()`: Aumenta a capacidade do vetor quando necessário.

### 2. **Lista Simplesmente Encadeada**

**Classes implementadas**:
- `Nodo`: Representa um nó da lista, armazenando o valor (dado) e uma referência ao próximo nó da lista.
- `ListaEncadeada`: Implementa a lógica da lista encadeada, com métodos para inserção, remoção e impressão dos elementos.

**Principais métodos**:
- `inserir(int dado)`: Adiciona um novo elemento ao final da lista.
- `remover(int dado)`: Remove o primeiro nó encontrado que contém o valor especificado.
- `imprimeLista()`: Exibe a lista completa no formato `[dado1, dado2, ...]`.

### 3. **Lista Duplamente Encadeada**

**Classes implementadas**:
- `Nodo`: Representa um nó da lista, armazenando o valor (dado) e uma referência ao próximo nó da lista.

**Principais métodos**:
- _em andamento_

### 4. **Árvores**

**Classes implementadas**:
- `Nodo`: Representa um nó na árvore, armazenando o valor (dado) e referências aos nós esquerdo e direito.
- `Arvore`: Implementa a lógica de uma árvore binária, incluindo métodos de inserção e varredura.
- `BST`: Representa uma Árvore Binária de Busca (Binary Search Tree), permitindo a inserção, busca e remoção de elementos.

**Principais métodos da classe `Arvore`**:
- `inserir(int valor)`: Insere um novo valor na árvore, utilizando uma abordagem em nível (BFS) para encontrar a posição adequada.
- `preOrdem()`: Realiza uma travessia em pré-ordem (raiz, esquerda, direita) e imprime os valores.
- `emOrdem()`: Realiza uma travessia em ordem (esquerda, raiz, direita) e imprime os valores.
- `posOrdem()`: Realiza uma travessia em pós-ordem (esquerda, direita, raiz) e imprime os valores.
- `BFS()`: Realiza uma busca em largura e imprime os valores dos nós.

**Principais métodos da classe `BST`**:
- `inserir(int valor)`: Insere um valor na árvore de busca, mantendo a propriedade de ordenação da árvore.
- `emOrdem()`: Realiza uma travessia em ordem e imprime os valores.
- `contem(int valor)`: Verifica se um valor está presente na árvore.
- `removerNodo(int valor)`: Remove um valor da árvore, ajustando os nós conforme necessário.
- `menorValor(Nodo nodoAtual)`: Retorna o menor valor a partir de um determinado nó.

**Descrição dos métodos da classe `BST`**:
- `inserir(int valor)`: Insere um novo valor na árvore. Se a raiz for nula, o valor se torna a raiz. Caso contrário, chama o método auxiliar `inserir(Nodo raiz, int valor)`.
- `emOrdem()`: Inicia a travessia em ordem a partir da raiz, chamando o método auxiliar `emOrdem(Nodo nodo)`.
- `contem(int valor)`: Verifica se um determinado valor existe na árvore, chamando o método auxiliar `contem(Nodo raiz, int valor)`.
- `removerNodo(int valor)`: Remove um valor da árvore e reestrutura os nós conforme necessário, utilizando o método auxiliar `removerNodo(Nodo raiz, int valor)`.
- `menorValor(Nodo nodoAtual)`: Encontra o menor valor em uma subárvore, navegando para a esquerda até o nó mais à esquerda.

## Referências
- [Curso de Estrutura de Dados e Algoritmos com Java - Loiane Groner](https://youtube.com/playlist?list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&si=k0qiXvQFlVz6jB-z)
- [Implementing a Linked List in Java using Class](https://www.geeksforgeeks.org/implementing-a-linked-list-in-java-using-class/)