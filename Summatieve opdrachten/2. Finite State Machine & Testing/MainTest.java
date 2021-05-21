package tobias.summatieveopdracht2;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void nieuweState() {
        State s0 = new State("s0");

        assertEquals("Error bij het aanmaken van nieuwe state", "s0", s0.getNaam());
    }
}
