package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void zodiac1() {
        assertEquals("Gemini", Main.Zodiac(16,6,1800) );
    }
    @Test
    void zodiac2() {
        assertEquals("Gemini", Main.Zodiac(16,6,1801));
    }
    @Test
    void zodiac3() {
        assertEquals("Gemini", Main.Zodiac(16,6,2020));
    }
    @Test
    void zodiac4() {
        assertEquals("Gemini", Main.Zodiac(16,6,2019));
    }
    @Test
    void zodiac5() {
        assertEquals("Gemini", Main.Zodiac(1,6,1910));
    }
    @Test
    void zodiac6() {
        assertEquals("Gemini", Main.Zodiac(2,6,1910));
    }
    @Test
    void zodiac7() {
        assertEquals("Invalid date", Main.Zodiac(31,6,1910));
    }

    @Test
    void zodiac8() {
        assertEquals("Cancer", Main.Zodiac(30,6,1910));
    }
    @Test
    void zodiac9() {
        assertEquals("Capricorn", Main.Zodiac(16,1,1910));
    }
    @Test
    void zodiac10() {
        assertEquals("Aquarius", Main.Zodiac(16,2,1910));
    }
    @Test
    void zodiac11() {
        assertEquals("Sagittarius", Main.Zodiac(16,12,1910));
    }
    @Test
    void zodiac12() {
        assertEquals("Scorpio", Main.Zodiac(16,11,1910));
    }
    @Test
    void zodiac13() {
        assertEquals("Gemini", Main.Zodiac(16,6,1910));
    }
}