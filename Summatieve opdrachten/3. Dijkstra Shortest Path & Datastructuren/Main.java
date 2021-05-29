package tobias.summatieveopdracht3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] treinstations = {"Utrecht Centraal", "Amsterdam Centraal", "Rotterdam Centraal", "Schiphol Airport",
                "Den Haag Centraal", "Leiden Centraal", "Eindhoven Centraal", "’s-Hertogenbosch"};
        String[] autolocaties = {"Utrecht", "Amsterdam", "Rotterdam", "Schiphol",
                "Den Haag", "Leiden", "Eindhoven", "’s-Hertogenbosch"};
        String[] luchthavens = {"Hartsfield-Jackson Atlanta International", "Beijing Capital International",
                "Dubai International Airport", "Los Angeles International Airport", "Tokyo International Airport",
                "O’Hare International Airport", "London Heathrow", "Amsterdam Schiphol"};

        List<List<Node>> dataTreinstations = new ArrayList<>();
        List<List<Node>> dataAutolocaties = new ArrayList<>();
        List<List<Node>> dataLuchthavens = new ArrayList<>();

        for (int i = 0; i < treinstations.length; i++) {
            List<Node> treinstation = new ArrayList<>();
            dataTreinstations.add(treinstation);
            List<Node> autolocatie = new ArrayList<>();
            dataAutolocaties.add(autolocatie);
            List<Node> luchthaven = new ArrayList<>();
            dataLuchthavens.add(luchthaven);
        }

        dataTreinstations.get(0).add(new Node(1, 27));
        dataTreinstations.get(0).add(new Node(2, 37));
        dataTreinstations.get(0).add(new Node(3, 29));
        dataTreinstations.get(0).add(new Node(4, 37));
        dataTreinstations.get(0).add(new Node(5, 42));
        dataTreinstations.get(0).add(new Node(6, 49));
        dataTreinstations.get(0).add(new Node(7, 27));

        dataTreinstations.get(1).add(new Node(0, 27));
        dataTreinstations.get(1).add(new Node(2, 41));
        dataTreinstations.get(1).add(new Node(3, 13));
        dataTreinstations.get(1).add(new Node(5, 36));
        dataTreinstations.get(0).add(new Node(7, 58));

        dataTreinstations.get(2).add(new Node(0, 37));
        dataTreinstations.get(2).add(new Node(1, 41));
        dataTreinstations.get(2).add(new Node(3, 25));
        dataTreinstations.get(2).add(new Node(4, 23));
        dataTreinstations.get(2).add(new Node(5, 33));

        dataTreinstations.get(3).add(new Node(0, 29));
        dataTreinstations.get(3).add(new Node(1, 13));
        dataTreinstations.get(3).add(new Node(2, 25));
        dataTreinstations.get(3).add(new Node(4, 29));
        dataTreinstations.get(3).add(new Node(5, 16));

        dataTreinstations.get(4).add(new Node(0, 37));
        dataTreinstations.get(4).add(new Node(2, 23));
        dataTreinstations.get(4).add(new Node(3, 29));
        dataTreinstations.get(4).add(new Node(5, 12));

        dataTreinstations.get(5).add(new Node(0, 42));
        dataTreinstations.get(5).add(new Node(1, 36));
        dataTreinstations.get(5).add(new Node(2, 33));
        dataTreinstations.get(5).add(new Node(3, 16));
        dataTreinstations.get(5).add(new Node(4, 12));

        dataTreinstations.get(6).add(new Node(0, 49));
        dataTreinstations.get(6).add(new Node(7, 18));

        dataTreinstations.get(7).add(new Node(0, 27));
        dataTreinstations.get(7).add(new Node(1, 58));
        dataTreinstations.get(7).add(new Node(6, 18));

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

        System.out.println("------------------ Treinritten ------------------");
        for (int i = 0; i < treinstations.length; i++) {
            Reis reis = new Reis(treinstations.length);
            reis.dijkstraAlgoritme(dataTreinstations, i);

            System.out.println("\nDe korste reis van ...");
            for (int x = 0; x < reis.getAfstand().length; x++) {
                System.out.println(treinstations[i] + " naar " + treinstations[x] + " duurt " + Math.round(reis.getAfstand()[x]) + " minuten");
            }
        }

        System.out.println("\n\n------------------ Autoritten ------------------");
        for (int i = 0; i < autolocaties.length; i++) {
            Reis reis = new Reis(autolocaties.length);
            reis.dijkstraAlgoritme(dataAutolocaties, i);

            System.out.println("\nDe korste reis van ...");
            for (int x = 0; x < reis.getAfstand().length; x++) {
                double aantalKm = Math.round(reis.getAfstand()[x] * 10);
                System.out.println(autolocaties[i] + " naar " + autolocaties[x] + " is " + aantalKm / 10 + " km");
            }
        }
    }
}
