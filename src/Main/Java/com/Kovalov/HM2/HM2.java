package com.Kovalov.HM2;

public class HM2 {

    public static void main(String[] args){
        byte hight = 10;
        byte length = 15;
        byte width = 12;
        short volume = (short) (hight * length * width);
        System.out.println("Объем паралелепипеда равен " + volume + " кубическим сантиметрам");// простите за самодеятельность , люблю когда все точно .
        short allLength = (short) ((hight * 4) + (length * 4) + (width * 4));// надеюсь не снимете балов за не четко выполненое тз
        System.out.println("Длина всех сторон равна " + allLength + " сантиметрам ");
        double latitude = 47.8312065;
        double longitude = 16.0678029;
        System.out.println("Мое текущее местоположение " + latitude + " " + longitude);
    }
}
