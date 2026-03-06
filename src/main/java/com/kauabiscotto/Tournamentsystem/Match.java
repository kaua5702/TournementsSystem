package com.kauabiscotto.Tournamentsystem;

public class Match {

    private Team teamA;
    private Team teamB;
    private Team winner;


    public Match(Team teamA, Team teamB) {
        if (teamA == teamB) {
            throw new IllegalArgumentException("Uma equipe não pode jogar contra si mesma!");
        }

        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public Team getWinner() {
        return winner;
    }

    public void iniciarPartida() {
        System.out.println("Partida entre " + teamA.getNameTeam() + " e " + teamB.getNameTeam() + " iniciada");
        System.out.println();
    }

    public void definirResultado(Team winner) {
        this.winner = winner;
        Team loser = (winner == teamA) ? teamB : teamA;

        for (Player player : winner.getPlayers()) {
            player.registrarVitoria();
        }

        for (Player player : loser.getPlayers()) {
            player.registrarDerrota();
        }

        System.out.println("Resultado: " + winner.getNameTeam() + " venceu a partida contra " + loser.getNameTeam());
        System.out.println();

    }
}
