package com.company;

public class ZbiorMetod {
    public void ustalWartosc(float y) {
        System.out.println(y + " :float");
    }

    public void ustalWartosc(int x) {
            System.out.println(x + " :int");
    }

    public void ustalWartosc(byte z) {
        System.out.println(z + " :byte");
    }

    public void ustalWartosc(Liczba a) {
        a.wyswietlWartosc();
    }
}