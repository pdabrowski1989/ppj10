package com.company;

public class Main {

    public static void main(String[] args) {
        Osoba osoba = new Osoba("Pawel", "Dabrowski", 1989);
        Liczba l = new Liczba(5);
        ZbiorMetod zm = new ZbiorMetod();
        char a = 'a';

        osoba.show("Pawel", "Dabrowski", 1989);

        zm.ustalWartosc(2);
        zm.ustalWartosc(0.5f);
        zm.ustalWartosc(a);
        zm.ustalWartosc((byte)129);
        zm.ustalWartosc(l.getX());
    }
}
