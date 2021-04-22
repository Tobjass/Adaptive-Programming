package com.tobias.zwembad;

public class Zwembad {

    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad() {
    }

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public String getBreedte() {
        return "BREEDTE: " + breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public String getLengte() {
        return "LENGTE: " + lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public String getDiepte() {
        return "DIEPTE: " + diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return "GEGEVENS ZWEMBAD: Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte
                + " meter diep";
    }

    public String inhoud() {
        return "BEREKENDE INHOUD: " + breedte * lengte * diepte;
    }
}
