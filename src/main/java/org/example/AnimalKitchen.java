package org.example;

import java.util.ArrayList;

public interface AnimalKitchen<T> {
    void add(T arg);
    void feed();
   ArrayList <T> getAnimals();
}
