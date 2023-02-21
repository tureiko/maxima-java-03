package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StreamTransformer implements Transformable {
    @Override
    public void transform(String fileIn, String fileOut) {
        FileInputStream stream;
        StringBuilder result = new StringBuilder();
        try {
            stream = new FileInputStream(fileIn);
            int r;
            while ((r = stream.read()) != -1) {
                result.append((char) r);
            }

            System.out.println(result);

            String arrResult[] = result.toString().split(";");

            String name = arrResult[0];
            String weight = arrResult[1];
            String isAngry = arrResult[2];

            System.out.println(Arrays.toString(arrResult));

            String template = ((isAngry.equals("true")) ? "Сердитый " : "Добродушный ") + "кот %s весом %s кг.";
            String textOut = String.format(template, name, weight);

            FileOutputStream outStream = new FileOutputStream(fileOut);
            outStream.write(textOut.getBytes(StandardCharsets.UTF_8));
            // outStream.write(result.toString().getBytes(StandardCharsets.UTF_8), 0, result.length());
            outStream.flush();
            outStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
