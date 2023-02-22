package org.example;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
       /* Birthday.getAge(1983, 9, 11);
        Birthday.nextBirthday(1983, 9, 11);*/

      /*   System.out.println();

        try {
            Cat cat = new Cat("Барсик", 5, false);
            cat.setWeight(-1);
        }
       catch (IncorrectCatWeightException ex) {
           System.out.println("Неправильный кот");
       }
        System.out.println();

        Cat cat = CatFactory.createCat("Мурзик", -1);
        System.out.println();*/


       /* File file = new File("cat.csv");
        File file2 = new File("text.txt");

        String fileIn = file.toString();
        String fileOut = file2.toString();

        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform(fileIn, fileOut);
        System.out.println();*/

       /* StreamTransformer streamTransformer = new StreamTransformer();
        streamTransformer.transform(fileIn,fileOut);*/

        Cat murzik = new Cat("Мурзик", 5, true);
        Cat barsik = new Cat("Барсик", 6, true);
        Cat murka = new Cat("Мурка", 8, true);
        Cat pushistik = new Cat("Пушистик", 8, false);


        //  Dog sharik = new Dog("Шарик", 10, false);
        //  Dog bobik = new Dog("Бобик", 20, true);
        //  Dog tuzik = new Dog("Тузик", 30, false);

       /* QueueKitchen<Dog> dogQueueKitchen = new QueueKitchen<>();
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
        catStackKitchen.feed(); */

        ArrayList<Cat> cats = new ArrayList<>();

        cats.add(murzik);
        cats.add(barsik);
        cats.add(murka);
        cats.add(pushistik);

        CatStatistics.sortByNameAscending(cats);
        CatStatistics.sortByWeightDescending(cats);
        CatStatistics.removeFirstAndLast(cats);
        CatStatistics.findFirstNonAngryCat(cats);
        CatStatistics.getCommonWeight(cats, true);
        CatStatistics.groupCatByFirstLetter(cats);


    }

}

