package tobias.summatieveopdracht1;

public class Vrouw extends Klant implements SoortKlant{

    private Klant vrouw;

    public void setVariable(Klant variable) {
        this.vrouw = variable;
    }

    @Override
    public String toString() {
        return vrouw + "vrouw";
    }
}
