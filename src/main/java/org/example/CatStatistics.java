package org.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatStatistics {
    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        cats = (ArrayList<Cat>) cats.stream().sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        System.out.println("По имени: " + cats);
        return cats;
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        List<Cat> sortCats = cats.stream().sorted((x, y) -> y.getWeight() - x.getWeight())
                .collect(Collectors.toList());
        System.out.println("По весу: " + sortCats);
        return (ArrayList<Cat>) sortCats;
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {

              // Stream.concat(cats.stream().findFirst().filter(cats::remove),cats.stream().reduce((a, b) -> b).filter(cats::remove)
        cats.stream().findFirst().filter(cats::remove);
        cats.stream().reduce((a, b) -> b).filter(cats::remove);

        System.out.println("Без первого и последнего: " + cats);

        return cats;
    }

    public static Cat findFirstNonAngryCat(ArrayList<Cat> cats) {
        Cat nonAngryCat = cats.stream().dropWhile(Cat::isAngry).findFirst().orElse(null);
        System.out.println("Первый не сердитый кот: " + nonAngryCat);
        return nonAngryCat;
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        int sumWeight;
       /*  sumWeight = onlyAngry ? cats.stream().filter(Cat::isAngry).mapToInt(Cat::getWeight).reduce(Integer::sum).getAsInt()
        : cats.stream().mapToInt(Cat::getWeight).sum();*/
        if (onlyAngry) {
            sumWeight = cats.stream().filter(Cat::isAngry).mapToInt(Cat::getWeight).reduce(Integer::sum).getAsInt();
            System.out.println("Суммарный вес только сердитых: " + sumWeight);
            return sumWeight;
        }
        sumWeight = cats.stream().mapToInt(Cat::getWeight).sum();
        System.out.println("Суммарный вес всех: " + sumWeight);
        return sumWeight;

    }


    public static Map<String, List<Cat>> groupCatByFirstLetter(ArrayList<Cat> cats) {

        Map<String, List<Cat>> catsListGrouped = new HashMap<>();
        // группировка по первой букве
        Map<Character, List<Cat>> catsCharAtGrouped = cats.stream().collect(Collectors.groupingBy(w -> w.getName().charAt(0)));
        // сортировка по возврастанию
        Map<Character, List<Cat>> map = new TreeMap<Character, List<Cat>>(catsCharAtGrouped);
        // получение значений и запись в новую Map
        for (Map.Entry<Character, List<Cat>> entry : map.entrySet()) {
            Character key = entry.getKey();
            List<Cat> values = entry.getValue();
            catsListGrouped.put(key.toString(), values);
        }
        System.out.println("Группировка по первой букве: " + catsListGrouped);

        return catsListGrouped;

    }

}


