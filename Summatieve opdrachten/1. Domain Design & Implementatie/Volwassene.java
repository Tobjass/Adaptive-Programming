package tobias.summatieveopdracht1;

public class Volwassene extends Klant {
    
    private Klant volwassene;

    public void setVolwassene(Klant volwassene) {
        this.volwassene = volwassene;
    }

    @Override
    public String toString() {
        return volwassene + "volwassene";
    }
}
