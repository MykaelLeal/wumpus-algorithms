# Jogo do Wumpus - Algoritmo de Busca Inteligente

## 📜 Descrição do Projeto

<p style="text-align: justify;">Este projeto implementa um jogo, no qual um robô inteligente, chamado Wumpus, deve encontrar o baú do tesouro em um cenário repleto de perigos, representado por uma matriz 8x8. Durante sua jornada para encontrar o tesouro, Wumpus precisa evitar obstáculos, como pedras e monstros, além de lidar com armadilhas que podem estar nos baús.</p>

<p style="text-align: justify;">A proposta desse jogo, é utilizar estratégias, como: menor distância, menos obstáculos, cada uma utilizando seus algoritmos de busca, para mostrar o melhor caminho ao Wumpus, evitando os perigos: obstáculos, para que ele possa sair vivo dessa, e com seu tesouro!</p>

## 🎯 Objetivo do Jogo

- O robô deve encontrar o baú do tesouro.
- Evitar obstáculos: pedras e monstros.
- Desviar de armadilhas nos baús, aplicando condições específicas.
- Utilizar estratégias de busca inteligentes para determinar o melhor caminho.

## 🛠️ Estrátegias e Algoritmos de busca utilizados

#### 1. Método Guloso
**Estratégia**: Menor distância (**Shortest Distance**).

  - Determina a menor distância que o robô deve percorrer para chegar ao tesouro.
  - A lógica utiliza a distância de Manhattan para priorizar o ponto mais próximo do tesouro.
  - Faz a verficação dos caminhos disponíveis para evitar bloqueios.
  - O algoritmo assegura que o robô não escolha posições onde todos os caminhos futuros estejam bloqueados.

##### Vantagens:
  - **Eficiência Computacional:** Avalia apenas as opções viáveis localmente, economizando recursos.
  - **Gestão de Bloqueios:** Identifica cenários bloqueados e interrompe o processamento com mensagens de erro, evitando loops infinitos.
  - **Flexibilidade:** Funciona bem em mapas dinâmicos ou estáticos.

##### Desvantagens:
  - **Otimização Local vs. Global:** Pode não encontrar o caminho ideal em termos globais.
  - **Dependência do Cenário:** Eficiência depende da distribuição de obstáculos e do tesouro.
  - **Erros em Caso de Empates:** Em situações com múltiplos caminhos de mesma distância, a estratégia escolhe arbitrariamente o primeiro na lista.

---

#### 2. Método Guloso
**Estratégia**: Menor número de obstáculos (**Fewer Obstacles**).

  -  Seleciona o ponto adjacente com o menor número de obstáculos.
  -  Evita pontos bloqueados e prioriza caminhos que sejam mais seguros ou eficientes para o deslocamento.
    
 ##### Vantagens:
   - **Simplicidade de implementação:** Cada decisão é feita com base em informações locais, sem necessidade de avaliar todo o mapa.
   - **Baixa complexidade computacional:** Avalia apenas os vizinhos imediatos, o que é eficiente em tempo de execução.

##### Desvantagens:
   - **Local vs. Global:** Como decisões locais são priorizadas, o algoritmo pode não encontrar o caminho globalmente mais eficiente.
   - **Dependência da Configuração do Cenário:** O desempenho é impactado por como os obstáculos e tesouros estão distribuídos.

___



 







