package com.Kovalov.HM3;

public class HM3 {

    public static void main(String[] args) {
        int armyLi = (13 + 24 + 46) * 860;
        double NoW = (double) 860 / 100;
        double Now1 = NoW * 150;
        double armyMi = (9 + 35 + 12) * Now1;
        System.out.println(armyLi);
        System.out.println(armyMi);

        division(10, 3);

        exercise3(100);

    }

    public static void division(int a, int b) {
        double c = (double) a / b;
        System.out.println(c);
    }

    public static void exercise3(int n) {
        int n2 = n * 2;
        int randomN = (int) (Math.random() * n2 - n);
        System.out.println(randomN);
    }
}