package tobias.summatieveopdracht1;

public class Huis {

    private String type;
    private int prijsPerNacht;
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

    public Huis(String type, int prijsPerNacht, int oppervlakte, int aantalSlaapkamers, int aantalVerdiepingen, boolean verwarming, boolean wifi, boolean vaatwasser, boolean koffiemachine, int aantalGaspitten, int aantalBadkamers, boolean föhn, boolean sauna, boolean zonnebank) {
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

    public String getType() {
        return type;
    }

    public int getPrijsPerNacht() {
        return prijsPerNacht;
    }

    public String booleanCheck(boolean waarde, String woord) {
        if (waarde) {
            return woord.substring(0, 1).toUpperCase() + woord.substring(1);
        }
        return "Geen " + woord;
    }

    @Override
    public String toString() {
        return "\n   " + type + "\n\t  €" + prijsPerNacht + " per nacht\n\t  Circa " + oppervlakte + " m²\n\t  "
                + aantalSlaapkamers + " slaapkamers\n\t  " + aantalVerdiepingen + " verdiepingen\n\t  "
                + booleanCheck(verwarming, "verwarming") + "\n\t  " + booleanCheck(wifi, "wifi") + "\n\t  "
                + booleanCheck(vaatwasser, "vaatwasser") + "\n\t  "
                + booleanCheck(koffiemachine, "koffiemachine") + "\n\t  Gasplaat (" + aantalGaspitten
                + "-pits)\n\t  " + aantalBadkamers + " badkamer(s)\n\t  " + booleanCheck(föhn, "föhn") + "\n\t  "
                + booleanCheck(sauna, "sauna") + "\n\t  " + booleanCheck(zonnebank, "zonnebank");
    }
}
