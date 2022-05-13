package com.Kovalov.HW12;

public class HW12 {
    public boolean task1(int[]a) {
        int summ= 0;
        for (int i = 0; i <a.length ; i++) {
                summ += a[i];
        }
        int sA = summ / a.length;
        if(sA <= 0){
            return false;
        }
        return true;
    }

    public boolean task2(int[][]a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a.length != a[j].length){
                        return false;
                }
            }
        }
        return true;
    }
}
