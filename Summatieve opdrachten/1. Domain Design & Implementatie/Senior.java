package tobias.summatieveopdracht1;

public class Senior extends Klant {

    private Klant senior;

    public void setSenior(Klant senior) {
        this.senior = senior;
    }

    @Override
    public String toString() {
        return senior + "senior";
    }
}
