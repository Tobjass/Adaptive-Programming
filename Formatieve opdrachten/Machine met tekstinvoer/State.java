package tobias.formatieveopdracht2a;

import java.util.HashMap;
import java.util.Set;

public class State {

    private HashMap<String, State> transities = new HashMap<>();
    private String naam;

    public State(String naam) {
        this.naam = naam;
    }

    public HashMap<String, State> getTransities() {
        return transities;
    }

    public Set<String> getTransitiesSet() {
        return transities.keySet();
    }

    public String getNaam() {
        return naam;
    }

    public void addTransitie(String optie, State state) {
        this.transities.put(optie, state);
    }

    @Override
    public String toString() {
        String transitiesString = "";
        for (String key : transities.keySet()) {
            transitiesString = transitiesString + key + " -> " + transities.get(key).naam + ", ";
        }
        return "Naam: " + naam + " Transities: " + transitiesString;
    }
}
