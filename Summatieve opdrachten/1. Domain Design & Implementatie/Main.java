package tobias.summatieveopdracht1;

public class Main {

    public static void main(String[] args) {
        Land land = new Land("Nederland");
        Park park = new Park("Landal De Vers", "Overloon", "Brabant", 8.4);
        land.setPark(park);
        // Nieuw land genaamd Nederland aanmaken. Daarna wordt er een nieuw park met de bijbehorende data aangemaakt.
        // Dit park wordt aan het land toegevoegd.

        Faciliteit f1 = new Faciliteit("Café", "Grand Café Broer & Zus");
        park.setFaciliteit(f1);
        Faciliteit f2 = new Faciliteit("Zwembad", "Zwempret");
        park.setFaciliteit(f2);
        Faciliteit f3 = new Faciliteit("Fietsverhuur", "Bikes & More");
        park.setFaciliteit(f3);
        // 3 verschillende faciliteiten aanmaken en toevoegen aan het park.

        Huis h1 = new Huis("6-persoons bungalow 6C2", 173, 102, 3, 2, true, true, true, true, 4, 2, true, false, false);
        park.setHuis(h1);
        Huis h2 = new Huis("8-persoons bungalow 8L", 235, 122, 4, 2, true, true, true, true, 5, 2, true, true, false);
        park.setHuis(h2);
        Huis h3 = new Huis("10-persoons bungalow 10L", 320, 148, 5, 2, true, true, true, true, 5, 3, true, true, false);
        park.setHuis(h3);
        Huis h4 = new Huis("16-persoons bungalow 16C", 250, 220, 8, 2, true, true, true, true, 8, 4, true, false, false);
        park.setHuis(h4);
        // 4 verschillende huizen aanmaken en toevoegen aan het park.

        HuisHuur hh1 = new HuisHuur();
        hh1.setGehuurdeHuis(h2);
        Klant k1 = new Klant("Ella Cox", "Middengolf", 23, "4189 IQ", "IJsselstein", "28/09/2003", "0682950192", "ellac@gmail.com", 5);
        Vrouw vr = new Vrouw();
        vr.setVariable(k1);
        Adolescent a1 = new Adolescent();
        a1.setVariable(k1);
        // Nieuwe huishuur aanmaken en het tweede huis hier aan toevoegen. Vervolgens wordt een nieuwe klant aangemaakt
        // met de bijbehorende data. Ook worden vrouw en adolescent aangemaakt. De klant wordt aan vrouw en adolescent
        // toegevoegd.

        HuisHuur hh2 = new HuisHuur();
        Klant k2 = new Klant("Tobias Kramer", "Achtersloot", 87, "5601 ES", "IJsselstein", "25/06/2002", "0678931803", "tobias35@gmail.com", 10);
        hh2.setHuurder(k2);
        hh2.setAantalNachten(4);
        hh2.setGehuurdeHuis(h2);
        Man m1 = new Man();
        m1.setVariable(k2);
        Adolescent a2 = new Adolescent();
        a2.setVariable(k2);
        // Nieuwe huishuur aanmaken. Vervolgens wordt er een nieuwe klant aangemaakt met de bijbehorende data. Deze
        // klant huurt het tweede huis voor 4 nachten, deze data wordt aan huishuur toevoegd. Dan worden man en
        // adolescent aangemaakt. De klant wordt aan man en adolescent toegevoegd.

        Klant k3 = new Klant("Jeroen Visser", "Bombardonlaan", 56, "2783 PT", "Nieuwegein", "14/03/1998", "0632619375", "jeroen89@gmail.com", 15);
        HuisHuur hh3 = new HuisHuur();
        hh3.setHuurder(k3);
        hh3.setAantalNachten(3);
        hh3.setGehuurdeHuis(h3);
        Man m2 = new Man();
        m2.setVariable(k3);
        Volwassene vo = new Volwassene();
        vo.setVariable(k3);
        // Nieuwe huishuur aanmaken. Vervolgens wordt er een nieuwe klant aangemaakt met de bijbehorende data. Deze
        // klant huurt het derde huis voor 3 nachten, deze data wordt aan huishuur toevoegd. Dan worden man en
        // volwassene aangemaakt. De klant wordt aan man en volwassene toegevoegd.

        Klant k4 = new Klant("Bart van Zandwijk", "Nolensstraat", 9, "9652 AN", "Nieuwegein", "09/11/1955", "0684617593", "bartvz@gmail.com", 5);
        HuisHuur hh4 = new HuisHuur();
        hh4.setHuurder(k4);
        hh4.setAantalNachten(5);
        hh4.setGehuurdeHuis(h4);
        Man m3 = new Man();
        m3.setVariable(k4);
        Senior s = new Senior();
        s.setVariable(k4);
        // Nieuwe huishuur aanmaken. Vervolgens wordt er een nieuwe klant aangemaakt met de bijbehorende data. Deze
        // klant huurt het vierde huis voor 5 nachten, deze data wordt aan huishuur toevoegd. Dan worden man en
        // senior aangemaakt. De klant wordt aan man en senior toegevoegd.

        System.out.println(land + "\n\nEerste huishuur:\n   " + hh1 + "\n\nTweede huishuur:\n   " + hh2
                + "\n\nDerde huishuur:\n   " + hh3 + "\n\nVierde huishuur:\n   " + hh4 + "\n\n" + vr + "\n" + a1 + "\n\n"
                + m1 + "\n" + a2 + "\n\n" + m2 + "\n" + vo + "\n\n" + m3 + "\n" + s);
        // Netjes printen van alle data. Land print de data van het park, eerste t/m vierde huishuur welk huis het over
        // gaat, wie het huurt en hoeveel dat kost. Vanaf '"\n\n" + vr ...' wordt het geslacht en de leeftijdsgroep per
        // klant getoond.
    }
}
