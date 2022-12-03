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

public class App
{
    public static void main( String[] args ) throws Exception
    {
       /* Birthday birthday = new Birthday();
        birthday.getAge(1988,12,19);
        birthday.nextBirthday(1988,12,19);
        System.out.println();

        try {
            Cat cat = new Cat("Барсик", -1, false);
        }
       catch (IncorrectCatWeightException ex) {
           System.out.println("Неправильный кот");
       }
        System.out.println();

         Cat cat = CatFactory.createCat("Мурзик", -1);
        System.out.println("вес - "+cat.getWeight());
        System.out.println("Сердитый - "+cat.isAngry());
        System.out.println();


        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv","text.txt");
        System.out.println();

        StreamTransformer streamTransformer = new StreamTransformer();
       streamTransformer.transform("cat.csv","out.txt");
       */
        Cat murzik = new Cat("Мурзик",5,true);
        Cat barsik = new Cat("Мурзик",6,true);
        Cat murka = new Cat("Мурзик",8,false);

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








    }

}

