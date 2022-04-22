package com.Kovalov.HM6;

import java.util.Scanner;

public class dhdn {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if ((i % 10 == 9) || (i % 10 == 4) || (i / 10 == 9) || (i / 10 == 4)) {
                continue;
            }
            System.out.println(i);
        }
    }
}
