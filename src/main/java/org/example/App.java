package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) throws Exception {
        Birthday birthday = new Birthday();
        birthday.getAge(1983,9,11);
        birthday.nextBirthday(1983,9,11);
        System.out.println();

        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv","text.txt");

        try {
            Cat cat = new Cat("Барсик", -1, false);
        }
        catch (Exception ex) {
            System.out.println("Неправильный кот");
        }

        Cat cat = CatFactory.createCat("Мурзик", 6);

        StreamTransformer streamTransformer = new StreamTransformer();
        streamTransformer.transform("cat.csv","out.txt");

        Cat murzik = new Cat("Мурзик",5,true);
        Cat barsik = new Cat("Барсик",6,true);
        Cat murka = new Cat("Мурка",8,false);
        Cat aurka = new Cat("Aурка",8,false);

        Dog sharik = new Dog("Шарик", true,"Пёс");
        Dog bobik = new Dog("Бобик", true,"Пёс");
        Dog tuzik = new Dog("Тузик", true,"Пёс");

        QueueKitchen<Object> queueKitchen =new QueueKitchen<>();
        queueKitchen.add(sharik);
        queueKitchen.add(bobik);
        queueKitchen.add(tuzik);
        queueKitchen.add(murzik);
        queueKitchen.add(barsik);
        queueKitchen.add(murka);
        queueKitchen.feed();

        StackKitchen<Object> stackKitchen = new StackKitchen<>();
        stackKitchen.add(sharik);
        stackKitchen.add(bobik);
        stackKitchen.add(tuzik);
        stackKitchen.add(murzik);
        stackKitchen.add(barsik);
        stackKitchen.add(murka);
        stackKitchen.feed();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(aurka);
        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);

        CatStatistics.sortByNameAscending(cats);
        CatStatistics.sortByWeightDescending(cats);
        CatStatistics.removeFirstAndLast(cats);
        CatStatistics.findFirstNonAngryCat(cats);
        CatStatistics.getCommonWeight(cats, false);
        CatStatistics.groupCatByFirstLetter(cats);
    }
}
