package tobias.formatieveopdracht2a;

public class s1 extends State {

    void enter() {
        System.out.println("Nu in de s1 state");
    }

    String update(String input) {
        switch (input) {
            case "A":
                current = s1;
                return "s1";
            case "B":
                current = s2;
                return "s2";
            default:
                System.out.println("\n*** Error, overgang bestaat niet");
                return "fout";
        }
    }
}
