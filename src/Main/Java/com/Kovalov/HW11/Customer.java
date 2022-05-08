package com.Kovalov.HW11;

public class Customer {
    private String name;
    private int day;
    private int mounth;
    private int year;
    private String mail;
    private long numb;
    String surname;
    int weight;
    int pressureH;
    int pressureL;
    int step;

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNumb(long numb) {
        this.numb = numb;
    }

    private int age;

    public void setAge(int year) {
        this.age = 2022 - year;
    }

    public Customer(String name, String surname, int day, int mounth, int year, String mail, long numb, int weight, int pressureH, int pressureL, int step) {
        setName(name);
        setDay(day);
        setMounth(mounth);
        setYear(year);
        setMail(mail);
        setNumb(numb);
        setAge(year);
        this.surname = surname;
        this.weight = weight;
        this.pressureH = pressureH;
        this.pressureL = pressureL;
        this.step = step;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public long getNumb() {
        return numb;
    }

    public void printAccountInfo() {
        System.out.println(getName() + " " + surname + " " + getAge() + " " + getMail() + " " + getNumb() + " " + weight + " " + pressureH + " " + pressureL + " " + step);
    }

}
