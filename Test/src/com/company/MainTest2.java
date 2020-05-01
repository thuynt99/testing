package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {
    @Test
    void zodiac1() {
        assertEquals("Aquarius", Main.Zodiac(15,2,2000) );
    }
    @Test
    void zodiac2() {
        assertEquals("Virgo", Main.Zodiac(15,9,2000) );
    }
    @Test
    void zodiac3() {
        assertEquals("Sagittarius", Main.Zodiac(15,12,2000) );
    }
    @Test
    void zodiac4() {
        assertEquals("Pisces", Main.Zodiac(20,2,2000) );
    }
    @Test
    void zodiac5() {
        assertEquals("Virgo", Main.Zodiac(20,9,2000) );
    }
    @Test
    void zodiac6() {
        assertEquals("Sagittarius", Main.Zodiac(20,12,2000) );
    }
    @Test
    void zodiac7() {
        assertEquals("Pisces", Main.Zodiac(21,2,2000) );
    }
    @Test
    void zodiac8() {
        assertEquals("Virgo", Main.Zodiac(21,9,2000) );
    }
    @Test
    void zodiac9() {
        assertEquals("Sagittarius", Main.Zodiac(21,12,2000) );
    }
    @Test
    void zodiac10() {
        assertEquals("Pisces", Main.Zodiac(22,2,2000) );
    }
    @Test
    void zodiac11() {
        assertEquals("Virgo", Main.Zodiac(22,9,2000) );
    }
    @Test
    void zodiac12() {
        assertEquals("Capricorn", Main.Zodiac(22,12,2000) );
    }
    @Test
    void zodiac13() {
        assertEquals("Pisces", Main.Zodiac(23,2,2000) );
    }
    @Test
    void zodiac14() {
        assertEquals("Libra", Main.Zodiac(23,9,2000) );
    }
    @Test
    void zodiac15() {
        assertEquals("Capricorn", Main.Zodiac(23,12,2000) );
    }
    @Test
    void zodiac16() {
        assertEquals("Pisces", Main.Zodiac(28,2,2000) );
    }
    @Test
    void zodiac17() {
        assertEquals("Libra", Main.Zodiac(28,9,2000) );
    }
    @Test
    void zodiac18() {
        assertEquals("Capricorn", Main.Zodiac(28,12,2000) );
    }
    @Test
    void zodiac19() {
        assertEquals("Pisces", Main.Zodiac(29,2,2000) );
    }
    @Test
    void zodiac20() {
        assertEquals("Libra", Main.Zodiac(29,9,2000) );
    }
    @Test
    void zodiac21() {
        assertEquals("Capricorn", Main.Zodiac(29,12,2000) );
    }
    @Test
    void zodiac22() {
        assertEquals("Invalid date", Main.Zodiac(30,2,2000) );
    }
    @Test
    void zodiac23() {
        assertEquals("Libra", Main.Zodiac(30,9,2000) );
    }
    @Test
    void zodiac24() {
        assertEquals("Capricorn", Main.Zodiac(30,12,2000) );
    }
    @Test
    void zodiac25() {
        assertEquals("Invalid date", Main.Zodiac(31,2,2000) );
    }
    @Test
    void zodiac26() {
        assertEquals("Invalid date", Main.Zodiac(31,9,2000) );
    }
    @Test
    void zodiac27() {
        assertEquals("Capricorn", Main.Zodiac(0,12,2000) );
    }
}