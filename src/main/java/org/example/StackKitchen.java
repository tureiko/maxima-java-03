package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class StackKitchen<T> implements AnimalKitchen<T> {
    private ArrayList<T> animals = new ArrayList<>();

    public ArrayList<T> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<T> animals) {
        this.animals = animals;
    }

    @Override
    public void add(T arg) {
        getAnimals().add(arg);
    }

    @Override
    public void feed() {
        for (int i = getAnimals().size() - 1; i >= 0; i--) {
            getAnimals().remove(i);
        }
    }
}
