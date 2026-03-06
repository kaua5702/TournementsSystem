## 🎮 Tournament System
Um sistema de gerenciamento de torneios em Java.
Permite cadastrar jogadores, formar equipes, organizar partidas, registrar resultados e premiar os vencedores.
---

## 📂 Estrutura do Projeto
 # Player.java
Representa um jogador.
- Atributos: nickName, ranking, score, team
- Métodos principais:
- registrarVitoria() → adiciona 3 pontos ao score
- registrarDerrota() → remove 1 ponto do score (nunca fica negativo)
- adicionarBonus(int pontos) → adiciona pontos extras ao score
- exibirInfo() → mostra informações do jogador


 #  Team.java
Representa uma equipe.
- Atributos: nameTeam, players (lista de jogadores)
- Métodos principais:
- adicionarJogador(Player player) → adiciona um jogador à equipe
- removerJogador(Player player) → remove um jogador da equipe
- getPontuacaoEquipe() → soma o score de todos os jogadores
- exibirEquipe() → mostra todos os jogadores da equipe

 # Match.java
Representa uma partida entre duas equipes.
- Atributos: teamA, teamB, resultado
- Regras: uma equipe não pode jogar contra si mesma.
- Métodos principais:
- iniciarPartida() → inicia a partida
- getTeamA() / getTeamB() → acessa as equipes envolvidas


 # Tournaments.java
Representa um torneio.
- Atributos: nameTournaments, teams (lista de equipes), matches (lista de partidas)
- Métodos principais:
- adicionarEquipe(Team team) → adiciona uma equipe ao torneio
- removerEquipe(Team team) → remove uma equipe do torneio
- organizarPartidas() → gera todas as partidas válidas (sem duplicação e sem equipes contra si mesmas)
- registrarResultado(Match match, Team vencedor) → registra o vencedor da partida
- mostrarRankingEquipes() → mostra ranking das equipes
- mostrarRankingJogadores() → mostra ranking dos jogadores
- declararCampeao() → anuncia a equipe campeã
- premiarJogadores() → dá bônus de 2 pontos para cada jogador da equipe campeã
- getMatches() → retorna todas as partidas organizadas


#  Main.java
Classe principal para execução do sistema.
- Cria jogadores e equipes
- Organiza torneio e partidas
- Define vencedores com base nos atributos dos jogadores + fator aleatório
- Mostra rankings, declara campeão e premia jogadores
---

## 🚀 Como Executar
1- Clone o repositório:
git clone https://github.com/seuusuario/tournament-system.git

2- Compile os arquivos Java:
javac com/kauabiscotto/Tournamentsystem/*.java

3- Execute a classe principal:
java com.kauabiscotto.Tournamentsystem.Main
---

## 📌 Saída esperada (exemplo)

O jogador ProMaster entrou para a equipe Dragons

O jogador Shadow entrou para a equipe Dragons

O jogador Speedy entrou para a equipe Titans

O jogador Blazer entrou para a equipe Titans



O time Dragons foi adicionado

O time Titans foi adicionado



Partida: Dragons vs Titans -> Vencedor: Dragons



🏆 Campeã do torneio: Dragons com 6 pontos!

Jogadores da equipe Dragons receberam bônus de 2 pontos!



Ranking de Equipes:

1º Dragons - 6 pontos

2º Titans - 0 pontos



Ranking de Jogadores:

ProMaster - 5 pontos

Shadow - 2 pontos

Speedy - 2 pontos

Blazer - 1 ponto
---




(Os resultados podem variar, pois há fator aleatório na definição dos vencedores.)
