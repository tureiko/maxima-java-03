package org.example;


public class Cat {
    private String name;
    private int weight;
    private boolean isAngry;


    public Cat(String name, int weight, boolean isAngry) throws Exception {
        this.name = name;
        if (weight >= 0) this.weight = weight;
        else throw new IncorrectCatWeightException("Неправильный кот");
        this.isAngry = isAngry;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws IncorrectCatWeightException {
        if (weight >= 0) this.weight = weight;
        else throw new IncorrectCatWeightException("Неправильный кот");
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }


   /* @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isAngry=" + isAngry +
                '}';
    }*/

        @Override
    public String toString() {
        return "Cat { " + name + " }";
    }
}
