package org.example;

public class CatFactory {
public static Cat newCat;



    public static Cat createCat(String name, int weight) throws Exception {

        if (weight>0) {
             newCat = new Cat(name, weight, false);
        }
        else {
             newCat =  new Cat(name,5, true);
        }
        System.out.println(newCat);
        return newCat;
    }

}
