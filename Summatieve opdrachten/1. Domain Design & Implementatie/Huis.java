package com.tobias.summatieveopdracht1;

public class Huis {

    private String type;
    private double prijsPerDag;
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

    public Huis(String type, double prijsPerDag, int oppervlakte, int aantalSlaapkamers, int aantalVerdiepingen, boolean verwarming, boolean wifi, boolean vaatwasser, boolean koffiemachine, int aantalGaspitten, int aantalBadkamers, boolean föhn, boolean sauna, boolean zonnebank) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
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
        return "Huis{" +
                "type='" + type + '\'' +
                ", prijsPerDag=" + prijsPerDag +
                ", oppervlakte=" + oppervlakte +
                ", aantalSlaapkamers=" + aantalSlaapkamers +
                ", aantalVerdiepingen=" + aantalVerdiepingen +
                ", verwarming=" + verwarming +
                ", wifi=" + wifi +
                ", vaatwasser=" + vaatwasser +
                ", koffiemachine=" + koffiemachine +
                ", aantalGaspitten=" + aantalGaspitten +
                ", aantalBadkamers=" + aantalBadkamers +
                ", föhn=" + föhn +
                ", sauna=" + sauna +
                ", zonnebank=" + zonnebank +
                '}';
    }
}
