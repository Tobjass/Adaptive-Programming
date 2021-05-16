package tobias.formatieveopdracht2a;

import java.util.Scanner;

public class s2 extends State {

    void enter() {
        System.out.println("Nu in de s2 state");
    }

    void update() {
        while (true) {
            System.out.println("B");

            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {

                case "B":
                    current = s3;
                    return;
                default:
                    System.out.println("\n*** Error, overgang bestaat niet");
            }
        }
    }
}
