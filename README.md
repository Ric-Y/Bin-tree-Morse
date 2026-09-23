# Árvore Binária de Morse

Projeto desenvolvido em Java que utiliza uma árvore binária para armazenar e consultar códigos Morse.

## Funcionamento

Cada código Morse é representado por um caminho na árvore:

* `.` representa o caminho para o filho esquerdo.
* `-` representa o caminho para o filho direito.

As letras e os números são inseridos na árvore de acordo com seus respectivos códigos Morse.

O programa permite digitar uma sequência de códigos Morse e retorna os caracteres correspondentes. Para representar mais de um caractere, os códigos devem ser separados por espaços.

### Exemplo

Entrada:

```text
... --- ...
```

Saída:

```text
SOS
```

O programa também possui o comando `SAIR`, utilizado para encerrar a execução.

## Estrutura

O projeto possui:

* `Nodo`: representa cada nó da árvore.
* `arvoreBinariaMorse`: responsável pela criação, inserção e busca na árvore.
* `inserirTudo`: adiciona as letras e números em Morse.
* `ARVORE_BIN`: classe principal responsável pela execução do programa.

## Tecnologias

* Java
* Estrutura de dados: Árvore Binária
* Código Morse
