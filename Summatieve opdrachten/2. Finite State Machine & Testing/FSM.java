package tobias.summatieveopdracht2;

import java.util.ArrayList;
import java.util.List;

public class FSM {

    private State[] states;
    private List<String> locaties = new ArrayList<>();

    public FSM(State[] states) {
        this.states = states;
    }
}
