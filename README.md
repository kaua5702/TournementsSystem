# 🎮 Tournament System

Um sistema simples de gerenciamento de torneios em Java.  
Permite cadastrar jogadores, formar equipes, registrar vitórias/derrotas e organizar torneios com múltiplos times.

---

## 📂 Estrutura do Projeto

- `Player.java`  
  Representa um jogador.  
  - Atributos: `nickName`, `ranking`, `score`  
  - Métodos principais:
    - `registrarVitoria()` → adiciona 3 pontos ao score  
    - `registrarDerrota()` → remove 1 ponto do score  
    - `exibirInfo()` → mostra informações do jogador  

- `Team.java`  
  Representa uma equipe.  
  - Atributos: `nameTeam`, `players` (lista de jogadores)  
  - Métodos principais:
    - `adicionarJogador(Player player)` → adiciona um jogador à equipe  
    - `removerJogador(Player player)` → remove um jogador da equipe  
    - `exibirEquipe()` → mostra todos os jogadores da equipe  

- `Tournaments.java`  
  Representa um torneio.  
  - Atributos: `nameTournaments`, `teams` (lista de equipes)  
  - Métodos principais:
    - `adicionarEquipe(Team team)` → adiciona uma equipe ao torneio  
    - `removerEquipe(Team team)` → remove uma equipe do torneio  
    - `exibirTorneio()` → mostra todas as equipes participantes  

- `Main.java`  
  Classe principal para execução do sistema.  
  - Cria jogadores, equipes e torneios  
  - Demonstra o funcionamento dos métodos implementados  

---

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/tournament-system.git
   ```

2. Compile os arquivos Java:
   ```
    javac com/kauabiscotto/Tournamentsystem/*.java
   ````

 3. Execute a classe principal:
    ```
    java com.kauabiscotto.Tournamentsystem.Main
    ```


 ##   Saída esperada:O jogador ProMaster entrou para a equipe Dragons
 
O jogador Shadow entrou para a equipe Dragons
 O jogador Speedy entrou para a equipe Titans

O time Dragons foi adicionado
O time Titans foi adicionado

Torneio: Copa Gamer
Dragons
Nome: ProMaster
Posição: 1
Pontuação: 3

Nome: Shadow
Posição: 2
Pontuação: 0

Titans
Nome: Speedy
Posição: 1
Pontuação: 2

O time Dragons foi removido

Torneio: Copa Gamer
Titans
Nome: Speedy
Posição: 1
Pontuação: 2

