package tobias.summatieveopdracht2;

import java.util.HashMap;

public class State {

    private HashMap<String, State> transities = new HashMap<>();
    private String naam;

    public State(String naam) {
        this.naam = naam;
    }

    public HashMap<String, State> getTransities() {
        return transities;
    }

    public void setTransities(HashMap<String, State> transities) {
        this.transities = transities;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void addTransitie(String optie, State state) {
        this.transities.put(optie, state);
    }
}
