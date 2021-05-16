package tobias.formatieveopdracht2a;

import java.util.Scanner;

public class s0 extends State {

    void enter() {
        System.out.println("Nu in de s0 state");
    }

    void update() {
        while (true) {
            System.out.println("A");
            System.out.println("B");

            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {

                case "A":
                    current = s2;
                    return;
                case "B":
                    current = s1;
                    return;
                default:
                    System.out.println("\n*** Error, overgang bestaat niet");
            }
        }
    }
}
