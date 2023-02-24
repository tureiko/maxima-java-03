package org.example;

import java.util.*;

public class QueueKitchen<T> implements AnimalKitchen<T> {
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
        // System.out.println(getAnimals());
    }

    @Override
    public void feed() {

        for (int i = 0; i <  getAnimals().size(); i++) {
            while (! getAnimals().isEmpty()) {
                getAnimals().remove(i);
                // System.out.println ( getAnimals().remove(i)+" "+ getAnimals().size());
            }

        }
    }
}
