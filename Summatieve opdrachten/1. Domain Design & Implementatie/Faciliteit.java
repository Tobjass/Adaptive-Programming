package tobias.summatieveopdracht1;

public class Faciliteit {

    private String type;
    private String naam;

    public Faciliteit(String type, String naam) {
        this.type = type;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "\n   " + type + "; " + naam;
    }
}
