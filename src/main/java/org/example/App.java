package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Birthday.getAge(1983, 9, 11);
        Birthday.nextBirthday(1983, 9, 11);

        System.out.println();

        /*TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv","text.txt");*/

        try {
            Cat cat = new Cat("Барсик", -1, false);
            System.out.println(cat);
        } catch (Exception ex) {
            System.out.println("Неправильный кот");
        }
        System.out.println();

        Cat cat = CatFactory.createCat("Мурзик", 3);
        System.out.println(cat);
/*
        StreamTransformer streamTransformer = new StreamTransformer();
        streamTransformer.transform("cat.csv","out.txt"); */

        Cat murzik = new Cat("Мурзик",5,true);
        Cat barsik = new Cat("Барсик",6,false);
        Cat murka = new Cat("Мурка",8,false);
        Cat aurka = new Cat("Aурка",3,true);

       /* Dog sharik = new Dog("Шарик", true, "Пёс");
        Dog bobik = new Dog("Бобик", true, "Пёс");
        Dog tuzik = new Dog("Тузик", true, "Пёс");

        QueueKitchen<Dog> dogQueueKitchen = new QueueKitchen<>();
        dogQueueKitchen.add(bobik);
        dogQueueKitchen.add(sharik);
        dogQueueKitchen.add(tuzik);
        dogQueueKitchen.feed();

        QueueKitchen<Cat> catQueueKitchen = new QueueKitchen<>();
        catQueueKitchen.add(murzik);
        catQueueKitchen.add(barsik);
        catQueueKitchen.add(murka);
        catQueueKitchen.feed();

        StackKitchen<Dog> dogStackKitchen = new StackKitchen<>();
        dogStackKitchen.add(sharik);
        dogStackKitchen.add(bobik);
        dogStackKitchen.add(tuzik);
        dogStackKitchen.feed();

        StackKitchen<Cat> catStackKitchen = new StackKitchen<>();
        catStackKitchen.add(murzik);
        catStackKitchen.add(barsik);
        catStackKitchen.add(murka);
        catStackKitchen.feed();*/

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(aurka);
        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);

        CatStatistics.sortByNameAscending(cats);
        CatStatistics.sortByWeightDescending(cats);
        CatStatistics.removeFirstAndLast(cats);
        CatStatistics.findFirstNonAngryCat(cats);
        CatStatistics.getCommonWeight(cats, true);
        CatStatistics.groupCatByFirstLetter(cats);
    }
}
