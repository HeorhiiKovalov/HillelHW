package com.Kovalov.Lesson3;

public class Lesson3 {

    public static void main(String[] args) {
        float a = 3.44444444444f;
        Math.round(a);
        int b = 2;
        Math.pow(b, 3);
        Math.sqrt(b);
        System.out.println(Math.random()); // от 0.0 до 0.9
        int a1 = 10;
        int a2 = 20;
        int random = a1 + (int) (Math.random() * a2);
        System.out.println(random);


        int a3 = 2;
        int b3 = -3;
        int c3 = 16;
        double result = (double) Math.abs(a3 - b3) / (a3 + b3) * 3 - Math.sqrt(c3);
        System.out.println(result);

        double result2 = (double) (a3 + b3) / 12 * c3 % 4 + Math.abs(b3);
        System.out.println(result2);


        double s1 = 500;
        double s2 = 1500;
        double s3 = 3500;
        double sFy1 = s1 * 120;
        double sFy2 = s2 * 120;
        double sFy3 = s3 * 120;
        double sWoT1 = sFy1 * 95;
        double sWoT2 = sFy2 * 95;
        double sWoT3 = sFy3 * 95;
        double all = (sWoT1 + sWoT2 + sWoT3) / 3;
        System.out.println(all);


        float ball1 = 1f;
        float ball2 = 0.5f;
        float ball3 = 0.2f;
        final float DESTINY_FACTOR = 0.7f;
        double volumeball1 = (double) 4 / 3 * Math.PI * Math.pow(ball1, 3);
        double volumeball2 = (double) 4 / 3 * Math.PI * Math.pow(ball2, 3);
        double volumeball3 = (double) 4 / 3 * Math.PI * Math.pow(ball3, 3);
        double weightball1 = volumeball1 * DESTINY_FACTOR;
        double weightball2 = volumeball2 * DESTINY_FACTOR;
        double weightball3 = volumeball3 * DESTINY_FACTOR;
        double result1 = weightball1 + weightball2 + weightball3;
        System.out.println(result1);
    }
}
