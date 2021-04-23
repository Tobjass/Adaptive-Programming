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

        Huis h1 = new Huis("8-persoons bungalow 8L", 235, 122, 4, 2, true, true, true, true, 5, 2, true, true, false);
        park.setHuis(h1);
        Huis h2 = new Huis("10-persoons bungalow 10L", 320, 148, 5, 2, true, true, true, true, 5, 3, true, true, false);
        park.setHuis(h2);
        Huis h3 = new Huis("16-persoons bungalow 16C", 250, 220, 8, 2, true, true, true, true, 8, 4, true, false, false);
        park.setHuis(h3);

        Klant k1 = new Klant("Tobias Kramer", "Achtersloot", 87, "5601 ES", "IJsselstein", "25/06/2002", "0678931803", "tobias35@gmail.com", 'M', 10);
        h2.setHuurder(k1);
        Klant k2 = new Klant("Jeroen Visser", "Bombardonlaan", 56, "2783 PT", "Nieuwegein", "14/03/2002", "0632619375", "jeroen89@gmail.com", 'M', 15);
        h1.setHuurder(k2);
        Klant k3 = new Klant("Bart van Zandwijk", "Nolensstraat", 9, "9652 AN", "Nieuwegein", "09/11/2002", "0684617593", "bartvz@gmail.com", 'M', 5);
        h3.setHuurder(k3);

        System.out.println(land);
        System.out.println(h1.getHuurder());
        System.out.println(h2.getHuurder());
        System.out.println(h3.getHuurder());
    }
}
