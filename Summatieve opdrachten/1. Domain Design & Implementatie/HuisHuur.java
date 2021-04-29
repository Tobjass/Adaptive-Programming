package tobias.summatieveopdracht1;

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

    public Huis getGehuurdeHuis() {
        return gehuurdeHuis;
    }
}
