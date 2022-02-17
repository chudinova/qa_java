package com.example;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Feline extends Animal implements Predator {

    private Feline feline;

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
