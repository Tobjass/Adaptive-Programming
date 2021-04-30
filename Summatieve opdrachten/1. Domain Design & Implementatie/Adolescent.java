package tobias.summatieveopdracht1;

public class Adolescent extends Klant {

    private Klant adolescent;

    public void setAdolescent(Klant adolescent) {
        this.adolescent = adolescent;
    }

    @Override
    public String toString() {
        return adolescent + "adolescent";
    }
}
