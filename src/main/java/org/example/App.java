package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

//        Birthday.getAge(1983, 9, 11);
//        Birthday.nextBirthday(1983, 9, 11);
//
//        System.out.println();

        File file = new File("cat.csv");
        File file2 = new File("text.txt");

        String fileIn = file.toString();
        String fileOut = file2.toString();

        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform(fileIn, fileOut);

//        StreamTransformer streamTransformer = new StreamTransformer();
//        streamTransformer.transform(fileIn,fileOut);

       /* try {
            Cat cat = new Cat("Барсик", -1, false);
            System.out.println(cat);
        } catch (Exception ex) {
            System.out.println("Неправильный кот");
        }
        System.out.println();

        Cat cat = CatFactory.createCat("Мурзик", 3);
        System.out.println(cat);*/


        Cat murzik = new Cat("Мурзик", 5, true);
        Cat barsik = new Cat("Барсик", 6, true);
        Cat murka = new Cat("Мурка", 8, true);
        Cat pushistik = new Cat("Пушистик", 8, false);

        Dog sharik = new Dog("Шарик", 10, true);
        Dog bobik = new Dog("Бобик", 15, false);
        Dog tuzik = new Dog("Тузик", 20, false);

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
        catStackKitchen.feed();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);
        cats.add(pushistik);

//        CatStatistics.sortByNameAscending(cats);
//        CatStatistics.sortByWeightDescending(cats);
//        CatStatistics.removeFirstAndLast(cats);
//        CatStatistics.findFirstNonAngryCat(cats);
//        CatStatistics.getCommonWeight(cats, true);
//        CatStatistics.groupCatByFirstLetter(cats);
    }
}
