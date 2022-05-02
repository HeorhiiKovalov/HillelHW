package com.Kovalov.HW8;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {

    public static void main(String[] args) {
        final int lottoAll = 7;
        int[] lottoArray = new int[lottoAll];
        for (int i = 0; i < lottoAll; i++) {
            lottoArray[i] = (int) (Math.random() * 9);
        }
        System.out.println(Arrays.toString(lottoArray));
        Scanner a = new Scanner(System.in);
        int[] playerArray = new int[lottoAll];
        System.out.println("Чтобы поиграть в лотто введите ваши числа от 0 до 9");
        int a1;
        for (int i = 0; i < lottoAll; i++) {
            if (a.hasNextInt()) {
                a1 = a.nextInt();
                if ((a1 <= 9) && (a1 >= 0)) {
                    playerArray[i] = a1;
                    if (i != 6) {
                        System.out.println("Следующие число");
                    }
                } else {
                    System.out.println("Введите число от 0 до 9");
                    i -= 1;
                }
            } else {
                System.out.println("Введите число");
                a.next();
                i--;
            }
        }
        System.out.println(Arrays.toString(playerArray));
        Arrays.sort(lottoArray);
        System.out.println(Arrays.toString(lottoArray));
        Arrays.sort(playerArray);
        System.out.println(Arrays.toString(playerArray));
        int b = 0;
        int b1 = 0;
        int[] coin = new int[lottoAll];
        for (int i = 0; i < lottoAll; i++) {
            b = lottoArray[i];
            b1 = playerArray[i];
            if (b == b1) {
                coin[i] = i;
            } else {
                continue;
            }
        }
        System.out.println("Coin" + Arrays.toString(coin));
        int h = 0;
        for (int i = 0; i < lottoAll; i++) {
            if (coin[i] > 0) {
                h++;
            }
        }
        System.out.println("У вас " + h + " совпадений, в индексах " + Arrays.toString(coin));
        if (h >= 4) {
            System.out.println("Вы выиграли автомобиль");
        } else if (h == 0) {
            System.out.println("Вы проиграли ");
        } else if (h < 4) {
            System.out.println("Вы выиграли стиральную машину ");
        }

        final int arrayLength = 10;
        int arrayAll;
        int min = 0;
        int max = arrayLength -1;
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        do{
            for (int i = min, j = max; i < max  && j > min; i++,j--) {
                if(array[i] > array[i + 1]){
                    arrayAll = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = arrayAll;
                }
                if (array[j] < array[j - 1]) {
                    arrayAll = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = arrayAll;
                }
            }
            max--;
            min++;
        }while(min < max);
        System.out.println(Arrays.toString(array));


    }
}
