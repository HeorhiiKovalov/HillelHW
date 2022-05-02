package com.Kovalov.HW9;

import java.util.Arrays;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner MN = new Scanner(System.in);
        int column;
        int line;
        System.out.println("Введите количество масивов");
       while(true){
           if(MN.hasNextInt()){
               line = MN.nextInt();
               System.out.println("Количество массивов сформировано ");
                break;
           }else {
               MN.nextInt();
               System.out.println("Введите число ");
           }
       }
        System.out.println("Введите количество объэктов в массивах ");
        while(true){
            if(MN.hasNextInt()){
                column = MN.nextInt();
                System.out.println("Количество объэктов сформировано");
                break;
            }else {
                MN.nextInt();
                System.out.println("Введите число ");
            }
        }
        int[][] mN = new int[line][column];

        for (int i = 0; i < mN.length; i++) {
            for (int j = 0; j < mN[i].length; j++) {
                mN[i][j] = (int)(Math.random()*20);
            }

        }
        int[][] nM = new int[column][line];
        for (int i = 0; i < nM.length; i++) {
            for (int j = 0; j < nM[i].length; j++) {
                nM[i][j] = mN[j][i];

            }
        }
        System.out.print(Arrays.deepToString(mN));
        System.out.println(" ");
        System.out.print(Arrays.deepToString(nM));
    }
}
