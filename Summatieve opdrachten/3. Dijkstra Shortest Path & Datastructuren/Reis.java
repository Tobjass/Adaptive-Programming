package tobias.summatieveopdracht3;

import java.util.*;

public class Reis {

    private int afstand[];
    private Set<Integer> visited;
    private int punten;
    private PriorityQueue<Node> priorityQueue;
    private List<List<Node>> data;

    public Reis(int punten) {
        this.punten = punten;
        afstand = new int[punten];
        visited = new HashSet<>();
        priorityQueue = new PriorityQueue<>(punten, new Node());
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

    public void dijkstraAlgoritme(List<List<Node>> data, int beginpunt) {

    }
}
