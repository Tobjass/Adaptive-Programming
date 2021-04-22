package com.tobias.zwembad;

public class Main {

    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);

        Zwembad z2 = new Zwembad();
        z2.setBreedte(2.5);
        z2.setLengte(100.0);
        z2.setDiepte(2.0);

        System.out.println(z1.getBreedte());
        System.out.println(z1.getLengte());
        System.out.println(z1.getDiepte());
        System.out.println(z1.inhoud());
        System.out.println(z2);
        System.out.println(z2.inhoud());
    }
}
