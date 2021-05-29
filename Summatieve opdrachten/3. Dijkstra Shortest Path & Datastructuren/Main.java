package tobias.summatieveopdracht3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] treinstations = {"Utrecht Centraal", "Amsterdam Centraal", "Rotterdam Centraal", "Schiphol Airport",
                "Den Haag Centraal", "Leiden Centraal", "Eindhoven Centraal", "’s-Hertogenbosch"};
        String[] autolocaties = {"Utrecht", "Amsterdam", "Rotterdam", "Schiphol",
                "Den Haag", "Leiden", "Eindhoven", "’s-Hertogenbosch"};

        List<List<Node>> dataStations = new ArrayList<>();
        List<List<Node>> dataAutolocaties = new ArrayList<>();

        for (int i = 0; i < treinstations.length; i++) {
            List<Node> lijst = new ArrayList<>();
            dataStations.add(lijst);
            dataAutolocaties.add(lijst);
        }

        dataStations.get(0).add(new Node(1, 27));
        dataStations.get(0).add(new Node(2, 37));
        dataStations.get(0).add(new Node(3, 29));
        dataStations.get(0).add(new Node(4, 37));
        dataStations.get(0).add(new Node(5, 42));
        dataStations.get(0).add(new Node(6, 49));
        dataStations.get(0).add(new Node(7, 27));

        dataStations.get(1).add(new Node(0, 27));
        dataStations.get(1).add(new Node(2, 41));
        dataStations.get(1).add(new Node(3, 13));
        dataStations.get(1).add(new Node(5, 36));
        dataStations.get(0).add(new Node(7, 58));

        dataStations.get(2).add(new Node(0, 37));
        dataStations.get(2).add(new Node(1, 41));
        dataStations.get(2).add(new Node(3, 25));
        dataStations.get(2).add(new Node(4, 23));
        dataStations.get(2).add(new Node(5, 33));

        dataStations.get(3).add(new Node(0, 29));
        dataStations.get(3).add(new Node(1, 13));
        dataStations.get(3).add(new Node(2, 25));
        dataStations.get(3).add(new Node(4, 29));
        dataStations.get(3).add(new Node(5, 16));

        dataStations.get(4).add(new Node(0, 37));
        dataStations.get(4).add(new Node(2, 23));
        dataStations.get(4).add(new Node(3, 29));
        dataStations.get(4).add(new Node(5, 12));

        dataStations.get(5).add(new Node(0, 42));
        dataStations.get(5).add(new Node(1, 36));
        dataStations.get(5).add(new Node(2, 33));
        dataStations.get(5).add(new Node(3, 16));
        dataStations.get(5).add(new Node(4, 12));

        dataStations.get(6).add(new Node(0, 49));
        dataStations.get(6).add(new Node(7, 18));

        dataStations.get(7).add(new Node(0, 27));
        dataStations.get(7).add(new Node(1, 58));
        dataStations.get(7).add(new Node(6, 18));

        dataAutolocaties.get(0).add(new Node(1, 42.7));
        dataAutolocaties.get(0).add(new Node(2, 61.2));
        dataAutolocaties.get(0).add(new Node(3, 50.6));
        dataAutolocaties.get(0).add(new Node(4, 68.2));
        dataAutolocaties.get(0).add(new Node(5, 58.9));
        dataAutolocaties.get(0).add(new Node(7, 54.8));

        dataAutolocaties.get(1).add(new Node(0, 42.7));
        dataAutolocaties.get(1).add(new Node(2, 88.1));
        dataAutolocaties.get(1).add(new Node(3, 21.8));
        dataAutolocaties.get(1).add(new Node(4, 64.2));
        dataAutolocaties.get(1).add(new Node(5, 50.6));
        dataAutolocaties.get(1).add(new Node(7, 87.6));

        dataAutolocaties.get(2).add(new Node(0, 61.2));
        dataAutolocaties.get(2).add(new Node(1, 88.1));
        dataAutolocaties.get(2).add(new Node(3, 59.1));
        dataAutolocaties.get(2).add(new Node(4, 23.2));
        dataAutolocaties.get(2).add(new Node(5, 35.1));
        dataAutolocaties.get(2).add(new Node(7, 78.8));

        dataAutolocaties.get(3).add(new Node(0, 50.6));
        dataAutolocaties.get(3).add(new Node(1, 21.8));
        dataAutolocaties.get(3).add(new Node(2, 59.1));
        dataAutolocaties.get(3).add(new Node(4, 46.9));
        dataAutolocaties.get(3).add(new Node(5, 33.2));

        dataAutolocaties.get(4).add(new Node(0, 68.2));
        dataAutolocaties.get(4).add(new Node(1, 64.2));
        dataAutolocaties.get(4).add(new Node(2, 23.2));
        dataAutolocaties.get(4).add(new Node(3, 46.9));
        dataAutolocaties.get(4).add(new Node(5, 21.9));

        dataAutolocaties.get(5).add(new Node(0, 58.9));
        dataAutolocaties.get(5).add(new Node(1, 50.6));
        dataAutolocaties.get(5).add(new Node(2, 35.1));
        dataAutolocaties.get(5).add(new Node(3, 33.2));
        dataAutolocaties.get(5).add(new Node(4, 21.9));

        dataAutolocaties.get(6).add(new Node(7, 36.6));

        dataAutolocaties.get(7).add(new Node(0, 54.8));
        dataAutolocaties.get(7).add(new Node(1, 87.6));
        dataAutolocaties.get(7).add(new Node(2, 78.8));
        dataAutolocaties.get(7).add(new Node(6, 36.6));

        for (int i = 0; i < treinstations.length; i++) {
            Reis reis = new Reis(treinstations.length);
            reis.dijkstraAlgoritme(dataStations, i);

            System.out.println("\nDe korste reis van ...");
            for (int x = 0; x < reis.getAfstand().length; x++) {
                System.out.println(treinstations[i] + " naar " + treinstations[x] + " duurt " + reis.getAfstand()[x] + " minuten");
            }
        }

        for (int i = 0; i < autolocaties.length; i++) {
            Reis reis = new Reis(autolocaties.length);
            reis.dijkstraAlgoritme(dataAutolocaties, i);

            System.out.println("\nDe korste reis van ...");
            for (int x = 0; x < reis.getAfstand().length; x++) {
                System.out.println(autolocaties[i] + " naar " + autolocaties[x] + " is " + reis.getAfstand()[x] + " km");
            }
        }
    }
}
