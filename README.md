# Projeto de Inteligência Artificial: Resolvendo o Problema do Triplo com A*

Este projeto foi desenvolvido no âmbito da disciplina de Inteligência Artificial, onde utilizei o algoritmo A* para resolver um problema específico: calcular o custo mínimo para transformar um número \( x \) no seu triplo, seguindo regras específicas de operações com custos associados.

## Descrição do Problema

O objetivo do problema é determinar o custo mínimo para transformar um número \( x \) no seu triplo utilizando apenas três operações:
- Somar 1 (custo 1)
- Subtrair 1 (custo 2)
- Multiplicar por 2 (custo 3)

Por exemplo, para \( x = 3 \), o triplo é \( 9 \). A sequência de operações com o menor custo para transformar \( 3 \) em \( 9 \) seria multiplicar por 2 duas vezes (custo total: \( 6 \)).

## Implementação do Algoritmo A*

O algoritmo A* foi escolhido para resolver este problema devido à sua eficiência em encontrar soluções ótimas em problemas de busca com custos. Ele utiliza uma heurística para estimar o custo mínimo restante até a solução, combinando isso com o custo atual acumulado para determinar a próxima ação a ser tomada.

## Como Utilizar

Para utilizar o projeto:
- Insira um número \( x \) como entrada para o programa.
- O programa calculará e imprimirá o custo mínimo para transformar \( x \) no seu triplo, junto com a sequência de operações necessárias.

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Algoritmo: A*
