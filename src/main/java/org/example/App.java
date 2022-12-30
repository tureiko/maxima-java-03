package org.example;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        Birthday birthday = new Birthday();
        birthday.getAge(1983,9,11);
        birthday.nextBirthday(1983,9,11);
        System.out.println();

        TextTransformer textTransformer = new TextTransformer();
        textTransformer.transform("cat.csv","text.txt");

    }
}
