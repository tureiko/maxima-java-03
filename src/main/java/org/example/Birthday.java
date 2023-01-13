package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Birthday {
    public static int getAge(int year, int month, int date) {
        LocalDate birthDay = LocalDate.of(year, month, date);
        LocalDate nowData = LocalDate.now();
        int inDays = (int) ChronoUnit.DAYS.between(birthDay, nowData);
        System.out.println("Возвраст в днях " + inDays);

        LocalDate birthDay1 = birthDay;

        int years = birthDay.getYear();
        int yearsNow = nowData.getYear();
        int inDays1;

        for (int i = years; i < yearsNow; i++) {
            birthDay1 = birthDay1.plus(1, ChronoUnit.YEARS);
        }
        if (birthDay1.isAfter(nowData)) {
            birthDay1 = birthDay1.minus(1, ChronoUnit.YEARS);
            inDays1 = (int) ChronoUnit.DAYS.between(birthDay, birthDay1);

        } else {
            inDays1 = (int) ChronoUnit.DAYS.between(birthDay, birthDay1);
        }

        System.out.println("Возвраст в днях для полных лет " + inDays1);

        return inDays;
    }

    public static LocalDate nextBirthday(int year, int month, int date) {
        LocalDate nextBirthday = LocalDate.of(year, month, date);
        LocalDate dat = LocalDate.now();

        while (nextBirthday.isBefore(dat)) {
            nextBirthday = nextBirthday.plusDays(1000);
        }

        System.out.println("Следующий день рождения в 1000 дней " + nextBirthday);

        return nextBirthday;
    }

}
