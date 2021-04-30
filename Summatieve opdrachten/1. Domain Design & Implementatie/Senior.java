package tobias.summatieveopdracht1;

public class Senior extends Klant implements SoortKlant{

    private Klant senior;

    public void setVariable(Klant variable) {
        this.senior = variable;
    }

    @Override
    public String toString() {
        return senior + "senior";
    }
}
