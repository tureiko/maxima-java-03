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
        cats = (ArrayList<Cat>) cats.stream().sorted((x, y) -> y.getWeight() - x.getWeight())
                .collect(Collectors.toList());
        System.out.println("По весу: " + cats);
        return cats;
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats) {
        List<Cat> exceptFirstLast = cats
                .stream().limit(cats.size() - 1).skip(1).collect(Collectors.toList());

        System.out.println("Кроме первого и последнего: " + exceptFirstLast);

        return cats;
    }

    public static Cat findFirstNonAngryCat(ArrayList<Cat> cats) {
        Cat nonAngryCat = cats.stream().dropWhile(Cat::isAngry).findFirst().orElse(null);
        System.out.println("Первый не сердитый кот: " + nonAngryCat);
        return nonAngryCat;
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
        int sumWeight;
        sumWeight = onlyAngry ? cats.stream().filter(Cat::isAngry).mapToInt(Cat::getWeight).reduce(Integer::sum).getAsInt()
                : cats.stream().mapToInt(Cat::getWeight).sum();
        System.out.println(String.format(onlyAngry ? "Суммарный вес только сердитых: %d" : "Суммарный вес всех: %d", sumWeight));
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


