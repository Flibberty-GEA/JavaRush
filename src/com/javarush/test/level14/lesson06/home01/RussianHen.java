package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Flibberty on 18.03.2016.
 */
public class RussianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){return 1;}
    public String getDescription(){return super.getDescription()+" Моя страна - "+Country.RUSSIA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";}
}
