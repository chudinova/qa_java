package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    private Alex alex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void doesHaveManeTest() {
        boolean actual = alex.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void getFriendsTest() {
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }
}