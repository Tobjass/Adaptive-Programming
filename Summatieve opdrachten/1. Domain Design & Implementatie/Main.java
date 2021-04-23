package com.tobias.summatieveopdracht1;

public class Main {

    public static void main(String[] args) {
        Land l1 = new Land("Nederland");
        Park p1 = new Park("Landal De Vers", "Overloon", "Brabant", 8.4);
        l1.setPark(p1);

        System.out.println(l1);
    }
}
