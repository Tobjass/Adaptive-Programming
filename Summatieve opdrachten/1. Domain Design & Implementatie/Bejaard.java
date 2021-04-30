package tobias.summatieveopdracht1;

public class Bejaard extends Klant {
    
    private Klant bejaard;

    public void setBejaard(Klant bejaard) {
        this.bejaard = bejaard;
    }

    @Override
    public String toString() {
        return bejaard + "bejaard";
    }
}
