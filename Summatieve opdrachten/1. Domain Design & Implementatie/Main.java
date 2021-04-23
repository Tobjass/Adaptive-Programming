package com.tobias.summatieveopdracht1;

public class Main {

    public static void main(String[] args) {
        Land land = new Land("Nederland");
        Park park = new Park("Landal De Vers", "Overloon", "Brabant", 8.4);
        land.setPark(park);

        Faciliteit f1 = new Faciliteit("Café", "Grand Café Broer & Zus");
        park.setFaciliteit(f1);
        Faciliteit f2 = new Faciliteit("Zwembad", "Zwempret");
        park.setFaciliteit(f2);
        Faciliteit f3 = new Faciliteit("Fietsverhuur", "Bikes & More");
        park.setFaciliteit(f3);

        System.out.println(land);
    }
}
