package org.example;

import java.util.*;

public class QueueKitchen<T> implements AnimalKitchen<T> {
    private ArrayList<T> animals = new ArrayList<>();
    private Queue<T> queue = new LinkedList<>();

    @Override
    public void add(T arg) {
        queue.add(arg);
        System.out.println(queue);
    }

    @Override
    public void feed() {
        while (!queue.isEmpty()) {
            queue.remove();
            System.out.println(queue);
        }

    }


}