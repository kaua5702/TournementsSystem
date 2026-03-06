package com.kauabiscotto.Tournamentsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando equipes
        Team dragons = new Team("Dragons");
        Team titans = new Team("Titans");

        // Criando jogadores já vinculados às equipes
        Player p1 = new Player("ProMaster", 1, 3, dragons);
        Player p2 = new Player("Shadow", 2, 0, dragons);
        Player p3 = new Player("Speedy", 1, 2, titans);
        Player p4 = new Player("Blazer", 2, 1, titans);

        // Adicionando jogadores às equipes
        dragons.adicionarJogador(p1);
        dragons.adicionarJogador(p2);
        titans.adicionarJogador(p3);
        titans.adicionarJogador(p4);

        // Criando torneio
        Tournaments copaGamer = new Tournaments("Copa Gamer");
        copaGamer.adicionarEquipe(dragons);
        copaGamer.adicionarEquipe(titans);

        // Organizando partidas
        copaGamer.organizarPartidas();

        Random random = new Random();

        // Simulando resultados com atributos + sorte
        for (Match partida : copaGamer.getMatches()) {
            partida.iniciarPartida();

            int scoreA = partida.getTeamA().getPlayers()
                    .stream().mapToInt(Player::getScore).sum();
            int scoreB = partida.getTeamB().getPlayers()
                    .stream().mapToInt(Player::getScore).sum();

            // Fator aleatório de sorte (0 a 5 pontos extras)
            scoreA += random.nextInt(6);
            scoreB += random.nextInt(6);

            Team vencedor = (scoreA >= scoreB) ? partida.getTeamA() : partida.getTeamB();

            copaGamer.registrarResultado(partida, vencedor);

            System.out.println("Partida: " + partida.getTeamA().getNameTeam() + " vs " +
                    partida.getTeamB().getNameTeam() + " -> Vencedor: " +
                    vencedor.getNameTeam());

            System.out.println();
        }

        // Mostrando ranking inicial
        copaGamer.mostrarRankingEquipes();
        copaGamer.mostrarrankingJogadores();

        // Declarando campeão
        copaGamer.declararCampeao();

        // Premiação dos jogadores da equipe campeã
        copaGamer.premiarJogadores();

        // Mostrando ranking final após premiação
        copaGamer.mostrarRankingEquipes();
        copaGamer.mostrarrankingJogadores();
    }


}
