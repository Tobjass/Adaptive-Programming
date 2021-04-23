package com.tobias.summatieveopdracht1;

public class Klant {

    private String naam;
    private String straat;
    private int huisnummer;
    private String postcode;
    private String woonplaats;
    private String geboortedatum;
    private int telefoonnummer;
    private String emailadres;
    private String manOfVrouw;
    private double kortingsPercentage;

    public Klant() {
    }

    public Klant(String naam, String straat, int huisnummer, String postcode, String woonplaats, String geboortedatum, int telefoonnummer, String emailadres, String manOfVrouw, double kortingsPercentage) {
        this.naam = naam;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.geboortedatum = geboortedatum;
        this.telefoonnummer = telefoonnummer;
        this.emailadres = emailadres;
        this.manOfVrouw = manOfVrouw;
        this.kortingsPercentage = kortingsPercentage;
    }
}
