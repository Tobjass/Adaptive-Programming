package tobias.summatieveopdracht3;

import java.util.Comparator;

public class Node implements Comparator<Node> {

    public int node;
    public double afstandVanBeginpunt;

    // Lege constructor
    public Node() { }

    // Constructor
    public Node(int node, double afstandVanBeginpunt) {
        this.node = node;
        this.afstandVanBeginpunt = afstandVanBeginpunt;
    }

    // Compare functie
    @Override
    public int compare(Node o1, Node o2) {
        if (o1.afstandVanBeginpunt < o2.afstandVanBeginpunt)
            return -1;
        if (o1.afstandVanBeginpunt > o2.afstandVanBeginpunt)
            return 1;
        return 0;
    }
}
