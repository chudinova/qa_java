package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = feline.eatMeat();
        List<String> actual = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

}