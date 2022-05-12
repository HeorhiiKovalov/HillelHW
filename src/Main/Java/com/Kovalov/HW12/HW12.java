package com.Kovalov.HW12;

public class HW12 {
    public void task1(int[]a) {
        int summ= 0;
        for (int i = 0; i <a.length ; i++) {
                summ += a[i];
        }
        int sA = summ / a.length;
        System.out.println(sA);
    }

    public void task2(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a.length == a[j].length){
                        System.out.println("vgjsnbv");
                }
            }
        }
    }
}
