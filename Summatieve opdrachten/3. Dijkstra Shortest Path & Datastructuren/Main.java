package tobias.summatieveopdracht3;

import tobias.dijkstra_priorityqueue.DPQ;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] treinstations = {"Utrecht Centraal", "Amsterdam Centraal", "Rotterdam Centraal", "Schiphol Airport",
                "Den Haag Centraal", "Leiden Centraal", "Eindhoven Centraal", "’s-Hertogenbosch"};

        List<List<Node>> data = new ArrayList<>();

        for (int i = 0; i < treinstations.length; i++) {
            List<Node> station = new ArrayList<>();
            data.add(station);
        }

        data.get(0).add(new Node(1, 27));
        data.get(0).add(new Node(2, 37));
        data.get(0).add(new Node(3, 29));
        data.get(0).add(new Node(4, 37));
        data.get(0).add(new Node(5, 42));
        data.get(0).add(new Node(6, 49));
        data.get(0).add(new Node(7, 27));

        data.get(1).add(new Node(0, 27));
        data.get(1).add(new Node(2, 41));
        data.get(1).add(new Node(3, 13));
        data.get(1).add(new Node(5, 36));
        data.get(0).add(new Node(7, 58));

        data.get(2).add(new Node(0, 37));
        data.get(2).add(new Node(1, 41));
        data.get(2).add(new Node(3, 25));
        data.get(2).add(new Node(4, 23));
        data.get(2).add(new Node(5, 33));

        data.get(3).add(new Node(0, 29));
        data.get(3).add(new Node(1, 13));
        data.get(3).add(new Node(2, 25));
        data.get(3).add(new Node(4, 29));
        data.get(3).add(new Node(5, 16));

        data.get(4).add(new Node(0, 37));
        data.get(4).add(new Node(2, 23));
        data.get(4).add(new Node(3, 29));
        data.get(4).add(new Node(5, 12));

        data.get(5).add(new Node(0, 42));
        data.get(5).add(new Node(1, 36));
        data.get(5).add(new Node(2, 33));
        data.get(5).add(new Node(3, 16));
        data.get(5).add(new Node(4, 12));

        data.get(6).add(new Node(0, 49));
        data.get(6).add(new Node(7, 18));

        data.get(7).add(new Node(0, 27));
        data.get(7).add(new Node(1, 58));
        data.get(7).add(new Node(6, 18));

        for (int i = 0; i < treinstations.length; i++) {
            Reis reis = new Reis(treinstations.length);
            reis.dijkstraAlgoritme(data, i);

            
        }
    }
}
