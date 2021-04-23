package com.tobias.summatieveopdracht1;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private String naam;
    private String plaats;
    private String provincie;
    private double beoordeling;
    private List<Faciliteit> faciliteiten = new ArrayList<>();

    public Park() {
    }

    public Park(String naam, String plaats, String provincie, double beoordeling) {
        this.naam = naam;
        this.plaats = plaats;
        this.provincie = provincie;
        this.beoordeling = beoordeling;
    }

    public void setFaciliteit(Faciliteit faciliteit) {
        this.faciliteiten.add(faciliteit);
    }

    @Override
    public String toString() {
        return naam + " (" + beoordeling + ")\n   " + plaats + ", " + provincie + "\n\nFaciliteiten: " + faciliteiten;
    }
}
