package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    private final int kittensCount;
    private final int expected;

    public FelineGetKittensTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                { 0, 0},
                { 1, 1},
                { 5, 5}
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithNoParameterTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
