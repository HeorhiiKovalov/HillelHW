package com.Kovalov.HW13;

public class MethodAutomat {

    int c = 0;
    public static int coast = 0;

    public void Total(int cost) {
        c++;
        coast += cost;
    }

    public void mCoke() {
        DrinksMachine coke = DrinksMachine.COKE;
        System.out.println("coke issued");
    }

    public void mCoffee() {
        DrinksMachine coffee = DrinksMachine.COFFEE;
        System.out.println("coffee is made");
    }

    public void mTee() {
        DrinksMachine tee = DrinksMachine.TEE;
        System.out.println("tee is made");
    }

    public void mLimonade() {
        DrinksMachine limonade = DrinksMachine.LIMONADE;
        System.out.println("limonade issued");
    }

    public void mMojito() {
        DrinksMachine mojito = DrinksMachine.MOJITO;
        System.out.println("mojito is made");
    }

    public void mGased() {
        DrinksMachine gased = DrinksMachine.GASED;
        System.out.println("gased water issued");
    }

    public void Choose(int a, String choose1) {
        switch (choose1) {
            case ("coke"):
                mCoke();
                Total(Drinks.COKEC);
                break;
            case ("coffee"):
                mCoffee();
                Total(Drinks.COFFEEC);
                break;
            case ("tee"):
                mTee();
                Total(Drinks.TEEC);
                break;
            case ("limonade"):
                mLimonade();
                Total(Drinks.LIMONADEC);
                break;
            case ("mojito"):
                mMojito();
                Total(Drinks.MOJITOC);
                break;
            case ("gased"):
                mGased();
                Total(Drinks.GASEDC);
                break;
            case ("pay"):
                System.out.println("pay " + coast + " $  for " + c + " items");
                break;
        }
    }
}
