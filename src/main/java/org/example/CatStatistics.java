package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CatStatistics {
    public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
        cats = (ArrayList<Cat>) cats.stream().sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        System.out.println(cats);
        return cats;
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats) {
        List<Cat> sortCats = new ArrayList<>();
        sortCats = cats.stream().sorted((x, y) -> y.getWeight() - x.getWeight())
                .collect(Collectors.toList());
        System.out.println(" По весу: " + sortCats);
        return (ArrayList<Cat>) sortCats;
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {
        ArrayList<Cat> cats1 = (ArrayList<Cat>) cats.clone();
        int lastIndex = cats1.size() - 1;
        cats1.remove(lastIndex);
        cats1.remove(0);
        System.out.println(" Коты кроме 1 и последнего: " + cats1);
        return cats1;
    }

    public static Cat findFirstNonAngryCat(ArrayList<Cat> cats) {
        Cat nonAngryCat = cats.stream().findFirst().get();
        System.out.println(cats);
        System.out.println(" Первый не сердитый кот: " + nonAngryCat);
        return nonAngryCat;
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {

        if (onlyAngry) {
            int sumAngryCats = cats.stream().filter(Cat::isAngry).mapToInt(Cat::getWeight).sum();
            System.out.println(" Суммарный вес только сердитых котов: " + sumAngryCats);
            return sumAngryCats;
        }
        int sum = cats.stream().mapToInt(Cat::getWeight).sum();
        System.out.println(" Суммарный вес котов: " + sum);
        return sum;
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
        System.out.println(catsListGrouped);

        return catsListGrouped;

    }

}