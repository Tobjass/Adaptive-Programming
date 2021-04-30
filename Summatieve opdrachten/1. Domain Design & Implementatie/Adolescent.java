package tobias.summatieveopdracht1;

public class Adolescent extends Klant implements SoortKlant {

    private Klant adolescent;

    public void setVariable(Klant variable) {
        this.adolescent = variable;
    }

    @Override
    public String toString() {
        return adolescent + "adolescent";
    }
}
