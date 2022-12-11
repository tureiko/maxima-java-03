package org.example;

import java.util.ArrayList;

public class Dog implements AnimalKitchen<Object>{
    private String name;
    private String breed;
    private boolean isGood;
    private ArrayList<Object> animals =new ArrayList<>();

    public Dog(String name, boolean isGood, String breed) {
        this.name = name;
        this.isGood = isGood;
        this.breed = breed;
    }

    public void say(){
        System.out.println("Гав !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }


    @Override
    public void add(Object arg) {
            animals.add(arg);
            System.out.println(animals.toString());
    }

    @Override
    public void feed() {

    }

    @Override
    public ArrayList getAnimals() {
        return null;
    }

    @Override
    public String toString(){
        return "Dog { "+ name + " }";
    }
}

