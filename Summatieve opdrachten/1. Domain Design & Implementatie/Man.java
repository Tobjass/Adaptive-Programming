package tobias.summatieveopdracht1;

public class Man extends Klant implements SoortKlant {

    private Klant man;

    public void setVariable(Klant variable) {
        this.man = variable;
    }

    @Override
    public String toString() {
        return man + "man";
    }
}
