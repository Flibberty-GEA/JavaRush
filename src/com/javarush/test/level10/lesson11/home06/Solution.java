package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        public String firstName;
        public String lastName;
        public int age;
        public boolean sex;
        public String address;
        public String profession;

        public Human(String firstName)
        {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName, int age, boolean sex, String address, String profession)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.profession = profession;
        }

        public Human(String firstName, String lastName, String profession, boolean sex, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.profession = profession;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, String lastName, String address, int age, boolean sex)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, boolean sex, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String address, boolean sex, String lastName, String firstName)
        {
            this.address = address;
            this.sex = sex;
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public Human(String address, String profession, String firstName, String lastName)
        {
            this.address = address;
            this.profession = profession;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, boolean sex)
        {
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(String profession, String firstName)
        {
            this.profession = profession;
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName, int age)
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        //напишите тут ваши переменные и конструкторы
    }
}
