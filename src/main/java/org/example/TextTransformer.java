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

        String name = "";
        String weight = "";
        String isAngry = new String();

        String[] row_csv = text.split(";");

        name = row_csv[0];
        weight = row_csv[1];
        isAngry = row_csv[2];

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

