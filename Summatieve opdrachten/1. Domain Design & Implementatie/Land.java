package com.tobias.summatieveopdracht1;

public class Land {

    private String naam;
    private Park park;

    public Land() {
    }

    public Land(String naam) {
        this.naam = naam;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    @Override
    public String toString() {
        return naam + ":\n\n" + park;
    }
}
