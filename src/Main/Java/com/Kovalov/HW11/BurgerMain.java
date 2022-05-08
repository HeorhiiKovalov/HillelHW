package com.Kovalov.HW11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classic = new Burger();
        Burger fettFree = new Burger();
        Burger doubleMeat = new Burger();
        classic.Classic("Гречневая булка ", "Говядина ", "Чедер", "Зелень", "Майонез");
        fettFree.FettFree("Гречневая булка", "Говядина ", "Чедер", "Зелень");
        doubleMeat.DoubleMeat("гречневая булка ", "Двойная говядина", "Чедер", "Зелень", "Майонез");
    }
}
