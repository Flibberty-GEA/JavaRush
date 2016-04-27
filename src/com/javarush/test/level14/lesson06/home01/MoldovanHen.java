package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Flibberty on 18.03.2016.
 */
public class MoldovanHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth(){return 6;}
    public String getDescription(){return super.getDescription()+" Моя страна - "+Country.MOLDOVA+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";}
}
