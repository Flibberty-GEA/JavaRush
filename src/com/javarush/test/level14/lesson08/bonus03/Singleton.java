package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Flibberty on 20.03.2016.
 */
public class Singleton
{
    private static Singleton INSTANCE = null;
    private Singleton() {}

    static Singleton getInstance() {
        if (INSTANCE==null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
