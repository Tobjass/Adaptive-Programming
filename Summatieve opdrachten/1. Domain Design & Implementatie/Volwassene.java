package tobias.summatieveopdracht1;

public class Volwassene extends Klant implements SoortKlant{

    private Klant volwassene;

    public void setVariable(Klant variable) {
        this.volwassene = variable;
    }

    @Override
    public String toString() {
        return volwassene + "volwassene";
    }
}
