package tobias.summatieveopdracht1;

public class Man extends Klant {

    private Klant man;

    public void setMan(Klant man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return man + "man";
    }
}
