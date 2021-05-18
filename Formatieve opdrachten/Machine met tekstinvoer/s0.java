package tobias.formatieveopdracht2a;

public class s0 extends State {

    void update(String input) {
        switch (input) {
            case "A":
                current = s2;
                State.setLocaties(s2);
                return;
            case "B":
                current = s1;
                State.setLocaties(s1);
                return;
            default:
                System.out.println("*** Error, overgang (s0 -> " + input + ") bestaat niet");
        }
    }

    @Override
    public String toString() {
        return "s0";
    }
}
