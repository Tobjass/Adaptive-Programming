package tobias.summatieveopdracht1;

public class HuisHuur {

    private int aantalNachten;
    private Klant huurder;
    private Huis gehuurdeHuis;

    public HuisHuur() {
    }

    public void setAantalNachten(int aantalNachten) {
        this.aantalNachten = aantalNachten;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeHuis(Huis gehuurdeHuis) {
        this.gehuurdeHuis = gehuurdeHuis;
    }

    public double berekenPrijs() {
        if (gehuurdeHuis != null && huurder != null) {
            return aantalNachten * gehuurdeHuis.getPrijsPerNacht() * (1 - huurder.getKorting() / 100);
        }
        return 0;
    }
    // Berekent de prijs voor het huis. Als er een huis en huurder is wordt het aantal nachten vermenigvuldigd met de
    // prijs per nacht van dat huis, en uiteindelijk met de korting van die klant. Als er geen huis of huurder bekend
    // is de prijs 0.

    public String huisCheck() {
       if (gehuurdeHuis != null) {
           return gehuurdeHuis.getType() + " met prijs per nacht: " + gehuurdeHuis.getPrijsPerNacht();
       }
       return "er is geen huis bekend";
    }
    // Controleert of er een huis bekend is. Zo ja, wordt het type van dit huis samen met de prijs per nacht als string
    // returned. Als dit niet het geval is wordt er een string returned.

    public String klantCheck() {
        if (huurder != null) {
            return "op naam van: " + huurder.getNaam() + " (korting: " + huurder.getKorting() + "%)";
        }
        return "er is geen huurder bekend";
    }
    // Controleert of er een huurder bekend is. Zo ja, wordt de naam van de huurder samen met het kortingspercentage als
    // string returned. Als dit niet het geval is wordt er een string returned.

    @Override
    public String toString() {
        return huisCheck() + "\n   " + klantCheck() + "\n   aantal nachten: " + aantalNachten + " en dat kost "
                + berekenPrijs();
    }
}
