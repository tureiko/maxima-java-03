package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TextTransformer implements Transformable {
    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileReader reader = new FileReader(fileIn);
        int c;
        int counter = 0;
        String text = "";
        while ((c = reader.read()) != -1) {
            counter++;
            System.out.print((char) c);
            text += String.valueOf((char) c);
        }
        reader.close();
        System.out.println();

        String[] arrStr = text.split(";");

        String name = arrStr[0];
        String weight = arrStr[1];
        String isAngry = arrStr[2];

        String template = ((isAngry.equals("true")) ? "Сердитый " : "Добродушный ") + "кот %s весом %s кг.";
        String textOut = String.format(template, name, weight);

        System.out.println(textOut);

        FileWriter writer = new FileWriter(fileOut);
        writer.write(textOut);
        // writer.append('\n');
        writer.flush();
        writer.close();
    }
}

