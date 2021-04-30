package tobias.summatieveopdracht1;

public class Vrouw extends Klant{

    private Klant vrouw;

    public void setVrouw(Klant vrouw) {
        this.vrouw = vrouw;
    }

    @Override
    public String toString() {
        return vrouw + "vrouw";
    }
}
