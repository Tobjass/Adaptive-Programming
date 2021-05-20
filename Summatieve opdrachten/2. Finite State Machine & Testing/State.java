package tobias.summatieveopdracht2;

import java.util.HashMap;

public class State {

    private HashMap<String, tobias.formatieveopdracht2a.State> transities = new HashMap<>();
    private String naam;

    public State(String naam) {
        this.naam = naam;
    }
}
