package tobias.formatieveopdracht2a;

public class s2 extends State {

    void enter() {
        System.out.println("Nu in de s2 state");
    }

    String update(String input) {
        switch (input) {
            case "B":
                current = s3;
                return "s3";
            default:
                System.out.println("\n*** Error, overgang bestaat niet");
                return "fout";
        }
    }
}
