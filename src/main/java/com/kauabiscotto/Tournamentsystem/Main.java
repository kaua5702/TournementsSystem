package com.kauabiscotto.Tournamentsystem;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("ProMaster", 1, 3);
        Player p2 = new Player("Shadow", 2, 0);
        Player p3 = new Player("Speedy", 1, 2);

        Team dragons = new Team("Dragons");
        dragons.adicionarJogador(p1);
        dragons.adicionarJogador(p2);

        Team titans = new Team("Titans");
        titans.adicionarJogador(p3);

        Tournaments copaGamer = new Tournaments("Copa Gamer");
        copaGamer.adicionarEquipe(dragons);
        copaGamer.adicionarEquipe(titans);

        copaGamer.exibirTorneio();

        copaGamer.removerEquipe(dragons);

        copaGamer.exibirTorneio();

    }
}
