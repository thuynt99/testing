package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    static int MAX_VALID_YR = 2020;
    static int MIN_VALID_YR = 1800;
    static boolean isLeapYear(int year) {
        // Return true if year is
        // a multiple of 4 and not
        // multiple of 100.
        // OR year is multiple of 400.
        return false;
    }

    static boolean isValidDate(int d, int m, int y) {
        // If year, month and day
        // are not in given range
        return false;
    }

    static String Zodiac(int d, int m, int y) {
        return !((y <= MAX_VALID_YR && y >= MIN_VALID_YR && m >= 1 && m <= 12 && (m != 2 || d != 29 || (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)))) && (d > 0 && d <= new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}[m - 1])) ? "Invalid date" : new String[] { "Aquarius", "Pisces", "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn" }[d >= new int[] { 20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22 }[m - 1] ? m - 1 : (m + 10) % 12];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,m,y;
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        System.out.println(Zodiac(d,m,y));
    }
}
