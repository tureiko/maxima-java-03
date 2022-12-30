package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class StackKitchen<T> implements  AnimalKitchen<Object>{
    private ArrayList<Object> animals =new ArrayList<>();
    private Stack<Object> stack = new Stack<>();
    @Override
    public void add(Object arg) {
        stack.push(arg);
        System.out.println(stack);
        stack.toString();
    }

    @Override
    public void feed() {
       while(!stack.isEmpty()) {
           stack.pop();
       }
       System.out.println(stack);
    }

    @Override
    public ArrayList getAnimals() {
        return null;
    }
}
