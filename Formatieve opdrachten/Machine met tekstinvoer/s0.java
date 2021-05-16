package tobias.formatieveopdracht2a;

public class s0 extends State {

    void enter() {
        System.out.println("Nu in de s0 state");
    }

    String update(String input) {
        switch (input) {
            case "A":
                current = s2;
                return "s2";
            case "B":
                current = s1;
                return "s1";
            default:
                System.out.println("\n*** Error, overgang bestaat niet");
                return "fout";
        }
    }
}
