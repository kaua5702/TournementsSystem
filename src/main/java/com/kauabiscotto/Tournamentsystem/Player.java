package com.kauabiscotto.Tournamentsystem;

public class Player {

    private String nickName;
    private int ranking;
    private int score;
    private Team team;

    public Player(String nickName, int ranking, int score, Team team) {
        this.nickName = nickName;
        this.ranking = ranking;
        this.score = score;
        this.team = team;
    }

    public String getNickName() {
        return nickName;
    }

    public int getRanking() {
        return ranking;
    }

    public int getScore() {
        return score;
    }

    public Team getTeam() {
        return team;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void registrarVitoria() {
        score += 3;
        System.out.println("Parabéns você ganhou 3 pontos");
        System.out.println();
    }

    public void registrarDerrota() {
        score -= 1;
        System.out.println("Você perdeu 1 ponto");
        if (this.score < 0) {
            this.score = 0;
        }
        System.out.println();
    }

    public void adicionarBonus(int pontos) {
        this.score += pontos;
        if (this.score < 0) {
            this.score = 0;
        }
        System.out.println();
    }

    public void exibirInfo() {
        System.out.println();
        System.out.println("Nome: " + getNickName());
        System.out.println("Posição: " + getRanking());
        System.out.println("Pontuação: " + getScore());
    }
}
