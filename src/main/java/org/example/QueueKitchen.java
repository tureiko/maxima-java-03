package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueKitchen<T> implements AnimalKitchen<Object> {
    private ArrayList<Object> animals =new ArrayList<>();
    private Queue<Object> queue = new LinkedList<>();

    @Override
    public void add(Object arg) {
        queue.add(arg);
        System.out.println(queue);

    }

    @Override
    public void feed() {
        while (!queue.isEmpty()){
            queue.remove();
       }
        System.out.println(queue);
    }

    @Override
    public ArrayList<Object> getAnimals() {
        return null;
    }
}
