package tobias.summatieveopdracht2;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void nieuweState() {
        State s0 = new State("s0");

        assertEquals("Error bij het aanmaken van nieuwe state", "s0", s0.getNaam());
    }

    @Test
    public void nieuweTransitie() {
        State s0 = new State("s0");
        State s3 = new State("s3");

        s0.addTransitie("A", s3);

        assertEquals("Error bij het aanmaken van nieuwe transitie", "State: s0 Transities: A -> s3, ", s0.toString());
    }

    @Test
    public void FSMrun() {
        State s0 = new State("s0");
        State s1 = new State("s1");
        State s2 = new State("s2");

        s0.addTransitie("D", s1);
        s1.addTransitie("A", s2);

        State[] states = {s0, s1, s2};
        FSM fsm = new FSM(states);

        String[] inputs = {"D", "A"};
        List<String> locaties = new ArrayList<>();
        locaties.add("s0");
        locaties.add("s1");
        locaties.add("s2");
        
        assertEquals("Error bij het runnen van FSM", locaties, fsm.run(inputs, s0));
    }
}
