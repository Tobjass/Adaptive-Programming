package tobias.summatieveopdracht2;

import java.util.HashMap;

public class State {

    private HashMap<String, tobias.formatieveopdracht2a.State> transities = new HashMap<>();
    private String naam;

    public State(String naam) {
        this.naam = naam;
    }

    public HashMap<String, tobias.formatieveopdracht2a.State> getTransities() {
        return transities;
    }

    public void setTransities(HashMap<String, tobias.formatieveopdracht2a.State> transities) {
        this.transities = transities;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
