package tobias.formatieveopdracht2a;

import java.util.Scanner;

public class s3 extends State {

    void enter() {
        System.out.println("Nu in de s3 state");
    }

    void update() {
        while (true) {
            System.out.println("A");
            System.out.println("B");

            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {

                case "A":
                    current = s3;
                    return;
                case "B":
                    current = s0;
                    return;
                default:
                    System.out.println("\n*** Error, overgang bestaat niet");
            }
        }
    }
}
