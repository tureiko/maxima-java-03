package org.example;


import java.time.Month;

public class App
{
    public static void main( String[] args )
    {Birthday birthday=new Birthday();
       System.out.println(birthday.getAge(1983, Month.SEPTEMBER,11));

    }
}
