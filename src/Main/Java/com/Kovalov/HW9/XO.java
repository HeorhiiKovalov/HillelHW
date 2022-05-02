package com.Kovalov.HW9;

import java.util.Arrays;
import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        String[][] map = {{"*","*","*"},
                {"*","*","*"},
                {"*","*","*"}};
        String XO = "X";
        String OX = "0";
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        int i =0;
        do{
            int c = 0;
            for (int j = 0; j < map.length + 3; j++) {
                System.out.println("Ходит игрок крестиками ");
                int  place = player.nextInt();
                X( place , map , XO );
                for (int a = 0; a < map.length; a++) {
                    for (int b = 0; b < map[i].length; b++) {
                        System.out.print(map[a][b] + "\t");
                    }
                    System.out.println();
                }
                System.out.println("Ходит иррок ноликами ");
                place = player.nextInt();
                X(place, map, OX);
                for (int a = 0; a < map.length; a++) {
                    for (int b = 0; b < map[i].length; b++) {
                        System.out.print(map[a][b] + "\t");
                    }
                    System.out.println();
                }

                if (map[0][0].equals(XO) && map[0][0].equals(map[0][1]) && map[0][0].equals(map[0][2])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[0][0].equals(XO) && map[0][0].equals(map[1][0]) && map[0][0].equals(map[2][0])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[0][1].equals(XO) && map[0][1].equals(map[1][1]) && map[0][1].equals(map[2][1])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[0][2].equals(XO) && map[0][2].equals(map[1][2]) && map[0][2].equals(map[2][2])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[1][0].equals(XO) && map[1][0].equals(map[1][1]) && map[1][0].equals(map[1][2])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[2][0].equals(XO) && map[2][0].equals(map[2][1]) && map[2][0].equals(map[2][2])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[0][0].equals(XO) && map[0][0].equals(map[1][1]) && map[0][0].equals(map[2][2])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                } else if (map[0][2].equals(XO) && map[0][2].equals(map[1][1]) && map[0][2].equals(map[2][0])) {
                    System.out.println("Победил игрок крестиками ");
                    c++;
                }
                if (map[0][0].equals(OX) && map[0][0].equals(map[0][1]) && map[0][0].equals(map[0][2])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[0][0].equals(OX) && map[0][0].equals(map[1][0]) && map[0][0].equals(map[2][0])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[0][1].equals(OX) && map[0][1].equals(map[1][1]) && map[0][1].equals(map[2][1])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[0][2].equals(OX) && map[0][2].equals(map[1][2]) && map[0][2].equals(map[2][2])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[1][0].equals(OX) && map[1][0].equals(map[1][1]) && map[1][0].equals(map[1][2])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[2][0].equals(OX) && map[2][0].equals(map[2][1]) && map[2][0].equals(map[2][2])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[0][0].equals(OX) && map[0][0].equals(map[1][1]) && map[0][0].equals(map[2][2])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;
                } else if (map[0][2].equals(OX) && map[0][2].equals(map[1][1]) && map[0][2].equals(map[2][0])) {
                    System.out.println("Победил игрок ноликами ");
                    c++;

                }
                if(c == 1){
                    break;
                }else if (c > 1){
                    System.out.println("Победила дружба ");
                    break;
                }
            }
            int yN ;
            System.out.println("Хочешь сыграть еще ? да - 1 нет - 2  ");
            yN= player.nextInt();
            if(yN == 2){
                i++;
            }else if ( yN == 1 ){
                System.out.println("Продолжаем !");
                c -= 1;
            }
        }while (i == 1);
    }



    public static void X(int place, String[][] map,String a){
        switch(place){
            case 1: map[0][0] = a;
                break;
            case 2: map[0][1] = a;
                break;
            case 3: map[0][2] = a;
                break;
            case 4: map[1][0] = a;
                break;
            case 5: map[1][1] = a;
                break;
            case 6: map[1][2] = a;
                break;
            case 7: map[2][0] = a;
                break;
            case 8: map[2][1] = a;
                break;
            case 9: map[2][2] = a;
                break;
        }
    }
}
