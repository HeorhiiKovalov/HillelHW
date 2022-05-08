package com.Kovalov.HW11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String green;
    String mayo;

    public void Classic(String bun, String meat, String cheese, String green, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayo = mayo;
        System.out.println("Состав классическо бургера - " + bun + " " + meat + " " + cheese + " " + green + " " + mayo);
    }

    public void FettFree(String bun, String meat, String cheese, String green) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.println("Состав диетического бургера - " + bun + " " + meat + " " + cheese + " " + green);
    }

    public void DoubleMeat(String bun, String doubleMeat, String cheese, String green, String mayo) {
        this.bun = bun;
        this.meat = doubleMeat;
        this.cheese = cheese;
        this.green = green;
        System.out.println("Состав  бургера с двойным мясом - " + bun + " " + doubleMeat + " " + cheese + " " + green + " " + mayo);
    }

}
