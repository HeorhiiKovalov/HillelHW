package com.Kovalov.HW142;

public class Main {
    public static void main(String[] args) {
        ClassicMusic Bah = new ClassicMusic();
        PopMusic CardiB = new PopMusic();
        RockMusic metallica = new RockMusic();

       MusicStyles[] array = new MusicStyles[]{
               Bah,CardiB,metallica
       };

        for (MusicStyles musicStyles : array) {
            musicStyles.playMusic();
        }
    }
}
