package com.tobias.autohuur;

import java.util.Objects;

public class AutoHuur {

    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    private double berekenPrijs() {
        if (gehuurdeAuto != null && huurder != null) {
            return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100);
        }
        return 0;
    }

    @Override
    public String toString() {
        return Objects.requireNonNullElse(gehuurdeAuto, "\n\ter is geen auto bekend") + "\n\t"
                + Objects.requireNonNullElse(huurder, "er is geen huurder bekend") + "\n\taantal dagen: "
                + aantalDagen + " en dat kost " + berekenPrijs();
    }
}
