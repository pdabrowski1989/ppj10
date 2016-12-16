package com.company;

public class Liczba {
    public Liczba(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    private int x;

    public void przypiszWartosc(int x) {
        this.x = x;
    }

    public void wyswietlWartosc() {
        System.out.print(x);
    }
}
