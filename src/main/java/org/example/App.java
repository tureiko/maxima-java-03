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
        /*Birthday birthday = new Birthday();
        Birthday.getAge(1983,9,11);
        Birthday.nextBirthday(1983,9,11);*/

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

        /*TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv", "text.txt");
        System.out.println();*/

       /* Transformable transformable = new TextTransformer();
        transformable.transform("cat.csv", "text.txt" );
        StreamTransformer streamTransformer = new StreamTransformer();
       streamTransformer.transform("cat.csv","out.txt");*/

        Cat murzik = new Cat("Мурзик", 5, false);
        Cat barsik = new Cat("Барсик", 6, true);
        Cat murka = new Cat("Мурка", 8, false);
        Cat aurka = new Cat("Aурка", 8, false);


        Dog sharik = new Dog("Шарик", true, "Пёс");
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
        catStackKitchen.feed();


       /* CatStatistics.sortByNameAscending(cats);
        CatStatistics.sortByWeightDescending(cats);
        CatStatistics.removeFirstAndLast(cats);
        CatStatistics.findFirstNonAngryCat(cats);
        CatStatistics.getCommonWeight(cats, false);
        CatStatistics.groupCatByFirstLetter(cats);*/


    }

}

