package com.tobias.gameshop;

public class Game {

    private String naam;
    private int releasejaar;
    private double prijs;

    public Game() {
    }

    public Game(String naam, int releasejaar, double prijs) {
        this.naam = naam;
        this.releasejaar = releasejaar;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public int getReleasejaar() {
        return releasejaar;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return "Game{" +
                "naam='" + naam + '\'' +
                ", releasejaar=" + releasejaar +
                ", prijs=" + prijs +
                '}';
    }
}
