package com.Kovalov.HM6;

import java.util.Scanner;

public class HM6 {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = a + (int) (Math.random() * b);
        System.out.println(c);
        System.out.println("Угадай число от нуля до десяти. У тебя три попытки");
        Scanner a1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (a1.hasNextInt()) {
                int a2 = a1.nextInt();
                if (a2 == c) {
                    System.out.println("Ты победил. Хочешь поиграть еще ?");
                    Scanner c1 = new Scanner(System.in);
                    String start = c1.nextLine();
                    String d = "да";
                    String d1 = "нет";
                    if (start.equals(d)) {
                        System.out.println("Угадай число от нуля до десяти. У тебя три попытки");
                        i = -1;
                        c = a + (int) (Math.random() * b);
                    } else if (start.equals(d1)) {
                        System.out.println("До встречи в следующий раз");
                    }
                } else if ((a2 != c) && (i != 2)) {
                    System.out.println("Следующая попытка");
                }
                if ((i == 2) && (a2 != c)) {
                    System.out.println("Ты проиграл . Хочешь поиграть еще ? Да или нет ?");
                    Scanner c1 = new Scanner(System.in);
                    String start = c1.nextLine();
                    String d = "да";
                    String d1 = "нет";
                    if (start.equals(d)) {
                        System.out.println("Угадай число от нуля до десяти. У тебя три попытки");
                        i = -1;
                        c = a + (int) (Math.random() * b);
                    } else if (start.equals(d1)) {
                        System.out.println("До встречи в следующий раз");
                    }
                }
            } else {
                System.out.println("Введите число");
                a1.next();
                i--;
            }
        }
        for (int i = 0; i < 101; i++) {
            if ((i % 10 == 9) || (i % 10 == 4) || (i / 10 == 9) || (i / 10 == 4)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
