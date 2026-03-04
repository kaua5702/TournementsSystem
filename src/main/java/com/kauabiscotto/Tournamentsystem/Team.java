package com.kauabiscotto.Tournamentsystem;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String nameTeam;
    private List<Player> players;


    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        this.players = new ArrayList<>();
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void adicionarJogador(Player player) {
        players.add(player);
        System.out.println("O jogador " + player.getNickName() + " entrou para a equipe" + nameTeam);
        System.out.println();
    }

    public void removerJogador(Player player) {
        players.remove(player);
        System.out.println("O jogador " + player.getNickName() + " saiu da equipe" + nameTeam);
        System.out.println();
    }

    public void exibirEquipe() {
        System.out.println(nameTeam);
        for (Player player : players) {
            player.exibirInfo();
        }
        System.out.println();
    }
}
