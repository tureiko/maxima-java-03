package org.example;

import java.util.ArrayList;
import java.util.List;

public interface AnimalKitchen<T> {
    void add(T arg);
    void feed();
}
