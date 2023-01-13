package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class StackKitchen<T> implements AnimalKitchen<T> {
    private ArrayList<T> animals = new ArrayList<>();
    private Stack stack = new Stack<>();

    @Override
    public void add(T arg) {
        stack.push(arg);
        System.out.println(stack);
    }

    @Override
    public void feed() {
        while (!stack.isEmpty()) {
            stack.pop();
            System.out.println(stack);
        }
    }

}
