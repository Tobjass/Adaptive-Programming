package tobias.summatieveopdracht3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] treinstations = {"Utrecht Centraal", "Amsterdam Centraal", "Rotterdam Centraal", "Schiphol Airport", "Den Haag Centraal", "Leiden Centraal", "Eindhoven Centraal", "’s-Hertogenbosch"};

        List<List<Node>> data = new ArrayList<>();

        for (int i = 0; i < treinstations.length; i++) {
            List<Node> station = new ArrayList<>();
            data.add(station);
        }
    }
}
