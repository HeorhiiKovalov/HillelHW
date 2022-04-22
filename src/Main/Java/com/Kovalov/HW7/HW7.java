package com.Kovalov.HW7;

import java.util.Arrays;

public class HW7 {

    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int srAf1 = 0;
        int srAf2 = 0;
        for (int i = 0; i < 25; i++) { //я регби не интересуюсь , но отталкивался от того что в каждой команде одинаковое количество игроков
            team1[i] = 18 + (int) (Math.random() * 22);
            team2[i] = 18 + (int) (Math.random() * 22);
        }
        String team0 = Arrays.toString(team1);
        System.out.println(" Возраст игроков " + team0);

        String team3 = Arrays.toString(team2);
        System.out.println(" Возраст игроков " + team3);
        for (int i = 0; i < 25; i++) {
            srAf1 += team1[i];
            srAf2 += team2[i];
        }
        srAf1 /= 25;
        srAf2 /= 25;
        System.out.println("Средний возраст игроков первой команды составляет " + srAf1 + " лет");
        System.out.println("Средний возраст игроков второй команды составляет " + srAf2 + " лет");

        int[] minMAx = new int[10];
        for (int i = 0; i < minMAx.length; i++) {
            minMAx[i] = (int) (Math.random() * 15);
        }
        minMax(minMAx);

        int[] source = new int[] {1,2,3,4,5,6,7};
        int[] destination = new int[] {8,9,10,11,12};
        System.out.println(Arrays.toString(copy(source,destination)));

    }
    public static void minMax(int[] minMax) {
        int min = minMax[0];
        int max = minMax[0];
        for (int j : minMax) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Минимальное значение массива " + min);
        System.out.println("Максимальное значение масива " + max);
    }
    public static int[] copy(int[]source,int[] destination){
        System.arraycopy(source,3,destination,2,3);
        return destination;
    }
}
