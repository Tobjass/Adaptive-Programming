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

    private double berekenPrijs() {
        if (gehuurdeHuis != null && huurder != null) {
            return aantalNachten * gehuurdeHuis.getPrijsPerNacht() * (1 - huurder.getKorting() / 100);
        }
        return 0;
    }

    private String huisCheck() {
       if (gehuurdeHuis != null) {
           return gehuurdeHuis.getType() + " met prijs per nacht: " + gehuurdeHuis.getPrijsPerNacht();
       }
       return "er is geen huis bekend";
    }

    private String klantCheck() {
        if (huurder != null) {
            return "op naam van: " + huurder.getNaam() + " (korting: " + huurder.getKorting() + "%)";
        }
        return "er is geen huurder bekend";
    }

    @Override
    public String toString() {
        return huisCheck() + "\n   " + klantCheck() + "\n   aantal nachten: " + aantalNachten + " en dat kost "
                + berekenPrijs();
    }
}
