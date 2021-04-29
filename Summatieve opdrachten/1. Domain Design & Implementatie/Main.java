package tobias.summatieveopdracht1;

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

        HuisHuur hh1 = new HuisHuur();
        Klant k1 = new Klant("Tobias Kramer", "Achtersloot", 87, "5601 ES", "IJsselstein", "25/06/2002", "0678931803", "tobias35@gmail.com", 'M', 10);
        hh1.setHuurder(k1);
        hh1.setAantalNachten(4);
        hh1.setGehuurdeHuis(h1);

        Klant k2 = new Klant("Jeroen Visser", "Bombardonlaan", 56, "2783 PT", "Nieuwegein", "14/03/2002", "0632619375", "jeroen89@gmail.com", 'M', 15);
        HuisHuur hh2 = new HuisHuur();
        hh2.setHuurder(k2);
        hh2.setAantalNachten(3);
        hh2.setGehuurdeHuis(h2);

        Klant k3 = new Klant("Bart van Zandwijk", "Nolensstraat", 9, "9652 AN", "Nieuwegein", "09/11/2002", "0684617593", "bartvz@gmail.com", 'M', 5);
        HuisHuur hh3 = new HuisHuur();
        hh3.setHuurder(k3);
        hh3.setAantalNachten(5);
        hh3.setGehuurdeHuis(h3);

        System.out.println(land);
        System.out.println("\nEerste huishuur:\n   " + hh1);
        System.out.println("\nTweede huishuur:\n   " + hh2);
        System.out.println("\nDerde huishuur:\n   " + hh3);
    }
}
