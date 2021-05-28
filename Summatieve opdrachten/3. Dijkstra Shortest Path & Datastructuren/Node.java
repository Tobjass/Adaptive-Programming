package tobias.summatieveopdracht3;

import java.util.Comparator;

public class Node implements Comparator<Node> {

    public int node;
    public int afstandVanBeginpunt;

    public Node() { }

    public Node(int node, int afstandVanBeginpunt) {
        this.node = node;
        this.afstandVanBeginpunt = afstandVanBeginpunt;
    }

    @Override
    public int compare(Node o1, Node o2) {
        return 0;
    }
}
