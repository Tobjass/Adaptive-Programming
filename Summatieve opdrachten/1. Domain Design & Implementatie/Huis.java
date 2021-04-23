package com.tobias.summatieveopdracht1;

public class Huis {

    private String type;
    private double prijsPerNacht;
    private int oppervlakte;
    private int aantalSlaapkamers;
    private int aantalVerdiepingen;
    private boolean verwarming;
    private boolean wifi;
    private boolean vaatwasser;
    private boolean koffiemachine;
    private int aantalGaspitten;
    private int aantalBadkamers;
    private boolean föhn;
    private boolean sauna;
    private boolean zonnebank;

    public Huis() {
    }

    public Huis(String type, double prijsPerNacht, int oppervlakte, int aantalSlaapkamers, int aantalVerdiepingen, boolean verwarming, boolean wifi, boolean vaatwasser, boolean koffiemachine, int aantalGaspitten, int aantalBadkamers, boolean föhn, boolean sauna, boolean zonnebank) {
        this.type = type;
        this.prijsPerNacht = prijsPerNacht;
        this.oppervlakte = oppervlakte;
        this.aantalSlaapkamers = aantalSlaapkamers;
        this.aantalVerdiepingen = aantalVerdiepingen;
        this.verwarming = verwarming;
        this.wifi = wifi;
        this.vaatwasser = vaatwasser;
        this.koffiemachine = koffiemachine;
        this.aantalGaspitten = aantalGaspitten;
        this.aantalBadkamers = aantalBadkamers;
        this.föhn = föhn;
        this.sauna = sauna;
        this.zonnebank = zonnebank;
    }

    @Override
    public String toString() {
        String verwarming = (this.verwarming) ? "Verwarming\n\t  " : "Geen verwarming\n\t  ";
        String wifi = (this.wifi) ? "Wifi\n\t  " : "Geen wifi\n\t  ";
        String vaatwasser = (this.vaatwasser) ? "Vaatwasser\n\t  " : "Geen vaatwasser\n\t  ";
        String koffiemachine = (this.koffiemachine) ? "Koffiemachine\n\t  Gasplaat (" : "Geen koffiemachine\n\t  Gasplaat (";
        String föhn = (this.föhn) ? "Föhn\n\t  " : "Geen föhn\n\t  ";
        String sauna = (this.sauna) ? "Sauna\n\t  " : "Geen sauna\n\t  ";
        String zonnebank = (this.zonnebank) ? "Zonnebank" : "Geen zonnebank";
        return "\n   " + type + "\n\t  €" + prijsPerNacht + " per nacht\n\t  Circa " + oppervlakte + " m²\n\t  "
                + aantalSlaapkamers + " slaapkamers\n\t  " + aantalVerdiepingen + " verdiepingen\n\t  " + verwarming
                + wifi + vaatwasser + koffiemachine + aantalGaspitten + "-pits)\n\t  " + aantalBadkamers
                + " badkamer(s)\n\t  " + föhn + sauna + zonnebank;
    }
}
