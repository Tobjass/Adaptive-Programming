package tobias.formatieveopdracht2a;

public class Statemachine {

    public static void main(String[] args) {

        State.s0 = new s0();
        State.s1 = new s1();
        State.s2 = new s2();
        State.s3 = new s3();

        State.current = State.s0;

        while (true) {
            State.current.enter();
            State.current.update();
        }
    }
}
