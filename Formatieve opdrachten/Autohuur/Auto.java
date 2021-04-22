package com.tobias.autohuur;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto() {
    }

    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
