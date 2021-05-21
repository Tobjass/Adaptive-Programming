package tobias.summatieveopdracht2;

import static org.junit.Assert.*;
import org.junit.Test;

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
}
