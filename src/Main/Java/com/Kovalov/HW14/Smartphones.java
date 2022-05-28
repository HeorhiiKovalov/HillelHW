package com.Kovalov.HW14;

public interface Smartphones {
    default void call(){
        System.out.println("Calling");
    }
    default void sms(){
        System.out.println("SMSing");
    }
    default void internet(){
        System.out.println("Conecting internet");
    }
}
