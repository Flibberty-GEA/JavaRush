package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Flibberty on 18.03.2016.
 */
public class UkrainianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){return 4;}
    public String getDescription(){return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";}
}
