package org.example;

public class CatFactory {

    public static Cat createCat(String name, int weight) throws Exception {

        if (weight >= 0) {
            return new Cat(name, weight, false);
        }

        return new Cat(name, 5, true);

    }

}

