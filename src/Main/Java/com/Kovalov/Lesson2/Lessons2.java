package com.Kovalov.Lesson2;

public class Lessons2 {

    public static void main(String[] args){
        byte byMin = -128;
        byte byMax = 127;
        char charVariable1 = '\u0004';// юникод таблица
        char charVariable2 = 65;
        String str = "Hello World";
        String str2 = """
                Hello 
                world
                """;
        // my car
        String name = "Lexus";
        String model = "Ls350";
        char category = 'B';
        String num = "KA 9777 KA";
        int cost = 160_000;
        System.out.println("марка - " + name);
        System.out.println("модель - " + model);
        System.out.println("Категория - " + category);
        System.out.println("Номер - " + num);
        System.out.println("Цена - " + cost);



    }
}
