package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CatStatistics {
   public static ArrayList<Cat> sortByNameAscending(ArrayList<Cat> cats) {
       cats = (ArrayList<Cat>) cats.stream().sorted((x,y)-> x.getName().compareTo(y.getName()))
         .collect(Collectors.toList());
       System.out.println(cats);
       return cats;
    }

    public static ArrayList<Cat> sortByWeightDescending(ArrayList<Cat> cats){
       List<Cat> sortCats = new ArrayList<>();
       sortCats = cats.stream().sorted((x, y)-> y.getWeight()- x.getWeight())
              .collect(Collectors.toList());
       System.out.println(" По весу: "+sortCats);
       return (ArrayList<Cat>) sortCats;
    }

    public static ArrayList<Cat> removeFirstAndLast(ArrayList<Cat> cats){
        ArrayList<Cat> cats1= (ArrayList<Cat>) cats.clone();
        int lastIndex = cats1.size() - 1;
        cats1.remove(lastIndex);
        cats1.remove(0);
        System.out.println(" Коты кроме 1 и последнего: "+cats1);
        return cats1;
    }

    public static ArrayList<Cat> findFirstNonAngryCat(ArrayList<Cat> cats){
        Cat first = cats.stream().filter(x-> !x.isAngry()).findFirst().get();
        ArrayList<Cat> nonAngryCats = new ArrayList<>();
        nonAngryCats.add(first);
        System.out.println(cats);
        System.out.println(" Первый не сердитый кот: "+ first+" "+nonAngryCats);
        return nonAngryCats;
    }

    public static int getCommonWeight(ArrayList<Cat> cats, boolean onlyAngry) {
       if (onlyAngry) {
           List<Cat> angry = cats.stream().filter(x-> x.isAngry()).collect(Collectors.toList());
            int resAngry = angry.stream()
                   .map(Cat::getWeight)
                   .reduce(Integer::sum).get();
           System.out.println(" Суммарный вес сердитых котов: " +resAngry);
            return resAngry;
       }
        else {
            int res = cats.stream()
                    .map(Cat::getWeight)
                    .reduce(Integer::sum).get();        // reduce - сбор статистики из коллекции
            System.out.println(" Суммарный вес котов: " + res);
            return res;
        }
    }

    public static Map<String, List<Cat>> groupCatByFirstLetter (ArrayList<Cat> cats){
//       String[] arrayCats = new String[cats.size()];
//       List<String> list = new ArrayList<>();
//        for (Cat cat: cats) {
//            list.add(cat.getName());
//        }
//       list.toArray(arrayCats);
//        System.out.println(Arrays.toString(arrayCats));
//        Map<Character, List<String>> result = Arrays.stream(arrayCats).collect(Collectors.groupingBy(s->s.charAt(0), Collectors.toList()));
//        result.forEach((k,v)-> System.out.println(k+"->"+v));
//        result.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
//                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        List<Cat> listCat = cats.stream().sorted((x,y)->x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        System.out.println(listCat);

        Map<Character, List<Cat>> catsCharAtGrouped =
                listCat.stream().collect(Collectors.groupingBy(w -> w.getName().charAt(0)));
        System.out.println("catsCharAtGrouped "+catsCharAtGrouped);

        Map<String, List<Cat>> catsListGrouped =
                cats.stream().collect(Collectors.groupingBy(w -> w.getName()));

        System.out.println("catsListGrouped "+ catsListGrouped);
        System.out.println(catsCharAtGrouped.get('М'));
       Map<String, List<Cat>> newCats = new HashMap<>();
        for (Cat cat: cats) {
            if(cat.getName().charAt(0)==cat.getName().charAt(0)){           // через compareto метод
                newCats.put(cat.getName(),new ArrayList<>());
            }

        }
        Map<String, List<Cat>> catsListGrouped1 = new HashMap<>(); // скопировать только value
        catsCharAtGrouped.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(catsCharAtGrouped);

       return catsListGrouped;
    }

}


