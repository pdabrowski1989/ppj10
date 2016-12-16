package com.company;

public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void show(String imie, String nazwisko, int rokUrodzenia) {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(rokUrodzenia);
    }
}
