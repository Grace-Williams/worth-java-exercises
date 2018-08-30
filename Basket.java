package com.worth.exercises;

public class Basket {
    private int apples;
    private int oranges;
    private int bananas;
    private int kilosOfCarrots;
    private int courgettes;
    private int peppers;

    public Basket() {
    }

    public int getOranges() {
        return oranges;
    }

    public void setOranges(int oranges) {
        this.oranges = oranges;
    }

    public int getBananas() {
        return bananas;
    }

    public void setBananas(int bananas) {
        this.bananas = bananas;
    }

    public int getKilosOfCarrots() {
        return kilosOfCarrots;
    }

    public void setKilosOfCarrots(int kilosOfCarrots) {
        this.kilosOfCarrots = kilosOfCarrots;
    }

    public int getCourgettes() {
        return courgettes;
    }

    public void setCourgettes(int courgettes) {
        this.courgettes = courgettes;
    }

    public int getPeppers() {
        return peppers;
    }

    public void setPeppers(int peppers) {
        this.peppers = peppers;
    }

    public int getApples() {
        return apples;
    }

    public void setApples(int apples) {
        this.apples = apples;
    }
}

// Goal:
// The shopping basket contains an order for apples (25p), bananas (18p) , oranges (35p), carrots (65p per kilo),
// courgettes (20p) and peppers (55p).
//
// Current deals are 3 for 2 on peppers. 30% off apples when you buy more than 3 apples,
// 50% off apples when you buy more than 7 apples. Get a free courgette if you buy more than 5 fruit.
// Get a free kilo of carrots for every 4 items of fruit bought.
//
// Implement the method Checkout.calculatePrice() to return the correct price of the basket.

