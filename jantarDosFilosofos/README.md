# Jantar dos Filósofos

Neste projeto, foi solicitada a implementação de duas soluções para o problema clássico do Jantar dos Filósofos. O objetivo principal era desenvolver duas soluções: uma baseada no algoritmo proposto por Dijkstra e outra criada pelo aluno. Ambas as soluções deveriam garantir que nenhum filósofo ficasse com fome indefinidamente (starvation) ou que ocorresse um deadlock, onde todos os filósofos estão segurando um garfo e esperando pelo outro.

Além da implementação das soluções, foi requerido que cada filósofo fosse representado por uma thread independente e que uma interface gráfica exibisse as seguintes métricas em tempo real:

- Tempo desde a última refeição de cada filósofo.
- Quantidade de vezes que cada filósofo comeu.
- Média de espera de cada filósofo entre pensar e comer.
- Tempo máximo que cada filósofo ficou esperando para comer.
