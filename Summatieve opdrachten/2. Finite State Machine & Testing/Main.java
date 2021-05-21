package tobias.summatieveopdracht2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        State s0 = new State("s0");
        State s1 = new State("s1");
        State s2 = new State("s2");
        State s3 = new State("s3");
        State s4 = new State("s4");
        State s5 = new State("s5");
        State s6 = new State("s6");
        State s7 = new State("s7");
        State s8 = new State("s8");
        State s9 = new State("s9");

        s0.addTransitie("A", s3);
        s0.addTransitie("B", s8);
        s0.addTransitie("C", s6);
        s0.addTransitie("D", s1);
        s0.addTransitie("E", s2);

        s1.addTransitie("A", s2);
        s1.addTransitie("B", s5);
        s1.addTransitie("C", s3);
        s1.addTransitie("D", s4);
        s1.addTransitie("E", s0);

        s2.addTransitie("A", s9);
        s2.addTransitie("B", s2);
        s2.addTransitie("C", s6);
        s2.addTransitie("D", s7);

        s3.addTransitie("A", s7);
        s3.addTransitie("B", s3);
        s3.addTransitie("C", s1);
        s3.addTransitie("D", s0);
        s3.addTransitie("E", s5);

        s4.addTransitie("A", s4);
        s4.addTransitie("B", s0);
        s4.addTransitie("C", s1);
        s4.addTransitie("D", s9);
        s4.addTransitie("E", s2);
        s4.addTransitie("F", s3);

        s5.addTransitie("A", s8);
        s5.addTransitie("B", s2);
        s5.addTransitie("C", s0);
        s5.addTransitie("D", s3);

        s6.addTransitie("A", s6);
        s6.addTransitie("B", s3);
        s6.addTransitie("C", s8);
        s6.addTransitie("D", s4);
        s6.addTransitie("E", s0);

        s7.addTransitie("A", s8);
        s7.addTransitie("B", s7);
        s7.addTransitie("C", s4);
        s7.addTransitie("D", s1);
        s7.addTransitie("E", s6);
        s7.addTransitie("F", s3);

        s8.addTransitie("A", s2);
        s8.addTransitie("B", s5);
        s8.addTransitie("C", s9);
        s8.addTransitie("D", s8);
        s8.addTransitie("E", s0);

        s9.addTransitie("A", s7);
        s9.addTransitie("B", s6);
        s9.addTransitie("C", s0);
        s9.addTransitie("D", s9);
        s9.addTransitie("E", s2);
        s9.addTransitie("F", s1);

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9 + "\n");

        State[] states = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9};
        FSM fsm = new FSM(states);

        System.out.println("Opties: A t/m F\nVoer een letter gevolgd door een spatie in\nVoorbeeld: D A C B");
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

//        String[] inputs = {"D", "A", "C", "B", "A", "C", "C", "B", "B", "C", "B", "A", "A", "C"};
        System.out.println("\nBezochte locaties:\n" + fsm.run(inputs, s0));
    }
}
