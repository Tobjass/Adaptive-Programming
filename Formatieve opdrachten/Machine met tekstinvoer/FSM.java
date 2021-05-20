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
            if (current.getTransitiesSet().contains(input)) {
                current = current.getTransities().get(input);
                this.locaties.add(current.getNaam());
            }
            else {
                System.out.println("\nError: overgang '" + input + "' bestaat niet voor state " + current.getNaam() + "\n");
            }
        }
        return this.locaties;
    }
}
