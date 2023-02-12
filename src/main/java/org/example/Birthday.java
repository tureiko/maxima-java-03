package org.example;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Birthday {


    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year, month, date);
        LocalDate nowData = LocalDate.now();
        int ageInDays = (int) DAYS.between(birthDay, nowData);
        System.out.println("Возвраст в днях " + ageInDays);

        return ageInDays;
    }

    public static LocalDate nextBirthday(int year, int month, int date) {

        LocalDate myBirthday = LocalDate.of(year, month, date);
        LocalDate dateNow = LocalDate.now();

        int totalDaysPassed = (int) DAYS.between(myBirthday, dateNow);
        LocalDate ThousandthBirthday = myBirthday.plusDays((int) (Math.ceil(totalDaysPassed / 1000.0) * 1000));

        System.out.println("Следующий день рождения в 1000 дней " + ThousandthBirthday);

        return ThousandthBirthday;
    }

}
