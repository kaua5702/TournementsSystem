package com.kauabiscotto.Tournamentsystem;

public class Player {

    private String nickName;
    private int ranking;
    private int score;

    public Player(String nickName, int ranking, int score) {
        this.nickName = nickName;
        this.ranking = ranking;
        this.score = score;
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

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void registrarVitoria() {
        score += 3;
        System.out.println("Parabéns você ganhou 3 pontos");
    }

    public void registrarDerrota() {
        score -= 1;
        System.out.println("Você perdeu 1 ponto");
    }

    public void exibirInfo() {
        System.out.println();
        System.out.println("Nome: " + getNickName());
        System.out.println("Posição: " + getRanking());
        System.out.println("Pontuação: " + getScore());
    }
}
