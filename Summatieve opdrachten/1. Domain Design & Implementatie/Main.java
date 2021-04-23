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

        Huis h1 = new Huis("8-persoons bungalow 8L", 236.33, 122, 4, 2, true, true, true, true, 5, 2, true, true, false);
        park.setHuis(h1);
        Huis h2 = new Huis("10-persoons bungalow 10L", 319.67, 148, 5, 2, true, true, true, true, 5, 3, true, true, false);
        park.setHuis(h2);
        Huis h3 = new Huis("16-persoons bungalow 16C", 247.25, 220, 8, 2, true, true, true, true, 8, 4, true, false, false);
        park.setHuis(h3);

        System.out.println(land);
    }
}
