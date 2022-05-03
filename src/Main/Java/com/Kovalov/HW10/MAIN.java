package com.Kovalov.HW10;

public class MAIN {
    public static void main(String[] args) {
        EMPLOYEES E1 = new EMPLOYEES();
        EMPLOYEES E2 = new EMPLOYEES();
        EMPLOYEES E3 = new EMPLOYEES();
        EMPLOYEES E4 = new EMPLOYEES();
        EMPLOYEES E5 = new EMPLOYEES();

        E1.name = " Коваленко Олег Иванович ";
        E1.position = "Директор";
        E1.email = "director@gmail.com";
        E1.numb = 215267843;
        E1.sallary = 40000;
        E1.age = 56;

        E2.name = " Петькин Александр Михайлович ";
        E2.position = "Зам.Директора";
        E2.email = "second@gmail.com";
        E2.numb = 215267843;
        E2.sallary = 35000;
        E2.age = 45;

        E3.name = "Шусько Иван Павлович ";
        E3.position = "Старший Инжинер ";
        E3.email = "engineer@gmail.com";
        E3.numb = 215267843;
        E3.sallary = 30000;
        E3.age = 35;

        E4.name = "Пес Петр Романович";
        E4.position = "Младший инжинер";
        E4.email = "smallengineer@gmail.com";
        E4.numb = 215267843;
        E4.sallary = 20000;
        E4.age = 27;

        E5.name = "Лигачев Сергей Валериевич ";
        E5.position = "Главный Бухгалтер";
        E5.email = "financier@gmail.com";
        E5.numb = 215267843;
        E5.sallary = 42000;
        E5.age = 48;

        E1.info();

        EMPLOYEES[] emplo = {E1,E2,E3,E4,E5};

        for (int i = 0; i < emplo.length; i++) {
            if(emplo[i].age > 40){
                emplo[i].info();

            }
        }

    }
}
