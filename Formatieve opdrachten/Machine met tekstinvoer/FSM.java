package tobias.formatieveopdracht2a;

import java.util.ArrayList;
import java.util.List;

public class FSM {

    private State[] states;
    private List<String> locaties = new ArrayList<>();

    public FSM(State[] states) {
        this.states = states;
    }

    public List<String> run(String[] inputs, State beginstate) {
        State current = beginstate;
        this.locaties.add(current.getNaam());
        for (String input : inputs) {
            current = current.getTransities().get(input);
            this.locaties.add(current.getNaam());
        }
        return this.locaties;
    }
}
