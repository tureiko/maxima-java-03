package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

public class Birthday {


    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year, month, date);
        LocalDate nowData = LocalDate.now();
        int inDays = (int) DAYS.between(birthDay, nowData);
        System.out.println("Возвраст в днях " + inDays);

        return inDays;
    }

    public static LocalDate nextBirthday(int year, int month, int date) {

        LocalDate myBirthday = LocalDate.of(year, month, date);
        LocalDate dateNow = LocalDate.now();

        int totalDaysPassed = (int) DAYS.between(myBirthday, dateNow);
        int daysBeforeTheBirthday = (int) (Math.ceil(totalDaysPassed / 1000.0) * 1000);
        LocalDate ThousandthBirthday = myBirthday.plusDays(daysBeforeTheBirthday);

        System.out.println("Следующий день рождения в 1000 дней " + ThousandthBirthday);

        return ThousandthBirthday;
    }

}
