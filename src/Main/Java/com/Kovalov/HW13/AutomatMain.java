package com.Kovalov.HW13;

import com.Kovalov.HW13.MethodAutomat.*;

import java.util.Scanner;

public class AutomatMain {

    public static void main(String[] args) {
        int a = 0;
        MethodAutomat a2 = new MethodAutomat();
        while(true){
            System.out.println("Choose your drink. Write 'pay' if you wont pay");
            Scanner choose = new Scanner(System.in);
            String choose1 = choose.nextLine();
            a2.Choose(a,choose1);
            if(choose1.equals("pay")){
                 break;
            }
        }

    }
}
