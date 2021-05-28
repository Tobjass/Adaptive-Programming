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

    public int[] getAfstand() {
        return afstand;
    }

    public void setAfstand(int[] afstand) {
        this.afstand = afstand;
    }

    public Set<Integer> getVisited() {
        return visited;
    }

    public void setVisited(Set<Integer> visited) {
        this.visited = visited;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }
}
