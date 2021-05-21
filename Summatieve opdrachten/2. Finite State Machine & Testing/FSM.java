package tobias.summatieveopdracht2;

import java.util.ArrayList;
import java.util.List;

public class FSM {

    private State[] states;
    private List<String> locaties = new ArrayList<>();

    // Constructor
    public FSM(State[] states) {
        this.states = states;
    }

    // Runnen van de Finite State Machine
    public List<String> run(String[] inputs, State beginState) {
        // Beginstate aan current toewijzen
        State current = beginState;
        // Naam van beginstate aan de locaties toevoegen
        this.locaties.add(current.getNaam());
        // For loop die elke letter uit inputs langsgaat
        for (String input : inputs) {
            // Als de letter in de transities aanwezig is
            if (current.getTransitiesSet().contains(input)) {
                // Current updaten
                current = current.getTransities().get(input);
                // Naam van nieuwe state aan de locaties toevoegen
                this.locaties.add(current.getNaam());
            }
            else {
                // Error printen en aangeven dat een input bij een bepaalde state niet bestaat
                System.out.println("\nError: overgang '" + input + "' bestaat niet voor state " + current.getNaam());
            }
        }
        return this.locaties;
    }
}
