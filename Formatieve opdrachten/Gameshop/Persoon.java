package com.tobias.gameshop;

import java.time.LocalDate;

public class Persoon {

    private String naam;
    private double budget;
    private Game games;

    public Persoon() {
    }

    public Persoon(String naam, int budget) {
        this.naam = naam;
        this.budget = budget;
    }

    public void setGames(Game game) {
        this.games = game;
    }

    public String koop(Game game) {
        this.games = game;
        this.budget -= (double) Math.round((LocalDate.now().getYear() - game.getReleasejaar()) * 0.7 * game.getPrijs() * 100) / 100;
        return "Gekochte game: " + games + "\nNieuwe budget: " + budget;
    }

}
