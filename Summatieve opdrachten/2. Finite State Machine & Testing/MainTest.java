package tobias.summatieveopdracht2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    State s0, s1;
    @Before
    public void setUp() {
        s0 = new State("s0");
        s1 = new State("s1");

        s0.addTransitie("D", s1);
    }

    @Test
    public void nieuweState() {
        assertEquals("Error bij het aanmaken van nieuwe state", "s0", s0.getNaam());
    }

    @Test
    public void nieuweTransitie() {
        assertEquals("Error bij het aanmaken van nieuwe transitie", "State: s0 Transities: D -> s1, ", s0.toString());
    }

    @Test
    public void FSMrun() {
        State s2 = new State("s2");

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
