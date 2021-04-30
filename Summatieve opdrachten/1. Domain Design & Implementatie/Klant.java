package tobias.summatieveopdracht1;

public class Klant {

    private String naam;
    private String straat;
    private int huisnummer;
    private String postcode;
    private String woonplaats;
    private String geboortedatum;
    private String telefoonnummer;
    private String emailadres;
    private double kortingsPercentage;

    public Klant() {
    }

    public Klant(String naam, String straat, int huisnummer, String postcode, String woonplaats, String geboortedatum, String telefoonnummer, String emailadres, double kortingsPercentage) {
        this.naam = naam;
        this.straat = straat;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.geboortedatum = geboortedatum;
        this.telefoonnummer = telefoonnummer;
        this.emailadres = emailadres;
        this.kortingsPercentage = kortingsPercentage;
    }

    public String getNaam() {
        return naam;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    @Override
    public String toString() {
        return "Klant genaamd " + naam + " is een ";
    }
}
