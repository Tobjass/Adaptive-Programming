package tobias.formatieveopdracht2a;

import java.util.Scanner;

public class s1 extends State {

    void enter() {
        System.out.println("Nu in de s1 state");
    }

    void update() {
        while (true) {
            System.out.println("A");
            System.out.println("B");

            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {

                case "A":
                    current = s1;
                    return;
                case "B":
                    current = s2;
                    return;
                default:
                    System.out.println("\n*** Error, overgang bestaat niet");
            }
        }
    }
}
