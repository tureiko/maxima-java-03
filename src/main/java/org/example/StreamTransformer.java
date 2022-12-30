package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StreamTransformer implements Transformable{
    @Override
    public void transform(String fileIn, String fileOut) throws IOException {
        FileInputStream stream;
        StringBuilder result = new StringBuilder();
        try {
            stream = new FileInputStream("cat.csv");
            int r;
            do {
                 r= stream.read();
                result.append((char)r);
                } while (r!=-1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
        try {
            FileOutputStream outStream = new FileOutputStream("out.txt");
            outStream.write(result.toString().getBytes(StandardCharsets.UTF_8),0, result.length());
            outStream.flush();
            outStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
