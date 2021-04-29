package tobias.summatieveopdracht1;

import java.util.Objects;

public class HuisHuur {

    private int aantalDagen;
    private Klant huurder;
    private Huis gehuurdeHuis;

    public HuisHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeHuis(Huis gehuurdeHuis) {
        this.gehuurdeHuis = gehuurdeHuis;
    }

    public String getGehuurdeHuis() {
        return gehuurdeHuis.getType();
    }

    private double berekenPrijs() {
        if (gehuurdeHuis != null && huurder != null) {
            return aantalDagen * gehuurdeHuis.getPrijsPerNacht() * (1 - huurder.getKorting() / 100);
        }
        return 0;
    }

    private String huisCheck() {
       if (gehuurdeHuis != null) {
           return gehuurdeHuis.getType() + " met prijs per nacht: " + gehuurdeHuis.getPrijsPerNacht();
       }
       return "er is geen huis bekend";
    }

    @Override
    public String toString() {
        return huisCheck() + "\n   " + Objects.requireNonNullElse(huurder, "er is geen huurder bekend") + "\n   aantal dagen: "
                + aantalDagen + " en dat kost " + berekenPrijs();
    }
}
