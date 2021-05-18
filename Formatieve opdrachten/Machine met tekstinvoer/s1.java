package tobias.formatieveopdracht2a;

public class s1 extends State {

    void update(String input) {
        switch (input) {
            case "A":
                current = s1;
                State.setLocaties(s1);
                return;
            case "B":
                current = s2;
                State.setLocaties(s2);
                return;
            default:
                System.out.println("*** Error, overgang (s1 -> " + input + ") bestaat niet");
        }
    }

    @Override
    public String toString() {
        return "s1";
    }
}
