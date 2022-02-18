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

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getKittens()).thenReturn(1);
            int actual = lion.getKittens();
            int expected = 1;
            assertEquals(expected, actual);
        }

    @Test
    public void doesHaveManeTrueTest() throws Exception {
        Lion lionMale = new Lion("Самец", feline);
        boolean actual = lionMale.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeFalseTest() throws Exception {
        Lion lionFemale = new Lion("Самка", feline);
        boolean actual = lionFemale.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void lionNoSexExceptionTest() {
        Exception exception = null;
        try {
            Lion lionOther = new Lion(" ", feline);
        } catch (Exception ex) {
            exception = ex;
        }
        assertNotNull(exception);
        assertEquals("Используйте допустимые значения пола животного - " +
                "самец или самка", exception.getMessage());
    }




        @Test
        public void getFoodTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List<String> actual = lion.getFood();
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expected, actual);
        }
    }
