package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Flibberty on 05.04.2016.
 */
public class Moon implements Planet
{
    private static volatile Moon instance;
    private Moon(){
    }
    public static Moon getInstance() {
        if (instance == null) {
            synchronized(Moon.class) {
                if (instance == null)
                    instance = new Moon();
            }
        }
        return instance;
    }
}
