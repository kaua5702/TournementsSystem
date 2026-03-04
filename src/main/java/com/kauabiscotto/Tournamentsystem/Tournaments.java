package com.kauabiscotto.Tournamentsystem;

import java.util.ArrayList;
import java.util.List;

public class Tournaments {

    private String nameTournaments;
    private List<Team> teams;


    public Tournaments(String nameTournaments) {
        this.nameTournaments = nameTournaments;
        this.teams = new ArrayList<>();
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

}
