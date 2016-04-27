package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Flibberty on 06.04.2016.
 */
public class SubSolution extends Solution
{
    private SubSolution(Character ch){
        super(ch);
    }
    private SubSolution(Boolean b){
        super(b);
    }
    private SubSolution(Integer i){
        super(i);
    }
    protected SubSolution(Number n)
    {
        super(n);
    }

    protected SubSolution(Long l)
    {
        super(l);
    }

    protected SubSolution(Short s)
    {
        super(s);
    }

    public SubSolution(Double d)
    {
        super(d);
    }

    public SubSolution(Float f)
    {
        super(f);
    }

    public SubSolution(Byte b)
    {
        super(b);
    }

    SubSolution(int i)
    {
        super(i);
    }

    SubSolution(char c)
    {
        super(c);
    }

    SubSolution(boolean b)
    {
        super(b);
    }
}
