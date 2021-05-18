package tobias.formatieveopdracht2a;

public class s2 extends State {

    void update(String input) {
        switch (input) {
            case "B":
                current = s3;
                State.setLocaties(s3);
                return;
            default:
                System.out.println("*** Error, overgang (s2 -> " + input + ") bestaat niet");
        }
    }

    @Override
    public String toString() {
        return "s2";
    }
}
