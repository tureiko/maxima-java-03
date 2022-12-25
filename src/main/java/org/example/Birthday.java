package org.example;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Birthday {

   public static int getAge(int year, Month month, int date){
    LocalDate datee=LocalDate.of(1983, Month.SEPTEMBER,11);
    int days=0;
    LocalDate daten=LocalDate.now();
    days= (int) ChronoUnit.DAYS.between(datee,daten);
    return days;

}
public static LocalDate nextBirthday(int year, Month month, int date){
   nextBirthday(1983,Month.SEPTEMBER,11).plus(1000,ChronoUnit.DAYS);
 return ;
}

}
