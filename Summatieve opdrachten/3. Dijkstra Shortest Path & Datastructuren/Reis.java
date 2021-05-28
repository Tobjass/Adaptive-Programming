package tobias.summatieveopdracht3;

import java.util.*;

public class Reis {

    private int afstand[];
    private Set<Integer> visited;
    private int punten;

    public Reis(int punten) {
        this.punten = punten;
        afstand = new int[punten];
        visited = new HashSet<>();
    }
}
