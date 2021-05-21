package tobias.summatieveopdracht2;

import java.util.HashMap;
import java.util.Set;

public class State {

    private HashMap<String, State> transities = new HashMap<>();
    private String naam;
    
    // Constructor
    public State(String naam) {
        this.naam = naam;
    }
    
    // Ophalen van de transities 
    public HashMap<String, State> getTransities() {
        return transities;
    }
    
    // Ophalen van de transities in een set om te kunnen controleren om de input geldig is
    public Set<String> getTransitiesSet() {
        return transities.keySet();
    }
    
    // Ophalen van de state-naam
    public String getNaam() {
        return naam;
    }
    
    // Transitie aan de state toevoegen
    public void addTransitie(String optie, State state) {
        this.transities.put(optie, state);
    }
    
    // Transities van de state overzichtelijk returnen
    @Override
    public String toString() {
        String transitiesString = "";
        for (String key : transities.keySet()) {
            transitiesString = transitiesString + key + " -> " + transities.get(key).naam + ", ";
        }
        return "State: " + naam + " Transities: " + transitiesString;
    }
}
