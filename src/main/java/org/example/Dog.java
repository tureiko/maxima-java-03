package org.example;


public class Dog{
    private String name;
    private String breed;
    private boolean isGood;


    public Dog(String name, boolean isGood, String breed) {
        this.name = name;
        this.isGood = isGood;
        this.breed = breed;
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
    public String toString() {
        return "Dog { " + name + " }";
    }
}
