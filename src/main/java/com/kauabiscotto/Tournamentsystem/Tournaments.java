package com.kauabiscotto.Tournamentsystem;

import java.util.ArrayList;
import java.util.List;

public class Tournaments {

    private String nameTournaments;
    private List<Team> teams;
    private List<Match> matches;


    public Tournaments(String nameTournaments) {
        this.nameTournaments = nameTournaments;
        this.teams = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void adicionarEquipe(Team team) {
        teams.add(team);
        System.out.println("O time " + team.getNameTeam() + " foi adicionado");
        System.out.println();
    }

    public void removerEquipe(Team team) {
        boolean removido = teams.remove(team);
        if (removido) {
            System.out.println("O time " + team.getNameTeam() + " foi removido");
            System.out.println();
        } else {
            System.out.println("O time" + team.getNameTeam() + " não está no torneio.");
            System.out.println();
        }
    }

    public void exibirTorneio() {
        System.out.println("Torneio: " + nameTournaments);
        for (Team team : teams) {
            team.exibirEquipe();
        }
    }

    public void organizarPartidas() {
        matches.clear();

        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team teamA = teams.get(i);
                Team teamB = teams.get(j);

                Match match = new Match(teamA, teamB);
                matches.add(match);
            }
        }
    }

    public void registrarResultado(Match match, Team winner) {
        if (! matches.contains(match)) {
            matches.add(match);
        }

        match.definirResultado(winner);

        System.out.println("Resultado registrado: " + winner.getNameTeam() +
                " venceu a partida contra " +
                (winner == match.getTeamA() ? match.getTeamB().getNameTeam() : match.getTeamA().getNameTeam()));
        System.out.println();
    }

    public void mostrarRankingEquipes() {
        System.out.println("=== Ranking de Equipes ===");

        teams.stream()
                .sorted((team1, team2) -> Integer.compare(team2.getPontuacaoEquipe(), team1.getPontuacaoEquipe()))
                .forEach(team -> System.out.println(team.getNameTeam() + " - Pontuação: " + team.getPontuacaoEquipe()));

        System.out.println();
    }

    public void mostrarrankingJogadores() {
        System.out.println("=== Ranking de Jogadores ===");

        List<Player> everyPlayers = new ArrayList<>();
        for (Team team : teams) {
            everyPlayers.addAll(team.getPlayers());
        }

        everyPlayers.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()))
                .forEach(player -> System.out.println(player.getNickName() +
                        " - Pontuação: " + player.getScore() +
                        " (Equipe: " + player.getTeam().getNameTeam() + ")"));

        System.out.println();
    }

    public void premiarJogadores() {
        Team campeao = teams.stream()
                .max((t1, t2) -> Integer.compare(t1.getPontuacaoEquipe(), t2.getPontuacaoEquipe()))
                .orElse(null);

        if (campeao != null) {
            for (Player player : campeao.getPlayers()) {
                player.adicionarBonus(2);
            }
            System.out.println("Jogadores da equipe " + campeao.getNameTeam() + " receberam bônus de 2 pontos!");
            System.out.println();
        }

    }

    public void declararCampeao() {
        Team campeao = teams.stream()
                .max((t1, t2) -> Integer.compare(t1.getPontuacaoEquipe(), t2.getPontuacaoEquipe()))
                .orElse(null);

        if (campeao != null) {
            System.out.println("🏆 Campeã do torneio: " + campeao.getNameTeam() +
                    " com " + campeao.getPontuacaoEquipe() + " pontos!");
        }
        System.out.println();
    }



}

