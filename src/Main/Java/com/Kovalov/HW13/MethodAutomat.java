package com.Kovalov.HW13;

import com.Kovalov.HW13.DrinksMachine.*;
import com.Kovalov.HW13.Drinks.*;
import com.Kovalov.HW13.AutomatMain.*;
import java.util.Scanner;

public class MethodAutomat {

    int c = 0;
    public static int coast = 0;
    public void Total(int cost){
        c++;
        coast += cost;
    }
    public void mCoke(){
        DrinksMachine coke = DrinksMachine.COKE;
    }
    public void mCoffee(){
        DrinksMachine coffee = DrinksMachine.COFFEE;
    }
    public void mTee(){
        DrinksMachine tee = DrinksMachine.TEE;
    }
    public void mLimonade() {
        DrinksMachine limonade = DrinksMachine.LIMONADE;
    }
    public void mMojito(){
        DrinksMachine mojito = DrinksMachine.MOJITO;
    }
    public void mGased(){
        DrinksMachine gased = DrinksMachine.GASED;
    }
    public void Choose(int a,String choose1){
  //      Scanner choose = new Scanner(System.in);
  //      String choose1 = choose.nextLine();
        switch(choose1){
            case("coke"):
                mCoke();
                Total(Drinks.COKEC);
                break;
            case("coffee"):
                mCoffee();
                Total(Drinks.COFFEEC);
                break;
            case("tee"):
                mTee();
                Total(Drinks.TEEC);
                break;
            case("limonade"):
                mLimonade();
                Total(Drinks.LIMONADEC);
                break;
            case("mojito"):
                mMojito();
                Total(Drinks.MOJITOC);
                break;
            case("gased"):
                mGased();
                Total(Drinks.GASEDC);
                break;
            case("pay"):
                a++;
                System.out.println("pay " + coast + " $  for " + c + " items");
                break;
        }
    }



}
