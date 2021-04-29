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
    
    @Override
    public String toString() {
        return Objects.requireNonNullElse(gehuurdeHuis.getType(), "\n\ter is geen huis bekend") + "\n\t"
                + Objects.requireNonNullElse(huurder, "er is geen huurder bekend") + "\n\taantal dagen: "
                + aantalDagen + " en dat kost " + berekenPrijs();
    }
}
