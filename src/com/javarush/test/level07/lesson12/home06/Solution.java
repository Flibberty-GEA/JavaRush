package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFatherOne = new Human("Jkd", true, 80);
        Human grandFatherTwo = new Human("Jwe", true, 83);
        Human grandMotherOne = new Human("Sdd", false, 80);
        Human grandMotherTwo = new Human("Sdv", false, 79);
        Human father = new Human("Ge", true, 40, grandFatherOne, grandMotherOne);
        Human mother = new Human("Sdv", false, 35, grandFatherTwo, grandMotherTwo);
        Human childOne = new Human("Ddf", false, 18, father, mother);
        Human childTwo = new Human("Dwws", true, 18, father, mother);
        Human childThree = new Human("Dikh", false, 18, father, mother);
        System.out.println(grandFatherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandMotherOne);
        System.out.println(grandMotherTwo);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(childOne);
        System.out.println(childTwo);
        System.out.println(childThree);
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        //напишите тут ваш код


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
