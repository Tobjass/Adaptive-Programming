package tobias.formatieveopdracht2a;

import java.util.ArrayList;
import java.util.List;

public class State {

    static State s0, s1, s2, s3, current;

    private static List<State> locaties = new ArrayList<>();

    public static void setLocaties(State locatie) {
        locaties.add(locatie);
    }

    public static List<State> getLocaties() {
        return locaties;
    }

    void update(String input) { }
}
