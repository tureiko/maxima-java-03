package org.example;



public class App
{
    public static void main( String[] args ) throws Exception
    {
        Birthday birthday = new Birthday();
        birthday.getAge(1988,12,19);
        birthday.nextBirthday(1988,12,19);
        System.out.println();

        try {
            Cat cat = new Cat("Барсик", -1, false);
        }
       catch (IncorrectCatWeightException ex) {
           System.out.println("Неправильный кот");
       }


  Cat cat = CatFactory.createCat("Мурзик", 4);
        System.out.println(cat.getWeight());
        System.out.println(cat.isAngry());



    }
}
