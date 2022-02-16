package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private Lion lionMale;
    private Lion lionFemale;
    private Lion lionNoSex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lionMale = new Lion("Самец", feline);
        lionFemale = new Lion("Самка", feline);
    }

    @Test
    public void getKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lionMale.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTrueTest() {
        boolean actual = lionMale.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeFalseTest() {
        boolean actual = lionFemale.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void lionNoSexExceptionTest() {
        Exception exception = null;
        try {
            lionNoSex = new Lion(" ", feline);
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - " +
                "самец или самка", exception.getMessage());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lionMale.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
}