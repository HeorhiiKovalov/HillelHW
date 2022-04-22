package com.Kovalov.HM4;

public class Person {

    public static void main(String[] args) {
        System.out.println(personinfo("Will", "Smith", "New York", 293672946));
        System.out.println(personinfo("Jackie", "Chan", "Shanghai", 1231241241));
        System.out.println(personinfo("Sherlock", "Holmes", "London", 377421235));

        System.out.println(met(11));
    }

    public static String personinfo(String name, String familie, String city, int num) {
        return "Позвонить гражданину " + name + " " + familie + " из города " + city + " можно по номеру телефона " + num;
    }

    public static int met(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * met(n - 1);
        }
    }
    /* откровено говоря неудалось написать доп. задание так как забыл что такое факториал(разбирал его посредтсвенно для такой же задачи на предидушем курсе )
    , код взят из интернета и я в итоге во всем разобрался.
    По поводу структуры иф вроде все понятно так как я изучал ее до начала войны , но сами понимаете в голове все перемешалось , стоит освежить */
}
