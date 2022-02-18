package com.example;

import java.util.List;

public class Alex extends Lion{

    private static final String sex = "Самец";
    boolean hasMane;

    public Alex(Feline feline) throws Exception {
        super(sex, feline);
    }

    public List<String> getFriends() {
        return List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
