package tobias.formatieveopdracht2a;

public class s3 extends State {

    void enter() {
        System.out.println("Nu in de s3 state");
    }

    String update(String input) {
        switch (input) {

            case "A":
                current = s3;
                return "s3";
            case "B":
                current = s0;
                return "s0";
            default:
                System.out.println("\n*** Error, overgang bestaat niet");
                return "fout";
        }
    }
}
