package com.Kovalov.HW11;

public class FitnessMain {
    public static void main(String[] args) {
        Customer c1 = new Customer("John", "Daily", 6, 6, 1995, "c1@gmail.com", 380957131, 85, 120, 60, 10000);
        Customer c2 = new Customer("Harvey", "spektor", 9, 1, 1972, "c2@gmail.com", 380918828, 90, 120, 60, 12000);
        Customer c3 = new Customer("Mike", "Ross", 7, 3, 1990, "c3@gmail.com", 380000000, 75, 130, 80, 7000);
        c1.printAccountInfo();
        c2.printAccountInfo();
        c3.printAccountInfo();
        c1.surname = "Deily";
        c1.step = 15000;
        c2.pressureH = 160;
        c2.weight = 85;
        c1.printAccountInfo();
        c2.printAccountInfo();
    }

}
