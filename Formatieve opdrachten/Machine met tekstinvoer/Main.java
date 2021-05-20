package tobias.formatieveopdracht2a;

public class Main {

    public static void main(String[] args) {

        State s0 = new State("s0");
        State s1 = new State("s1");
        State s2 = new State("s2");
        State s3 = new State("s3");

        s0.addTransitie("A", s2);
        s0.addTransitie("B", s1);
        s1.addTransitie("A", s1);
        s1.addTransitie("B", s2);
        s2.addTransitie("B", s3);
        s3.addTransitie("A", s3);
        s3.addTransitie("B", s0);

        State[] states = {s0, s1, s2, s3};
        FSM fsm = new FSM(states);

        String[] inputs = {"B", "A", "A", "B"};
        System.out.println(fsm.run(inputs, s0));
    }
}
