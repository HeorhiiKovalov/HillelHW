package com.Kovalov.HM5;

import java.util.Scanner;

public class HM5 {

    public static void main(String[] args) {
        System.out.println("Введите имя первой команды ");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();
        System.out.println("Введите количество фрагов первого игрока ");
        Scanner kill11 = new Scanner(System.in);
        int kil11 = kill11.nextInt();
        System.out.println("Введите количество фрагов второго игрока ");
        Scanner kill12 = new Scanner(System.in);
        int kil12 = kill12.nextInt();
        System.out.println("Введите количество фрагов третьего игрока ");
        Scanner kill13 = new Scanner(System.in);
        int kil13 = kill13.nextInt();
        System.out.println("Введите количество фрагов четвертого игрока ");
        Scanner kill14 = new Scanner(System.in);
        int kil14 = kill14.nextInt();
        System.out.println("Введите количество фрагов пятого игрока ");
        Scanner kill15 = new Scanner(System.in);
        int kil15 = kill15.nextInt();

        System.out.println("Введите имя второй команды ");
        Scanner name2 = new Scanner(System.in);
        String name3 = name2.nextLine();
        System.out.println("Введите количество фрагов первого игрока ");
        Scanner kill21 = new Scanner(System.in);
        int ki21 = kill21.nextInt();
        System.out.println("Введите количество фрагов второго игрока ");
        Scanner kill22 = new Scanner(System.in);
        int ki22 = kill22.nextInt();
        System.out.println("Введите количество фрагов третьего игрока ");
        Scanner kill23 = new Scanner(System.in);
        int ki23 = kill23.nextInt();
        System.out.println("Введите количество фрагов четвертого игрока ");
        Scanner kill24 = new Scanner(System.in);
        int ki24 = kill24.nextInt();
        System.out.println("Введите количество фрагов пятого игрока ");
        Scanner kill25 = new Scanner(System.in);
        int ki25 = kill25.nextInt();

        int sraf1 = (kil11 + kil12 + kil13 + kil14 + kil15) / 5;
        int sraf2 = (ki21 + ki22 + ki23 + ki24 + ki25) / 5;

        if (sraf1 > sraf2){
            System.out.println("Победила команда " + name1 + " набравшая в среднем " + sraf1 + " очков");
        }
        else if (sraf1 < sraf2){
            System.out.println("Победтла команда " + name3 + " наьравшая в среднем " + sraf2 + " очков");
        }
        else if (sraf1 == sraf2){
            System.out.println("Победила дружба");
        }

        System.out.println(leapyear(2016));
    }
        public static boolean leapyear(int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        else{
            return false;
        }
        }




}
