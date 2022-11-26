package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        System.out.println();

  Cat cat = CatFactory.createCat("Мурзик", -1);
        System.out.println("вес - "+cat.getWeight());
        System.out.println("Сердитый - "+cat.isAngry());
        System.out.println();

        /* BufferedReader bufferedReader = new BufferedReader(new FileReader("cat.csv"));
         String  line;
         counter = 0;
         while ((line= bufferedReader.readLine())!=null){
             counter++;
             System.out.println(line);
         }
 bufferedReader.close();
        System.out.println();

        */
        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv","text.txt");

    }

}

