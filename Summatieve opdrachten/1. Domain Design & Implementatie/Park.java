package com.tobias.summatieveopdracht1;

public class Park {

    private String naam;
    private String plaats;
    private String provincie;
    private double beoordeling;

    public Park() {
    }

    public Park(String naam, String plaats, String provincie, double beoordeling) {
        this.naam = naam;
        this.plaats = plaats;
        this.provincie = provincie;
        this.beoordeling = beoordeling;
    }

    @Override
    public String toString() {
        return naam + " (" + beoordeling + ")\n   " + plaats + ", " + provincie;
    }
}
