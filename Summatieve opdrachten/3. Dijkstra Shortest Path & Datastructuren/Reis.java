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
        this.data = data;

        for (int i = 0; i < punten; i++) {
            afstand[i] = Integer.MAX_VALUE;
        }

        priorityQueue.add(new Node(beginpunt, 0));

        afstand[beginpunt] = 0;
        while (visited.size() != punten) {
            int edgeAfstand;
            int nieuweAfstand;

            int temp = priorityQueue.remove().node;
            visited.add(temp);

            for (int x = 0; x < data.get(temp).size(); x++) {
                Node stap = data.get(temp).get(x);

                edgeAfstand = stap.afstandVanBeginpunt;
                nieuweAfstand = afstand[temp] + edgeAfstand;

                if (nieuweAfstand < afstand[stap.node]) {
                    afstand[stap.node] = nieuweAfstand;
                }

                priorityQueue.add(new Node(stap.node, afstand[stap.node]));
            }
        }
    }
}
