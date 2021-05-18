package tobias.formatieveopdracht2a;

public class s3 extends State {

    void update(String input) {
        switch (input) {
            case "A":
                current = s3;
                State.setLocaties(s3);
                return;
            case "B":
                current = s0;
                State.setLocaties(s0);
                return;
            default:
                System.out.println("*** Error, overgang (s3 -> " + input + ") bestaat niet");
        }
    }

    @Override
    public String toString() {
        return "s3";
    }
}
