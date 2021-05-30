package tobias.summatieveopdracht3;

import java.util.*;

public class Reis {

    private double afstand[];
    private Set<Integer> visited;
    private int punten;
    private PriorityQueue<Node> priorityQueue;
    private List<List<Node>> data;

    // Constructor
    public Reis(int punten) {
        this.punten = punten;
        afstand = new double[punten];
        visited = new HashSet<>();
        priorityQueue = new PriorityQueue<>(punten, new Node());
    }

    public double[] getAfstand() {
        return afstand;
    }

    // Functie om de korste/goedkoopste reis te berekenen
    public void dijkstraAlgoritme(List<List<Node>> data, int beginpunt) {
        this.data = data;

        // Grootste integer in java toewijzen aan afstanden
        for (int i = 0; i < punten; i++) {
            afstand[i] = Integer.MAX_VALUE;
        }

        // Beginpunt aan priorityQueue toevoegen
        priorityQueue.add(new Node(beginpunt, 0));

        // Afstand naar het beginpunt is altijd 0
        afstand[beginpunt] = 0;
        while (visited.size() != punten) {
            double edgeAfstand;
            double nieuweAfstand;

            // Minimale afstand uit de priority queue halen
            int temp = priorityQueue.remove().node;
            visited.add(temp);

            // Berekenen of er een kortere reis mogelijk is
            for (int x = 0; x < data.get(temp).size(); x++) {
                Node stap = data.get(temp).get(x);

                // Als de huidige node nog niet gecontroleerd is
                if (!visited.contains(stap.node)) {
                    edgeAfstand = stap.afstandVanBeginpunt;
                    nieuweAfstand = afstand[temp] + edgeAfstand;

                    // Als de nieuwe afstand korter is dan de huidige afstand
                    if (nieuweAfstand < afstand[stap.node]) {
                        afstand[stap.node] = nieuweAfstand;
                    }

                    // Huidige node aan de priorityQueue toevoegen
                    priorityQueue.add(new Node(stap.node, afstand[stap.node]));
                }
            }
        }
    }

    // Printen van alle data
    public void printData(List<List<Node>> data, String[] lijst, int aantalAchterKomma, String reisSoort, String woord, String eenheid) {
        for (int i = 0; i < lijst.length; i++) {
            // Reis aanmaken en dijkstraAlgoritme() runnen
            Reis reis = new Reis(lijst.length);
            reis.dijkstraAlgoritme(data, i);

            // Prints uitvoeren
            System.out.println("\nDe " + reisSoort + " reis van ...");
            for (int x = 0; x < reis.getAfstand().length; x++) {
                // Afstand afronden naar een bepaald aantal cijfers achter de komma
                double afstand = Math.round(reis.getAfstand()[x] * aantalAchterKomma);
                System.out.println(lijst[i] + " naar " + lijst[x] + woord + afstand / aantalAchterKomma + eenheid);
            }
        }
    }
}
